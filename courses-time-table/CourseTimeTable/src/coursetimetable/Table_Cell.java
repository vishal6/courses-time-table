/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coursetimetable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tarek
 */

public final class Table_Cell 
{   
    int slot;
    int Day_ID;
    String Day_Name;
    public Room[] lecture_rooms;
    int lecture_rooms_index; // represent how many courses have been assigned to the array of rooms\
    public Room[] lab_rooms;
    int lab_rooms_index;
    public Table_Cell(List<Integer> lecture_Rooms_IDs,List<Integer> lab_Rooms_IDs)
    {
        lecture_rooms = new Room[lecture_Rooms_IDs.size()];
        for (int i = 0; i <lecture_Rooms_IDs.size(); i++) {
            lecture_rooms[i]= new Room();
            lecture_rooms[i].room_id = lecture_Rooms_IDs.get(i);
        }
        lab_rooms = new Room[lab_Rooms_IDs.size()];
        for (int i = 0; i <lab_Rooms_IDs.size(); i++) {
            lab_rooms[i]= new Room();
            lab_rooms[i].room_id = lab_Rooms_IDs.get(i);
        }
    }
    public void Set_Day_Name(List<Day> d)
    {
       for (int i=0 ;i< d.size();i++)
       {
         if(d.get(i).Day_id==Day_ID)
         {
            Day_Name= d.get(i).Day_Name;
         }
       }
    }
   
    
}

