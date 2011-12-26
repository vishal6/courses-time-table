/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Admin_Main.java
 *
 * Created on Dec 3, 2011, 12:49:03 AM
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


/**
 *
 * @author mahmoud
 */
public class ConfilctGraph extends javax.swing.JFrame {

    /** Creates new form Admin_Main */
    public ConfilctGraph() {
      
        this.setLocation(200, 100);
        this.setResizable(false);
        
        initComponents();
      
       
         //this.Professor_Tap_Button_Visble(true);
    }
  
     public static JGraph DrawGraph (String [] s_a , int w,int m [] [])
    {
          GraphModel model = new DefaultGraphModel();
         JGraph graph = new JGraph(model);
         // Control-drag should clone selection
         graph.setCloneable(true); // da 3shan t enable eno yl3ab bl nodes ymen w shmal :D 
         graph.setJumpToDefaultPort(true);
         graph.setBackground(Color.WHITE);
         
         DefaultGraphCell[] cells = new DefaultGraphCell[s_a.length + w]; // kol cell mn l cells d bt3aber 3an mad htb2a 3andk 
            Random number = new  Random();       
         for(int i=0 ;i< s_a.length ;i++)
                  {
                       int x = number.nextInt(500) ; 
                       int y = number.nextInt(500);
                        cells[i]=createVertex(s_a[i], x, y, 50,50, Color.black, true);
                      
                  }
      
        
         DefaultEdge [] E= new DefaultEdge  [w];
         for (int i = 0; i < w; i++) {
             E[i]=new DefaultEdge("");
            
        }
         int v=0;
        
         
         
                
                  
                      for(int j=0 ;j< m.length;j++)
                      {
                          for(int z=0;z<m.length;z++)
                          {
                               
                               
                              if(m[j][z]==1)
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
                     
//                  
         // TO set cells with subjects naames and to define its atributs data :D 2alk color w x,y,w kman l size bta3 l bolck ;)
         //d 3shan arsem l edges between l nodes ;)
              //   DefaultEdge edges = new DefaultEdge(""); // bt3aref edge w btdelo esm lw 3ayz tsameh ;) lw msh 3ays fakes farhada
               //  edges.setSource(cells[0].getChildAt(0)); // hna bt3aref l bdaya bra3et l edge 
                // edges.setTarget(cells[1].getChildAt(0));// hna bt7aded l nhaya bta3et l edge 
                // cells[4] = edges; // 5aly balak b2a 3shan enta bt3aref cell zyada t7ot feha l edge bta3ek 3shan t3ref trabet ben l cells 
                // GraphConstants.setLineEnd(edges.getAttributes(),0);
                 //GraphConstants.setEndFill(edges.getAttributes(), true);  
                  // DefaultEdge edge1 = new DefaultEdge(""); // bt3aref edge w btdelo esm lw 3ayz tsameh ;) lw msh 3ays fakes farhada
                 //edge1.setSource(cells[1].getChildAt(0)); // hna bt3aref l bdaya bra3et l edge 
                 //edge1.setTarget(cells[2].getChildAt(0));// hna bt7aded l nhaya bta3et l edge 
                 //cells[5] = edge1; // 5aly balak b2a 3shan enta bt3aref cell zyada t7ot feha l edge bta3ek 3shan t3ref trabet ben l cells 
                 //GraphConstants.setLineEnd(edges.getAttributes(),0);
                 //GraphConstants.setEndFill(edges.getAttributes(), true);  
                
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
            GraphConstants.setBorderColor(cell.getAttributes(),Color.black);
        }
        // Add a Floating Port
        cell.addPort();
        return cell;
    }
 

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        scrollPane1 = new java.awt.ScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(coursetimetable.CourseTimeTableApp.class).getContext().getResourceMap(ConfilctGraph.class);
        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        scrollPane1.setName("scrollPane1"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 520, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jButton2)
                .addGap(0, 284, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
JFrame frame = new JFrame("Conflex Graph");  //bt3arf b2a JFrame  tb3atlo l graph d3shan yrsemo 
        frame.setLocation(100,100);
        frame.setSize(500,500);
        int  [][] m = new int [10][10];
        for(int i=0;i< 10 ;i++)
        {
            for(int j =0; j<10;j++)
            {
          m[i][j]=0;
                  }
        }
        String [] s= {"1","2","3","4","5","6","7","8","9","10"};
        m[0][1]=1;
        m[1][2]=1;
        m[2][5]=1;
        m[3][1]=1;
        m[6][7]=1;
        m[5][6]=1;
        m[6][8]=1;
        m[8][5]=1;
        m[5][9]=1;
        m[9][8]=1;
        m[9][6]=1;
        
        
        JScrollPane scrol=new JScrollPane();
          frame.getContentPane().add(scrol.add(DrawGraph(s,11,m)));
          // scrollPane1.add(DrawGraph(s,11,m));
       
      //  frame.getContentPane().add(new JScrollPane(DrawGraph(s,11,m))); //w GOOOOOOOOOOOOOOOOOOON;)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setVisible(true);      
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ConfilctGraph().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
}
