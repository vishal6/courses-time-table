/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coursetimetable;

import java.sql.*;
import javax.sql.*;
import javax.swing.*;
/**
 *
 * @author Nody
 */
//connect to the database and search queries
public class connect {
    public ResultSet connection(String query){
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
    
    
    
    //connect to database for delete or update or insert
    public int UpdateConnection(String query){
        int check = 0;
        try{
           String URL="jdbc:mysql://localhost:3306/course_timetable";
           String Driver="com.mysql.jdbc.Driver";
           
           Class.forName(Driver);
           Connection conn=DriverManager.getConnection(URL,"root","");
           Statement stm=conn.createStatement();
           check = stm.executeUpdate(query);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        return check;
    }
}
