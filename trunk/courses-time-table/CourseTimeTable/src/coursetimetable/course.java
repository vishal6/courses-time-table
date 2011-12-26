/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coursetimetable;

import java.util.*;

/**
 *
 * @author Tarek
 */
public final class course {
   public String name;  
   public int id ;// the id of the course in the matrix
   public int weight;
   public int color;
   public boolean overwrite;// if true the course have other available slots in the table and can overwrite it wit another course 
   //public List<Integer> Room_Id; // every course has room for lect and room for lab  
   public List<Integer> Avilable_Days; // avilable day of the course professor 
   public  int C_Prof;
  public  int C_TA;
   public int No_Of_Lect_Slots_Per_Weak ;  
   public int No_Of_Lab_Slots_Per_Weak ;
   public int No_Of_sec_Slots_Per_Weak ;
   
   public int No_of_assigned_lectures;
   public int No_of_assigned_sections;
   public int No_of_assigned_labs;
   
   public boolean sec_overwrite;
   public boolean lab_overwrite;
   public course()
   {
       overwrite=true;
       sec_overwrite=true;
       lab_overwrite=true;
   }
   
}
