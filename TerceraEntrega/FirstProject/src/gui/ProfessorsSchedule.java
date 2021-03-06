/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entities.PracticalCourse;
import entities.Schedule;
import entities.TheoryCourse;
import firstproject.Singleton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import structs.ClassroomNode;
import structs.CourseNode;
import structs.ProfessorCourse;
import structs.ProfessorNode;
import structs.ScheduleNode;

/**
 *
 * @author Osvaldo08CR
 */
public class ProfessorsSchedule extends javax.swing.JFrame {
    Singleton methods = Singleton.getInstance();
    DefaultListModel scheduleModel = new DefaultListModel();
    ProfessorNode professor;
    ProfessorCourse[] coursesArray;
    ClassroomNode classroomNode;
    ClassroomNode[] classroomsArray;
    ScheduleNode[] scheduleArray;
    int coursesIndex = 0;
    int coursesAmount;
    String[] periods;
    
    /**
     * Creates new form ProfessorsSchedule
     */
    public ProfessorsSchedule() {
        initComponents();
        btnSave.setVisible(false);
        setClassrooms();
        loadPeriodsArray();
    }
    
    private void loadPeriodsArray() {
        periods = new String[9];
        periods[0] = "7:00";
        periods[1] = "7:55";
        periods[2] = "8:50";
        periods[3] = "9:45";
        periods[4] = "10:40";
        periods[5] = "12:30";
        periods[6] = "1:25";
        periods[7] = "2:20";
        periods[8] = "3:15";
        
    }
    private void setClassrooms () {
        int counter = 0;
        int classroomsAmount = 0;
        String name;
        String location;
        String capacity;
        
        classroomsAmount = methods.getMyClassroomList().getClassroomsAmount();
        classroomsArray = methods.getMyClassroomList().getClassroomArray(
                classroomsAmount);
        
        while (counter < classroomsAmount) {
            cmbClassroom.addItem(classroomsArray[counter].getInfo().getId());
            counter++;
        }
        
        name = classroomsArray[0].getInfo().getName();
        location = classroomsArray[0].getInfo().getLocation();
        capacity = "" + classroomsArray[0].getInfo().getCapacity();
        
        lblName.setText(name);
        lblLocation.setText(location);
        lblCapacity.setText(capacity);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        cmbCourses = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cmbDay = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cmbStart = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbAmount = new javax.swing.JComboBox();
        btnAddSchedule = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblCapacity = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cmbClassroom = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSchedule = new javax.swing.JList();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblSupportMaterials = new javax.swing.JLabel();
        lblOperativeSystem = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        txtSupportMaterials = new javax.swing.JTextField();
        txtOperatingSystem = new javax.swing.JTextField();
        lblCredits = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblFeedback = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Schedule Generator - Professor");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Load professor courses", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel1.setText("ID:");

        txtID.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnSearch.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 20, 340, 90);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Professor courses", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 0, 12))); // NOI18N

        cmbCourses.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        cmbCourses.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCoursesItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbCourses, 0, 308, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbCourses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel9);
        jPanel9.setBounds(30, 150, 340, 90);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Schedule", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 0, 12))); // NOI18N
        jPanel2.setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "New schedule", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 0, 12))); // NOI18N
        jPanel4.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel8.setText("Day:");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(10, 30, 30, 20);

        cmbDay.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        cmbDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));
        jPanel4.add(cmbDay);
        cmbDay.setBounds(10, 50, 90, 30);

        jLabel9.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel9.setText("Start block:");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(10, 120, 80, 20);

        cmbStart.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        cmbStart.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7:00", "7:55", "8:50", "9:45", "10:40", "12:30", "1:25", "2:20", "3:15" }));
        jPanel4.add(cmbStart);
        cmbStart.setBounds(10, 140, 90, 30);

        jLabel11.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel11.setText("Classroom:");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(120, 30, 70, 20);

        jLabel12.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel12.setText("Amount of blocks:");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(120, 120, 110, 20);

        cmbAmount.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jPanel4.add(cmbAmount);
        cmbAmount.setBounds(120, 140, 110, 30);

        btnAddSchedule.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        btnAddSchedule.setText("Add");
        btnAddSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddScheduleActionPerformed(evt);
            }
        });
        jPanel4.add(btnAddSchedule);
        btnAddSchedule.setBounds(160, 210, 70, 30);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Classroom information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 0, 12))); // NOI18N
        jPanel5.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Name:");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(30, 40, 40, 30);

        jLabel15.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Location:");
        jPanel5.add(jLabel15);
        jLabel15.setBounds(10, 80, 60, 30);

        jLabel16.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Capacity:");
        jPanel5.add(jLabel16);
        jLabel16.setBounds(10, 120, 60, 30);

        lblName.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel5.add(lblName);
        lblName.setBounds(80, 40, 220, 30);

        lblLocation.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        lblLocation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel5.add(lblLocation);
        lblLocation.setBounds(80, 80, 220, 30);

        lblCapacity.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        lblCapacity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel5.add(lblCapacity);
        lblCapacity.setBounds(80, 120, 220, 30);

        jButton1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jButton1.setText("More info...");
        jPanel5.add(jButton1);
        jButton1.setBounds(205, 165, 100, 30);

        jPanel4.add(jPanel5);
        jPanel5.setBounds(240, 40, 310, 200);

        cmbClassroom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        cmbClassroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClassroomActionPerformed(evt);
            }
        });
        jPanel4.add(cmbClassroom);
        cmbClassroom.setBounds(120, 50, 110, 29);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(10, 30, 560, 250);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Course's schedule", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 0, 12))); // NOI18N
        jPanel6.setLayout(null);

        lstSchedule.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        lstSchedule.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstSchedule);

        jPanel6.add(jScrollPane1);
        jScrollPane1.setBounds(20, 30, 520, 100);

        jButton3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel6.add(jButton3);
        jButton3.setBounds(430, 140, 110, 30);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(10, 300, 560, 180);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(390, 20, 580, 490);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Course information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 0, 12))); // NOI18N
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel2.setText("Credits:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(80, 50, 50, 30);

        lblSupportMaterials.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        lblSupportMaterials.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSupportMaterials.setText("Support materials:");
        jPanel3.add(lblSupportMaterials);
        lblSupportMaterials.setBounds(10, 100, 120, 30);

        lblOperativeSystem.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        lblOperativeSystem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOperativeSystem.setText("Operative System:");
        jPanel3.add(lblOperativeSystem);
        lblOperativeSystem.setBounds(10, 150, 120, 30);

        btnEdit.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel3.add(btnEdit);
        btnEdit.setBounds(10, 190, 110, 30);

        txtSupportMaterials.setEditable(false);
        txtSupportMaterials.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        txtSupportMaterials.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel3.add(txtSupportMaterials);
        txtSupportMaterials.setBounds(130, 100, 200, 30);

        txtOperatingSystem.setEditable(false);
        txtOperatingSystem.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        txtOperatingSystem.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel3.add(txtOperatingSystem);
        txtOperatingSystem.setBounds(130, 150, 200, 29);

        lblCredits.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        lblCredits.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lblCredits);
        lblCredits.setBounds(130, 50, 200, 30);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave);
        btnSave.setBounds(220, 190, 110, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(30, 280, 340, 230);

        lblFeedback.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        lblFeedback.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblFeedback);
        lblFeedback.setBounds(0, 540, 1000, 30);

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jMenuItem1.setText("Back to Login");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1016, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Open the Login window.
        new Login().show(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnAddScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddScheduleActionPerformed
        int intDay;
        int intStart;
        int blocksAmount;
        int classroomIndex;
        String strDay;
        String strStart;
        int counter = 0;
        int creditsLeft = 0;
        int amount = 0;
        
        if (cmbCourses.getSelectedIndex() == -1) {
           return; 
        }
        
        intDay = cmbDay.getSelectedIndex();
        intStart = cmbStart.getSelectedIndex();
        blocksAmount = cmbAmount.getSelectedIndex() + 1;
        classroomIndex = cmbClassroom.getSelectedIndex();
        strDay = cmbDay.getSelectedItem().toString();
        strStart = cmbStart.getSelectedItem().toString();
        classroomNode = classroomsArray[classroomIndex];
        
        if ( !methods.getMyCourseList().getHead().checkProfessorSchedule(
                coursesArray[coursesIndex].getCourse(), strDay, intStart, 
                blocksAmount) ) {
            lblFeedback.setText(" Error: schedule unavailable.");
            return;
        }
        
        coursesArray[coursesIndex].getCourse().addSchedule(
                new Schedule(strDay, intStart, blocksAmount), classroomNode);
        
        scheduleModel.addElement("Day: " + strDay + " | Start block: " 
                + strStart + " | Blocks amount: " + blocksAmount 
                + " | Classroom: " + classroomsArray[classroomIndex].getInfo()
                .getId());
        lstSchedule.setModel(scheduleModel);
        
        amount = methods.getMyCourseList().getHead().getScheduleAmount(
                coursesArray[coursesIndex].getCourse());
        scheduleArray = null;
        scheduleArray = methods.getMyCourseList().getHead()
                .getScheduleArray(coursesArray[coursesIndex].getCourse(), amount);
        
        creditsLeft = methods.getMyCourseList().getHead().getCreditsLeft(
                coursesArray[coursesIndex].getCourse());
        
        DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
        
        if(creditsLeft == 0){
            comboBoxModel.addElement("Unavailable");
            btnAddSchedule.setEnabled(false);
        } else {
            btnAddSchedule.setEnabled(true);
        }
        
        counter = 1;
        
        while ( counter <= creditsLeft  ) {
            comboBoxModel.addElement(counter);
            counter++;
        }
        
        cmbAmount.setModel(comboBoxModel);
        
        lblFeedback.setText(" The schedule was added successfully.");
        
    }//GEN-LAST:event_btnAddScheduleActionPerformed

    private void cmbClassroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClassroomActionPerformed
        String name;
        String location;
        String capacity;
        int index;
        
        index = cmbClassroom.getSelectedIndex();
        name = classroomsArray[index].getInfo().getName();
        location = classroomsArray[index].getInfo().getLocation();
        capacity = "" + classroomsArray[index].getInfo().getCapacity();
        
        lblName.setText(name);
        lblLocation.setText(location);
        lblCapacity.setText(capacity);
    }//GEN-LAST:event_cmbClassroomActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (cmbCourses.getSelectedIndex() == -1) {
           return; 
        }
        
        btnEdit.setVisible(false);
        btnSave.setVisible(true);
        
        txtSupportMaterials.setEditable(true);
        
        if ( coursesArray[coursesIndex].getCourse().getInfo() instanceof 
                PracticalCourse) {
            txtOperatingSystem.setEditable(true);
        }
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String name;
        int credits;
        String supportMaterial;
        String operatingSystem;
        boolean exclusive;
        String website;
        
        name = coursesArray[coursesIndex].getCourse().getInfo().getName();
        credits = Integer.parseInt(lblCredits.getText());
        exclusive = coursesArray[coursesIndex].getCourse().getInfo()
                .isExclusive();
        
        txtSupportMaterials.setEditable(false);
        
        if ( coursesArray[coursesIndex].getCourse().getInfo() instanceof 
                PracticalCourse) {
            supportMaterial = txtSupportMaterials.getText();
            operatingSystem = txtOperatingSystem.getText();
            methods.getMyCourseList().edit(
                    ((PracticalCourse)coursesArray[coursesIndex].getCourse()
                    .getInfo()), name, credits, exclusive, supportMaterial, 
                    operatingSystem);
            txtOperatingSystem.setEditable(false);
        } else {
            website = txtSupportMaterials.getText();
            methods.getMyCourseList().edit(
                    ((TheoryCourse)coursesArray[coursesIndex].getCourse()
                    .getInfo()), name, credits, exclusive, website);
        }
        
        btnEdit.setVisible(true);
        btnSave.setVisible(false);
        
        lblFeedback.setText(" The course was edited successfully.");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cmbCoursesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCoursesItemStateChanged
        String credits = "";
        String operatingSystem = "";
        String supportMaterial = "";
        String website = "";
        int counter = 0;
        int amount = 0;
        int creditsLeft;
        
        coursesIndex = cmbCourses.getSelectedIndex();
        credits = "" + coursesArray[coursesIndex].getCourse().getInfo()
                .getCredits();
        lblCredits.setText(credits);
        
        if ( coursesArray[coursesIndex].getCourse().getInfo() instanceof 
                TheoryCourse) {
            website = ((TheoryCourse)coursesArray[coursesIndex].getCourse()
                    .getInfo()).getWebSite();
            lblOperativeSystem.setVisible(false);
            txtOperatingSystem.setVisible(false);
            lblSupportMaterials.setText("Website:");
            txtSupportMaterials.setText(website);
            
            
        } else {
            supportMaterial = ((PracticalCourse)coursesArray[coursesIndex].getCourse()
                    .getInfo()).getSupportMaterial();
            operatingSystem = ((PracticalCourse)coursesArray[coursesIndex].getCourse()
                    .getInfo()).getOperatingSystem();
            lblOperativeSystem.setVisible(true);
            txtOperatingSystem.setVisible(true);
            txtOperatingSystem.setText(operatingSystem);
            txtSupportMaterials.setText(supportMaterial);
            
        }
        amount = methods.getMyCourseList().getHead().getScheduleAmount(
                coursesArray[coursesIndex].getCourse());
        scheduleArray = methods.getMyCourseList().getHead()
                .getScheduleArray(coursesArray[coursesIndex].getCourse(), amount);
        
        scheduleModel = new DefaultListModel();
        
        counter = 0;
        
        while (counter < amount) {
            String day;
            String strStart;
            int intStart;
            String blocks;
            String classroom;
            
            day = scheduleArray[counter].getInfo().getDay();
            intStart = scheduleArray[counter].getInfo().getStart();
            strStart = periods[intStart];
            blocks = "" + scheduleArray[counter].getInfo().getBlocks();
            classroom = scheduleArray[counter].getClassroomLink().getInfo()
                    .getId();
            
            scheduleModel.addElement("Day: " + day + " | Start block: " + strStart 
                    + " | Blocks amount: " + blocks + " | Classroom: " 
                    + classroom);
            
            counter++;
        }
        
        lstSchedule.setModel(scheduleModel);
        
        creditsLeft = methods.getMyCourseList().getHead().getCreditsLeft(
                coursesArray[coursesIndex].getCourse());
        
        DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
        
        if(creditsLeft == 0){
            comboBoxModel.addElement("Unavailable");
            btnAddSchedule.setEnabled(false);
        } else {
            btnAddSchedule.setEnabled(true);
        }
        
        counter = 1;
        
        while ( counter <= creditsLeft  ) {
            comboBoxModel.addElement(counter);
            counter++;
        }
        
        cmbAmount.setModel(comboBoxModel);
        
    }//GEN-LAST:event_cmbCoursesItemStateChanged

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        String id;      // Gets the ID from gui.
        int amount;     // Gets the amount of ProfessorCourses.
        int counter;
        int group;
        String name = "";
        String credits = "";
        String operatingSystem = "";
        String supportMaterial = "";
        String website = "";
        int creditsLeft = 0;
        
        id = txtID.getText();
        professor = methods.getMyProfessorList().search(id);
        if ( professor == null ) {
            lblFeedback.setText("Professor no found.");
            txtID.setText("");
            return;
        }
        coursesAmount = methods.getMyProfessorList().getHead().getCoursesAmount(
                professor);
        
        if ( coursesAmount == 0 ) {
            lblFeedback.setText(" Error: professor courses not found.");
            return;
        }
        coursesArray = null;
        coursesArray = methods.getMyProfessorList().getHead().getCoursesArray(
                professor, coursesAmount);
        DefaultComboBoxModel cmbModel = new DefaultComboBoxModel();
        counter = 0;
        
        while (counter < coursesAmount) {
            group = coursesArray[counter].getCourse().getGroup();
            name = coursesArray[counter].getCourse().getInfo().getName();
            cmbModel.addElement("GR" + group + " | " + name);
            counter++;
        }
        cmbCourses.setModel(cmbModel);
        coursesIndex = cmbCourses.getSelectedIndex();
        credits = "" + coursesArray[coursesIndex].getCourse().getInfo()
                .getCredits();
        lblCredits.setText(credits);
        
        if ( coursesArray[coursesIndex].getCourse().getInfo() instanceof 
                TheoryCourse) {
            website = ((TheoryCourse)coursesArray[coursesIndex].getCourse()
                    .getInfo()).getWebSite();
            lblOperativeSystem.setVisible(false);
            txtOperatingSystem.setVisible(false);
            lblSupportMaterials.setText("Website:");
            txtSupportMaterials.setText(website);
            
            
        } else {
            supportMaterial = ((PracticalCourse)coursesArray[coursesIndex].getCourse()
                    .getInfo()).getSupportMaterial();
            operatingSystem = ((PracticalCourse)coursesArray[coursesIndex].getCourse()
                    .getInfo()).getOperatingSystem();
            lblOperativeSystem.setVisible(true);
            txtOperatingSystem.setVisible(true);
            txtOperatingSystem.setText(operatingSystem);
            txtSupportMaterials.setText(supportMaterial);
            
        }
        
        
        amount = methods.getMyCourseList().getHead().getScheduleAmount(
                coursesArray[coursesIndex].getCourse());
        scheduleArray = null;
        scheduleArray = methods.getMyCourseList().getHead()
                .getScheduleArray(coursesArray[coursesIndex].getCourse(), amount);
        
        scheduleModel = new DefaultListModel();
        counter = 0;
        while (counter < amount) {
            String day;
            String strStart;
            int intStart;
            String blocks;
            String classroom;
            
            day = scheduleArray[counter].getInfo().getDay();
            intStart = scheduleArray[counter].getInfo().getStart();
            strStart = periods[intStart];
            blocks = "" + scheduleArray[counter].getInfo().getBlocks();
            classroom = scheduleArray[counter].getClassroomLink().getInfo()
                    .getId();
            
            scheduleModel.addElement("Day: " + day + " | Start block: " + strStart 
                    + " | Blocks amount: " + blocks + " | Classroom: " 
                    + classroom);
            
            counter++;
        }
        lstSchedule.setModel(scheduleModel);
        
        
        creditsLeft = methods.getMyCourseList().getHead().getCreditsLeft(
                coursesArray[coursesIndex].getCourse());
        DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
        
        if(creditsLeft == 0){
            comboBoxModel.addElement("Unavailable");
            btnAddSchedule.setEnabled(false);
        } else {
            btnAddSchedule.setEnabled(true);
        }
        
        counter = 1;
        
        while ( counter <= creditsLeft  ) {
            comboBoxModel.addElement(counter);
            counter++;
        }
        
        cmbAmount.setModel(comboBoxModel);
        
        
        lblFeedback.setText("Professor courses loaded.");
    }//GEN-LAST:event_btnSearchMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        int scheduleIndex;
        int blocks;
        String day;
        CourseNode course;
        int counter = 0;
        int creditsLeft = 0;
        
        scheduleIndex = lstSchedule.getSelectedIndex();
        if ( scheduleIndex == -1 ) {
            lblFeedback.setText(" Error: schedule not selected.");
            return;
        }
        
        blocks = scheduleArray[scheduleIndex].getInfo().getStart();
        day = scheduleArray[scheduleIndex].getInfo().getDay();
        course = coursesArray[coursesIndex].getCourse();
        
        methods.getMyCourseList().getHead().removeSchedule(course, day, blocks);
        scheduleModel.remove(scheduleIndex);
        lstSchedule.setModel(scheduleModel);
        
        creditsLeft = methods.getMyCourseList().getHead().getCreditsLeft(
                coursesArray[coursesIndex].getCourse());
        
        DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
        
        if(creditsLeft == 0){
            comboBoxModel.addElement("Unavailable");
            btnAddSchedule.setEnabled(false);
        } else {
            btnAddSchedule.setEnabled(true);
        }
        
        counter = 1;
        
        while ( counter <= creditsLeft  ) {
            comboBoxModel.addElement(counter);
            counter++;
        }
        
        cmbAmount.setModel(comboBoxModel);
        lblFeedback.setText(" Schedule deleted successfully.");
    }//GEN-LAST:event_jButton3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProfessorsSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfessorsSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfessorsSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfessorsSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfessorsSchedule().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSchedule;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbAmount;
    private javax.swing.JComboBox cmbClassroom;
    private javax.swing.JComboBox cmbCourses;
    private javax.swing.JComboBox cmbDay;
    private javax.swing.JComboBox cmbStart;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCapacity;
    private javax.swing.JLabel lblCredits;
    private javax.swing.JLabel lblFeedback;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOperativeSystem;
    private javax.swing.JLabel lblSupportMaterials;
    private javax.swing.JList lstSchedule;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtOperatingSystem;
    private javax.swing.JTextField txtSupportMaterials;
    // End of variables declaration//GEN-END:variables
}
