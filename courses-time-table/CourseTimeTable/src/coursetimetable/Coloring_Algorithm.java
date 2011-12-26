/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coursetimetable;


import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.*;
import javax.swing.text.TableView.TableCell;

/**
 *
 * @author Tarek
 */
public class Coloring_Algorithm {
   
    List<Integer> Lecture_Room_ID;  // all available rooms in database
    List<Integer> Labs_Room_ID;
    public List<course> unassigned_courses;
    public List<course> unassigned_sections;
     public List<course> unassigned_labs;
    String query;
    connect c ;
    procedures P;
    ResultSet R;
    public Table_Cell [][] Cells;
    course [] Courses;
    int[][] Conflict_Matrix ;
int no_of_days;
    int no_colored_courses = 0;
        int color_index = 0;
        
    public Coloring_Algorithm (course[] C_,int[][] C_Matrix ) throws SQLException
    {
        Courses = C_;
        Conflict_Matrix = C_Matrix;
        // initialize the slots 2d array
       
        c = new connect();
        P = new procedures();
        no_of_days = 0;
        int  no_of_slots_per_day = 0;
       
        
        query = P.get_No_of_days();
        R = c.connection(query);
        while(R.next())
        {
           no_of_days = R.getInt(1);
        }
        query = P.get_No_of_slots();
        R = c.connection(query);
        while(R.next())
        {
           no_of_slots_per_day = R.getInt(1);
        }
        //initialize the room_id array
        Lecture_Room_ID= new ArrayList<Integer>();
        Labs_Room_ID= new ArrayList<Integer>();
        query = P.get_All_classes();
        R= c.connection(query);
          while(R.next())
        {
            int room_id = R.getInt(1);
            if(room_id >= 900000)
            {
             Labs_Room_ID.add(R.getInt(1));
            }
            else
            {
             Lecture_Room_ID.add(R.getInt(1));
            }
        }
        
        Cells = new Table_Cell[no_of_days][no_of_slots_per_day];
        for (int i = 0 ; i< no_of_days ; i++)
        {
            for (int j = 0; j < no_of_slots_per_day; j++) {
                Cells[i][j] = new Table_Cell(Lecture_Room_ID,Labs_Room_ID);
                Cells[i][j].Day_ID = i;
                Cells[i][j].slot = j;
            }
        }
        
        unassigned_courses = new ArrayList<course>();
        unassigned_sections = new ArrayList<course>();
        unassigned_labs = new ArrayList<course>();
        Coloring();
    }
    
    
    public void Coloring()
    {   
       
        for (int i = 0; i < Courses.length; i++) 
        {
            try {
              int course_no_of_students=0;
              query = P.get_NoOfStudents_in_Course(Courses[i].name);
              R = c.connection(query);
              while(R.next())
              {
                  course_no_of_students = R.getInt(1);
              }
                if (course_no_of_students != 0) {
                    assign_course_lecture(Courses[i]);
                    assign_course_section(Courses[i]);
                    assign_course_lab(Courses[i]);
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(Coloring_Algorithm.class.getName()).log(Level.SEVERE, null, ex);
            }
 
        }
        clear_repeated_assingments();
    
    }
    
    // return true if there is a conflict 
 public boolean  conflict_exist (Table_Cell cell , course subject)
 {
    
     int Course1_ID = subject.id ;
     int Course2_ID = 0;
     
     for (int i = 0; i < cell.lecture_rooms_index; i++) 
     {
         Course2_ID = cell.lecture_rooms[i].C.id;
         
         if(Conflict_Matrix[Course1_ID][Course2_ID] == 1 || Conflict_Matrix[Course1_ID][Course2_ID] == 2 || cell.lecture_rooms[i].C.id == subject.id)
             return true;
     }
     return false;
 }
 
 // if no of hours > 6 return false violate soft constraints
  public boolean  check_DR_NoOfHours (int Day_ID,course subject)
 {
     int no_of_hours = 0;
     for (int i = 0; i < Cells[Day_ID].length; i++) {
         for (int j = 0; j < Cells[Day_ID][i].lecture_rooms_index; j++) {
             if (Cells[Day_ID][i].lecture_rooms[j].C.C_Prof == subject.C_Prof ) {
                 no_of_hours +=2;
                 if (no_of_hours == 6) {
                     return false;
                 }
                 break;
             }
         }
     }
     return true;     
 }
 
  // return true if there is a big gap
  public boolean check_Dr_gaps (int Day_ID,int slot_no,course subject)
  {
      for (int i = 0; i <Cells[Day_ID].length ; i++) {
          for (int j = 0; j < Cells[Day_ID][i].lecture_rooms_index; j++) {
              if (subject.C_Prof == Cells[Day_ID][i].lecture_rooms[j].C.C_Prof) {
                  if ((slot_no-i)>2) {
                      return true;
                  }
              }
          }
      }
      return false;
  }
  
  public boolean  check_TA_NoOfHours (int Day_ID,course subject)
 {
     int no_of_hours = 0;
     for (int i = 0; i < Cells[Day_ID].length; i++) {
         for (int j = 0; j < Cells[Day_ID][i].lecture_rooms_index; j++) {
             if (Cells[Day_ID][i].lecture_rooms[j].C.C_TA == subject.C_TA ) {
                 no_of_hours +=2;
                 if (no_of_hours == 6) {
                     return false;
                 }
                 break;
             }
         }
     }
     return true;     
 }
 
  // return true if there is a big gap
  public boolean check_TA_gaps (int Day_ID,int slot_no,course subject)
  {
      for (int i = 0; i <Cells[Day_ID].length ; i++) {
          for (int j = 0; j < Cells[Day_ID][i].lecture_rooms_index; j++) {
              if (subject.C_TA == Cells[Day_ID][i].lecture_rooms[j].C.C_TA) {
                  if ((slot_no-i)>2) {
                      return true;
                  }
              }
          }
      }
      return false;
  }
  
  
   public boolean  check_TA_lab_NoOfHours (int Day_ID,course subject)
 {
     int no_of_hours = 0;
     for (int i = 0; i < Cells[Day_ID].length; i++) {
         for (int j = 0; j < Cells[Day_ID][i].lab_rooms_index; j++) {
             if (Cells[Day_ID][i].lab_rooms[j].C.C_TA == subject.C_TA ) {
                 no_of_hours +=2;
                 if (no_of_hours == 6) {
                     return false;
                 }
                 break;
             }
         }
     }
     return true;     
 }
 
  // return true if there is a big gap
  public boolean check_TA_lab_gaps (int Day_ID,int slot_no,course subject)
  {
      for (int i = 0; i <Cells[Day_ID].length ; i++) {
          for (int j = 0; j < Cells[Day_ID][i].lab_rooms_index; j++) {
              if (subject.C_TA == Cells[Day_ID][i].lab_rooms[j].C.C_TA) {
                  if ((slot_no-i)>2) {
                      return true;
                  }
              }
          }
      }
      return false;
  }
  
 public void assign_course_lecture (course subject)
 {
      
      List<Table_Cell> waiting_list = new ArrayList<Table_Cell>(); //list to hold the available slots if we neglect the soft constraints 
              for(int j=0; j< subject.Avilable_Days.size() ; j++) //Dr days
              {
                  
                  for (int k = 0; k < subject.No_Of_Lect_Slots_Per_Weak ; k++) //no of lectures needed
                  {
                      for (int t = 0; t < Cells[subject.Avilable_Days.get(j)].length; t++)//slots/day 
                      {
                          if(!conflict_exist(Cells[subject.Avilable_Days.get(j)][t], subject))
                          {
                              if(Cells[subject.Avilable_Days.get(j)][t].lecture_rooms_index < Cells[subject.Avilable_Days.get(j)][t].lecture_rooms.length )
                              {
                                  if (check_DR_NoOfHours(subject.Avilable_Days.get(j),subject)) {
                                      if (!check_Dr_gaps(j,t , subject)) {
                                        colors(subject);                              
                              Cells[subject.Avilable_Days.get(j)][t].lecture_rooms[Cells[subject.Avilable_Days.get(j)][t].lecture_rooms_index].C=subject;
                              Cells[subject.Avilable_Days.get(j)][t].lecture_rooms[Cells[subject.Avilable_Days.get(j)][t].lecture_rooms_index].type=0;
                              Cells[subject.Avilable_Days.get(j)][t].lecture_rooms_index++;                                            
                              subject.No_of_assigned_lectures++;                      
                              break;  
                                      }
                                      else
                                      {
                                       waiting_list.add(Cells[subject.Avilable_Days.get(j)][t]);   
                                      }
                                  
                                  
                              
                                  }
                                  else
                                  {
                                      waiting_list.add(Cells[subject.Avilable_Days.get(j)][t]);
                                  }
                              }
                              else
                              {
                                     waiting_list.add(Cells[subject.Avilable_Days.get(j)][t]);
                              }
                           }
                          else
                          {
                             waiting_list.add(Cells[subject.Avilable_Days.get(j)][t]);
                          }
                          }
                      }
                  }
              check_course_lecture_assigning_results(subject, waiting_list);
            
    
 }
 
  public void assign_course_section (course subject)
 {
      
      List<Table_Cell> waiting_list = new ArrayList<Table_Cell>(); //list to hold the available slots if we neglect the soft constraints 
              for(int j=0; j<no_of_days; j++) //Dr days
              {
                  
                  for (int k = 0; k < subject.No_Of_sec_Slots_Per_Weak ; k++) //no of lectures needed
                  {
                      for (int t = 0; t < Cells[j].length; t++)//slots/day 
                      {
                          if(!conflict_exist(Cells[j][t], subject))
                          {
                              if(Cells[j][t].lecture_rooms_index < Cells[j][t].lecture_rooms.length )
                              {
                                  if (check_TA_NoOfHours(j,subject)) {
                                      
                                      if (!check_TA_gaps(j,t , subject)) {
                                                                      
                              Cells[j][t].lecture_rooms[Cells[j][t].lecture_rooms_index].C = subject;
                              Cells[j][t].lecture_rooms[Cells[j][t].lecture_rooms_index].type = 1;
                              Cells[j][t].lecture_rooms_index++;                                            
                              subject.No_of_assigned_sections++;                      
                              break;  
                                      }
                                      else
                                      {
                                       waiting_list.add(Cells[j][t]);   
                                      }
                                  
                                  
                              
                                  }
                                  else
                                  {
                                      waiting_list.add(Cells[j][t]);
                                  }
                              }
                              else
                              {
                                     waiting_list.add(Cells[j][t]);
                              }
                           }
                          else
                          {
                             waiting_list.add(Cells[j][t]);
                          }
                          }
                      }
                  }
              check_course_section_assigning_results(subject, waiting_list);
            
    
 }
  
   public void assign_course_lab (course subject)
 {
      
      List<Table_Cell> waiting_list = new ArrayList<Table_Cell>(); //list to hold the available slots if we neglect the soft constraints 
              for(int j=0; j<no_of_days; j++) 
              {
                  
                  for (int k = 0; k < subject.No_Of_Lab_Slots_Per_Weak ; k++) //no of lectures needed
                  {
                      for (int t = 0; t < Cells[j].length; t++)//slots/day 
                      {
                          if(!conflict_exist(Cells[j][t], subject))
                          {
                              if(Cells[j][t].lab_rooms_index < Cells[j][t].lab_rooms.length )
                              {
                                  if (check_TA_lab_NoOfHours(j,subject)) {
                                      
                                      if (!check_TA_lab_gaps(j,t , subject)) {
                                                                      
                              Cells[j][t].lab_rooms[Cells[j][t].lab_rooms_index].C = subject;
                              Cells[j][t].lab_rooms[Cells[j][t].lab_rooms_index].type = 1;
                              Cells[j][t].lab_rooms_index++;                                            
                              subject.No_of_assigned_labs++;                      
                              break;  
                                      }
                                      else
                                      {
                                       waiting_list.add(Cells[j][t]);   
                                      }
                                  
                                  
                              
                                  }
                                  else
                                  {
                                      waiting_list.add(Cells[j][t]);
                                  }
                              }
                              else
                              {
                                     waiting_list.add(Cells[j][t]);
                              }
                           }
                          else
                          {
                             waiting_list.add(Cells[j][t]);
                          }
                          }
                      }
                  }
              check_course_lab_assigning_results(subject, waiting_list);
            
    
 }
 
 
public void check_course_lecture_assigning_results(course subject , List<Table_Cell> waiting_list)
{
    if (subject.No_of_assigned_lectures == subject.No_Of_Lect_Slots_Per_Weak) {
        subject.overwrite = false;
    }
    else if(subject.No_of_assigned_lectures < subject.No_Of_Lect_Slots_Per_Weak)
    {
        for (int i = 0; i < (subject.No_Of_Lect_Slots_Per_Weak-subject.No_of_assigned_lectures); i++) {
          solve_lecture_assigning_problem(waiting_list,subject);    
        }
        if(subject.No_of_assigned_lectures < subject.No_Of_Lect_Slots_Per_Weak)            
            unassigned_courses.add(subject);
    }
}

public void check_course_section_assigning_results(course subject , List<Table_Cell> waiting_list)
{
    if (subject.No_of_assigned_sections == subject.No_Of_Lect_Slots_Per_Weak) {
        subject.sec_overwrite = false;
    }
    else if(subject.No_of_assigned_sections < subject.No_Of_sec_Slots_Per_Weak)
    {
        for (int i = 0; i < (subject.No_Of_sec_Slots_Per_Weak-subject.No_of_assigned_sections); i++) {
          solve_section_assigning_problem(waiting_list,subject);    
        }
        if(subject.No_of_assigned_sections < subject.No_Of_sec_Slots_Per_Weak)            
            unassigned_sections.add(subject);
    }
}

public void check_course_lab_assigning_results(course subject , List<Table_Cell> waiting_list)
{
    if (subject.No_of_assigned_labs == subject.No_Of_Lab_Slots_Per_Weak) {
        subject.lab_overwrite = false;
    }
    else if(subject.No_of_assigned_labs < subject.No_Of_Lab_Slots_Per_Weak)
    {
        for (int i = 0; i < (subject.No_Of_Lab_Slots_Per_Weak-subject.No_of_assigned_labs); i++) {
          solve_lab_assigning_problem(waiting_list,subject);    
        }
        if(subject.No_of_assigned_labs < subject.No_Of_Lab_Slots_Per_Weak)            
            unassigned_labs.add(subject);
    }
}

public void solve_lecture_assigning_problem (List<Table_Cell> waiting_list,course subject)
{
    Table_Cell cell= best_cell_in_waiting_list(waiting_list, subject);
        if (cell != null) {     
    
        
        // remove the courses which have conflict with our course
        for (int j = 0; j < cell.lecture_rooms_index; j++) {
            if (Conflict_Matrix[cell.lecture_rooms[j].C.id][subject.id] == 1 || Conflict_Matrix[cell.lecture_rooms[j].C.id][subject.id] == 2) {
                
                cell.lecture_rooms[j].C.No_of_assigned_lectures --;
                if ( cell.lecture_rooms[j].C.No_of_assigned_lectures ==  cell.lecture_rooms[j].C.No_Of_Lect_Slots_Per_Weak) {
                     cell.lecture_rooms[j].C.overwrite = false;
                }
                rearranging_the_lecture_rooms(j, cell);
                j--;
            }
            
        }
        
        // assign our course
        cell.lecture_rooms[cell.lecture_rooms_index].C = subject;
        cell.lecture_rooms[cell.lecture_rooms_index].type=0;
        cell.lecture_rooms_index++;
        
        //remove cell from waiting list
        waiting_list.remove(cell);
        }
        
        
        
}


 public void solve_section_assigning_problem (List<Table_Cell> waiting_list,course subject)
{
    Table_Cell cell= best_sec_cell_in_waiting_list(waiting_list, subject);
        if (cell != null) {     
    
        
        // remove the courses which have conflict with our course
        for (int j = 0; j < cell.lecture_rooms_index; j++) {
            if (Conflict_Matrix[cell.lecture_rooms[j].C.id][subject.id] == 1 || Conflict_Matrix[cell.lecture_rooms[j].C.id][subject.id] == 2) {
                
                cell.lecture_rooms[j].C.No_of_assigned_sections --;
                if ( cell.lecture_rooms[j].C.No_of_assigned_sections ==  cell.lecture_rooms[j].C.No_Of_sec_Slots_Per_Weak) {
                     cell.lecture_rooms[j].C.sec_overwrite = false;
                }
                rearranging_the_lecture_rooms(j, cell);
                j--;
            }
            
        }
        
        // assign our course
        cell.lecture_rooms[cell.lecture_rooms_index].C = subject;
        cell.lecture_rooms[cell.lecture_rooms_index].type = 1;
        cell.lecture_rooms_index++;
        
        //remove cell from waiting list
        waiting_list.remove(cell);
        }
        
        
        
}       
 
 
  public void solve_lab_assigning_problem (List<Table_Cell> waiting_list,course subject)
{
    Table_Cell cell= best_lab_cell_in_waiting_list(waiting_list, subject);
        if (cell != null) {     
    
        
        // remove the courses which have conflict with our course
        for (int j = 0; j < cell.lab_rooms_index; j++) {
            if (Conflict_Matrix[cell.lab_rooms[j].C.id][subject.id] == 1 || Conflict_Matrix[cell.lab_rooms[j].C.id][subject.id] == 2) {
                
                cell.lab_rooms[j].C.No_of_assigned_labs --;
                if ( cell.lab_rooms[j].C.No_of_assigned_labs ==  cell.lab_rooms[j].C.No_Of_Lab_Slots_Per_Weak) {
                     cell.lab_rooms[j].C.lab_overwrite = false;
                }
                rearranging_the_lab_rooms(j, cell);
                j--;
            }
            
        }
        
        // assign our course
        cell.lab_rooms[cell.lab_rooms_index].C = subject;
       
        cell.lab_rooms_index++;
        
        //remove cell from waiting list
        waiting_list.remove(cell);
        }
        
        
        
}       
        
        


public void rearranging_the_lecture_rooms (int index,Table_Cell cell)
{
    for (int i = index; i < cell.lecture_rooms_index -1; i++) {
       
        cell.lecture_rooms[i].C = cell.lecture_rooms[i+1].C;
        cell.lecture_rooms[i+1].C = null;
        cell.lecture_rooms[i].type = cell.lecture_rooms[i+1].type;
        cell.lecture_rooms[i+1].type= 0;
    }
    cell.lecture_rooms_index--;
}


public void rearranging_the_lab_rooms (int index,Table_Cell cell)
{
    for (int i = index; i < cell.lab_rooms_index -1; i++) {
       
        cell.lab_rooms[i].C = cell.lab_rooms[i+1].C;
        cell.lab_rooms[i+1].C = null;
        
        
    }
    cell.lab_rooms_index--;
}
    

public Table_Cell best_cell_in_waiting_list (List<Table_Cell> waiting_list,course subject)
{
 // remove the waiting list items that cant be used for assigning because of conflicts
    for (int i = 0; i < waiting_list.size(); i++) {
        for (int j = 0; j < waiting_list.get(i).lecture_rooms_index; j++) {
            if (Conflict_Matrix[waiting_list.get(i).lecture_rooms[j].C.id][subject.id] == 1 || Conflict_Matrix[waiting_list.get(i).lecture_rooms[j].C.id][subject.id] == 2 || waiting_list.get(i).lecture_rooms[j].C.id == subject.id) {
                if (!waiting_list.get(i).lecture_rooms[j].C.overwrite || waiting_list.get(i).lecture_rooms[j].C.id == subject.id ) {
                    waiting_list.remove(i);
                    break;
                }
            }
        }
    }
     // calcate the best cell for overwriting
    if (!waiting_list.isEmpty()) {
        int best_cell_index=0;
        double case_probablity=0;
        int no_of_rooms=0;
        int no_of_overwrites=0;
    for (int i = 0; i < waiting_list.size(); i++) {
         no_of_rooms=0;
         no_of_overwrites=0;
        for (int j = 0; j < waiting_list.get(i).lecture_rooms_index; j++) {
            if (Conflict_Matrix[waiting_list.get(i).lecture_rooms[j].C.id][subject.id] == 1 || Conflict_Matrix[waiting_list.get(i).lecture_rooms[j].C.id][subject.id] == 2) {
                no_of_rooms++;
                no_of_overwrites+=(waiting_list.get(i).lecture_rooms[j].C.No_of_assigned_lectures - waiting_list.get(i).lecture_rooms[j].C.No_Of_Lect_Slots_Per_Weak);
            }
        }
        if (((double)no_of_overwrites / no_of_rooms) > case_probablity) {
            best_cell_index = i;
            case_probablity = (double)no_of_overwrites / no_of_rooms;
        }
        
 
    }
    return waiting_list.get(best_cell_index);
    }
    else
        return null;
 
     
}
        

public Table_Cell best_sec_cell_in_waiting_list (List<Table_Cell> waiting_list,course subject)
{
 // remove the waiting list items that cant be used for assigning because of conflicts
    for (int i = 0; i < waiting_list.size(); i++) {
        for (int j = 0; j < waiting_list.get(i).lecture_rooms_index; j++) {
            if (Conflict_Matrix[waiting_list.get(i).lecture_rooms[j].C.id][subject.id] == 1 || Conflict_Matrix[waiting_list.get(i).lecture_rooms[j].C.id][subject.id] == 2 || waiting_list.get(i).lecture_rooms[j].C.id == subject.id) {
                if (!waiting_list.get(i).lecture_rooms[j].C.sec_overwrite || waiting_list.get(i).lecture_rooms[j].C.id == subject.id ) {
                    waiting_list.remove(i);
                    break;
                }
            }
        }
    }
     // calcate the best cell for overwriting
    if (!waiting_list.isEmpty()) {
        int best_cell_index=0;
        double case_probablity=0;
        int no_of_rooms=0;
        int no_of_overwrites=0;
    for (int i = 0; i < waiting_list.size(); i++) {
         no_of_rooms=0;
         no_of_overwrites=0;
        for (int j = 0; j < waiting_list.get(i).lecture_rooms_index; j++) {
            if (Conflict_Matrix[waiting_list.get(i).lecture_rooms[j].C.id][subject.id] == 1 || Conflict_Matrix[waiting_list.get(i).lecture_rooms[j].C.id][subject.id] == 2) {
                no_of_rooms++;
                no_of_overwrites+=(waiting_list.get(i).lecture_rooms[j].C.No_of_assigned_sections - waiting_list.get(i).lecture_rooms[j].C.No_Of_sec_Slots_Per_Weak);
            }
        }
        if (((double)no_of_overwrites / no_of_rooms) > case_probablity) {
            best_cell_index = i;
            case_probablity = (double)no_of_overwrites / no_of_rooms;
        }
        
 
    }
    return waiting_list.get(best_cell_index);
    }
    else
        return null;
 
     
}

public Table_Cell best_lab_cell_in_waiting_list (List<Table_Cell> waiting_list,course subject)
{
 // remove the waiting list items that cant be used for assigning because of conflicts
    for (int i = 0; i < waiting_list.size(); i++) {
        for (int j = 0; j < waiting_list.get(i).lab_rooms_index; j++) {
            if (Conflict_Matrix[waiting_list.get(i).lab_rooms[j].C.id][subject.id] == 1 || Conflict_Matrix[waiting_list.get(i).lab_rooms[j].C.id][subject.id] == 2 || waiting_list.get(i).lab_rooms[j].C.id == subject.id) {
                if (!waiting_list.get(i).lab_rooms[j].C.lab_overwrite || waiting_list.get(i).lab_rooms[j].C.id == subject.id ) {
                    waiting_list.remove(i);
                    break;
                }
            }
        }
    }
     // calcate the best cell for overwriting
    if (!waiting_list.isEmpty()) {
        int best_cell_index=0;
        double case_probablity=0;
        int no_of_rooms=0;
        int no_of_overwrites=0;
    for (int i = 0; i < waiting_list.size(); i++) {
         no_of_rooms=0;
         no_of_overwrites=0;
        for (int j = 0; j < waiting_list.get(i).lab_rooms_index; j++) {
            if (Conflict_Matrix[waiting_list.get(i).lab_rooms[j].C.id][subject.id] == 1 || Conflict_Matrix[waiting_list.get(i).lab_rooms[j].C.id][subject.id] == 2) {
                no_of_rooms++;
                no_of_overwrites+=(waiting_list.get(i).lab_rooms[j].C.No_of_assigned_labs - waiting_list.get(i).lab_rooms[j].C.No_Of_Lab_Slots_Per_Weak);
            }
        }
        if (((double)no_of_overwrites / no_of_rooms) > case_probablity) {
            best_cell_index = i;
            case_probablity = (double)no_of_overwrites / no_of_rooms;
        }
        
 
    }
    return waiting_list.get(best_cell_index);
    }
    else
        return null;
 
     
}
 
 public void colors(course subject)
 {
     
         for (int j = 0; j < no_colored_courses; j++) {
             if (Conflict_Matrix[Courses[j].id][subject.id] !=1 && Conflict_Matrix[Courses[j].id][subject.id]!=2) {
                 subject.color = Courses[j].color;
                  color_index ++ ;
                         return;
             }
         }
         subject.color = color_index;
         color_index ++ ;
     
 }
 
 public  void clear_repeated_assingments()
 {
     for (int k = 0; k < Courses.length; k++) {
         if (Courses[k].No_of_assigned_sections > Courses[k].No_Of_sec_Slots_Per_Weak || Courses[k].No_of_assigned_lectures > Courses[k].No_Of_Lect_Slots_Per_Weak || Courses[k].No_of_assigned_labs > Courses[k].No_Of_Lab_Slots_Per_Weak ) {
            int lec_count= 0;
         int sec_count= 0;
         int lab_count = 0;
      for (int i = 0; i < Cells.length; i++) {
         for (int j = 0; j < Cells[i].length; j++) {
             for (int h = 0; h < Cells[i][j].lecture_rooms_index; h++) {
                 if (Cells[i][j].lecture_rooms[h].C.id == Courses[k].id && Cells[i][j].lecture_rooms[h].type == 0) {
                     
                     if (lec_count < Courses[k].No_Of_Lect_Slots_Per_Weak ) {
                         lec_count++;
                     }
                     else 
                     {
                         Cells[i][j].lecture_rooms[h].C = null;
                         rearranging_the_lecture_rooms(h,Cells[i][j]);
                         h--;
                     }
                 }
                 else if (Cells[i][j].lecture_rooms[h].C.id == Courses[k].id && Cells[i][j].lecture_rooms[h].type == 1)
                 {
                     if (sec_count < Courses[k].No_Of_sec_Slots_Per_Weak ) {
                         sec_count++;
                     }
                     else
                     {
                        Cells[i][j].lecture_rooms[h].C = null;
                        rearranging_the_lecture_rooms(h,Cells[i][j]);
                        h--;
                     }
                 }
             }
             for (int q = 0; q < Cells[i][j].lab_rooms_index; q++) {
                 if (Cells[i][j].lab_rooms[q].C.id == Courses[k].id ) {
                     
                     if (lab_count < Courses[k].No_Of_Lab_Slots_Per_Weak) {
                         lab_count++;
                     }
                     else 
                     {
                         Cells[i][j].lab_rooms[q].C = null;
                         rearranging_the_lab_rooms(q,Cells[i][j]);
                         q--;
                     }
                 }
                 
             }
            
         }
      }
         }
         
     }   
     
     
 }
 
 }


