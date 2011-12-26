/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coursetimetable;
import java.sql.*;
import java.util.ArrayList;
import javax.sql.*;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author Tarek
 */
public class Graph_Matrix {
    procedures pro = new procedures();
    connect connection = new connect();
    String query;
    ResultSet r ;
    
   private  int[][] G_Matrix;
   private course [] courses;

    public Graph_Matrix() {
        try{          
            query = pro.get_NoOfCourses();
            r=connection.connection(query);
            if(r.next())
            {
            courses= new course[r.getInt(1)];
            
            query = pro.get_course_name();
            r=connection.connection(query);
            int i = 0 ;
            while (r.next()) 
            {
                courses[i]=new course();
            courses[i].id= i;
            courses[i].name=r.getString(1);
            courses[i].overwrite = true;
         // courses[i].Room_Id = new ArrayList<Integer>();
            courses[i].Avilable_Days = new ArrayList<Integer>();
                i++;
            }
            int no_of_weeks =0;
            query = pro.get_No_of_weeks();
            r = connection.connection(query);
            while(r.next())
            {
                no_of_weeks = r.getInt(1);
            }
                for (int j = 0; j < courses.length; j++) {
                 query = pro.get_CourseProf_Days(courses[j].name)    ;
                 r = connection.connection(query);
                 while(r.next())
                 {
                     courses[j].Avilable_Days.add(r.getInt(1));
                 }
                }
                      for (int j = 0; j < courses.length; j++) {
                 query = pro.get_course_hours(courses[j].name)    ;
                 r = connection.connection(query);
                 while(r.next())
                 {
                     
                     courses[j].No_Of_Lect_Slots_Per_Weak=(Integer.parseInt(r.getString(1))/no_of_weeks)/2;
                     courses[j].No_Of_sec_Slots_Per_Weak=(Integer.parseInt(r.getString(2))/no_of_weeks)/2;
                     courses[j].No_Of_Lab_Slots_Per_Weak=(Integer.parseInt(r.getString(3))/no_of_weeks)/2;
                 }
                 
                 query = pro.get_course_prof(courses[j].name);
                 r = connection.connection(query);
                 while(r.next())
                 {                     
                     courses[j].C_Prof=r.getInt(1);
                     
                 }
                 
                 query = pro.get_course_TA(courses[j].name);
                 r = connection.connection(query);
                 while(r.next())
                 {                     
                     courses[j].C_TA=r.getInt(1);
                     
                 }
                 
                }
                      
           
        
        G_Matrix = new int[courses.length][courses.length];
        for (int j = 0; j < courses.length; j++) 
        {
            for (int g = 0; g < courses.length; g++) 
            {
               
             G_Matrix[j][g]=0;
                
            }
        }
              set_conflicts();
            }
        
            else
            {
                courses=null;
                G_Matrix = null;
            }
            }
      
        catch(Exception ex)
        {
              JOptionPane.showMessageDialog(null, ex.toString());
        }
        }

    public int[][] getG_Matrix() {
        return G_Matrix;
    }

    public course[] getCourses() {
        return courses;
    }
    
    
   public void set_conflicts ()
   {
       //di el paramters elly hkhzn fiha each course students, professors,TA
       int c1_prof,c2_prof,c1_ta,c2_ta=0;
       List <Integer>c1_students=new ArrayList<Integer>();
       List <Integer>c2_students=new ArrayList<Integer>();
       try
       {
       if(courses!=null)
       {
       for(int i = 0 ; i<courses.length-1;i++)
       {
           //get the first course ta , prof , students
            c1_prof=0;
            query = pro.get_course_prof(courses[i].name);
            r=connection.connection(query);
            if(r.next())
            {
                 c1_prof = r.getInt(1);
            }
            c1_ta=0;
             query = pro.get_course_TA(courses[i].name);
            r=connection.connection(query);
            if(r.next())
            {
                 c1_ta = r.getInt(1);
            }
            c1_students.clear();
             query = pro.get_course_students(courses[i].name);
            r=connection.connection(query);
            
            while(r.next())
            {
                 c1_students.add(r.getInt(1)) ;
            }
           for (int j = i+1; j < courses.length; j++) 
           {
            //get course2 prof and compare with course1
               //if equal set the matrix ij 1
               //else get course2 ta
               // compare as we did in prof
               //else get course2 students
               //compare to find if there is a match between 2c courses student
              
               c2_prof=0;        
               
            query = pro.get_course_prof(courses[j].name);
            r=connection.connection(query);
            if(r.next())
            {
                 c2_prof = r.getInt(1);
            }
               if(c1_prof==c2_prof)
                
            {
                G_Matrix[i][j]=1;
                G_Matrix[j][i]=1;
            }
               else 
               {
               
               c2_ta=0;        
              
            query = pro.get_course_TA(courses[j].name);
            r=connection.connection(query);
            if(r.next())
            {
                 c2_ta = r.getInt(1);
            }
            if(c1_ta==c2_ta)
                
            {
                G_Matrix[i][j]=1;
                G_Matrix[j][i]=1;
            }
            else
            {
            
                   c2_students.clear();                 
             
            query = pro.get_course_students(courses[j].name);
            r=connection.connection(query);
            
            while(r.next())
            {
                 c2_students.add(r.getInt(1)) ;
            } 
                  if( exist_matching(c1_students, c2_students)==true)
                  {
                      G_Matrix[i][j]=2;
                G_Matrix[j][i]=2;
                  }
                  
           }
           
       }
       }
           
       }
       }
       }
       catch(Exception ex)
       {
              JOptionPane.showMessageDialog(null, ex.toString());
       }
}
   //htakhod  2 lists represent each course list of students
   //if there is student whp take the 2 courses will return true
   //else false
   private boolean exist_matching(List<Integer> L1,List<Integer>L2)
   {
       for (int i = 0; i < L1.size(); i++) {
           for (int j = 0; j < L2.size(); j++) {
               if(L1.get(i).intValue()==L2.get(j).intValue())
               {
                return true;               
               }
           }
       }
       return false;
   }
}
