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
    // get the no of weeks , and no of slots per day
      public  String get_No_of_weeks(){
        String c = "select No_Weeks from system_status";
        return c;
    
      }
      public  String get_No_of_slots(){
        String c = "select No_Of_Slots_per_day from system_status";
        return c;
    
      }
           public  String get_No_of_days(){
        String c = "select count(*) from week_day";
        return c;
    
      }
        public  String get_All_classes(){
        String c = "select ID from classroom";
        return c;
    
      }
  
               public  String get_CourseProf_Days(String course_name){
        String c = "select week_day.ID from courses inner join prof_day inner join week_day where courses.name = \""+course_name+"\" and prof_day.prof_ID = courses.C_prof and prof_day.day_ID = week_day.ID";
        return c;
    
      }
                   public  String get_course_hours(String course_name){
        String c = "select lec_HRs,sec_HRs,Lab_HRs from courses where name= \""+course_name+"\";";
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
      public  String ADD_Person(String ID,String first_Name, String last_Name,String password,String Gender,String Mail,String mobile){
        String c = "insert into person (ID,first_name,last_name,password,Gender,Mail,Mobile) values("+ID+','+"\""+first_Name+"\""+','+"\""+last_Name+"\""+','+"\""+password+"\""+','+"\'"+Gender+"\'"+','+"\""+Mail+"\""+','+mobile+')';
        return c;
    
      }
      public  String Update_Person(String ID,String first_Name, String last_Name,String password,String Gender,String phone,String mobile){
        String c = "update person set "+"first_name="+"\""+first_Name+"\""+','+"last_name="+"\""+last_Name+"\""+','+"password="+"\""+password+"\""+','+"Gender="+"\'"+Gender+"\'"+','+"Mail="+"\""+phone+"\""+','+"Mobile="+mobile+"where ID ="+ID+';';
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
      
             public  String get_All_courses(){
        String c = "SELECT ID,name  FROM courses "+";";
        return c;
        
      }
            public  String Add_course(String ID,String name,String Lab_HRs,String lec_HRs,String sec_HRs,String C_prof,String C_TA,String Year){
        String c = "insert into courses values("+ID+','+"\""+name+"\""+','+Lab_HRs+','+lec_HRs+','+sec_HRs+','+C_prof+','+C_TA+','+Year+')';
        return c;
      }
              public  String update_course(String ID,String name,String Lab_HRs,String lec_HRs,String sec_HRs,String C_prof,String C_TA,String Year){
        String c = "update courses set ID="+ID+','+" name= \""+name+"\""+','+"Lab_HRs="+Lab_HRs+','+"lec_HRs="+lec_HRs+','+"sec_HRs="+sec_HRs+','+"C_prof="+C_prof+','+"C_TA="+C_TA+','+"Year="+Year+" where ID="+ID+";";
        return c;
      }
              public  String get_NoOfCourses(){
        String c = "SELECT COUNT(*)  FROM courses "+";";
        return c;
        
      }
              public  String get_NoOfStudents_in_Course(String Course_name){
        String c = "SELECT COUNT(std_ID) AS No_of_students FROM take_course inner join courses WHERE take_course.crs_ID=courses.ID and courses.name="+"\""+Course_name+"\""+";";
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
                      public  String get_course_id(String Course_Name){
        String c = "select ID from courses where name="+"\""+Course_Name+"\""+";";
        return c;
        
      }
                         public  String get_course_prof(String crs_name){
        String c = "select C_prof from courses where name="+"\""+crs_name+"\""+";";
        return c;
                         }
                               public  String get_course_TA(String crs_name){
        String c = "select C_TA from courses where name="+"\""+crs_name+"\""+";";
        return c;
                         }
                     public  String get_course_students(String crs_name){
        String c = "select std_ID from take_course INNER JOIN courses where name="+"\""+crs_name+"\""+"and ID=crs_ID"+";";
        return c;
                         }
                       public  String get_course_name(){
        String c = "select name from courses ;";
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

        
        //////////////////////////////////////////////////////////////////////////////////////////////////////////
        //gets the course ID
        public String GetTakensCourseID(int STD_ID){
            String c ="select crs_ID from take_course where std_ID="+STD_ID;
            return c;
        }
        
        //gets number of courses that student takes
        public String GetNumberofCourseforStudent(int std_id){
            String c ="select count(*) from take_course where std_ID="+std_id;
            return c;
        }
        
        
        //gets Course Name
        public String GetCourseName(int crs_ID){
            String c="select name from courses where ID="+crs_ID;
            return c;
        }
        
        //gets number of subject for the selected student
        public String GetNumberofSubjects(int std_ID){
            String c ="select count(*) from take_course where std_ID="+std_ID;
            return c;
        }
        
        
        //gets the course ID
        public String GetCourseID(String crs_name){
            String c ="select ID from courses where name='"+crs_name+"'";
            return c;
        }
        
        //admin updates student
        public String UpdateStudent(int id, String f_name, String l_name){
            String c = "update person set first_name='"+f_name+"',last_name='"+l_name+"'where id ="+id;
            return c;
        }
        
        //gets number of subject for the selected student
        public String GetNumberofCourses(int prof_ID){
            String c ="select count(*) from courses where c_prof="+prof_ID+";";
            return c;
        }
        
        //gets number of subject for the selected student
        public String GetNumberofCoursesTA(int prof_ID){
            String c ="select count(*) from courses where c_ta="+prof_ID+";";
            return c;
        }
        
        //admin updates the professor
        public String UpdateProfessor(int id, String f_name, String l_name){
            String c = "update person set first_name='"+f_name+"',last_name='"+l_name+"'where id ="+id;
            return c;
        }
        
        //get all courses
        public String GetAllCourses(){
            String c ="select * from courses";
            return c;
        }
        
        //gets all professors
        public String GetAllProfessor(){
            String c = "select first_name, last_name from person where id between 1000 and 1999;";
            return c;
        }
        
         //gets all TA
        public String GetAllTA(){
            String c = "select first_name, last_name from person where id between 2000 and 2999;";
            return c;
        }
        
        //get the name of all courses
        public String GetAllCourseName(){
            String c="select name from courses";
            return c;
        }
        
        //gets the number of professors
        public String GetNumberofProfessor(){
            String c = "select count(*) from person where id between 1000 and 1999";
            return c;
        }
        
        //gets the number of TA
        public String GetNumberofTA(){
            String c = "select count(*) from person where id between 2000 and 2999";
            return c;
        }
        
        //gets Professor's ID
        public String GetPersonID(String FirstName, String LastName, int Upper, int lower){
            String c = "select id from person where first_name='"+FirstName+"' and last_name ='"+LastName+"' and id between "+Upper+" and "+lower+";";
            return c;
        }
        
        //gets all classes
        public String GetClassrooms(){
            String c = "select * from classroom;";
            return c;
        }
        
        //searches classes by class ID
        public String SearchClassbyID(int id){
            String c ="select id, deprtment_name from classroom where id ="+id+";";
            return c;
        }
        
        //updates classroom
        public String UpdateClass(int id, String dep_name){
            String c ="update classroom set deprtment_name='"+dep_name+"' where id = "+id+";";
            return c;
        }
        
        //updates person's mobile, gender, mail, password
        public String UpdatePerson_PersonView(int id, String mail, String gender, String mobile, int password){
            String c = "update person set mail='"+mail+"', gender='"+gender+"',mobile='"+mobile+"', password ='"+password+"' where id="+id+";";
            return c;
        }
        
        //gets the percourses of the selected course
        public String GetPrecourse(int crsID){
            String c="select pre_ID from precourses where crs_ID="+crsID;
            return c;
        }
        
        //gets number of precourses of the course
        public String GetNumberofPrecourses(int crsID){
            String c="select count(*) from precourses where crs_ID="+crsID;
            return c;
        }
        
        //gets the number of courses of sepecified professor
        public String GetNumberofCoursesforProfessor(int profID){
            String c = "select count(*) from courses where C_prof="+profID;
            return c;
        }
        
        //gets the number of days availble to the professor
        public String GetNumberofDaysforProfessor(int profID){
            String c="select count(*) from prof_day where prof_id="+profID;
            return c;
        }
        
        //get the name of the day
        public String GetDayName(int dayID){
            String c="select name from week_day where ID="+dayID;
            return c;
        }
        
        //gets the days in the week
        public String GetWeekDays(){
            String c="select name from week_day";
            return c;
        }
        
        //get day's ID
        public String GetDayID(String dayName){
            String c="select id from week_day where name='"+dayName+"';";
            return c;
        }
        
        //get all week days
        public String GetAllWeek(){
            String c="select * from week_day";
            return c;
        }
        
        //gets all system status
        public String GetSystemStatus(){
            String c="select * from system_status";
            return c;
        }
        
        //updates system status
        public String UpdateSystem(int weeks, int slots, int semester, int year){
            String c="update system_status set current_year="+year+", current_semster="+semester+", no_weeks="+weeks+", no_of_slots_per_day="+slots;
            return c;
        }
        
        //get number of weeks in term
        public String GetWeeks()
        {
            String c="select no_weeks from system_status";
            return c;
        }
        
        public  String Drop_course_from_person(String Course_ID,String person_ID){
        String c = "delete from take_course where std_ID="+person_ID+" and crs_ID="+Course_ID+";";
        return c;
      }
        public  String search_for_person_ByName(String Student_FName,String Student_LName, int upper, int lower){
         String c ="";
         if(Student_FName.isEmpty() & Student_LName != "")
             c = "select * from person where  last_name="+"\""+Student_LName+"\""+"and id between "+upper+" and "+lower+";";
         else if(Student_FName != "" & Student_LName.isEmpty())
             c = "select * from person where first_name="+"\""+Student_FName+"\""+"and id between "+upper+" and "+lower+";";
         else if(Student_FName !="" & Student_LName != "")
             c = "select * from person where first_name="+"\""+Student_FName+"\""+" and last_name="+"\""+Student_LName+"\""+" and id between "+upper+" and "+lower+";";
                  return c;
        
      }
                                            /*views*/
              //student view
        public String GetStudentView(){
        String c = "select * from person where id between 3000 and 3999";
        return c;
        }
        
        //student view for semster
        public String GetStudentNewSmesterView(){
            String c="select ID, first_name, last_name from person where id between 3000 and 3999";
            return c;
        }
        
        //professor view
        public String GetProfessorView(){
            String c = "select * from person where id between 1000 and 1999";
            return c;
        }
        
        //TA view
        public String GetTAView(){
            String c="select * from person where id between 2000 and 2999";
            return c;
        }
        
}
