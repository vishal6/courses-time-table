/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coursetimetable;


import java.awt.*;
//import java.awt.geom.Rectangle2D;
import java.awt.geom.*;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JFrame;

import javax.swing.JScrollPane;


import org.jgraph.JGraph;
import org.jgraph.graph.DefaultEdge;

import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.DefaultGraphModel;
import org.jgraph.graph.GraphConstants;
import org.jgraph.graph.GraphModel;
import java.util.*;
import javax.swing.JViewport;
import org.w3c.dom.css.RGBColor;

/**
 *
 * @author Tarek
 */
public class conflict {
         public static JGraph DrawGraph (String [] s_a , int w,int m [] [])
    {
          GraphModel model = new DefaultGraphModel();
         JGraph graph = new JGraph(model);
         // Control-drag should clone selection
         graph.setCloneable(true); // da 3shan t enable eno yl3ab bl nodes ymen w shmal :D 
         graph.setJumpToDefaultPort(true);
      
         graph.setBackground( Color.white );
         
         DefaultGraphCell[] cells = new DefaultGraphCell[s_a.length + w]; // kol cell mn l cells d bt3aber 3an mad htb2a 3andk 
            Random number = new  Random();       
         for(int i=0 ;i< s_a.length ;i++)
                  {
                       int x = number.nextInt(500) ; 
                       int y = number.nextInt(500);
                        cells[i]=createVertex(s_a[i], x, y, 100,100, Color.CYAN, true);
                      
                  }
      
        
         DefaultEdge [] E= new DefaultEdge  [w];
         for (int i = 0; i < w; i++) {
             E[i]=new DefaultEdge("");
            
        }
         int v=0;
        
         
         
                
                  
                      for(int j=0 ;j< m.length;j++)
                      {
                          for(int z=j+1;z<m.length;z++)
                          {
                               
                               
                              if(m[j][z]==1 || m[j][z]==2)
                              {
                                 
                                 
                                  E[v].setSource(cells[z].getChildAt(0));
                                  E[v].setTarget(cells[j].getChildAt(0));
                                  cells[s_a.length+v  ] = E[v];
                                  GraphConstants.setLineEnd(E[v].getAttributes(),0);
                                  GraphConstants.setEndFill(E[v].getAttributes(), true);
                                  v++;
                                 
                                  
                              }
                               
                              
                          }
                              }
                     

                
                 graph.getGraphLayoutCache().insert(cells);     // d b2a 3sahn trsem l lela kolha 
                 graph.setPortsScaled(true);                       
                 return graph;
    }
  public static DefaultGraphCell createVertex(String name, double x, double y, double w, double h, Color bg, boolean raised) {
// l Fn d hya l princes bta3et l lelaa :)  hya ly btdef vertex ll graph bta3ak :D 
        // Create vertex with the given name
        DefaultGraphCell cell = new DefaultGraphCell(name);

        // Set bounds
        GraphConstants.setBounds(cell.getAttributes(),new Rectangle2D.Double(x, y, w, h));
      GraphConstants.setAbsolute(cell.getAttributes(), true);
      GraphConstants.setConnectable(cell.getAttributes(), true);
      
        // Set fill color
        if (bg != null) {
            GraphConstants.setGradientColor(cell.getAttributes(), bg);
            GraphConstants.setOpaque(cell.getAttributes(), true);
        }

        // Set raised border
        if (raised) {
            GraphConstants.setBorder(cell.getAttributes(),BorderFactory.createTitledBorder(""));
        } else // Set black border
        {
            GraphConstants.setBorderColor(cell.getAttributes(),Color.WHITE);
        }
        // Add a Floating Port
        cell.addPort();
        return cell;
    }
 

}
