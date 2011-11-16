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
    //prof
    public String prof(){
        String pr="select  id,first_name from prof";
        return pr;
    }
    //student
    public String std(){
        String s="select ID,first_name from student ";
        return s;
    }
    
    //TA
    public String ta(){
        String t = "select id, first_name from ta";
        return t;
    }
    
    //courses
    public  String course(){
        String c = "select id,name from courses";
        return c;
    }
    
}
