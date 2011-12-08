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

import javax.swing.JOptionPane;

/**
 *
 * @author mahmoud
 */
public class AdminMain extends javax.swing.JFrame {

    /** Creates new form Admin_Main */
    public AdminMain() {
      
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
     jTextField3.setVisible(b);
     jTextField4.setVisible(b);
     jTextField5.setVisible(b);
     jButton2.setVisible(b);
     
     
    
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
     jTextField12.setVisible(b);
     jTextField13.setVisible(b);
     jTextField14.setVisible(b);
     jButton20.setVisible(b);
     
     
    
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
      private  void Add_Cr_Visble(boolean  b)
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
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
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
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton44 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
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
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
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
        jTabbedPane1.setName("jTabbedPane1"); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(coursetimetable.CourseTimeTableApp.class).getContext().getResourceMap(AdminMain.class);
        jLabel20.setText(resourceMap.getString("jLabel20.text")); // NOI18N
        jLabel20.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel20.setName("jLabel20"); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 70, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jComboBox1.setName("jComboBox1"); // NOI18N
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 110, 40));

        jTextField7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField7.setName("jTextField7"); // NOI18N
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 90, 30));

        jTextField6.setText(resourceMap.getString("jTextField6.text")); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField6.setName("jTextField6"); // NOI18N
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 90, 30));

        jLabel19.setText(resourceMap.getString("jLabel19.text")); // NOI18N
        jLabel19.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel19.setName("jLabel19"); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 110, 20));

        jButton11.setText(resourceMap.getString("jButton11.text")); // NOI18N
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
        jButton13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton13.setName("jButton13"); // NOI18N
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 180, -1));

        jButton12.setText(resourceMap.getString("jButton12.text")); // NOI18N
        jButton12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton12.setName("jButton12"); // NOI18N
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 180, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setName("jTable1"); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 530, 190));

        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton2.setName("jButton2"); // NOI18N
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 140, 30));

        jButton3.setText(resourceMap.getString("jButton3.text")); // NOI18N
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
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField1.setName("Student_Year_Text"); // NOI18N
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 150, -1));

        jLabel14.setFont(resourceMap.getFont("Student_Year_Label.font")); // NOI18N
        jLabel14.setText(resourceMap.getString("Student_Year_Label.text")); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel14.setName("Student_Year_Label"); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 70, 30));

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

        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField2.setName("Student_Id_Text"); // NOI18N
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 150, -1));

        jTextField3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField3.setName("Student_Password_Text"); // NOI18N
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 150, -1));

        jTextField4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField4.setName("Student_Fn_Text"); // NOI18N
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 150, -1));

        jTextField5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField5.setName("Student_LN_Text"); // NOI18N
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 150, -1));

        jButton10.setText(resourceMap.getString("jButton10.text")); // NOI18N
        jButton10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton10.setName("jButton10"); // NOI18N
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 170, 40));

        jButton14.setText(resourceMap.getString("jButton14.text")); // NOI18N
        jButton14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton14.setName("jButton14"); // NOI18N
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        jPanel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));

        jButton15.setText(resourceMap.getString("jButton15.text")); // NOI18N
        jButton15.setActionCommand(resourceMap.getString("jButton15.actionCommand")); // NOI18N
        jButton15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton15.setName("jButton15"); // NOI18N
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 110, 40));

        jButton16.setText(resourceMap.getString("jButton16.text")); // NOI18N
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
        jButton45.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton45.setName("jButton45"); // NOI18N
        jPanel2.add(jButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 140, 30));

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
        jButton21.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton21.setName("jButton21"); // NOI18N
        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton21MouseClicked(evt);
            }
        });
        jPanel9.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 170, 40));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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
        jButton18.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton18.setName("jButton18"); // NOI18N
        jPanel9.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 180, -1));

        jButton19.setText(resourceMap.getString("jButton19.text")); // NOI18N
        jButton19.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton19.setName("jButton19"); // NOI18N
        jPanel9.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 180, -1));

        jButton20.setText(resourceMap.getString("jButton20.text")); // NOI18N
        jButton20.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton20.setName("jButton20"); // NOI18N
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

        jTextField13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField13.setName("jTextField13"); // NOI18N
        jPanel9.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 150, -1));

        jTextField14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField14.setName("jTextField14"); // NOI18N
        jPanel9.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 150, -1));

        jButton22.setText(resourceMap.getString("jButton22.text")); // NOI18N
        jButton22.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton22.setName("jButton22"); // NOI18N
        jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton22MouseClicked(evt);
            }
        });
        jPanel9.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 170, 40));

        jButton23.setText(resourceMap.getString("jButton23.text")); // NOI18N
        jButton23.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton23.setName("jButton23"); // NOI18N
        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton23MouseClicked(evt);
            }
        });
        jPanel9.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));

        jButton24.setText(resourceMap.getString("jButton24.text")); // NOI18N
        jButton24.setActionCommand(resourceMap.getString("jButton24.actionCommand")); // NOI18N
        jButton24.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton24.setName("jButton24"); // NOI18N
        jPanel9.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 110, 40));

        jButton25.setText(resourceMap.getString("jButton25.text")); // NOI18N
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setName("jTable2"); // NOI18N
        jScrollPane2.setViewportView(jTable2);

        jPanel9.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 530, 190));

        jButton44.setText(resourceMap.getString("jButton44.text")); // NOI18N
        jButton44.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton44.setName("jButton44"); // NOI18N
        jPanel9.add(jButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 140, 30));

        jLabel29.setIcon(resourceMap.getIcon("jLabel29.icon")); // NOI18N
        jLabel29.setName("jLabel29"); // NOI18N
        jPanel9.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        jTabbedPane1.addTab(resourceMap.getString("jPanel9.TabConstraints.tabTitle"), jPanel9); // NOI18N

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel10.setName("jPanel10"); // NOI18N
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton26.setText(resourceMap.getString("jButton26.text")); // NOI18N
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
        jPanel10.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 90, 30));

        jButton27.setText(resourceMap.getString("jButton27.text")); // NOI18N
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
        jPanel10.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 110, 20));

        jButton28.setText(resourceMap.getString("jButton28.text")); // NOI18N
        jButton28.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton28.setName("jButton28"); // NOI18N
        jPanel10.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 180, -1));

        jButton29.setText(resourceMap.getString("jButton29.text")); // NOI18N
        jButton29.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton29.setName("jButton29"); // NOI18N
        jPanel10.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 180, -1));

        jButton30.setText(resourceMap.getString("jButton30.text")); // NOI18N
        jButton30.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton30.setName("jButton30"); // NOI18N
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

        jTextField16.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField16.setName("jTextField16"); // NOI18N
        jPanel10.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 150, -1));

        jLabel35.setFont(resourceMap.getFont("jLabel35.font")); // NOI18N
        jLabel35.setText(resourceMap.getString("jLabel35.text")); // NOI18N
        jLabel35.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel35.setName("jLabel35"); // NOI18N
        jPanel10.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 110, 30));

        jTextField17.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField17.setName("jTextField17"); // NOI18N
        jPanel10.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 150, -1));

        jTextField18.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField18.setName("jTextField18"); // NOI18N
        jPanel10.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 150, -1));

        jLabel37.setFont(resourceMap.getFont("jLabel37.font")); // NOI18N
        jLabel37.setText(resourceMap.getString("jLabel37.text")); // NOI18N
        jLabel37.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel37.setName("jLabel37"); // NOI18N
        jPanel10.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 90, 30));

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

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jComboBox3.setName("jComboBox3"); // NOI18N
        jPanel10.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 130, 40));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jComboBox4.setName("jComboBox4"); // NOI18N
        jPanel10.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 130, 40));

        jTextField21.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField21.setName("jTextField21"); // NOI18N
        jPanel10.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 150, -1));

        jLabel40.setFont(resourceMap.getFont("jLabel40.font")); // NOI18N
        jLabel40.setText(resourceMap.getString("jLabel40.text")); // NOI18N
        jLabel40.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel40.setName("jLabel40"); // NOI18N
        jPanel10.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 90, 30));

        jButton31.setText(resourceMap.getString("jButton31.text")); // NOI18N
        jButton31.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton31.setName("jButton31"); // NOI18N
        jButton31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton31MouseClicked(evt);
            }
        });
        jPanel10.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 170, 40));

        jButton32.setText(resourceMap.getString("jButton32.text")); // NOI18N
        jButton32.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton32.setName("jButton32"); // NOI18N
        jButton32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton32MouseClicked(evt);
            }
        });
        jPanel10.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));

        jButton34.setText(resourceMap.getString("jButton34.text")); // NOI18N
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

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane3.setName("jScrollPane3"); // NOI18N

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.setName("jTable3"); // NOI18N
        jScrollPane3.setViewportView(jTable3);

        jPanel10.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 530, 190));

        jButton43.setText(resourceMap.getString("jButton43.text")); // NOI18N
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
        jPanel11.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 70, 30));

        jLabel44.setFont(resourceMap.getFont("jLabel44.font")); // NOI18N
        jLabel44.setText(resourceMap.getString("jLabel44.text")); // NOI18N
        jLabel44.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel44.setName("jLabel44"); // NOI18N
        jPanel11.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 50, 30));

        jTextField23.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField23.setName("jTextField23"); // NOI18N
        jPanel11.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 150, -1));

        jTextField22.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField22.setName("jTextField22"); // NOI18N
        jPanel11.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 150, -1));

        jButton33.setText(resourceMap.getString("jButton33.text")); // NOI18N
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
        jButton35.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton35.setName("jButton35"); // NOI18N
        jButton35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton35MouseClicked(evt);
            }
        });
        jPanel11.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 180, -1));

        jButton42.setText(resourceMap.getString("jButton42.text")); // NOI18N
        jButton42.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton42.setName("jButton42"); // NOI18N
        jPanel11.add(jButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 140, 30));

        jLabel41.setText(resourceMap.getString("jLabel41.text")); // NOI18N
        jLabel41.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel41.setName("jLabel41"); // NOI18N
        jPanel11.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 110, 20));

        jButton36.setText(resourceMap.getString("jButton36.text")); // NOI18N
        jButton36.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton36.setName("jButton36"); // NOI18N
        jPanel11.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 180, -1));

        jButton37.setText(resourceMap.getString("jButton37.text")); // NOI18N
        jButton37.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton37.setName("jButton37"); // NOI18N
        jPanel11.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 180, -1));

        jButton38.setText(resourceMap.getString("jButton38.text")); // NOI18N
        jButton38.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton38.setName("jButton38"); // NOI18N
        jPanel11.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 140, 30));

        jButton39.setText(resourceMap.getString("jButton39.text")); // NOI18N
        jButton39.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton39.setName("jButton39"); // NOI18N
        jButton39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton39MouseClicked(evt);
            }
        });
        jPanel11.add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 170, 40));

        jButton40.setText(resourceMap.getString("jButton40.text")); // NOI18N
        jButton40.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton40.setName("jButton40"); // NOI18N
        jButton40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton40MouseClicked(evt);
            }
        });
        jPanel11.add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));

        jButton41.setText(resourceMap.getString("jButton41.text")); // NOI18N
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable4.setName("jTable4"); // NOI18N
        jScrollPane4.setViewportView(jTable4);

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
        jPanel5.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jRadioButton3.setText(resourceMap.getString("Prof_Acc_Yes_R.text")); // NOI18N
        jRadioButton3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jRadioButton3.setName("Prof_Acc_Yes_R"); // NOI18N
        jPanel5.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        jLabel11.setFont(resourceMap.getFont("jLabel11.font")); // NOI18N
        jLabel11.setText(resourceMap.getString("jLabel11.text")); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel11.setName("jLabel11"); // NOI18N
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 220, 40));

        jLabel12.setFont(resourceMap.getFont("jLabel12.font")); // NOI18N
        jLabel12.setText(resourceMap.getString("jLabel12.text")); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel12.setName("jLabel12"); // NOI18N
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 240, 40));

        jLabel5.setIcon(resourceMap.getIcon("jLabel5.icon")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        jTabbedPane1.addTab(resourceMap.getString("jPanel5.TabConstraints.tabTitle"), jPanel5); // NOI18N

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel6.setName("jPanel6"); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                this.Add_Cr_Visble(false);
                this.Course_Tap_Button_Visble(true);
                this.Cr_Show_Current_Visble(false);          //pro show current back button
                this.Course_Update_Visble(false);
                this.index=2;
            }
            else if (n==3) {
               
                this.Class_Tap_Button_Visble(true);
                this.Cl_Show_Current_Visble(false);          //pro show current back button
                this.Class_Update_Visble(false);
                 this.Add_Cl_Visble(false);
                this.index=3;
            }else {
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
        
}//GEN-LAST:event_jButton31MouseClicked

    private void jButton27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton27MouseClicked
        // Course update
         this.Add_Cr_Visble(false);
        this.Course_Tap_Button_Visble(false);
        this.Cr_Show_Current_Visble(false);                 //pr update back buttin
        this.Course_Update_Visble(true);
        
}//GEN-LAST:event_jButton27MouseClicked

    private void jButton26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton26MouseClicked
        // add new course 
           this.Add_Cr_Visble(true);
        
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

    private void jButton22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton22MouseClicked
        this.Add_Pr_Visble(false);
        this.Professor_Tap_Button_Visble(false);
        this.Pr_Show_Current_Visble(true);                 //pro showcurrent buttin
        this.Professor_Update_Visble(false);
    }//GEN-LAST:event_jButton22MouseClicked

    private void jButton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseClicked
        this.Add_Pr_Visble(false);
        this.Professor_Tap_Button_Visble(false);
        this.Pr_Show_Current_Visble(false);     //prupdate button
        this.Professor_Update_Visble(true);
    }//GEN-LAST:event_jButton17MouseClicked

    private void jButton21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseClicked
        this.Add_Pr_Visble(true);//Add pro
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

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        this.Add_St_Visble(false);
        this.Student_Tap_Button_Visble(false);
        this.Show_Current_Visble(true);                 //showcurrent buttin
        this.Student_Update_Visble(false);
}//GEN-LAST:event_jButton10MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        this.Add_St_Visble(true);
}//GEN-LAST:event_jButton3MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        this.Add_St_Visble(false);
        this.Student_Tap_Button_Visble(false);
        this.Show_Current_Visble(false);          //    st update button
        this.Student_Update_Visble(true);
}//GEN-LAST:event_jButton11MouseClicked

    private void jButton33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton33MouseClicked
        // Add class
       this.Class_Update_Visble(false);
        this.Add_Cl_Visble(true);
        this.Cl_Show_Current_Visble(false);                 
        
        
    }//GEN-LAST:event_jButton33MouseClicked

    private void jButton35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton35MouseClicked
        // Update Class
         this.Add_Cl_Visble(false);
        this.Class_Tap_Button_Visble(false);
        this.Cl_Show_Current_Visble(false);                 //pr update back buttin
        this.Class_Update_Visble(true);
        
    }//GEN-LAST:event_jButton35MouseClicked

    private void jButton39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton39MouseClicked
        // Show current Class
        this.Add_Cl_Visble(false);
        this.Class_Tap_Button_Visble(false);
        this.Cl_Show_Current_Visble(true);                 
        this.Class_Update_Visble(false);
        
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

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // Add new Semster
        AddNewSemster a = new AddNewSemster();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void OnClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_OnClosing
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
        if(n == 0)
            this.dispose();
    }//GEN-LAST:event_OnClosing

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
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
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
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
