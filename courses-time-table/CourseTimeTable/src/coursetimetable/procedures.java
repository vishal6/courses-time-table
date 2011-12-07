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
    
}
