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


import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author mahmoud
 */
public class AdminMain extends javax.swing.JFrame {
    connect c = new connect();                      //donnect driver class
    procedures prc = new procedures();              //procedures object
    public ResultSet r;                             //data container
    char job;                                       //specify user's type (job)
    ExtraFunctions extra = new ExtraFunctions();    //object to access the extra functions
    char type = ' ';
    String query;                                   //to get the query in it
    int count;                                      //gets the number of rows in the resulted query
    int check, check1;                              //checks if the query is excuted succefully or not
    int crsID;
    

    /** Creates new form Admin_Main */
    public AdminMain() {
        this.setTitle("Administrator Main Window");
        this.setLocation(200, 100);
        this.setResizable(false);
        
        initComponents();
        this.Add_St_Visble(false);
        this.Show_Current_Visble(false);
        this.Student_Update_Visble(false);
        this.Add_Pr_Visble(false);
        this.Pr_Show_Current_Visble(false);      // professor tap
        this.Professor_Update_Visble(false);
        this.index=0;
         //this.Professor_Tap_Button_Visble(true);
        jTextField26.setVisible(false);
        try{
            
            query = prc.get_Current_Year();
            r=c.connection(query);
            while(r.next()){
                jLabel2.setText(r.getString(1));
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "error "+ex.toString());
        }
    }
    private int index;
    
    private  void Add_St_Visble(boolean  b)
    {
     jLabel13.setVisible(b);
     jLabel14.setVisible(b);
     jLabel15.setVisible(b);
     jLabel16.setVisible(b);
     jLabel17.setVisible(b);
     jTextField1.setVisible(b);
     jTextField2.setVisible(b);
     jPasswordField1.setVisible(b);
     jTextField4.setVisible(b);
     jTextField5.setVisible(b);
     jButton2.setVisible(b);
     jLabel6.setVisible(b);
     jComboBox5.setVisible(b); 
    }
    private  void Show_Current_Visble(boolean  b)
    {
     jLabel19.setVisible(b);
     jLabel18.setVisible(b);
     jTextField6.setVisible(b);
     jTextField7.setVisible(b);
     jButton11.setVisible(b);
     jButton12.setVisible(b);
     jButton13.setVisible(b);
     jButton14.setVisible(b);
     jScrollPane1.setVisible(b);
    }
    private  void Student_Update_Visble(boolean  b)
    {
     jLabel20.setVisible(b);
     jComboBox1.setVisible(b);
     jLabel13.setVisible(b);
     jLabel17.setVisible(b);
     jTextField4.setVisible(b);
     jTextField5.setVisible(b);
     jButton16.setVisible(b);
     jButton15.setVisible(b);
     jButton45.setVisible(b);
     
     
    }
     private  void Student_Tap_Button_Visble(boolean  b)
    {
     jButton3.setVisible(b);
     jButton10.setVisible(b);  
     jButton16.setVisible(b);
     
    }
     private  void Add_Pr_Visble(boolean  b)
    {
     jLabel26.setVisible(b);
     jLabel27.setVisible(b);
     jLabel28.setVisible(b);
     jLabel24.setVisible(b);
     jTextField11.setVisible(b);
     jTextField12.setVisible(false);
     jPasswordField2.setVisible(b);
     jTextField13.setVisible(b);
     jTextField14.setVisible(b);
     jButton20.setVisible(b);
     jComboBox6.setVisible(b);
     jLabel7.setVisible(b);
     
     
    
    }
    private  void Pr_Show_Current_Visble(boolean  b)
    {
     jLabel23.setVisible(b);
     jLabel22.setVisible(b);
     jTextField8.setVisible(b);
     jTextField9.setVisible(b);
     jButton19.setVisible(b);
     jButton23.setVisible(b);
     jButton17.setVisible(b);
     jButton18.setVisible(b);
     jScrollPane2.setVisible(b);
    }
    private  void Professor_Update_Visble(boolean  b)
    {
     jLabel21.setVisible(b);
     jComboBox2.setVisible(b);
     jLabel24.setVisible(b);
     jLabel28.setVisible(b);
     jTextField13.setVisible(b);
     jTextField14.setVisible(b);
     jButton24.setVisible(b);
     jButton25.setVisible(b);
     jButton44.setVisible(b);
     
    }
     private  void Professor_Tap_Button_Visble(boolean  b)
    {
     jButton21.setVisible(b);
     jButton22.setVisible(b);  
    
     
    }
     
     
     private  void Add_Ta_Visble(boolean  b)
    {
     jLabel45.setVisible(b);
     jLabel46.setVisible(b);
     jLabel47.setVisible(b);
     jLabel48.setVisible(b);
     //jTextField26.setVisible(b);
     jTextField25.setVisible(b);
     jPasswordField3.setVisible(b);
     jTextField27.setVisible(b);
     jTextField28.setVisible(b);
     jButton50.setVisible(b);
     jComboBox8.setVisible(b);
     jLabel10.setVisible(b);
     
     
    
    }
    private  void Ta_Show_Current_Visble(boolean  b)
    {
     jLabel30.setVisible(b);
     jLabel43.setVisible(b);
     jTextField10.setVisible(b);
     jTextField24.setVisible(b);
     jButton47.setVisible(b);
     jButton48.setVisible(b);
     jButton49.setVisible(b);
     jButton52.setVisible(b);
     jScrollPane5.setVisible(b);
    }
    private  void Ta_Update_Visble(boolean  b)
    {
     jLabel25.setVisible(b);
     jComboBox7.setVisible(b);
     jLabel45.setVisible(b);
     jLabel48.setVisible(b);
     jTextField28.setVisible(b);
     jTextField27.setVisible(b);
     jButton53.setVisible(b);
     jButton54.setVisible(b);
     jButton55.setVisible(b);
     
    }
     private  void Ta_Tap_Button_Visble(boolean  b)
    {
     jButton46.setVisible(b);
     jButton51.setVisible(b);  
    
     
    }
     
     
     
      private  void Add_Cr_Visble(boolean  b)
    {
     jLabel23.setVisible(b);
     jLabel32.setVisible(b);
       jButton58.setVisible(b);
     jLabel33.setVisible(b);
     jLabel34.setVisible(b);
     jLabel35.setVisible(b);
     jLabel37.setVisible(b);
     jLabel38.setVisible(b);
     jLabel39.setVisible(b);
     jLabel40.setVisible(b);
     jTextField16.setVisible(b);
     jTextField17.setVisible(b);
     jTextField18.setVisible(b);
     jTextField20.setVisible(b);
      jTextField21.setVisible(b);
      jComboBox3.setVisible(b);
      jComboBox4.setVisible(b);
     jButton30.setVisible(b);
     
     
    
    }
    private  void Cr_Show_Current_Visble(boolean  b)
    {
     jLabel31.setVisible(b);
     jTextField15.setVisible(b);
     jButton27.setVisible(b);
     jButton28.setVisible(b);
     jButton34.setVisible(b);
     jButton29.setVisible(b);
   
     jScrollPane3.setVisible(b);
     
    }
    private  void Course_Update_Visble(boolean  b)
    {
     jLabel23.setVisible(b);
     jLabel32.setVisible(b);
     jLabel33.setVisible(b);
     jLabel34.setVisible(b);
     jLabel35.setVisible(b);
     jLabel37.setVisible(b);
     jLabel38.setVisible(b);
     jLabel39.setVisible(b);
     jLabel40.setVisible(b);
     jTextField16.setVisible(b);
     jTextField17.setVisible(b);
     jTextField18.setVisible(b);
     jTextField20.setVisible(b);
      jTextField21.setVisible(b);
      jButton58.setVisible(b);
      jComboBox3.setVisible(b);
      jComboBox4.setVisible(b);
     jButton32.setVisible(b);
     jButton43.setVisible(b);
     
    }
     private  void Course_Tap_Button_Visble(boolean  b)
    {
     jButton31.setVisible(b);
     jButton26.setVisible(b); 
    }
        private  void Add_Cl_Visble(boolean  b)
    {
     jLabel42.setVisible(b);
     jLabel44.setVisible(b);
     jTextField22.setVisible(b);
     jTextField23.setVisible(b);
     jButton38.setVisible(b);
     
     
    
    }
    private  void Cl_Show_Current_Visble(boolean  b)
    {
     jLabel41.setVisible(b);
     jTextField19.setVisible(b);
     jButton35.setVisible(b);
     jButton36.setVisible(b);
     jButton37.setVisible(b);
     jButton41.setVisible(b);
     jScrollPane4.setVisible(b);
    }
    private  void Class_Update_Visble(boolean  b)
    {
    jLabel42.setVisible(b);
     jLabel44.setVisible(b);
     jTextField22.setVisible(b);
     jTextField23.setVisible(b);
     jButton40.setVisible(b);
     jButton42.setVisible(b);
     
     
    }
     private  void Class_Tap_Button_Visble(boolean  b)
    {
     jButton33.setVisible(b);
     jButton39.setVisible(b); 
    }


    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        course_timetablePUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("course_timetablePU").createEntityManager();
        takeCourseQuery = java.beans.Beans.isDesignTime() ? null : course_timetablePUEntityManager.createQuery("SELECT t FROM TakeCourse t");
        takeCourseList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : takeCourseQuery.getResultList();
        coursesQuery = java.beans.Beans.isDesignTime() ? null : course_timetablePUEntityManager.createQuery("SELECT c FROM Courses c");
        coursesList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : coursesQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField7 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jComboBox5 = new javax.swing.JComboBox();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton44 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jButton46 = new javax.swing.JButton();
        jComboBox7 = new javax.swing.JComboBox();
        jTextField10 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jButton47 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jComboBox8 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton55 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton58 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jTextField15 = new javax.swing.JTextField();
        jButton27 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField16 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jTextField21 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jButton33 = new javax.swing.JButton();
        jTextField19 = new javax.swing.JTextField();
        jButton35 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel50 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setName("Form"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                OnClosing(evt);
            }
        });

        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(coursetimetable.CourseTimeTableApp.class).getContext().getResourceMap(AdminMain.class);
        jTabbedPane1.setToolTipText(resourceMap.getString("jTabbedPane1.toolTipText")); // NOI18N
        jTabbedPane1.setName("jTabbedPane1"); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setText(resourceMap.getString("jLabel20.text")); // NOI18N
        jLabel20.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel20.setName("jLabel20"); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 70, 30));

        jComboBox1.setToolTipText(resourceMap.getString("jComboBox1.toolTipText")); // NOI18N
        jComboBox1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jComboBox1.setName("jComboBox1"); // NOI18N
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 110, 40));

        jTextField7.setToolTipText(resourceMap.getString("jTextField7.toolTipText")); // NOI18N
        jTextField7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField7.setName("jTextField7"); // NOI18N
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 90, 30));

        jTextField6.setText(resourceMap.getString("jTextField6.text")); // NOI18N
        jTextField6.setToolTipText(resourceMap.getString("jTextField6.toolTipText")); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField6.setName("jTextField6"); // NOI18N
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 90, 30));

        jLabel19.setText(resourceMap.getString("jLabel19.text")); // NOI18N
        jLabel19.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel19.setName("jLabel19"); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 110, 20));

        jButton11.setText(resourceMap.getString("jButton11.text")); // NOI18N
        jButton11.setToolTipText(resourceMap.getString("jButton11.toolTipText")); // NOI18N
        jButton11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton11.setName("jButton11"); // NOI18N
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 180, -1));

        jLabel18.setText(resourceMap.getString("jLabel18.text")); // NOI18N
        jLabel18.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel18.setName("jLabel18"); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 110, 20));

        jButton13.setText(resourceMap.getString("jButton13.text")); // NOI18N
        jButton13.setToolTipText(resourceMap.getString("jButton13.toolTipText")); // NOI18N
        jButton13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton13.setName("jButton13"); // NOI18N
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 180, -1));

        jButton12.setText(resourceMap.getString("jButton12.text")); // NOI18N
        jButton12.setToolTipText(resourceMap.getString("jButton12.toolTipText")); // NOI18N
        jButton12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton12.setName("jButton12"); // NOI18N
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 180, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name", "Password", "Gender", "E-Mail", "Mobile"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setName("jTable1"); // NOI18N
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setHeaderValue(resourceMap.getString("jTable1.columnModel.title0")); // NOI18N
        jTable1.getColumnModel().getColumn(1).setHeaderValue(resourceMap.getString("jTable1.columnModel.title1")); // NOI18N
        jTable1.getColumnModel().getColumn(2).setHeaderValue(resourceMap.getString("jTable1.columnModel.title2")); // NOI18N
        jTable1.getColumnModel().getColumn(3).setHeaderValue(resourceMap.getString("jTable1.columnModel.title6")); // NOI18N
        jTable1.getColumnModel().getColumn(4).setHeaderValue(resourceMap.getString("jTable1.columnModel.title3")); // NOI18N
        jTable1.getColumnModel().getColumn(5).setHeaderValue(resourceMap.getString("jTable1.columnModel.title4")); // NOI18N
        jTable1.getColumnModel().getColumn(6).setHeaderValue(resourceMap.getString("jTable1.columnModel.title5")); // NOI18N

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 530, 190));

        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setToolTipText(resourceMap.getString("jButton2.toolTipText")); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 140, 30));

        jButton3.setText(resourceMap.getString("jButton3.text")); // NOI18N
        jButton3.setToolTipText(resourceMap.getString("jButton3.toolTipText")); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 170, 40));

        jLabel13.setFont(resourceMap.getFont("Student_Fn_Label.font")); // NOI18N
        jLabel13.setText(resourceMap.getString("Student_Fn_Label.text")); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel13.setName("Student_Fn_Label"); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 90, 30));

        jTextField1.setText(resourceMap.getString("Student_Year_Text.text")); // NOI18N
        jTextField1.setToolTipText(resourceMap.getString("Student_Year_Text.toolTipText")); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField1.setName("Student_Year_Text"); // NOI18N
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 150, -1));

        jLabel14.setFont(resourceMap.getFont("Student_Year_Label.font")); // NOI18N
        jLabel14.setText(resourceMap.getString("Student_Year_Label.text")); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel14.setName("Student_Year_Label"); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 70, 30));

        jLabel15.setFont(resourceMap.getFont("Student_Password_Label.font")); // NOI18N
        jLabel15.setText(resourceMap.getString("Student_Password_Label.text")); // NOI18N
        jLabel15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel15.setName("Student_Password_Label"); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, 30));

        jLabel16.setFont(resourceMap.getFont("Student_Id_Label.font")); // NOI18N
        jLabel16.setText(resourceMap.getString("Student_Id_Label.text")); // NOI18N
        jLabel16.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel16.setName("Student_Id_Label"); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 50, 30));

        jLabel17.setFont(resourceMap.getFont("Student_Ln_Label.font")); // NOI18N
        jLabel17.setText(resourceMap.getString("Student_Ln_Label.text")); // NOI18N
        jLabel17.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel17.setName("Student_Ln_Label"); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 90, 30));

        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel6.setName("jLabel6"); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(29, 21));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 70, 30));

        jTextField2.setToolTipText(resourceMap.getString("Student_Id_Text.toolTipText")); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField2.setName("Student_Id_Text"); // NOI18N
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 150, -1));

        jTextField4.setText(resourceMap.getString("Student_Fn_Text.text")); // NOI18N
        jTextField4.setToolTipText(resourceMap.getString("Student_Fn_Text.toolTipText")); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField4.setName("Student_Fn_Text"); // NOI18N
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 150, -1));

        jTextField5.setToolTipText(resourceMap.getString("Student_LN_Text.toolTipText")); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField5.setName("Student_LN_Text"); // NOI18N
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 150, -1));

        jButton10.setText(resourceMap.getString("jButton10.text")); // NOI18N
        jButton10.setToolTipText(resourceMap.getString("jButton10.toolTipText")); // NOI18N
        jButton10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton10.setName("jButton10"); // NOI18N
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 170, 40));

        jButton14.setText(resourceMap.getString("jButton14.text")); // NOI18N
        jButton14.setToolTipText(resourceMap.getString("jButton14.toolTipText")); // NOI18N
        jButton14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton14.setName("jButton14"); // NOI18N
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        jPanel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));

        jButton15.setText(resourceMap.getString("jButton15.text")); // NOI18N
        jButton15.setToolTipText(resourceMap.getString("jButton15.toolTipText")); // NOI18N
        jButton15.setActionCommand(resourceMap.getString("jButton15.actionCommand")); // NOI18N
        jButton15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton15.setName("jButton15"); // NOI18N
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 110, 40));

        jButton16.setText(resourceMap.getString("jButton16.text")); // NOI18N
        jButton16.setToolTipText(resourceMap.getString("jButton16.toolTipText")); // NOI18N
        jButton16.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton16.setName("jButton16"); // NOI18N
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });
        jButton16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton16KeyPressed(evt);
            }
        });
        jPanel2.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 70, 20));

        jButton45.setText(resourceMap.getString("jButton45.text")); // NOI18N
        jButton45.setToolTipText(resourceMap.getString("jButton45.toolTipText")); // NOI18N
        jButton45.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton45.setName("jButton45"); // NOI18N
        jButton45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton45MouseClicked(evt);
            }
        });
        jPanel2.add(jButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 140, 30));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        jComboBox5.setToolTipText(resourceMap.getString("jComboBox5.toolTipText")); // NOI18N
        jComboBox5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jComboBox5.setName("jComboBox5"); // NOI18N
        jPanel2.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 40, 40));

        jPasswordField1.setText(resourceMap.getString("jPasswordField1.text")); // NOI18N
        jPasswordField1.setToolTipText(resourceMap.getString("jPasswordField1.toolTipText")); // NOI18N
        jPasswordField1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPasswordField1.setName("jPasswordField1"); // NOI18N
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 150, -1));

        jLabel8.setIcon(resourceMap.getIcon("jLabel8.icon")); // NOI18N
        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        jTabbedPane1.addTab(resourceMap.getString("jPanel2.TabConstraints.tabTitle"), jPanel2); // NOI18N

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel9.setName("jPanel9"); // NOI18N
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setText(resourceMap.getString("jLabel21.text")); // NOI18N
        jLabel21.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel21.setName("jLabel21"); // NOI18N
        jPanel9.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 70, 30));

        jButton21.setText(resourceMap.getString("jButton21.text")); // NOI18N
        jButton21.setToolTipText(resourceMap.getString("jButton21.toolTipText")); // NOI18N
        jButton21.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton21.setName("jButton21"); // NOI18N
        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton21MouseClicked(evt);
            }
        });
        jPanel9.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 170, 40));

        jComboBox2.setToolTipText(resourceMap.getString("jComboBox2.toolTipText")); // NOI18N
        jComboBox2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jComboBox2.setName("jComboBox2"); // NOI18N
        jPanel9.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 110, 40));

        jTextField8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField8.setName("jTextField8"); // NOI18N
        jPanel9.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 90, 30));

        jTextField9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField9.setName("jTextField9"); // NOI18N
        jPanel9.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 90, 30));

        jLabel22.setText(resourceMap.getString("jLabel22.text")); // NOI18N
        jLabel22.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel22.setName("jLabel22"); // NOI18N
        jPanel9.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 110, 20));

        jButton17.setText(resourceMap.getString("jButton17.text")); // NOI18N
        jButton17.setToolTipText(resourceMap.getString("jButton17.toolTipText")); // NOI18N
        jButton17.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton17.setName("jButton17"); // NOI18N
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton17MouseClicked(evt);
            }
        });
        jPanel9.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 180, -1));

        jLabel23.setText(resourceMap.getString("jLabel23.text")); // NOI18N
        jLabel23.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel23.setName("jLabel23"); // NOI18N
        jPanel9.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 110, 20));

        jButton18.setText(resourceMap.getString("jButton18.text")); // NOI18N
        jButton18.setToolTipText(resourceMap.getString("jButton18.toolTipText")); // NOI18N
        jButton18.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton18.setName("jButton18"); // NOI18N
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton18MouseClicked(evt);
            }
        });
        jPanel9.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 180, -1));

        jButton19.setText(resourceMap.getString("jButton19.text")); // NOI18N
        jButton19.setToolTipText(resourceMap.getString("jButton19.toolTipText")); // NOI18N
        jButton19.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton19.setName("jButton19"); // NOI18N
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton19MouseClicked(evt);
            }
        });
        jPanel9.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 180, -1));

        jButton20.setText(resourceMap.getString("jButton20.text")); // NOI18N
        jButton20.setToolTipText(resourceMap.getString("jButton20.toolTipText")); // NOI18N
        jButton20.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton20.setName("jButton20"); // NOI18N
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton20MouseClicked(evt);
            }
        });
        jPanel9.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 140, 30));

        jLabel24.setFont(resourceMap.getFont("jLabel24.font")); // NOI18N
        jLabel24.setText(resourceMap.getString("jLabel24.text")); // NOI18N
        jLabel24.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel24.setName("jLabel24"); // NOI18N
        jPanel9.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 90, 30));

        jLabel26.setFont(resourceMap.getFont("jLabel26.font")); // NOI18N
        jLabel26.setText(resourceMap.getString("jLabel26.text")); // NOI18N
        jLabel26.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel26.setName("jLabel26"); // NOI18N
        jPanel9.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, 30));

        jLabel27.setFont(resourceMap.getFont("jLabel27.font")); // NOI18N
        jLabel27.setText(resourceMap.getString("jLabel27.text")); // NOI18N
        jLabel27.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel27.setName("jLabel27"); // NOI18N
        jPanel9.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 50, 30));

        jTextField11.setToolTipText(resourceMap.getString("jTextField11.toolTipText")); // NOI18N
        jTextField11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField11.setName("jTextField11"); // NOI18N
        jPanel9.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 150, -1));

        jLabel28.setFont(resourceMap.getFont("jLabel28.font")); // NOI18N
        jLabel28.setText(resourceMap.getString("jLabel28.text")); // NOI18N
        jLabel28.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel28.setName("jLabel28"); // NOI18N
        jPanel9.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 90, 30));

        jTextField12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField12.setName("jTextField12"); // NOI18N
        jPanel9.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 150, -1));

        jPasswordField2.setText(resourceMap.getString("jPasswordField2.text")); // NOI18N
        jPasswordField2.setToolTipText(resourceMap.getString("jPasswordField2.toolTipText")); // NOI18N
        jPasswordField2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPasswordField2.setName("jPasswordField2"); // NOI18N
        jPanel9.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 150, -1));

        jTextField13.setToolTipText(resourceMap.getString("jTextField13.toolTipText")); // NOI18N
        jTextField13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField13.setName("jTextField13"); // NOI18N
        jPanel9.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 150, -1));

        jTextField14.setToolTipText(resourceMap.getString("jTextField14.toolTipText")); // NOI18N
        jTextField14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField14.setName("jTextField14"); // NOI18N
        jPanel9.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 150, -1));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        jComboBox6.setToolTipText(resourceMap.getString("jComboBox6.toolTipText")); // NOI18N
        jComboBox6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jComboBox6.setName("jComboBox6"); // NOI18N
        jPanel9.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 90, 50));

        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel7.setName("jLabel7"); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(29, 21));
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 70, 30));

        jButton22.setText(resourceMap.getString("jButton22.text")); // NOI18N
        jButton22.setToolTipText(resourceMap.getString("jButton22.toolTipText")); // NOI18N
        jButton22.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton22.setName("jButton22"); // NOI18N
        jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton22MouseClicked(evt);
            }
        });
        jPanel9.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 170, 40));

        jButton23.setText(resourceMap.getString("jButton23.text")); // NOI18N
        jButton23.setToolTipText(resourceMap.getString("jButton23.toolTipText")); // NOI18N
        jButton23.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton23.setName("jButton23"); // NOI18N
        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton23MouseClicked(evt);
            }
        });
        jPanel9.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));

        jButton24.setText(resourceMap.getString("jButton24.text")); // NOI18N
        jButton24.setToolTipText(resourceMap.getString("jButton24.toolTipText")); // NOI18N
        jButton24.setActionCommand(resourceMap.getString("jButton24.actionCommand")); // NOI18N
        jButton24.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton24.setName("jButton24"); // NOI18N
        jButton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton24MouseClicked(evt);
            }
        });
        jPanel9.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 110, 40));

        jButton25.setText(resourceMap.getString("jButton25.text")); // NOI18N
        jButton25.setToolTipText(resourceMap.getString("jButton25.toolTipText")); // NOI18N
        jButton25.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton25.setName("jButton25"); // NOI18N
        jButton25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton25MouseClicked(evt);
            }
        });
        jButton25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton25KeyPressed(evt);
            }
        });
        jPanel9.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 70, 20));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name", "Password", "Gender", "Mail", "Mobile"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setName("jTable2"); // NOI18N
        jScrollPane2.setViewportView(jTable2);
        jTable2.getColumnModel().getColumn(0).setHeaderValue(resourceMap.getString("jTable2.columnModel.title0")); // NOI18N
        jTable2.getColumnModel().getColumn(1).setHeaderValue(resourceMap.getString("jTable2.columnModel.title1")); // NOI18N
        jTable2.getColumnModel().getColumn(2).setHeaderValue(resourceMap.getString("jTable2.columnModel.title2")); // NOI18N
        jTable2.getColumnModel().getColumn(3).setHeaderValue(resourceMap.getString("jTable2.columnModel.title3")); // NOI18N
        jTable2.getColumnModel().getColumn(4).setHeaderValue(resourceMap.getString("jTable2.columnModel.title4")); // NOI18N
        jTable2.getColumnModel().getColumn(5).setHeaderValue(resourceMap.getString("jTable2.columnModel.title5")); // NOI18N
        jTable2.getColumnModel().getColumn(6).setHeaderValue(resourceMap.getString("jTable2.columnModel.title6")); // NOI18N

        jPanel9.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 530, 190));

        jButton44.setText(resourceMap.getString("jButton44.text")); // NOI18N
        jButton44.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton44.setName("jButton44"); // NOI18N
        jButton44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton44MouseClicked(evt);
            }
        });
        jPanel9.add(jButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 140, 30));

        jLabel29.setIcon(resourceMap.getIcon("jLabel29.icon")); // NOI18N
        jLabel29.setName("jLabel29"); // NOI18N
        jPanel9.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        jTabbedPane1.addTab(resourceMap.getString("jPanel9.TabConstraints.tabTitle"), jPanel9); // NOI18N

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel12.setName("jPanel12"); // NOI18N
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setText(resourceMap.getString("jLabel25.text")); // NOI18N
        jLabel25.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel25.setName("jLabel25"); // NOI18N
        jPanel12.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 70, 30));

        jButton46.setText(resourceMap.getString("jButton46.text")); // NOI18N
        jButton46.setToolTipText(resourceMap.getString("jButton46.toolTipText")); // NOI18N
        jButton46.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton46.setName("jButton46"); // NOI18N
        jButton46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton46MouseClicked(evt);
            }
        });
        jPanel12.add(jButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 170, 40));

        jComboBox7.setToolTipText(resourceMap.getString("jComboBox7.toolTipText")); // NOI18N
        jComboBox7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jComboBox7.setName("jComboBox7"); // NOI18N
        jPanel12.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 110, 40));

        jTextField10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField10.setName("jTextField10"); // NOI18N
        jPanel12.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 90, 30));

        jTextField24.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField24.setName("jTextField24"); // NOI18N
        jPanel12.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 90, 30));

        jLabel30.setText(resourceMap.getString("jLabel30.text")); // NOI18N
        jLabel30.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel30.setName("jLabel30"); // NOI18N
        jPanel12.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 110, 20));

        jButton47.setText(resourceMap.getString("jButton47.text")); // NOI18N
        jButton47.setToolTipText(resourceMap.getString("jButton47.toolTipText")); // NOI18N
        jButton47.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton47.setName("jButton47"); // NOI18N
        jButton47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton47MouseClicked(evt);
            }
        });
        jPanel12.add(jButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 180, -1));

        jLabel43.setText(resourceMap.getString("jLabel43.text")); // NOI18N
        jLabel43.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel43.setName("jLabel43"); // NOI18N
        jPanel12.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 110, 20));

        jButton48.setText(resourceMap.getString("jButton48.text")); // NOI18N
        jButton48.setToolTipText(resourceMap.getString("jButton48.toolTipText")); // NOI18N
        jButton48.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton48.setName("jButton48"); // NOI18N
        jButton48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton48MouseClicked(evt);
            }
        });
        jPanel12.add(jButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 180, -1));

        jButton49.setText(resourceMap.getString("jButton49.text")); // NOI18N
        jButton49.setToolTipText(resourceMap.getString("jButton49.toolTipText")); // NOI18N
        jButton49.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton49.setName("jButton49"); // NOI18N
        jButton49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton49MouseClicked(evt);
            }
        });
        jPanel12.add(jButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 180, -1));

        jButton50.setText(resourceMap.getString("jButton50.text")); // NOI18N
        jButton50.setToolTipText(resourceMap.getString("jButton50.toolTipText")); // NOI18N
        jButton50.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton50.setName("jButton50"); // NOI18N
        jButton50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton50MouseClicked(evt);
            }
        });
        jPanel12.add(jButton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 140, 30));

        jLabel45.setFont(resourceMap.getFont("jLabel45.font")); // NOI18N
        jLabel45.setText(resourceMap.getString("jLabel45.text")); // NOI18N
        jLabel45.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel45.setName("jLabel45"); // NOI18N
        jPanel12.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 90, 30));

        jLabel46.setFont(resourceMap.getFont("jLabel46.font")); // NOI18N
        jLabel46.setText(resourceMap.getString("jLabel46.text")); // NOI18N
        jLabel46.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel46.setName("jLabel46"); // NOI18N
        jPanel12.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, 30));

        jLabel47.setFont(resourceMap.getFont("jLabel47.font")); // NOI18N
        jLabel47.setText(resourceMap.getString("jLabel47.text")); // NOI18N
        jLabel47.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel47.setName("jLabel47"); // NOI18N
        jPanel12.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 50, 30));

        jTextField25.setToolTipText(resourceMap.getString("jTextField25.toolTipText")); // NOI18N
        jTextField25.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField25.setName("jTextField25"); // NOI18N
        jPanel12.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 150, -1));

        jLabel48.setFont(resourceMap.getFont("jLabel48.font")); // NOI18N
        jLabel48.setText(resourceMap.getString("jLabel48.text")); // NOI18N
        jLabel48.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel48.setName("jLabel48"); // NOI18N
        jPanel12.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 90, 30));

        jTextField26.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField26.setName("jTextField26"); // NOI18N
        jPanel12.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 150, -1));

        jPasswordField3.setToolTipText(resourceMap.getString("jPasswordField3.toolTipText")); // NOI18N
        jPasswordField3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPasswordField3.setName("jPasswordField3"); // NOI18N
        jPanel12.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 150, -1));

        jTextField27.setToolTipText(resourceMap.getString("jTextField27.toolTipText")); // NOI18N
        jTextField27.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField27.setName("jTextField27"); // NOI18N
        jPanel12.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 150, -1));

        jTextField28.setToolTipText(resourceMap.getString("jTextField28.toolTipText")); // NOI18N
        jTextField28.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField28.setName("jTextField28"); // NOI18N
        jPanel12.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 150, -1));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        jComboBox8.setToolTipText(resourceMap.getString("jComboBox8.toolTipText")); // NOI18N
        jComboBox8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jComboBox8.setName("jComboBox8"); // NOI18N
        jPanel12.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 90, 50));

        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel10.setName("jLabel10"); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(29, 21));
        jPanel12.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 70, 30));

        jButton51.setText(resourceMap.getString("jButton51.text")); // NOI18N
        jButton51.setToolTipText(resourceMap.getString("jButton51.toolTipText")); // NOI18N
        jButton51.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton51.setName("jButton51"); // NOI18N
        jButton51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton51MouseClicked(evt);
            }
        });
        jPanel12.add(jButton51, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 170, 40));

        jButton52.setText(resourceMap.getString("jButton52.text")); // NOI18N
        jButton52.setToolTipText(resourceMap.getString("jButton52.toolTipText")); // NOI18N
        jButton52.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton52.setName("jButton52"); // NOI18N
        jButton52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton52MouseClicked(evt);
            }
        });
        jPanel12.add(jButton52, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));

        jButton53.setText(resourceMap.getString("jButton53.text")); // NOI18N
        jButton53.setToolTipText(resourceMap.getString("jButton53.toolTipText")); // NOI18N
        jButton53.setActionCommand(resourceMap.getString("jButton53.actionCommand")); // NOI18N
        jButton53.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton53.setName("jButton53"); // NOI18N
        jButton53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton53MouseClicked(evt);
            }
        });
        jPanel12.add(jButton53, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 110, 40));

        jButton54.setText(resourceMap.getString("jButton54.text")); // NOI18N
        jButton54.setToolTipText(resourceMap.getString("jButton54.toolTipText")); // NOI18N
        jButton54.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton54.setName("jButton54"); // NOI18N
        jButton54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton54MouseClicked(evt);
            }
        });
        jButton54.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton54KeyPressed(evt);
            }
        });
        jPanel12.add(jButton54, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 70, 20));

        jScrollPane5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane5.setName("jScrollPane5"); // NOI18N

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name", "Password", "Gender", "Mail", "Mobile"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.setName("jTable5"); // NOI18N
        jScrollPane5.setViewportView(jTable5);
        jTable5.getColumnModel().getColumn(0).setHeaderValue(resourceMap.getString("jTable2.columnModel.title0")); // NOI18N
        jTable5.getColumnModel().getColumn(1).setHeaderValue(resourceMap.getString("jTable2.columnModel.title1")); // NOI18N
        jTable5.getColumnModel().getColumn(2).setHeaderValue(resourceMap.getString("jTable2.columnModel.title2")); // NOI18N
        jTable5.getColumnModel().getColumn(3).setHeaderValue(resourceMap.getString("jTable2.columnModel.title3")); // NOI18N
        jTable5.getColumnModel().getColumn(4).setHeaderValue(resourceMap.getString("jTable2.columnModel.title4")); // NOI18N
        jTable5.getColumnModel().getColumn(5).setHeaderValue(resourceMap.getString("jTable2.columnModel.title5")); // NOI18N
        jTable5.getColumnModel().getColumn(6).setHeaderValue(resourceMap.getString("jTable2.columnModel.title6")); // NOI18N

        jPanel12.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 530, 190));

        jButton55.setText(resourceMap.getString("jButton55.text")); // NOI18N
        jButton55.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton55.setName("jButton55"); // NOI18N
        jButton55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton55MouseClicked(evt);
            }
        });
        jPanel12.add(jButton55, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 140, 30));

        jLabel49.setIcon(resourceMap.getIcon("jLabel49.icon")); // NOI18N
        jLabel49.setName("jLabel49"); // NOI18N
        jPanel12.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        jButton56.setText(resourceMap.getString("jButton56.text")); // NOI18N
        jButton56.setToolTipText(resourceMap.getString("jButton56.toolTipText")); // NOI18N
        jButton56.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton56.setName("jButton56"); // NOI18N
        jButton56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton56MouseClicked(evt);
            }
        });
        jPanel12.add(jButton56, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 140, 30));

        jButton57.setText(resourceMap.getString("jButton57.text")); // NOI18N
        jButton57.setToolTipText(resourceMap.getString("jButton57.toolTipText")); // NOI18N
        jButton57.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton57.setName("jButton57"); // NOI18N
        jButton57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton57MouseClicked(evt);
            }
        });
        jPanel12.add(jButton57, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 140, 30));

        jTabbedPane1.addTab(resourceMap.getString("jPanel12.TabConstraints.tabTitle"), jPanel12); // NOI18N

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel10.setName("jPanel10"); // NOI18N
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton58.setText(resourceMap.getString("jButton58.text")); // NOI18N
        jButton58.setToolTipText(resourceMap.getString("jButton58.toolTipText")); // NOI18N
        jButton58.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton58.setName("jButton58"); // NOI18N
        jButton58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton58MouseClicked(evt);
            }
        });
        jPanel10.add(jButton58, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 100, 30));

        jButton26.setText(resourceMap.getString("jButton26.text")); // NOI18N
        jButton26.setToolTipText(resourceMap.getString("jButton26.toolTipText")); // NOI18N
        jButton26.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton26.setName("jButton26"); // NOI18N
        jButton26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton26MouseClicked(evt);
            }
        });
        jPanel10.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 170, 40));

        jTextField15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField15.setName("jTextField15"); // NOI18N
        jPanel10.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 90, 40));

        jButton27.setText(resourceMap.getString("jButton27.text")); // NOI18N
        jButton27.setToolTipText(resourceMap.getString("jButton27.toolTipText")); // NOI18N
        jButton27.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton27.setName("jButton27"); // NOI18N
        jButton27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton27MouseClicked(evt);
            }
        });
        jPanel10.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 180, -1));

        jLabel31.setText(resourceMap.getString("jLabel31.text")); // NOI18N
        jLabel31.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel31.setName("jLabel31"); // NOI18N
        jPanel10.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 110, 20));

        jButton28.setText(resourceMap.getString("jButton28.text")); // NOI18N
        jButton28.setToolTipText(resourceMap.getString("jButton28.toolTipText")); // NOI18N
        jButton28.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton28.setName("jButton28"); // NOI18N
        jButton28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton28MouseClicked(evt);
            }
        });
        jPanel10.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 180, -1));

        jButton29.setText(resourceMap.getString("jButton29.text")); // NOI18N
        jButton29.setToolTipText(resourceMap.getString("jButton29.toolTipText")); // NOI18N
        jButton29.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton29.setName("jButton29"); // NOI18N
        jButton29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton29MouseClicked(evt);
            }
        });
        jPanel10.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 180, -1));

        jButton30.setText(resourceMap.getString("jButton30.text")); // NOI18N
        jButton30.setToolTipText(resourceMap.getString("jButton30.toolTipText")); // NOI18N
        jButton30.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton30.setName("jButton30"); // NOI18N
        jButton30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton30MouseClicked(evt);
            }
        });
        jPanel10.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 140, 30));

        jLabel33.setFont(resourceMap.getFont("jLabel33.font")); // NOI18N
        jLabel33.setText(resourceMap.getString("jLabel33.text")); // NOI18N
        jLabel33.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel33.setName("jLabel33"); // NOI18N
        jPanel10.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 70, 30));

        jLabel32.setFont(resourceMap.getFont("jLabel32.font")); // NOI18N
        jLabel32.setText(resourceMap.getString("jLabel32.text")); // NOI18N
        jLabel32.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel32.setName("jLabel32"); // NOI18N
        jPanel10.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 90, 30));

        jLabel34.setFont(resourceMap.getFont("jLabel34.font")); // NOI18N
        jLabel34.setText(resourceMap.getString("jLabel34.text")); // NOI18N
        jLabel34.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel34.setName("jLabel34"); // NOI18N
        jPanel10.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 50, 30));

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane3.setName("jScrollPane3"); // NOI18N

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                " ID", "Name", "Lab HRs", "Lec HRs", "Sec HRs", "Course Professor", "Course Teacher Asistant", "Year"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setName("jTable3"); // NOI18N
        jScrollPane3.setViewportView(jTable3);
        jTable3.getColumnModel().getColumn(0).setHeaderValue(resourceMap.getString("jTable3.columnModel.title0")); // NOI18N
        jTable3.getColumnModel().getColumn(1).setHeaderValue(resourceMap.getString("jTable3.columnModel.title1")); // NOI18N
        jTable3.getColumnModel().getColumn(2).setHeaderValue(resourceMap.getString("jTable3.columnModel.title2")); // NOI18N
        jTable3.getColumnModel().getColumn(3).setHeaderValue(resourceMap.getString("jTable3.columnModel.title3")); // NOI18N
        jTable3.getColumnModel().getColumn(4).setHeaderValue(resourceMap.getString("jTable3.columnModel.title4")); // NOI18N
        jTable3.getColumnModel().getColumn(5).setHeaderValue(resourceMap.getString("jTable3.columnModel.title5")); // NOI18N
        jTable3.getColumnModel().getColumn(6).setHeaderValue(resourceMap.getString("jTable3.columnModel.title6")); // NOI18N
        jTable3.getColumnModel().getColumn(7).setHeaderValue(resourceMap.getString("jTable3.columnModel.title7")); // NOI18N

        jPanel10.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 530, 190));

        jTextField16.setToolTipText(resourceMap.getString("jTextField16.toolTipText")); // NOI18N
        jTextField16.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField16.setName("jTextField16"); // NOI18N
        jPanel10.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 150, -1));

        jLabel35.setFont(resourceMap.getFont("jLabel35.font")); // NOI18N
        jLabel35.setText(resourceMap.getString("jLabel35.text")); // NOI18N
        jLabel35.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel35.setName("jLabel35"); // NOI18N
        jPanel10.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 110, 30));

        jTextField17.setToolTipText(resourceMap.getString("jTextField17.toolTipText")); // NOI18N
        jTextField17.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField17.setName("jTextField17"); // NOI18N
        jPanel10.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 150, -1));

        jTextField18.setToolTipText(resourceMap.getString("jTextField18.toolTipText")); // NOI18N
        jTextField18.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField18.setName("jTextField18"); // NOI18N
        jPanel10.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 150, -1));

        jLabel37.setFont(resourceMap.getFont("jLabel37.font")); // NOI18N
        jLabel37.setText(resourceMap.getString("jLabel37.text")); // NOI18N
        jLabel37.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel37.setName("jLabel37"); // NOI18N
        jPanel10.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 90, 30));

        jTextField20.setToolTipText(resourceMap.getString("jTextField20.toolTipText")); // NOI18N
        jTextField20.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField20.setName("jTextField20"); // NOI18N
        jPanel10.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 150, -1));

        jLabel38.setFont(resourceMap.getFont("jLabel38.font")); // NOI18N
        jLabel38.setText(resourceMap.getString("jLabel38.text")); // NOI18N
        jLabel38.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel38.setName("jLabel38"); // NOI18N
        jPanel10.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 90, 30));

        jLabel39.setFont(resourceMap.getFont("jLabel39.font")); // NOI18N
        jLabel39.setText(resourceMap.getString("jLabel39.text")); // NOI18N
        jLabel39.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel39.setName("jLabel39"); // NOI18N
        jPanel10.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 90, 30));

        jComboBox3.setToolTipText(resourceMap.getString("jComboBox3.toolTipText")); // NOI18N
        jComboBox3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jComboBox3.setName("jComboBox3"); // NOI18N
        jPanel10.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 130, 40));

        jComboBox4.setToolTipText(resourceMap.getString("jComboBox4.toolTipText")); // NOI18N
        jComboBox4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jComboBox4.setName("jComboBox4"); // NOI18N
        jPanel10.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 130, 40));

        jTextField21.setToolTipText(resourceMap.getString("jTextField21.toolTipText")); // NOI18N
        jTextField21.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField21.setName("jTextField21"); // NOI18N
        jPanel10.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 150, -1));

        jLabel40.setFont(resourceMap.getFont("jLabel40.font")); // NOI18N
        jLabel40.setText(resourceMap.getString("jLabel40.text")); // NOI18N
        jLabel40.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel40.setName("jLabel40"); // NOI18N
        jPanel10.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 90, 30));

        jButton31.setText(resourceMap.getString("jButton31.text")); // NOI18N
        jButton31.setToolTipText(resourceMap.getString("jButton31.toolTipText")); // NOI18N
        jButton31.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton31.setName("jButton31"); // NOI18N
        jButton31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton31MouseClicked(evt);
            }
        });
        jPanel10.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 170, 40));

        jButton32.setText(resourceMap.getString("jButton32.text")); // NOI18N
        jButton32.setToolTipText(resourceMap.getString("jButton32.toolTipText")); // NOI18N
        jButton32.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton32.setName("jButton32"); // NOI18N
        jButton32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton32MouseClicked(evt);
            }
        });
        jPanel10.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));

        jButton34.setText(resourceMap.getString("jButton34.text")); // NOI18N
        jButton34.setToolTipText(resourceMap.getString("jButton34.toolTipText")); // NOI18N
        jButton34.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton34.setName("jButton34"); // NOI18N
        jButton34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton34MouseClicked(evt);
            }
        });
        jButton34.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton34KeyPressed(evt);
            }
        });
        jPanel10.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 70, 20));

        jButton43.setText(resourceMap.getString("jButton43.text")); // NOI18N
        jButton43.setToolTipText(resourceMap.getString("jButton43.toolTipText")); // NOI18N
        jButton43.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton43.setName("jButton43"); // NOI18N
        jPanel10.add(jButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 140, 30));

        jLabel36.setIcon(resourceMap.getIcon("jLabel36.icon")); // NOI18N
        jLabel36.setName("jLabel36"); // NOI18N
        jPanel10.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        jTabbedPane1.addTab(resourceMap.getString("jPanel10.TabConstraints.tabTitle"), jPanel10); // NOI18N

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel11.setName("jPanel11"); // NOI18N
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(resourceMap.getFont("jLabel42.font")); // NOI18N
        jLabel42.setText(resourceMap.getString("jLabel42.text")); // NOI18N
        jLabel42.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel42.setName("jLabel42"); // NOI18N
        jPanel11.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 120, 30));

        jLabel44.setFont(resourceMap.getFont("jLabel44.font")); // NOI18N
        jLabel44.setText(resourceMap.getString("jLabel44.text")); // NOI18N
        jLabel44.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel44.setName("jLabel44"); // NOI18N
        jPanel11.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 50, 30));

        jTextField23.setToolTipText(resourceMap.getString("jTextField23.toolTipText")); // NOI18N
        jTextField23.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField23.setName("jTextField23"); // NOI18N
        jPanel11.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 130, -1));

        jTextField22.setEditable(false);
        jTextField22.setToolTipText(resourceMap.getString("jTextField22.toolTipText")); // NOI18N
        jTextField22.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField22.setName("jTextField22"); // NOI18N
        jPanel11.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 130, -1));

        jButton33.setText(resourceMap.getString("jButton33.text")); // NOI18N
        jButton33.setToolTipText(resourceMap.getString("jButton33.toolTipText")); // NOI18N
        jButton33.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton33.setName("jButton33"); // NOI18N
        jButton33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton33MouseClicked(evt);
            }
        });
        jPanel11.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 170, 40));

        jTextField19.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField19.setName("jTextField19"); // NOI18N
        jPanel11.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 90, 30));

        jButton35.setText(resourceMap.getString("jButton35.text")); // NOI18N
        jButton35.setToolTipText(resourceMap.getString("jButton35.toolTipText")); // NOI18N
        jButton35.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton35.setName("jButton35"); // NOI18N
        jButton35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton35MouseClicked(evt);
            }
        });
        jPanel11.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 180, -1));

        jButton42.setText(resourceMap.getString("jButton42.text")); // NOI18N
        jButton42.setToolTipText(resourceMap.getString("jButton42.toolTipText")); // NOI18N
        jButton42.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton42.setName("jButton42"); // NOI18N
        jButton42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton42MouseClicked(evt);
            }
        });
        jPanel11.add(jButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 140, 30));

        jLabel41.setText(resourceMap.getString("jLabel41.text")); // NOI18N
        jLabel41.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel41.setName("jLabel41"); // NOI18N
        jPanel11.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 110, 20));

        jButton36.setText(resourceMap.getString("jButton36.text")); // NOI18N
        jButton36.setToolTipText(resourceMap.getString("jButton36.toolTipText")); // NOI18N
        jButton36.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton36.setName("jButton36"); // NOI18N
        jButton36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton36MouseClicked(evt);
            }
        });
        jPanel11.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 180, -1));

        jButton37.setText(resourceMap.getString("jButton37.text")); // NOI18N
        jButton37.setToolTipText(resourceMap.getString("jButton37.toolTipText")); // NOI18N
        jButton37.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton37.setName("jButton37"); // NOI18N
        jButton37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton37MouseClicked(evt);
            }
        });
        jPanel11.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 180, -1));

        jButton38.setText(resourceMap.getString("jButton38.text")); // NOI18N
        jButton38.setToolTipText(resourceMap.getString("jButton38.toolTipText")); // NOI18N
        jButton38.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton38.setName("jButton38"); // NOI18N
        jButton38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton38MouseClicked(evt);
            }
        });
        jPanel11.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 140, 30));

        jButton39.setText(resourceMap.getString("jButton39.text")); // NOI18N
        jButton39.setToolTipText(resourceMap.getString("jButton39.toolTipText")); // NOI18N
        jButton39.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton39.setName("jButton39"); // NOI18N
        jButton39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton39MouseClicked(evt);
            }
        });
        jPanel11.add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 170, 40));

        jButton40.setText(resourceMap.getString("jButton40.text")); // NOI18N
        jButton40.setToolTipText(resourceMap.getString("jButton40.toolTipText")); // NOI18N
        jButton40.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton40.setName("jButton40"); // NOI18N
        jButton40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton40MouseClicked(evt);
            }
        });
        jPanel11.add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));

        jButton41.setText(resourceMap.getString("jButton41.text")); // NOI18N
        jButton41.setToolTipText(resourceMap.getString("jButton41.toolTipText")); // NOI18N
        jButton41.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton41.setName("jButton41"); // NOI18N
        jButton41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton41MouseClicked(evt);
            }
        });
        jButton41.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton41KeyPressed(evt);
            }
        });
        jPanel11.add(jButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 70, 20));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane4.setName("jScrollPane4"); // NOI18N

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Classroom's ID", "Classroom Department's Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setName("jTable4"); // NOI18N
        jScrollPane4.setViewportView(jTable4);
        jTable4.getColumnModel().getColumn(0).setHeaderValue(resourceMap.getString("jTable4.columnModel.title0")); // NOI18N
        jTable4.getColumnModel().getColumn(1).setHeaderValue(resourceMap.getString("jTable4.columnModel.title1")); // NOI18N

        jPanel11.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 530, 190));

        jLabel50.setIcon(resourceMap.getIcon("jLabel50.icon")); // NOI18N
        jLabel50.setName("jLabel50"); // NOI18N
        jPanel11.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        jTabbedPane1.addTab(resourceMap.getString("jPanel11.TabConstraints.tabTitle"), jPanel11); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setName("jPanel5"); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton1.setText(resourceMap.getString("St_Acc_Yes_R.text")); // NOI18N
        jRadioButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jRadioButton1.setName("St_Acc_Yes_R"); // NOI18N
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jPanel5.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel12.setFont(resourceMap.getFont("jLabel12.font")); // NOI18N
        jLabel12.setText(resourceMap.getString("jLabel12.text")); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel12.setName("jLabel12"); // NOI18N
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 260, 40));

        jRadioButton3.setText(resourceMap.getString("Prof_Acc_Yes_R.text")); // NOI18N
        jRadioButton3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jRadioButton3.setName("Prof_Acc_Yes_R"); // NOI18N
        jRadioButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton3MouseClicked(evt);
            }
        });
        jPanel5.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        jLabel11.setFont(resourceMap.getFont("jLabel11.font")); // NOI18N
        jLabel11.setText(resourceMap.getString("jLabel11.text")); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel11.setName("jLabel11"); // NOI18N
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 220, 40));

        jLabel5.setIcon(resourceMap.getIcon("jLabel5.icon")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        jTabbedPane1.addTab(resourceMap.getString("jPanel5.TabConstraints.tabTitle"), jPanel5); // NOI18N

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel6.setName("jPanel6"); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText(resourceMap.getString("jButton4.text")); // NOI18N
        jButton4.setToolTipText(resourceMap.getString("jButton4.toolTipText")); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton4.setName("jButton4"); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel6.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 200, 120));

        jLabel4.setIcon(resourceMap.getIcon("jLabel4.icon")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        jTabbedPane1.addTab(resourceMap.getString("jPanel6.TabConstraints.tabTitle"), jPanel6); // NOI18N

        jTabbedPane1.setSelectedComponent(jPanel2);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 700, 480));

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel7.setName("jPanel7"); // NOI18N
        jPanel7.setLayout(null);

        jLabel1.setFont(resourceMap.getFont("YearLabel.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("YearLabel.text")); // NOI18N
        jLabel1.setName("YearLabel"); // NOI18N
        jPanel7.add(jLabel1);
        jLabel1.setBounds(10, 20, 140, 40);

        jLabel2.setFont(resourceMap.getFont("Yaer20_label.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("Yaer20_label.text")); // NOI18N
        jLabel2.setName("Yaer20_label"); // NOI18N
        jPanel7.add(jLabel2);
        jLabel2.setBounds(150, 20, 90, 40);

        jLabel9.setIcon(resourceMap.getIcon("jLabel9.icon")); // NOI18N
        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N
        jPanel7.add(jLabel9);
        jLabel9.setBounds(0, 0, 260, 70);

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 260, 70));

        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 33, 170, 30));

        jLabel3.setIcon(resourceMap.getIcon("jLabel3.icon")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 840, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        
        int n  =jTabbedPane1.getSelectedIndex();
        if(this.index!=n) {
            
            if (n==0) {
                this.Add_St_Visble(false);
                this.Student_Tap_Button_Visble(true);
                this.Show_Current_Visble(false);
                this.Student_Update_Visble(false);
                this.index=0;
            } else if (n==1) {
                this.Add_Pr_Visble(false);
                this.Professor_Tap_Button_Visble(true);
                this.Pr_Show_Current_Visble(false);          //pro show current back button
                this.Professor_Update_Visble(false);
                this.index=1;
            }
            else if (n==2) {
                this.Add_Ta_Visble(false);
                this.Ta_Tap_Button_Visble(true);
                this.Ta_Show_Current_Visble(false);          //pro show current back button
                this.Ta_Update_Visble(false);
                this.index=2;
            }
            else if (n==3) {
                this.Add_Cr_Visble(false);
                this.Course_Tap_Button_Visble(true);
                this.Cr_Show_Current_Visble(false);          //pro show current back button
                this.Course_Update_Visble(false);
                this.index=3;
            }
            else if (n==4) {
               
                this.Class_Tap_Button_Visble(true);
                this.Cl_Show_Current_Visble(false);          //pro show current back button
                this.Class_Update_Visble(false);
                 this.Add_Cl_Visble(false);
                this.index=4;
            }
            else if(n==5){
                query = prc.get_Student_Access();
                r = c.connection(query);
                String student_status = null;
                try{
                    while(r.next()){
                        student_status = r.getString(1);
                    }
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
                }
                if("T".equals(student_status))
                    jRadioButton1.setSelected(true);
                else
                    if("F".equals(student_status))
                        jRadioButton1.setSelected(false);
                else
                        JOptionPane.showMessageDialog(null, "Error Loading", "Error!!!",JOptionPane.ERROR_MESSAGE);
                query = prc.get_prof_Access();
                r = c.connection(query);
                String prof_status = null;
                try{
                    while(r.next()){
                        prof_status = r.getString(1);
                    }
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
                }
                if("T".equals(prof_status))
                    jRadioButton3.setSelected(true);
                else
                    if("F".equals(prof_status))
                        jRadioButton3.setSelected(false);
                else
                        JOptionPane.showMessageDialog(null, "Error Loading", "Error!!!",JOptionPane.ERROR_MESSAGE);
            }
            else {
                this.index=-1;
            }
        }
        
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        // TODO add your handling code here:
}//GEN-LAST:event_jPanel10MouseClicked

    private void jButton34KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton34KeyPressed
    
                
}//GEN-LAST:event_jButton34KeyPressed

    private void jButton34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton34MouseClicked
        // show current back
         this.Add_Cr_Visble(false);
        this.Course_Tap_Button_Visble(true);
        this.Cr_Show_Current_Visble(false);       
        this.Course_Update_Visble(false);
        
}//GEN-LAST:event_jButton34MouseClicked

    private void jButton32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton32MouseClicked
        // update back 
        this.Add_Cr_Visble(false);
        this.Course_Tap_Button_Visble(false);
        this.Cr_Show_Current_Visble(true);                 
        this.Course_Update_Visble(false);
        
        
}//GEN-LAST:event_jButton32MouseClicked

    private void jButton31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton31MouseClicked
        // show current course
        this.Add_Cr_Visble(false);
        this.Course_Tap_Button_Visble(false);
        this.Cr_Show_Current_Visble(true);                
        this.Course_Update_Visble(false);
                        //filling table
        query = prc.GetAllCourses();
        r = c.connection(query);
        int i = 0;                                      //counter
        try {
            while (r.next()){
                    for(int j = 1; j<= 7; j++){
                        jTable3.setValueAt(r.getString(j), i, j-1);
                    }
                i++;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
        }
        
}//GEN-LAST:event_jButton31MouseClicked

    private void jButton27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton27MouseClicked
        // Course update
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField18.setText("");
        jTextField20.setText("");
        jTextField21.setText("");
        jComboBox3.removeAllItems();
        jComboBox4.removeAllItems();
       if(jTable3.isColumnSelected(0) || jTable3.isColumnSelected(1) || jTable3.isColumnSelected(2) || jTable3.isColumnSelected(3) || jTable3.isColumnSelected(4) || jTable3.isColumnSelected(5) || jTable3.isColumnSelected(6) || jTable3.isColumnSelected(7)){            
                            //GUI effects
        this.Add_Cr_Visble(false);
        this.Course_Tap_Button_Visble(false);
        this.Cr_Show_Current_Visble(false);                 //pr update back buttin
        this.Course_Update_Visble(true);
        int row = jTable3.getSelectedRow();                             //gets the selected row ID
        jComboBox3.removeAllItems();
        jComboBox4.removeAllItems();
        jTextField16.setText(jTable3.getValueAt(row,0).toString());
        jTextField17.setText(jTable3.getValueAt(row,1).toString());
        jTextField20.setText(jTable3.getValueAt(row,2).toString());
        jTextField18.setText(jTable3.getValueAt(row,3).toString());
        jTextField21.setText(jTable3.getValueAt(row,4).toString());
        String courseProfessor = jTable3.getValueAt(row, 5).toString();               //course's professor
        String courseTA = jTable3.getValueAt(row, 6).toString();                      //course's TA
        crsID=Integer.parseInt(jTable3.getValueAt(row,0).toString());
        query = prc.GetNumberofProfessor();
        r = c.connection(query);
        int NumberofProfessors = 0;
        try{
            while(r.next()){
                NumberofProfessors = Integer.parseInt(r.getString(1));
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
        }
        if(NumberofProfessors != 0){
            String[] FirstName = new String[NumberofProfessors];
            String[] LastName = new String[NumberofProfessors];
            query = prc.GetAllProfessor();
            r = c.connection(query);
            try{
              for(int i =0;r.next();i++){
                  FirstName[i] = r.getString(1);
                  LastName[i] = r.getString(2);
              }  
            }
            catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
        }
            jComboBox4.removeAllItems();
            for(int i = 0; i<NumberofProfessors; i++){
                jComboBox4.addItem(FirstName[i]+" "+LastName[i]);
            }
           int NumberofTA = 0;
           query = prc.GetNumberofTA();
           r = c.connection(query);
           try{
               while (r.next()){
                   NumberofTA = Integer.parseInt(r.getString(1));
               }
           }
            catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
        }
           if(NumberofTA !=0){
               FirstName = new String[NumberofTA];
               LastName = new String[NumberofTA];
               query = prc.GetAllTA();
               r = c.connection(query);
                    try {
                        for(int i = 0; r.next(); i++){
                            FirstName[i] = r.getString(1);
                            LastName[i] = r.getString(2);
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
                    }
                    jComboBox3.removeAllItems();
                        for(int i = 0; i<NumberofTA; i++){
                            jComboBox3.addItem(FirstName[i]+" "+LastName[i]);
                        }
           }
        }
       }
}//GEN-LAST:event_jButton27MouseClicked

    private void jButton26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton26MouseClicked
        // add new course 
        this.Add_Cr_Visble(true);
        crsID=0;
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField18.setText("");
        jTextField20.setText("");
        jTextField21.setText("");
        jComboBox3.removeAllItems();
        jComboBox4.removeAllItems();
        query = prc.GetAllProfessor();
        r = c.connection(query);
        try{
            while(r.next()){
                jComboBox4.addItem(r.getString(1)+" "+r.getString(2));
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
        }
        query = prc.GetAllTA();
        r = c.connection(query);
        try{
            while(r.next()){
                jComboBox3.addItem(r.getString(1)+" "+r.getString(2));
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
        }
}//GEN-LAST:event_jButton26MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        
}//GEN-LAST:event_jPanel9MouseClicked

    private void jButton25KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton25KeyPressed
        
}//GEN-LAST:event_jButton25KeyPressed

    private void jButton25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton25MouseClicked
        this.Add_Pr_Visble(false);
        this.Professor_Tap_Button_Visble(false);
        this.Pr_Show_Current_Visble(true);                 //pr update back buttin
        this.Professor_Update_Visble(false);
}//GEN-LAST:event_jButton25MouseClicked

    private void jButton23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MouseClicked
        this.Add_Pr_Visble(false);
        this.Professor_Tap_Button_Visble(true);
        this.Pr_Show_Current_Visble(false);          //pro show current back button
        this.Professor_Update_Visble(false);
    }//GEN-LAST:event_jButton23MouseClicked
                        //show current professor tab
    private void jButton22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton22MouseClicked
        this.Add_Pr_Visble(false);
        this.Professor_Tap_Button_Visble(false);
        this.Pr_Show_Current_Visble(true);                 //pro showcurrent buttin
        this.Professor_Update_Visble(false);
                        //loading in data in jtable
        query = prc.GetProfessorView();
        r = c.connection(query);
        int i = 0;                                      //counter
        try {
            while (r.next()){
                    for(int j = 1; j<= 7; j++){
                        jTable2.setValueAt(r.getString(j), i, j-1);
                    }
                i++;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
        }
        
    }//GEN-LAST:event_jButton22MouseClicked

    private void jButton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseClicked
        if(jTable2.isColumnSelected(0) || jTable2.isColumnSelected(1) || jTable2.isColumnSelected(2) || jTable2.isColumnSelected(3) || jTable2.isColumnSelected(4) || jTable2.isColumnSelected(5) || jTable2.isColumnSelected(6)){
            this.Add_Pr_Visble(false);
            this.Professor_Tap_Button_Visble(false);
            this.Pr_Show_Current_Visble(false);     //prupdate button
            this.Professor_Update_Visble(true);
                        //Update
            int row = jTable2.getSelectedRow();                             //gets the selected row ID
            jComboBox2.removeAllItems();
            int x = 1;                                                      //number of the first name coloumn
            jTextField13.setText(jTable2.getValueAt(row,x).toString());
            jTextField14.setText(jTable2.getValueAt(row,x+1).toString());
            int ID = Integer.parseInt(jTable2.getValueAt(row, x-1).toString());                //professor ID
                        //Updates the Selected professor
            query = prc.GetNumberofCourses(ID);                              //gets the number of subjects for the selected professor
            r = c.connection(query);
            int Subject = 0;
            try { 
                while(r.next()){
                    Subject = Integer.parseInt(r.getString(1));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
            }
            if(Subject != 0){
                String id_st = jTable2.getValueAt(row, x-1).toString();
             query  = prc.get_Prof_courses(id_st);
             r = c.connection(query);
             try{
                 while(r.next()){
                 jComboBox2.addItem(r.getString(2));
                }
             }
             catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
            }
            }
            else
                JOptionPane.showMessageDialog(null, "Professor NOT Registered to any Course","NOTICE",JOptionPane.INFORMATION_MESSAGE);
        }            
    }//GEN-LAST:event_jButton17MouseClicked

    private void jButton21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseClicked
        this.Add_Pr_Visble(true);//Add pro
        jTextField11.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jPasswordField2.setText("");
}//GEN-LAST:event_jButton21MouseClicked

    private void jButton16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton16KeyPressed
        
        this.Add_St_Visble(false);
        this.Student_Tap_Button_Visble(false);
        this.Show_Current_Visble(true);                 //fakes
        this.Student_Update_Visble(false);
}//GEN-LAST:event_jButton16KeyPressed

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        this.Add_St_Visble(false);
        this.Student_Tap_Button_Visble(false);
        this.Show_Current_Visble(true);                 //update back buttin
        this.Student_Update_Visble(false);
}//GEN-LAST:event_jButton16MouseClicked

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        this.Add_St_Visble(false);
        this.Student_Tap_Button_Visble(true);
        this.Show_Current_Visble(false);          //show current back button
        this.Student_Update_Visble(false);
}//GEN-LAST:event_jButton14MouseClicked
                            //filling the table
    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
                //GUI Effect
        this.Add_St_Visble(false);
        this.Student_Tap_Button_Visble(false);
        this.Show_Current_Visble(true);                 //showcurrent button
        this.Student_Update_Visble(false);
                             //loading in data in jtable
        query = prc.GetStudentView();
        r = c.connection(query);
        int i = 0;                                      //counter
        try {
            while (r.next()){
                    for(int j = 1; j<= 7; j++){
                        jTable1.setValueAt(r.getString(j), i, j-1);
                    }
                i++;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
        }
}//GEN-LAST:event_jButton10MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        this.Add_St_Visble(true);
        jTextField1.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jPasswordField1.setText("");
}//GEN-LAST:event_jButton3MouseClicked
                    //Updates the selected Student
    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        if(jTable1.isColumnSelected(0) || jTable1.isColumnSelected(1) || jTable1.isColumnSelected(2) || jTable1.isColumnSelected(3) || jTable1.isColumnSelected(4) || jTable1.isColumnSelected(5) || jTable1.isColumnSelected(6)){            
                            //GUI effects
            this.Add_St_Visble(false);
            this.Student_Tap_Button_Visble(false);
            this.Show_Current_Visble(false);          //    st update button
            this.Student_Update_Visble(true);
            int row = jTable1.getSelectedRow();                             //gets the selected row ID
            jComboBox1.removeAllItems();
            int x = 1;                                                      //number of the first name coloumn
            jTextField4.setText(jTable1.getValueAt(row,x).toString());
            jTextField5.setText(jTable1.getValueAt(row,x+1).toString());
            int ID = Integer.parseInt(jTable1.getValueAt(row, x-1).toString());                //Stdent ID
                        //Updates the Selected Student
            query = prc.GetNumberofSubjects(ID);                              //gets the number of subjects for the selected student
            r = c.connection(query);
            int Subject = 0;
            int [] Subjects_ID;                                               //array of courses ID taken by student
            try { 
                while(r.next()){
                    Subject = Integer.parseInt(r.getString(1));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
            }
            Subjects_ID = new int[Subject];;
            if(Subject != 0){
             query = prc.GetTakensCourseID(ID);
             r = c.connection(query);
              
             try{
                for(int i=0; r.next(); i++){
                    Subjects_ID[i]=Integer.parseInt(r.getString(1));
                }
             }
             catch(Exception ex){
                JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
             }
            }
            else
                JOptionPane.showMessageDialog(null, "Student NOT Registered to any Course","NOTICE",JOptionPane.INFORMATION_MESSAGE);
            if(Subject != 0){
                for(int i=0; i<Subject; i++){
                    query = prc.GetCourseName(Subjects_ID[i]);
                    r = c.connection(query);
                    try{
                        while(r.next()){
                            jComboBox1.addItem(r.getString(1));
                        }
                    }
                    catch(Exception ex){
                        JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
                    }
                }
            }
           // else
               // JOptionPane.showMessageDialog(null, "Student NOT Registered to any Course","NOTICE",JOptionPane.INFORMATION_MESSAGE);
        }
        
}//GEN-LAST:event_jButton11MouseClicked

    private void jButton33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton33MouseClicked
        // Add class
       this.Class_Update_Visble(false);
        this.Add_Cl_Visble(true);
        this.Cl_Show_Current_Visble(false);                 
        jTextField22.setEditable(true);
        jTextField22.setText("");
        jTextField23.setText("");
        
    }//GEN-LAST:event_jButton33MouseClicked

    private void jButton35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton35MouseClicked
       jTextField22.setEditable(false);
        if(jTable4.isColumnSelected(0) || jTable4.isColumnSelected(1)){
            // Update Class
          this.Add_Cl_Visble(false);
          this.Class_Tap_Button_Visble(false);
          this.Cl_Show_Current_Visble(false);                 //pr update back buttin
          this.Class_Update_Visble(true);
                //updates the classroom
          int row = jTable4.getSelectedRow();
          jTextField22.setText(jTable4.getValueAt(row, 0).toString());
          jTextField23.setText(jTable4.getValueAt(row, 1).toString());
          }
    }//GEN-LAST:event_jButton35MouseClicked
                //fill classroom in table
    private void jButton39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton39MouseClicked
        // Show current Class
        this.Add_Cl_Visble(false);
        this.Class_Tap_Button_Visble(false);
        this.Cl_Show_Current_Visble(true);                 
        this.Class_Update_Visble(false);
        jTextField19.setText("");
                //filling table
        int i = 0;                                      //counter
        query = prc.GetClassrooms();
        r = c.connection(query);
        extra.ResetTable(jTable4, 49, 1);
        try{
                while(r.next()){
                    for(int j = 1; j<= 2; j++){
                        jTable4.setValueAt(r.getString(j), i, j-1);
                    }
                    i++;
                }
        }
        catch(Exception ex){
             JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
        }
    }//GEN-LAST:event_jButton39MouseClicked

    private void jButton40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton40MouseClicked
        // Update Back Class
         this.Add_Cl_Visble(false);
        this.Class_Tap_Button_Visble(false);
        this.Cl_Show_Current_Visble(true);                 
        this.Class_Update_Visble(false);
        
    }//GEN-LAST:event_jButton40MouseClicked

    private void jButton41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton41MouseClicked
        // TODO add your handling code here:
          // Show Current Back Class
        this.Add_Cl_Visble(false);
        this.Class_Tap_Button_Visble(true);
        this.Cl_Show_Current_Visble(false);                 
        this.Class_Update_Visble(false);
    }//GEN-LAST:event_jButton41MouseClicked

    private void jButton41KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton41KeyPressed
      
    }//GEN-LAST:event_jButton41KeyPressed

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel11MouseClicked
                                //adds new semster
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // Add new Semster
        this.setVisible(false);
        AddNewSemster f=new AddNewSemster(this);
        f.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked
                                //confirm exit
    private void OnClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_OnClosing
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
        if(n == 0)
            this.dispose();
    }//GEN-LAST:event_OnClosing
                            //Search student by First and Last Name
    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        // TODO add your handling code here:
        String FirstName = jTextField6.getText().toString();
        String LastName = jTextField7.getText().toString();
        extra.ResetTable(jTable1, 24, 6);
        query = prc.search_for_person_ByName(FirstName, LastName,3000,3999);
        r = c.connection(query);
        int i = 0;                                      //counter
        try {
            while (r.next()){
                    for(int j = 1; j<= 6; j++){
                        jTable1.setValueAt(r.getString(j), i, j-1);
                    }
                i++;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
        }
    }//GEN-LAST:event_jButton12MouseClicked
                        //Delete Student
    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        String id = (String) jTable1.getValueAt(row, 0);
        query = prc.delete_Person(id);
        check = c.UpdateConnection(query);
        if(check == 1)
            JOptionPane.showMessageDialog(null, "Deleted Succefully", "Success Operation", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Can't be Deleted", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
                            //loading the new Data in the table
        extra.ResetTable(jTable1, 24, 6);
        query = prc.GetStudentView();
        r = c.connection(query);
        int i = 0;                                      //counter
        try {
            while (r.next()){
                    for(int j = 1; j<= 7; j++){
                        jTable1.setValueAt(r.getString(j), i, j-1);
                    }
                i++;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
        }
        
    }//GEN-LAST:event_jButton13MouseClicked
                        //insert new student
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        if(jTextField1.getText() != null){
            String year = jTextField1.getText();
            if(jTextField12.getText() != null){
                String ID = jTextField2.getText();
                if(jPasswordField1.getText() != null){
                    String Password = jPasswordField1.getText();
                    if(jTextField4.getText() != null){
                        String FirstName = jTextField4.getText();
                        if(jTextField15.getText() != null){
                            if(Integer.parseInt(ID) >=3000 && Integer.parseInt(ID) <=3999){
                            String LastName = jTextField5.getText();
                             Object G =  jComboBox5.getSelectedItem();
                             String Gender = G.toString();
                            query = prc.ADD_Person(ID, FirstName, LastName, Password,Gender,"null","null");
                            check = c.UpdateConnection(query);
                            query = prc.ADD_Student(ID, year);
                            check1 = c.UpdateConnection(query);
                            if(check == 1 && check1 == 1)
                                JOptionPane.showMessageDialog(null, "Added Succefully", "Success Operation", JOptionPane.INFORMATION_MESSAGE);
                            else
                                JOptionPane.showMessageDialog(null, "Can't be Added", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
                            }
                            else
                                JOptionPane.showMessageDialog(null, "Please, enter valid ID(between 3000 and 3999)", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
                        }
                                                //elses of the main IFs
                        else
                            JOptionPane.showMessageDialog(null, "please, enter Student's year", "UnCompleted Operation", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                        JOptionPane.showMessageDialog(null, "please, enter the Last Name", "UnCompleted Operation", JOptionPane.ERROR_MESSAGE);
                }
                else
                    JOptionPane.showMessageDialog(null, "please, enter the First Student", "UnCompleted Operation", JOptionPane.ERROR_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(null, "please, enter the password", "UnCompleted Operation", JOptionPane.ERROR_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null, "please, enter the ID", "UnCompleted Operation", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton2MouseClicked
                                //drops a course to a selected student
    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(null, "ARE you sure you want to delete the selected course","Confirm",JOptionPane.INFORMATION_MESSAGE);
        if(n==0){
            String subject = jComboBox1.getSelectedItem().toString();                              //subject that will be deleted
            int selected_student = jTable1.getSelectedRow();                                    //get the selected student
            String ID = jTable1.getValueAt(selected_student, 0).toString();       //get the ID of the selected student
            String SubjectID="";                                                                   //subject ID
            query = prc.GetCourseID(subject);
            r = c.connection(query);
            try{
                while(r.next()){
                    SubjectID = r.getString(1);
                }
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
            }
                if(SubjectID!=""){
                    query = prc.Drop_course_from_person(SubjectID, ID);
                    check = c.UpdateConnection(query);
                    if(check == 1)
                        JOptionPane.showMessageDialog(null, "Deleted Succefully", "Success Operation", JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, "Can't be Deleted", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
                                    //filling the combo box
                    jComboBox1.removeAllItems();
                    query = prc.GetNumberofSubjects(Integer.parseInt(ID));                              //gets the number of subjects for the selected student
                    r = c.connection(query);
                    int Subject = 0;
                    int [] Subjects_ID;                                               //array of courses ID taken by student
                try { 
                    while(r.next()){
                        Subject = Integer.parseInt(r.getString(1));
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
                }
                Subjects_ID = new int[Subject];
                if(Subject != 0){
                    query = prc.GetTakensCourseID(Integer.parseInt(ID));
                    r = c.connection(query); 
                    try{
                        for(int i=0; r.next(); i++){
                            Subjects_ID[i]=Integer.parseInt(r.getString(1));
                        }
                    }
                    catch(Exception ex){
                        JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
                    }
                }
               else
                JOptionPane.showMessageDialog(null, "Student NOT Registered to any Course","NOTICE",JOptionPane.INFORMATION_MESSAGE);
               if(Subject != 0){
                for(int i=0; i<Subject; i++){
                    query = prc.GetCourseName(Subjects_ID[i]);
                    r = c.connection(query);
                    jComboBox1.removeAllItems();
                    try{
                        while(r.next()){
                            jComboBox1.addItem(r.getString(1));
                        }
                    }
                    catch(Exception ex){
                        JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
                    }
                }
                }
            }
        }
    }//GEN-LAST:event_jButton15MouseClicked
                        //submits the Updates
    private void jButton45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton45MouseClicked
        // TODO add your handling code here:
        check1 = JOptionPane.showConfirmDialog(null, "Are you sure you want to conitnue?","Confirm First",JOptionPane.INFORMATION_MESSAGE);
        if(check1 == 0){
            int index = jTable1.getSelectedRow();
            int ID = Integer.parseInt(jTable1.getValueAt(index, 0).toString());                         //gets student's ID 
            String FirstName = jTextField4.getText();                                                   //gets first name
            String LastName = jTextField5.getText();                                                    //gets last name
            query=prc.UpdateStudent(ID, FirstName, LastName);
            check=c.UpdateConnection(query);
            if(check == 1)
                        JOptionPane.showMessageDialog(null, "Updated Succefully", "Success Operation", JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, "Can't be Updated", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton45MouseClicked
                        //professor search
    private void jButton19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseClicked
        // TODO add your handling code here:
        String FirstName = jTextField9.getText().toString();                        //professor's first name
        String LastName = jTextField8.getText().toString();                         //professor's last name
        extra.ResetTable(jTable2, 24, 6);
        query = prc.search_for_person_ByName(FirstName, LastName,1000,1999);
        r = c.connection(query);
        int i = 0;                                      //counter
        try {
            while (r.next()){
                    for(int j = 1; j<= 6; j++){
                        jTable2.setValueAt(r.getString(j), i, j-1);
                    }
                i++;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
        }
    }//GEN-LAST:event_jButton19MouseClicked

    private void jButton18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseClicked
        // TODO add your handling code here:
        int row = jTable2.getSelectedRow();
        String id = (String) jTable2.getValueAt(row, 0);
        query = prc.delete_Person(id);
        check = c.UpdateConnection(query);
        if(check == 1)
            JOptionPane.showMessageDialog(null, "Deleted Succefully", "Success Operation", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Can't be Deleted", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
                            //loading the new Data in the table
        extra.ResetTable(jTable2, 24, 6);
        query = prc.GetProfessorView();
        r = c.connection(query);
        int i = 0;                                      //counter
        try {
            while (r.next()){
                    for(int j = 1; j<= 7; j++){
                        jTable2.setValueAt(r.getString(j), i, j-1);
                    }
                i++;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
        }
    }//GEN-LAST:event_jButton18MouseClicked
                                        //drop a course from professor
    private void jButton24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton24MouseClicked
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(null, "ARE you sure you want to delete the selected course","Confirm",JOptionPane.INFORMATION_MESSAGE);
        if(n==0){
            String subject = jComboBox2.getSelectedItem().toString();                              //subject that will be deleted
            int selected_student = jTable2.getSelectedRow();                                    //get the selected professor
            String ID = jTable2.getValueAt(selected_student, 0).toString();       //get the ID of the selected professor
            String SubjectID="";                                                                   //subject ID
            query = prc.GetCourseID(subject);
            r = c.connection(query);
            try{
                while(r.next()){
                    SubjectID = r.getString(1);
                }
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
            }
                if(!"".equals(SubjectID)){
                    query = prc.delete_Prof_course(SubjectID);
                    check = c.UpdateConnection(query);
                    if(check == 1)
                        JOptionPane.showMessageDialog(null, "Deleted Succefully", "Success Operation", JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, "Can't be Deleted", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
                                    //filling the combo box
            jComboBox2.removeAllItems();
            query = prc.GetNumberofCourses(Integer.parseInt(ID));                              //gets the number of subjects for the selected professor
            r = c.connection(query);
            int Subject = 0;
            try { 
                while(r.next()){
                    Subject = Integer.parseInt(r.getString(1));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
            }
            if(Subject != 0){
             query  = prc.get_Prof_courses(ID);
             r = c.connection(query);
             try{
                 while(r.next()){
                 jComboBox2.addItem(r.getString(2));
                }
             }
             catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
            }
            }
            else
                JOptionPane.showMessageDialog(null, "Student NOT Registered to any Course","NOTICE",JOptionPane.INFORMATION_MESSAGE);
                }
        }
    }//GEN-LAST:event_jButton24MouseClicked
                            //submits the professor updates
    private void jButton44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton44MouseClicked
        // TODO add your handling code here:
         check1 = JOptionPane.showConfirmDialog(null, "Are you sure you want to conitnue?","Confirm First",JOptionPane.INFORMATION_MESSAGE);
        if(check1 == 0){
            int index1 = jTable2.getSelectedRow();
            int ID = Integer.parseInt(jTable2.getValueAt(index1, 0).toString());                         //gets student's ID 
            String FirstName = jTextField13.getText();                                                   //gets first name
            String LastName = jTextField14.getText();                                                    //gets last name
            query=prc.UpdateProfessor(ID, FirstName, LastName);
            check=c.UpdateConnection(query);
            if(check == 1)
                        JOptionPane.showMessageDialog(null, "Updated Succefully", "Success Operation", JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, "Can't be Updated", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton44MouseClicked
                        //adds new professor
    private void jButton20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseClicked
        // TODO add your handling code here:
        if(jTextField11.getText() != null){
            String ID = jTextField11.getText();
                if(jPasswordField2.getText() != null){
                    String Password = jPasswordField2.getText();
                    if(jTextField13.getText() != null){
                        String FirstName = jTextField13.getText();
                        if(jTextField14.getText() != null){
                            if(Integer.parseInt(ID)>=1000 && Integer.parseInt(ID)<=1999){
                            String LastName = jTextField14.getText();
                             Object G =  jComboBox6.getSelectedItem();
                             String Gender = G.toString();
                            query = prc.ADD_Person(ID, FirstName, LastName, Password,Gender,"null","null");
                            check = c.UpdateConnection(query);
                            if(check == 1)
                                JOptionPane.showMessageDialog(null, "Added Succefully", "Success Operation", JOptionPane.INFORMATION_MESSAGE);
                            else
                                JOptionPane.showMessageDialog(null, "Can't be Added", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
                        }
                            else
                                JOptionPane.showMessageDialog(null, "Please, enter valid ID(between 1000 and 1999)", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
                        }                   
                            //elses of the main IFs
                        else
                            JOptionPane.showMessageDialog(null, "please, enter Student's year", "UnCompleted Operation", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                        JOptionPane.showMessageDialog(null, "please, enter the Last Name", "UnCompleted Operation", JOptionPane.ERROR_MESSAGE);
                }
            else
                JOptionPane.showMessageDialog(null, "please, enter the password", "UnCompleted Operation", JOptionPane.ERROR_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null, "please, enter the ID", "UnCompleted Operation", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton20MouseClicked
                        //searches the course by name
    private void jButton29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton29MouseClicked
        // TODO add your handling code here:
            String CourseName = jTextField15.getText();
            extra.ResetTable(jTable3, 49, 7);
            query = prc.search_for_course_ByName(CourseName);
            r = c.connection(query);
            int i = 0;                                      //counter
        try {
            while (r.next()){
                    for(int j = 1; j<= 8; j++){
                        jTable3.setValueAt(r.getString(j), i, j-1);
                    }
                i++;
            }
        }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
            }
    }//GEN-LAST:event_jButton29MouseClicked
                        //Delete the selected course
    private void jButton28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton28MouseClicked
        // TODO add your handling code here:
        int row = jTable3.getSelectedRow();
        String id = (String) jTable3.getValueAt(row, 0);
        query = prc.Delete_course(id);
        check = c.UpdateConnection(query);
        if(check == 1)
            JOptionPane.showMessageDialog(null, "Deleted Succefully", "Success Operation", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Can't be Deleted", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
                            //loading the new Data in the table
        extra.ResetTable(jTable3, 24, 6);
        query = prc.GetAllCourses();
        r = c.connection(query);
        int i = 0;                                      //counter
        try {
            while (r.next()){
                    for(int j = 1; j<= 7; j++){
                        jTable3.setValueAt(r.getString(j), i, j-1);
                    }
                i++;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
        }
    }//GEN-LAST:event_jButton28MouseClicked
            //add new course
    private void jButton30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton30MouseClicked
        // TODO add your handling code here:
        boolean flag1=extra.checkHRs(Integer.parseInt(jTextField18.getText()));
        boolean flag2=extra.checkHRs(Integer.parseInt(jTextField20.getText()));
        boolean flag3=extra.checkHRs(Integer.parseInt(jTextField21.getText()));
        if(flag1&&flag2&&flag3){
        if(jTextField16.getText()!=""){
            String ID = jTextField16.getText();
            if(jTextField17.getText()!=""){
                String CrsName = jTextField17.getText();
                if(jTextField18.getText()!=""){
                    String LecHrs = jTextField18.getText();
                    if(jTextField20.getText()!=""){
                        String LabHrs = jTextField20.getText();
                        if(jTextField21.getText()!=""){
                            String SecHrs = jTextField21.getText();
                            if(jComboBox4.getSelectedIndex()!=-1){
                                if(Integer.parseInt(ID)>=10000 && Integer.parseInt(ID)<=99999){
                                String[] CrsProf = jComboBox4.getSelectedItem().toString().split(" ");
                                query = prc.GetPersonID(CrsProf[0],CrsProf[1], 1000, 1999);
                                r = c.connection(query);
                                String id_prof = null;
                                try{
                                    while(r.next()){
                                        id_prof = r.getString(1);
                                    }
                                }
                                catch (Exception ex) {
                                    JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
                                    }
                                if(jComboBox3.getSelectedIndex()!=-1){
                                    String[] CrsTa = jComboBox3.getSelectedItem().toString().split(" ");
                                    query = prc.GetPersonID(CrsTa[0],CrsTa[1], 2000, 2999);
                                r = c.connection(query);
                                String id_ta = null;
                                try{
                                    while(r.next()){
                                        id_ta = r.getString(1);
                                    }
                                }
                                catch (Exception ex) {
                                    JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
                                    }
                                    query = prc.get_Current_Year();
                                    r = c.connection(query);
                                    String year = null;
                                    try{
                                        while(r.next()){
                                            year = r.getString(1);
                                        }
                                    }
                                    catch (Exception ex) {
                                        JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
                                    }
                                    if(id_prof!=null&&id_ta!=null&&year!=null){
                                    query = prc.Add_course(ID, CrsName, LabHrs, LecHrs, SecHrs, id_prof, id_ta, year);
                                    check = c.UpdateConnection(query);
                                    if(check == 1)
                                        JOptionPane.showMessageDialog(null, "Added Succefully", "Success Operation", JOptionPane.INFORMATION_MESSAGE);
                                    else
                                        JOptionPane.showMessageDialog(null, "Can't be Added", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    else 
                                        JOptionPane.showMessageDialog(null, "Can't be Added", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
                                }
                                  else
                                    JOptionPane.showMessageDialog(null, "please, enter Course's Teacher Assistance", "UnCompleted Operation", JOptionPane.ERROR_MESSAGE);
                                }
                                 else
                                    JOptionPane.showMessageDialog(null, "Please, enter valid ID(between 10000 and 99999)", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
                            }
                            else
                                JOptionPane.showMessageDialog(null, "please, enter Course's Professor", "UnCompleted Operation", JOptionPane.ERROR_MESSAGE);
                        }
                           else
                            JOptionPane.showMessageDialog(null, "please, enter the Section Hours", "UnCompleted Operation", JOptionPane.ERROR_MESSAGE);
                    }
                       else
                        JOptionPane.showMessageDialog(null, "please, enter the Lab Hours", "UnCompleted Operation", JOptionPane.ERROR_MESSAGE);
                }
                   else
                    JOptionPane.showMessageDialog(null, "please, enter Lecuter Hours", "UnCompleted Operation", JOptionPane.ERROR_MESSAGE);
            }
               else
                JOptionPane.showMessageDialog(null, "please, enter Course Name", "UnCompleted Operation", JOptionPane.ERROR_MESSAGE);
        }
          else
           JOptionPane.showMessageDialog(null, "please, enter the ID", "UnCompleted Operation", JOptionPane.ERROR_MESSAGE); 
        }
        else
            JOptionPane.showMessageDialog(null, "Can't put this Hours in this Semster", "ERROR", JOptionPane.OK_OPTION);
    }//GEN-LAST:event_jButton30MouseClicked
                //searches the classroom
    private void jButton37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton37MouseClicked
        // TODO add your handling code here:
        int id = Integer.parseInt(jTextField19.getText());
        query = prc.SearchClassbyID(id);
        r = c.connection(query);
        extra.ResetTable(jTable4, 49, 1);
        try{
            while(r.next()){
                jTable4.setValueAt(r.getString(1), 0, 0);
                jTable4.setValueAt(r.getString(2), 0, 1);
            }
        }
        catch (Exception ex) {
         JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
        }
    }//GEN-LAST:event_jButton37MouseClicked
                    //deletes the selected classroom
    private void jButton36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton36MouseClicked
        // TODO add your handling code here:
        int row = jTable4.getSelectedRow();
        String id = jTable4.getValueAt(row, 0).toString();
        query = prc.delete_Class(id);
        check = c.UpdateConnection(query);
        if(check == 1)
            JOptionPane.showMessageDialog(null, "Deleted Succefully", "Success Operation", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Can't be Deleted", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
                            //loading the new Data in the table
        extra.ResetTable(jTable4, 49, 1);
        query = prc.GetClassrooms();
        r = c.connection(query);
        int i = 0;                                      //counter
        try {
            while (r.next()){
                    for(int j = 1; j<= 2; j++){
                        jTable4.setValueAt(r.getString(j), i, j-1);
                    }
                i++;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
        }
    }//GEN-LAST:event_jButton36MouseClicked
                    //submits the updates of the class
    private void jButton42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton42MouseClicked
        // TODO add your handling code here:
        if(Integer.parseInt(jTextField22.getText())>=100000 && Integer.parseInt(jTextField22.getText())<=999999){
        query = prc.UpdateClass(Integer.parseInt(jTextField22.getText()), jTextField23.getText());
        check = c.UpdateConnection(query);
        if(check == 1)
            JOptionPane.showMessageDialog(null, "Updated Succefully", "Success Operation", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Can't be Updated", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
        }
else
JOptionPane.showMessageDialog(null, "Please, enter valid ID(between 100000 and 999999)", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton42MouseClicked
                //add the new class
    private void jButton38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton38MouseClicked
        // TODO add your handling code here:
        if(!" ".equals(jTextField22.getText()) && !"".equals(jTextField23.getText())){
            query = prc.Add_Class(jTextField22.getText(), jTextField23.getText());
            check = c.UpdateConnection(query);
            if(check == 1)
                JOptionPane.showMessageDialog(null, "Added Succefully", "Success Operation", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "Can't be Added", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton38MouseClicked
                // Student Access
    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        // TODO add your handling code here:
        if(jRadioButton1.isSelected()==true){
            query = prc.set_student_Access("T");
            check = c.UpdateConnection(query);
            if(check == 1)
                JOptionPane.showMessageDialog(null, "Student Access Enabled", "Success Operation", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "Can't Enable Student Access", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
        }
        else
            if(jRadioButton1.isSelected()==false){
            query = prc.set_student_Access("F");
            check = c.UpdateConnection(query);
            if(check == 1)
                JOptionPane.showMessageDialog(null, "Student Access Disabled", "Success Operation", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "Can't Disable Student Access", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jRadioButton1MouseClicked
            //professor access
    private void jRadioButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton3MouseClicked
        // TODO add your handling code here:
        if(jRadioButton3.isSelected()==true){
            query = prc.set_prof_Access("T");
            check = c.UpdateConnection(query);
            if(check == 1)
                JOptionPane.showMessageDialog(null, "Professor and Teacher Assistant Access Enabled", "Success Operation", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "Can't Enable Professor and Teacher Assistant Access", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
        }
        else
            if(jRadioButton3.isSelected()==false){
            query = prc.set_prof_Access("F");
            check = c.UpdateConnection(query);
            if(check == 1)
                JOptionPane.showMessageDialog(null, "Professor and Teacher Assistant Access Disabled", "Success Operation", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "Can't Disable Professor and Teacher Assistant Access", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
        }                                         
    }//GEN-LAST:event_jRadioButton3MouseClicked

    private void jButton46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton46MouseClicked
         this.Add_Ta_Visble(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton46MouseClicked
                //GO TO UPDATE
    private void jButton47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton47MouseClicked
        if(jTable5.isColumnSelected(0) || jTable5.isColumnSelected(1) || jTable5.isColumnSelected(2) || jTable5.isColumnSelected(3) || jTable5.isColumnSelected(4) || jTable5.isColumnSelected(5) || jTable5.isColumnSelected(6)){
        this.Add_Ta_Visble(false);
        this.Ta_Tap_Button_Visble(false);
        this.Ta_Show_Current_Visble(false);                 //pr update back buttin
        this.Ta_Update_Visble(true);
        //Update
            int row = jTable5.getSelectedRow();                             //gets the selected row ID
            jComboBox7.removeAllItems();
            int x = 1;                                                      //number of the first name coloumn
            jTextField27.setText(jTable5.getValueAt(row,x).toString());
            jTextField28.setText(jTable5.getValueAt(row,x+1).toString());
            int ID = Integer.parseInt(jTable5.getValueAt(row, x-1).toString());                //TA ID
                        //Updates the Selected TA
            query = prc.GetNumberofCoursesTA(ID);
            r = c.connection(query);
            int Subject = 0;
            try { 
                while(r.next()){
                    Subject = Integer.parseInt(r.getString(1));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
            }
            if(Subject != 0){
                String id_st = jTable5.getValueAt(row, x-1).toString();
             query  = prc.get_TA_courses(id_st);
             r = c.connection(query);
             try{
                 while(r.next()){
                 jComboBox7.addItem(r.getString(2));
                }
             }
             catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
            }
            }
            else
                JOptionPane.showMessageDialog(null, "Teacher Assistant NOT Registered to any Course","NOTICE",JOptionPane.INFORMATION_MESSAGE);
        }            
    }//GEN-LAST:event_jButton47MouseClicked
                //deletes the selected TA
    private void jButton48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton48MouseClicked
        // TODO add your handling code here:
        int row = jTable5.getSelectedRow();
        String id = (String) jTable5.getValueAt(row, 0);
        query = prc.delete_Person(id);
        check = c.UpdateConnection(query);
        if(check == 1)
            JOptionPane.showMessageDialog(null, "Deleted Succefully", "Success Operation", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Can't be Deleted", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
                            //loading the new Data in the table
        extra.ResetTable(jTable5, 24, 6);
        query = prc.GetTAView();
        r = c.connection(query);
        int i = 0;                                      //counter
        try {
            while (r.next()){
                    for(int j = 1; j<= 7; j++){
                        jTable5.setValueAt(r.getString(j), i, j-1);
                    }
                i++;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
        }
    }//GEN-LAST:event_jButton48MouseClicked
                //search the TA
    private void jButton49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton49MouseClicked
        // TODO add your handling code here:
        String FirstName = jTextField24.getText().toString();                        //professor's first name
        String LastName = jTextField10.getText().toString();                         //professor's last name
        extra.ResetTable(jTable5, 24, 6);
        query = prc.search_for_person_ByName(FirstName, LastName,2000,2999);
        r = c.connection(query);
        int i = 0;                                      //counter
        try {
            while (r.next()){
                    for(int j = 1; j<= 6; j++){
                        jTable5.setValueAt(r.getString(j), i, j-1);
                    }
                i++;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
        }
    }//GEN-LAST:event_jButton49MouseClicked

    private void jButton50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton50MouseClicked
        // TODO add your handling code here:
         if(jTextField25.getText() != null){
            String ID = jTextField25.getText();
                if(jPasswordField3.getText() != null){
                    String Password = jPasswordField3.getText();
                    if(jTextField27.getText() != null){
                        String FirstName = jTextField27.getText();
                        if(jTextField28.getText() != null){
                            if(Integer.parseInt(ID)>=2000 && Integer.parseInt(ID)<=2999){
                            String LastName = jTextField28.getText();
                             Object G =  jComboBox8.getSelectedItem();
                             String Gender = G.toString();
                            query = prc.ADD_Person(ID, FirstName, LastName, Password,Gender,"null","null");
                            check = c.UpdateConnection(query);
                            if(check == 1)
                                JOptionPane.showMessageDialog(null, "Added Succefully", "Success Operation", JOptionPane.INFORMATION_MESSAGE);
                            else
                                JOptionPane.showMessageDialog(null, "Can't be Added", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
                        }
                            else
                                JOptionPane.showMessageDialog(null, "Please, enter valid ID(between 1000 and 1999)", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
                        }                   
                            //elses of the main IFs
                        else
                            JOptionPane.showMessageDialog(null, "please, enter TA's year", "UnCompleted Operation", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                        JOptionPane.showMessageDialog(null, "please, enter the Last Name", "UnCompleted Operation", JOptionPane.ERROR_MESSAGE);
                }
            else
                JOptionPane.showMessageDialog(null, "please, enter the password", "UnCompleted Operation", JOptionPane.ERROR_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null, "please, enter the ID", "UnCompleted Operation", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton50MouseClicked
            //loading data into TA table
    private void jButton51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton51MouseClicked
       this.Add_Ta_Visble(false);
        this.Ta_Tap_Button_Visble(false);
        this.Ta_Show_Current_Visble(true);                
        this.Ta_Update_Visble(false);
        // TODO add your handling code here:
        try{
            query = prc.GetTAView();
        r = c.connection(query);
        int i = 0;                                      //counter
            while (r.next()){
                    for(int j = 1; j<= 7; j++){
                        jTable5.setValueAt(r.getString(j), i, j-1);
                    }
                i++;
        }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
        }
    }//GEN-LAST:event_jButton51MouseClicked

    private void jButton52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton52MouseClicked
     this.Add_Ta_Visble(false);
        this.Ta_Tap_Button_Visble(true);
        this.Ta_Show_Current_Visble(false);       
        this.Ta_Update_Visble(false);
    }//GEN-LAST:event_jButton52MouseClicked
                //drop TA course
    private void jButton53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton53MouseClicked
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(null, "ARE you sure you want to delete the selected course","Confirm",JOptionPane.INFORMATION_MESSAGE);
        if(n==0){
            String subject = jComboBox7.getSelectedItem().toString();                              //subject that will be deleted
            int selected_student = jTable5.getSelectedRow();                                    //get the selected TA
            String ID = jTable5.getValueAt(selected_student, 0).toString();       //get the ID of the selected TA
            String SubjectID="";                                                                   //subject ID
            query = prc.GetCourseID(subject);
            r = c.connection(query);
            try{
                while(r.next()){
                    SubjectID = r.getString(1);
                }
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
            }
                if(!"".equals(SubjectID)){
                    query = prc.delete_TA_course(SubjectID);
                    check = c.UpdateConnection(query);
                    if(check == 1)
                        JOptionPane.showMessageDialog(null, "Deleted Succefully", "Success Operation", JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, "Can't be Deleted", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
                                    //filling the combo box
            jComboBox5.removeAllItems();
            query = prc.GetNumberofCoursesTA(Integer.parseInt(ID));                            //gets the number of subjects for the selected professor
            r = c.connection(query);
            int Subject = 0;
            try { 
                while(r.next()){
                    Subject = Integer.parseInt(r.getString(1));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
            }
            if(Subject != 0){
                jComboBox7.removeAllItems();
             query  = prc.get_TA_courses(ID);
             r = c.connection(query);
             try{
                 while(r.next()){
                 jComboBox7.addItem(r.getString(2));
                }
             }
             catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
            }
            }
            else
                JOptionPane.showMessageDialog(null, "Teacher Assistnt NOT Registered to any Course","NOTICE",JOptionPane.INFORMATION_MESSAGE);
                }
        }
    }//GEN-LAST:event_jButton53MouseClicked

    private void jButton54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton54MouseClicked
      this.Add_Ta_Visble(false);
        this.Ta_Tap_Button_Visble(false);
        this.Ta_Show_Current_Visble(true);                 
        this.Ta_Update_Visble(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton54MouseClicked

    private void jButton54KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton54KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton54KeyPressed
                //submits the changes
    private void jButton55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton55MouseClicked
        // TODO add your handling code here:
        check1 = JOptionPane.showConfirmDialog(null, "Are you sure you want to conitnue?","Confirm First",JOptionPane.INFORMATION_MESSAGE);
        if(check1 == 0){
            int index1 = jTable5.getSelectedRow();
            int ID = Integer.parseInt(jTable5.getValueAt(index1, 0).toString());                         //gets TA's ID 
            String FirstName = jTextField27.getText();                                                   //gets first name
            String LastName = jTextField28.getText();                                                    //gets last name
            query=prc.UpdateProfessor(ID, FirstName, LastName);
            check=c.UpdateConnection(query);
            if(check == 1)
                        JOptionPane.showMessageDialog(null, "Updated Succefully", "Success Operation", JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, "Can't be Updated", "Unsuccess Operation", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton55MouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel12MouseClicked

    private void jButton56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton56MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton56MouseClicked

    private void jButton57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton57MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton57MouseClicked

    private void jButton58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton58MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        AddCoursePre f=new AddCoursePre(crsID,this);
        f.setVisible(true);
    }//GEN-LAST:event_jButton58MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        try{
        query=prc.get_Student_Access();
        r=c.connection(query);
        String student = null;
        while(r.next()){
           student=r.getString(1);
        }
        query=prc.get_prof_Access();
        r=c.connection(query);
        String prof = null;
        while(r.next()){
           prof=r.getString(1);
        }
        query=prc.get_TA_Access();
        r=c.connection(query);
        String ta = null;
        while(r.next()){
           ta=r.getString(1);
        }
        if( "F".equals(student) && "F".equals(prof) /*&& "F".equals(ta)*/){
            this.dispose();
            TimeTableForamt1 f=new TimeTableForamt1();
            f.setVisible(true);
        }
        }
        catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR"+ex.toString());
            }
    }//GEN-LAST:event_jButton4MouseClicked
      
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AdminMain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager course_timetablePUEntityManager;
    private java.util.List<coursetimetable.Courses> coursesList;
    private javax.persistence.Query coursesQuery;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private java.util.List<coursetimetable.TakeCourse> takeCourseList;
    private javax.persistence.Query takeCourseQuery;
    // End of variables declaration//GEN-END:variables
}
