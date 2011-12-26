/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coursetimetable;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.sql.*;
import javax.swing.DefaultListModel;

/**
 *
 * @author Nody
 */

/*
 * here we put some different functions 
 */
public class ExtraFunctions {
    //get the user's type while logging
    static int id;                                     //user id while signning in
    public char getTypeUser(int id){
        char c = 'n';                           //null
        if(1000 <= id && id <= 3999){
            if(1000 <= id && id <= 1999)
                c = 'd';                        //the user is Doctor
            else if(2000 <= id && id <= 2999)
                c = 't';                        //the user is Teacher Assistant
            else if(3000 <= id && id <= 3999)
                c = 's';                        //the user is student 
        }
        if(9000 <= id && id <= 9999){
            c = 'a';
        }
        return c;
    }
    
    //choose which frame to go to after loginning
    public JFrame ChooseFrame(char type){
       JFrame f = null;
        if(type == 'd'){
            f = new Professor();
            f.setVisible(true);
        }
        else if(type == 't'){
            /*f = new TAmainframe();
            f.setVisible(true);*/
            JOptionPane.showMessageDialog(null, "Under Construction","Sorry",JOptionPane.OK_OPTION);
        }
        else if(type == 's'){
            f = new Student();
            f.setVisible(true);
        }
        else if(type == 'a'){
            f = new AdminMain();
            f.setVisible(true);
        }
        return f;
    }
    
    
    public void ResetTable(JTable t, int rows, int col){
        for(int i = 0; i<= rows; i++){
            for(int j = 0; j<=col; j++){
                t.setValueAt("", i, j);
            }
        }
    }
    
    //set the user's ID while signning in
    public void SetUserID(int userID)
    {
         id=userID;
    }
 
    //GET USER'S id WHILE signning in
    public int GetUserID(){
        return id;
    }
    
    //gets the student status
    public boolean  GetStudentAccess()
    {
        boolean check=false;
        procedures prc = new procedures();
        connect c=new connect();
        String query;
        ResultSet r;
        query=prc.get_Student_Access();
        r=c.connection(query);
        String s=null;
        try{
            while(r.next()){
                s=r.getString(1);
            }
        }
        catch(Exception ex){
          JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
        }
        if(s!=null){
         if("T".equals(s))
             check=true;
         else if("F".equals(s))
             check=false;
        }
        return check;
    }
    
    
    //gets the professor status
    public boolean  GetprofAccess()
    {
        boolean check=false;
        procedures prc = new procedures();
        connect c=new connect();
        String query;
        ResultSet r;
        query=prc.get_prof_Access();
        r=c.connection(query);
        String s=null;
        try{
            while(r.next()){
                s=r.getString(1);
            }
        }
        catch(Exception ex){
          JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
        }
        if(s!=null){
         if("T".equals(s))
             check=true;
         else if("F".equals(s))
             check=false;
        }
        return check;
    }
    
    
    //gets the TA status
    public boolean  GetTAAccess()
    {
        boolean check=false;
        procedures prc = new procedures();
        connect c=new connect();
        String query;
        ResultSet r;
        query=prc.get_TA_Access();
        r=c.connection(query);
        String s=null;
        try{
            while(r.next()){
                s=r.getString(1);
            }
        }
        catch(Exception ex){
          JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
        }
        if(s!=null){
         if("T".equals(s))
             check=true;
         else if("F".equals(s))
             check=false;
        }
        return check;
    }
    
    //checks for the courses of the student to be taken
    public boolean CheckStudentCourse(int stdID, DefaultListModel crID){
        boolean check=false;
        String query;
        ResultSet r;
        procedures prc=new procedures();
        connect c=new connect();
        DefaultListModel list=new DefaultListModel();
        try{
            int count = 0;
            query =prc.GetNumberofCourseforStudent(stdID);
            r=c.connection(query);
            while(r.next()){
                count=Integer.parseInt(r.getString(1));
            }
            int[] crsIDs=new int[count];
            query = prc.GetTakensCourseID(stdID);
            r=c.connection(query);
            for(int i=0; r.next(); i++){
                crsIDs[i]=Integer.parseInt(r.getString(1));                     //courses that student took
            }
            Object[] newcrs=crID.toArray();                                     //new courses that student want to take
            int[] newcrss=new int[newcrs.length];
            for(int i=0; i<newcrs.length; i++){
                query=prc.GetCourseID(newcrs[i].toString());
                r=c.connection(query);
                while(r.next()){
                    newcrss[i]=Integer.parseInt(r.getString(1));
                }
            }
            for(int i=0; i<newcrs.length; i++){
                query = prc.GetPrecourse(newcrss[i]);
                r=c.connection(query);
                while(r.next()){
                    list.addElement(r.getString(1));
                }
                Object[] list11=list.toArray();                                 //precourses list of the course that student want to take
                for(int x=0; x<list11.length; x++){
                        if(Integer.valueOf(list11[x].toString())==crsIDs[i]){
                            check =true;
                        }
                        else{
                            check=false;
                            break;
                        }
                }
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
        }
        return check;
    }
    
    
    //checks on  hours for course
    public boolean checkHRs(int hrs){
        boolean check=false;
        String query;
        procedures prc=new procedures();
        connect c=new connect();
        ResultSet r;
        int weeks = 0;
        try{
            query =prc.GetWeeks();
            r=c.connection(query);
            while(r.next()){
                weeks=Integer.parseInt(r.getString(1));
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
        }
        if(hrs%weeks==0)
            check=true;
        else
            check=false;
        return check;
    }
    
 }
    

