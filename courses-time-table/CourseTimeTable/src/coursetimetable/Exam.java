/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coursetimetable;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tarek
 */
// the student must have one day or more between each 2 exams
public class Exam {
    List<Integer> Lecture_Room_ID;  // all available rooms in database
    String query;
    connect c ;
    procedures P;
    ResultSet R;
    List<Exam_table> exams;
    course [] Courses;
    int[][] Conflict_Matrix ;
    int day_id; // no of days open until all courses have exams
    int no_of_slot_in_day; // 2 slots in day
    int no_of_assigned_courses_in_day;
    List<course> waiting_list = new ArrayList<course>(); // list to hold the un assigned courses
    Exam_table Exam1 ;
    public Exam(int[][]matrix,course[] coursess) throws SQLException {
        Conflict_Matrix = matrix;
        Courses = coursess;
        exams = new ArrayList<Exam_table>();
        Exam1 = new Exam_table();
        waiting_list = new ArrayList<course>();
        for (int i = 0; i < Courses.length; i++) {
            waiting_list.add(Courses[i]) ;
        }
        
        day_id = 0;
        no_of_slot_in_day = 2;
        c = new connect();
        P = new procedures();
        
        //initialize the room_id array
        Lecture_Room_ID= new ArrayList<Integer>();
        
        query = P.get_All_classes();
        R= c.connection(query);
          while(R.next())
        {
            int room_id = R.getInt(1);
            if(room_id < 900000)
            {
             Lecture_Room_ID.add(R.getInt(1));
            }
          
        }
          
          Coloring();
        
    }
    
    public void Coloring()
    {   
       
        while(!waiting_list.isEmpty()) 
        {
            try {
                int waiting_list_size=waiting_list.size();
                for (int i = 0; i < waiting_list.size(); i++) {
                   int course_no_of_students=0;
              query = P.get_NoOfStudents_in_Course(waiting_list.get(i).name);
              R = c.connection(query);
              while(R.next())
              {
                  course_no_of_students = R.getInt(1);
              }
                if (course_no_of_students != 0) {
                  i =  assign_course_exam(waiting_list.get(i),i);
                                      
                } 
                }
                if (waiting_list_size == waiting_list.size()) {
                    day_id++;
                }
            }
             catch (SQLException ex) {
                Logger.getLogger(Coloring_Algorithm.class.getName()).log(Level.SEVERE, null, ex);
            }
 
        }
       
    
    }

    
 public boolean  conflict_exist (course subject)
 {
    
     int Course1_ID = subject.id ;
     int Course2_ID = 0;
       
     for (int i = 0; i < exams.size(); i++) 
     {
         if (day_id != 0) {
          if (exams.get(i).day_ID == day_id || exams.get(i).day_ID == day_id-1) {
             for (int j = 0; j < exams.get(i).courses.size(); j++) {
                Course2_ID= exams.get(i).courses.get(j).id;
                 if(Conflict_Matrix[Course1_ID][Course2_ID] == 1 || Conflict_Matrix[Course1_ID][Course2_ID] == 2)
                     return true;
             }
         }   
         }
         else
         {
             if (exams.get(i).day_ID == day_id ) {
             for (int j = 0; j < exams.get(i).courses.size(); j++) {
                Course2_ID= exams.get(i).courses.get(j).id;
                 if(Conflict_Matrix[Course1_ID][Course2_ID] == 1 || Conflict_Matrix[Course1_ID][Course2_ID] == 2)
                     return true;
             }
         }
         }
                  
         
     
     }
     return false;
 }
    
    private int assign_course_exam(course subject,int i) {             
                                
                  
                          if(!conflict_exist(subject))
                          {
                              if(no_of_assigned_courses_in_day < no_of_slot_in_day )
                              {                                                      
                               
                               Exam1.day_ID= day_id;
                               Exam1.courses.add(subject);
                               no_of_assigned_courses_in_day++;
                               waiting_list.remove(subject);
                               i--;
                                  if (no_of_assigned_courses_in_day == no_of_slot_in_day) {
                                      exams.add(Exam1);
                                      Exam1 = new Exam_table();
                                      no_of_assigned_courses_in_day=0;
                                      day_id++;
                                  }
                               
                              }
                          }
                          return i;
   
    }
    
 
      
           
    
 
 
    
}
