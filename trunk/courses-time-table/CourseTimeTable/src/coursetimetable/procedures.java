/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coursetimetable;

/**
 *
 * @author Nody
 */
//here we will put all the procedures we will use
public class procedures {
    //log in
    public String log_in(int ID){
        String log = "select password from person where ID ='" +ID+ "'";
        return log;
    }
    public  String course(){
        String c = "select id,name from courses";
        return c;
    }
   // All the Adds that the admin can do:
    // get the system status properties
      public  String set_system_status(String current_year,String current_semster,String prof_access,String Ta_access,String student_access){
        String c = "insert into system_status values("+current_year+","+current_semster+",\'"+prof_access+"\',\'"+Ta_access+"\',\'"+student_access+"\');";
        return c;
    
      } 
      public  String delete_system_status(){
        String c = "delete from system_status ;";
        return c;
    
      }
    public  String get_prof_Access(){
        String c = "select Prof_Access from System_Status;";
        return c;
    
      }
        public  String set_prof_Access(String prof_access){
        String c = "update system_status set Prof_Access = \'"+prof_access+"\';";
        return c;
    
      }
    public  String get_TA_Access(){
        String c = "select TA_Access from System_Status;";
        return c;
    
      }
      public  String set_TA_Access(String TA_access){
        String c = "update system_status set TA_Access = \'"+TA_access+"\';";
        return c;
    
      }
    public  String get_Student_Access(){
        String c = "select Student_Access from System_Status;";
        return c;
    
      }
      public  String set_student_Access(String student_access){
        String c = "update system_status set Student_Access = \'"+student_access+"\';";
        return c;
    
      }
    public  String get_Current_Year(){
        String c = "select Current_Year from System_Status;";
        return c;
    
      }
    public  String set_current_Year(String current_year){
        String c = "update system_status set Current_Year = "+current_year+";";
        return c;
    
      }
    public  String get_Current_semster(){
        String c = "select Current_Semster from System_Status;";
        return c;
    
      }
      public  String set_current_semster(String current_semster){
        String c = "update system_status set Current_Semster = "+current_semster+";";
        return c;
    
      }
      
    
    //==========================================
      public  String ADD_Person(String ID,String first_Name, String last_Name,String password,String Gender,String phone,String mobile){
        String c = "insert into person (ID,first_name,last_name,password,Gender,Phone,Mobile) values("+ID+','+"\""+first_Name+"\""+','+"\""+last_Name+"\""+','+password+','+"\'"+Gender+"\'"+','+phone+','+mobile+')';
        return c;
    
      }
      public  String Update_Person(String ID,String first_Name, String last_Name,String password,String Gender,String phone,String mobile){
        String c = "update person set "+"first_name="+"\""+first_Name+"\""+','+"last_name="+"\""+last_Name+"\""+','+"password="+password+','+"Gender="+"\'"+Gender+"\'"+','+"Phone="+phone+','+"Mobile="+mobile+"where ID ="+ID+';';
        return c;
    
      }
      public  String delete_Person(String ID){
        String c = "delete from person where ID="+ID+";";
        return c;
    
      }
      // used for the search operation and to fill the profile page of the TA or Prof OR Student
      public  String search_for_person_ByID(String Student_ID){
        String c = "select * from person where ID="+Student_ID+";";
        return c;
        
      }
              public  String search_for_person_ByName(String Student_FName,String Student_LName){
                  String c;
                  if(Student_FName !="" && Student_LName != "" )
                    c = "select * from person where first_name="+"\""+Student_FName+"\""+" and last_name="+"\""+Student_LName+"\";";
                  else if (Student_FName =="" && Student_LName != "" )
                    c = "select * from person where  last_name="+"\""+Student_LName+"\""+";";
                  else if (Student_FName !="" && Student_LName == "")
                      c = "select * from person where first_name="+"\""+Student_FName+"\""+";";
                  else 
                      c = "";
                  return c;
        
      }
              
      //Admin -> add new year 
               public  String get_Student_courses(String Student_ID){
        String c = "select courses.name,take_course.crs_ID from courses inner join take_course where take_course.std_ID ="+Student_ID+" and courses.ID=take_course.crs_ID;";
        return c;
      }
       public  String get_list_students(){
        String c ="SELECT person.first_name,person.last_name FROM person INNER JOIN undergraduate_students ON person.ID=undergraduate_students.ID";
        return c;
      }
        public  String ADD_Graduated_Student(String ID,String year){
        String c = "insert into graduated_students values ("+ID+','+year+");";
        return c;
      }
        
      // Admin -> student -> queries
      public  String ADD_Student(String ID,String year){
        String c = "insert into undergraduate_students values ("+ID+','+year+");";
        return c;
      }
            
             // to delete the student from the undergraduate delete his persom
             // to move him to the graduated students use Delete_Student() then Add_graduated_student()
      public  String Delete_Student(String ID){
        String c = "delete from undergraduate_students where ID="+ID+";";
        return c;
      }
      public  String Assign_Course_to_Student(String Student_ID,String Course_ID){
        String c = "insert into take_course values ("+Student_ID+','+Course_ID+");";
        return c;
      }
      public  String Drop_course_from_Student(String Course_ID,String Student_ID){
        String c = "delete from take_course where std_ID="+Student_ID+" and crs_ID="+Course_ID+";";
        return c;
      }
     
      
      // Admin -> Prof page-> queries
     public  String get_Prof_Days(String Prof_ID){
        String c = "select week_day.name from week_day inner join prof_day on prof_day.prof_ID="+Prof_ID+" and prof_day.day_ID=week_day.ID;";
        return c;
      }
      public  String ADD_Prof_Day(String prof_ID,String Day_ID){
        String c = "insert into prof_day values ("+prof_ID+','+Day_ID+");";
        return c;
      }
      public  String drop_Prof_Day(String prof_ID,String Day_ID){
        String c = "delete from prof_day where prof_ID="+prof_ID+" and day_ID="+Day_ID+";";
        return c;
      }
     public  String get_Prof_courses(String Prof_ID){
        String c = "select ID,name from courses where C_prof="+Prof_ID+";";
        return c;
      }
      public  String delete_Prof_course(String course_ID){
        String c = "update courses set C_prof= null where ID="+course_ID+";";
        return c;
      }
      
      // Admin -> TA page-> queries
           public  String get_TA_Days(String TA_ID){
        String c = "select week_day.name from week_day inner join ta_day on ta_day.ta_ID="+TA_ID+" and ta_day.day_ID=week_day.ID;";
        return c;
      }
      public  String ADD_TA_Day(String ta_ID,String Day_ID){
        String c = "insert into ta_day values ("+ta_ID+','+Day_ID+");";
        return c;
      }
      public  String Drop_TA_Day(String ta_ID,String Day_ID){
        String c = "delete from ta_day where ta_ID="+ta_ID+" and day_ID="+Day_ID+";";
        return c;
      }
         public  String get_TA_courses(String TA_ID){
        String c = "select ID,name from courses where C_TA="+TA_ID+";";
        return c;
      }
      public  String delete_TA_course(String course_ID){
        String c = "update courses set C_TA= null where ID="+course_ID+";";
        return c;
      }
        /* public  String Assign_course_to_prof(String Course_ID,String Prof_ID){
        String c = "update courses set C_prof="+Prof_ID+ " where ID="+Course_ID;
        return c;
      }
         public  String Assign_course_to_TA(String Course_ID,String TA_ID){
        String c = "update courses set C_TA="+TA_ID+ " where ID="+Course_ID;
        return c;
      }
          public  String Assign_labHRs_to_course(String Course_ID,String Lab_HRs){
        String c = "update courses set Lab_HRs="+Lab_HRs+ " where ID="+Course_ID;
        return c;
      }*/
      
      //Admin -> courses page -> Queries
            public  String Add_course(String ID,String name,String Lab_HRs,String lec_HRs,String sec_HRs,String C_prof,String C_TA,String Year){
        String c = "insert into courses values("+ID+','+"\""+name+"\""+','+Lab_HRs+','+lec_HRs+','+sec_HRs+','+C_prof+','+C_TA+','+Year+')';
        return c;
      }
              public  String update_course(String ID,String name,String Lab_HRs,String lec_HRs,String sec_HRs,String C_prof,String C_TA,String Year){
        String c = "update courses set ID="+ID+','+" name= \""+name+"\""+','+"Lab_HRs="+Lab_HRs+','+"lec_HRs="+lec_HRs+','+"sec_HRs="+sec_HRs+','+"C_prof="+C_prof+','+"C_TA="+C_TA+','+"Year="+Year+" where ID="+ID+";";
        return c;
      }
              public  String Add_Precourse_to_course(String Course_ID,String Precourse_ID ){
        String c = "insert into precourses values("+Course_ID+','+Precourse_ID+");";
        return c;
        
      }
              public  String Delete_course_Precourse(String Course_ID,String Precourse_ID){
        String c = "delete from precourses where crs_ID="+Course_ID+" and pre_ID="+Precourse_ID+";";
        return c;
        
      }
              public  String search_for_course_ByID(String Course_ID){
        String c = "select * from courses where ID="+Course_ID+";";
        return c;
        
      }
              public  String search_for_course_ByName(String Course_Name){
        String c = "select * from courses where name="+"\""+Course_Name+"\""+";";
        return c;
        
      }
              
              public  String Delete_course(String Course_ID){
        String c = "Delete from courses where ID="+Course_ID+";";
        return c;
        
      }
              //          =======================================================
              
             // admin -> Class -> queries 
              public  String Add_Class(String ID,String Department_name ){
                  
        String c = "insert into classroom values("+ID+','+"\""+ Department_name+"\");";
        return c;
      }   
              public  String delete_Class(String ID){
                  
        String c = "delete from classroom where ID = "+ID+";";
        return c;
      }   
}
