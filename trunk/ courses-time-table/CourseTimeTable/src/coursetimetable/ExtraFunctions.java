/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coursetimetable;
import javax.swing.JFrame;

/**
 *
 * @author Nody
 */

/*
 * here we put some different functions 
 */
public class ExtraFunctions {
    //get the user's type while logging
    public char getTypeUser(int id){
        char c = 'n';                           //null
        if(1000 <= id && id <= 9999){
            if(1000 <= id && id <= 1999)
                c = 'd';                        //the user is Doctor
            else if(2000 <= id && id <= 2999)
                c = 't';                        //the user is Teacher Assistant
            else if(3000 <= id && id <= 3999)
                c = 's';                        //the user is Student
            else if(9000 <= id && id <= 9999)
                c = 'a';                        //the user is Admin
        }
        return c;
    }
    
    //choose which frame to go to after loginning
    public JFrame ChooseFrame(char type){
       JFrame f = null;
        if(type == 'a'){                        //Admin
            f = new AdminMain();
            f.setVisible(true);                 //access the Admin Main Frame
        }
        else if(type == 'd'){                   //Doctor
            f = new DoctorMain();
            f.setVisible(true);
        }
        else if(type == 't'){                   //Teacher Assistant
            f = new TAMain();
            f.setVisible(true);
        }
        else if(type == 's'){                   //Student
            f = new StudentMain();
            f.setVisible(true);
        }
        return f;
    }
    
}
