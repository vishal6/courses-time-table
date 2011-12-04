/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coursetimetable;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Nody
 */
//this to connect to the database
public class connect {
    //this fucntion used in searching in the database
    public ResultSet SearchConnection(String query){
        try{
           String URL="jdbc:mysql://localhost:3306/course_timetable";
           String Driver="com.mysql.jdbc.Driver";
           
           Class.forName(Driver);
           Connection conn=DriverManager.getConnection(URL,"root","");
           Statement stm=conn.createStatement();
           ResultSet r=stm.executeQuery(query);
           return r;
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
            return null;
        }
    }
    
    //this function used in Inserting/Updating/Deleting
    public void UpdatingConnection(String query){
        try{
           String URL="jdbc:mysql://localhost:3306/course_timetable";
           String Driver="com.mysql.jdbc.Driver";
           
           Class.forName(Driver);
           Connection conn=DriverManager.getConnection(URL,"root","");
           Statement stm=conn.createStatement();
           stm.executeUpdate(query);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    
}
