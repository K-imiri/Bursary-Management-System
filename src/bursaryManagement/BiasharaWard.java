
package bursaryManagement;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import projectConnectors.*;


public class BiasharaWard extends javax.swing.JFrame {

    
    public BiasharaWard() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonLogOut = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonExit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldAdm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jComboBoxGender = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldSchool = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxYOS = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxeducLevel = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldCampus = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxLiving = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxDisability = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxPerfomance = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxSupportDocs = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jComboBoxChief = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jComboBoxDisabilityProof = new javax.swing.JComboBox<>();
        jButtonSave = new javax.swing.JButton();
        jButtonViewlist = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBoxArrears = new javax.swing.JComboBox<>();
        jButtonrejectedList = new javax.swing.JButton();
        jLabelError2 = new javax.swing.JLabel();
        jLabelError = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jComboBoxSibling = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIASHARA WARD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 187, 30));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 0, -1, -1));

        jButtonLogOut.setBackground(new java.awt.Color(204, 0, 0));
        jButtonLogOut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonLogOut.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogOut.setText("LOG OUT");
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 144, 50));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 780, -1, -1));

        jButtonExit.setBackground(new java.awt.Color(204, 0, 0));
        jButtonExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExit.setText("EXIT");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 140, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Student Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Admission Number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jTextFieldName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 300, 30));

        jTextFieldAdm.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jTextFieldAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 300, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("National ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        jTextFieldID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldIDKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 300, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Phone Number");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, -1));

        jTextFieldPhone.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPhoneKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 300, 30));

        jComboBoxGender.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(jComboBoxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 300, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Institution Name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        jTextFieldSchool.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jTextFieldSchool, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 300, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Year of Study");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, -1, -1));

        jComboBoxYOS.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBoxYOS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade 4", "Grade 5", "Grade 6", "Form 1", "Form 2", "Form 3", "Form 4", "Year 1", "Year 2", "Year 3", "Year 4", "Year 5", "Year 6" }));
        getContentPane().add(jComboBoxYOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 400, 300, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Level of education");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, -1, -1));

        jComboBoxeducLevel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBoxeducLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Special School", "Secondary School", "Tertiary institutions" }));
        getContentPane().add(jComboBoxeducLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 300, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Campus");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, -1, -1));

        jTextFieldCampus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jTextFieldCampus, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 450, 300, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Living With");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, -1, -1));

        jComboBoxLiving.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBoxLiving.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Both Parents ", "Total Orphan(Guardian)", "Partial Orphan", "Single Parent", " " }));
        getContentPane().add(jComboBoxLiving, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 300, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Any Disabilities");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, -1, -1));

        jComboBoxDisability.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBoxDisability.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disable", "Not Disable" }));
        getContentPane().add(jComboBoxDisability, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 300, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Performance");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, -1, -1));

        jComboBoxPerfomance.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBoxPerfomance.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Excellent", "Above Average", "Average", "Below Average" }));
        getContentPane().add(jComboBoxPerfomance, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 250, 300, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Supporting Docs");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 550, -1, -1));

        jComboBoxSupportDocs.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBoxSupportDocs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Death Certificate attached", "Burial Permit Attached", "No Document attached", "Parent (s) Alive" }));
        getContentPane().add(jComboBoxSupportDocs, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 540, 300, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Recommendation");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 160, -1));

        jComboBoxChief.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBoxChief.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Highly Recommended", "Average Recommended", "No Recommendation" }));
        getContentPane().add(jComboBoxChief, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 620, 300, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Disability Proof");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, -1, -1));

        jComboBoxDisabilityProof.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBoxDisabilityProof.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hospital Document attached", "Studies in a special school", "No Document attached", "Not Disable" }));
        getContentPane().add(jComboBoxDisabilityProof, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 490, 300, 30));

        jButtonSave.setBackground(new java.awt.Color(0, 153, 0));
        jButtonSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSave.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSave.setText("Save Data");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 670, 139, 50));

        jButtonViewlist.setBackground(new java.awt.Color(0, 153, 0));
        jButtonViewlist.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonViewlist.setForeground(new java.awt.Color(255, 255, 255));
        jButtonViewlist.setText("View List");
        jButtonViewlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewlistActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonViewlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 670, 139, 50));

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 1170, 20));

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 20, 620));

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 110, -1, 620));

        jPanel4.setBackground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 730, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("BURSARY APPLICATION FORM");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 590, 40));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("School Arrears");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 630, -1, -1));

        jComboBoxArrears.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBoxArrears.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Has School Arrears", "No  School Arrears" }));
        getContentPane().add(jComboBoxArrears, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 620, 300, 30));

        jButtonrejectedList.setBackground(new java.awt.Color(0, 153, 0));
        jButtonrejectedList.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonrejectedList.setForeground(new java.awt.Color(255, 255, 255));
        jButtonrejectedList.setText("View Rejected List");
        jButtonrejectedList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonrejectedListActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonrejectedList, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 670, 210, 50));

        jLabelError2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelError2.setForeground(new java.awt.Color(204, 0, 0));
        jLabelError2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabelError2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 300, 20));

        jLabelError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelError.setForeground(new java.awt.Color(255, 0, 0));
        jLabelError.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 300, 20));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("No. of Siblings");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, -1, -1));

        jComboBoxSibling.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxSibling.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 and Below", "4 and Above" }));
        getContentPane().add(jComboBoxSibling, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, 300, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Are you sure you want to Log Out?","select",JOptionPane.YES_NO_OPTION );
        if(a==0){
            setVisible(false);
            new Login().setVisible(true);
        }
                
    }//GEN-LAST:event_jButtonLogOutActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        int close = JOptionPane.showConfirmDialog(null, "Are you sure you want to close the application?","Select",JOptionPane.YES_NO_OPTION);
        if(close==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonExitActionPerformed
        int score = 0;
    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        String stdName = jTextFieldName.getText();
        String admNumber = jTextFieldAdm.getText();
        String nationalID = jTextFieldID.getText();
        String phoneNumber = jTextFieldPhone.getText();
        String institutionName = jTextFieldSchool.getText();
        String campus = jTextFieldCampus.getText();
        String educLevel = jComboBoxeducLevel.getSelectedItem().toString();
        String disability = jComboBoxDisability.getSelectedItem().toString();
        String livingWith = jComboBoxLiving.getSelectedItem().toString();
        String chiefRecommend =jComboBoxChief.getSelectedItem().toString();
        String gender = jComboBoxGender.getSelectedItem().toString();
        String perfomance = jComboBoxPerfomance.getSelectedItem().toString();
        String yearOfStudy = jComboBoxYOS.getSelectedItem().toString();
        String disabilityProof = jComboBoxDisabilityProof.getSelectedItem().toString();
        String supportDOC = jComboBoxSupportDocs.getSelectedItem().toString();
        String arrears = jComboBoxArrears.getSelectedItem().toString();
        String sibling = jComboBoxSibling.getSelectedItem().toString();
        
        //Confirm fields are field
        if(stdName.isEmpty() || admNumber.isEmpty()||nationalID.isEmpty()|| phoneNumber.isEmpty() ||institutionName.isEmpty()||educLevel.isEmpty()||disability.isEmpty()||livingWith.isEmpty()||chiefRecommend.isEmpty()||gender.isEmpty()||perfomance.isEmpty()||yearOfStudy.isEmpty()||disabilityProof.isEmpty()||supportDOC.isEmpty()||arrears.isEmpty()||sibling.isEmpty()){
            JOptionPane.showMessageDialog(null, "Some Fields are Missing!");    
        }
        
       
        //Check ID Number
        else{
            //Confirm ID not supporting another form
            ResultSet rs = SelectFromDB.getData("SELECT * FROM biaBursaryForm WHERE nationalID='"+nationalID+"'");
            try {
                if(rs.next()){
                    
                    String query = "INSERT INTO biaduplicateID VALUES ('"+stdName+"','"+admNumber+"','"+nationalID+"','"+gender+"','"+phoneNumber+"','"+institutionName+"','"+campus+"','"+educLevel+"','"+perfomance+"','"+yearOfStudy+"','"+disability+"','"+disabilityProof+"','"+livingWith+"','"+supportDOC+"','"+sibling+"','"+chiefRecommend+"','"+arrears+"','Biashara','ID Already Supporting another form')";
                    InsertUpdateDelete.setData(query, " ID Number "+nationalID+" Already Filled in another form ");
                    setVisible(false);
                    new BiasharaWard().setVisible(true);
                }
                //Confirm ID exist in IEBC Register
                else{
                    ResultSet rs2 = SelectFromDB.getData("SELECT * FROM iebcRegisterForm WHERE nationalID='"+nationalID+"'");
                    
                    //If ID Number Exists in the IEBC Register
                    if(rs2.next()){
                        score +=10;
                        
                        //Check for different values and assign scores appropriately for females
                        if(gender.equalsIgnoreCase("Female")){
                            score+=15;
                            if(perfomance.equalsIgnoreCase("Excellent")){
                                score+=20;
                                if(disability.equalsIgnoreCase("Disable")){
                                    score+=2;
                                    if(disabilityProof.equalsIgnoreCase("Hospital Document attached") || disabilityProof.equalsIgnoreCase("Studies in a special school")){
                                        score+=8;
                                        if(livingWith.equalsIgnoreCase("Total orphan(Guardian)")){
                                            score+=10;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                
                                            }
                                        }
                                        else if(livingWith.equalsIgnoreCase("Partial Orphan")){
                                            score+=5;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                        else if(livingWith.equalsIgnoreCase("Single Parent")){
                                            score+=10;
                                              if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        else{
                                            score+=5;
                                            if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                    }
                                    else if(disabilityProof.equalsIgnoreCase("No Document Attached")){
                                        score+=0;
                                        if(livingWith.equalsIgnoreCase("Total orphan(Guardian)")){
                                            score+=10;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                       else if(livingWith.equalsIgnoreCase("Partial Orphan")){
                                            score+=5;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                         else if(livingWith.equalsIgnoreCase("Single Parent")){
                                            score+=10;
                                              if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        else{
                                            score+=5;
                                            if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                    }
                                }
                                else if(disability.equalsIgnoreCase("Not Disable")){
                                    score+=1;
                                    if(disabilityProof.equalsIgnoreCase("Not Disable") || disabilityProof.equalsIgnoreCase("No Document attached")){
                                        score+=4;
                                        if(livingWith.equalsIgnoreCase("Total orphan(Guardian)")){
                                            score+=10;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                        else if(livingWith.equalsIgnoreCase("Partial Orphan")){
                                            score+=5;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                         else if(livingWith.equalsIgnoreCase("Single Parent")){
                                            score+=10;
                                              if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        else{
                                            score+=5;
                                            if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                    }
                                }
                                
                            }
                            else if(perfomance.equalsIgnoreCase("Above average")){
                                score+=15;
                                if(disability.equalsIgnoreCase("Disable")){
                                    score+=2;
                                    if(disabilityProof.equalsIgnoreCase("Hospital Document attached") || disabilityProof.equalsIgnoreCase("Studies in a special school")){
                                        score+=8;
                                        if(livingWith.equalsIgnoreCase("Total orphan(Guardian)")){
                                            score+=10;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    } 
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            
                                        }
                                        else if(livingWith.equalsIgnoreCase("Partial Orphan")){
                                            score+=5;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                         else if(livingWith.equalsIgnoreCase("Single Parent")){
                                            score+=10;
                                              if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        else{
                                            score+=5;
                                            if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                    }
                                      else if(disabilityProof.equalsIgnoreCase("No Document Attached") || disabilityProof.equalsIgnoreCase("Not Disable")){
                                        score+=0;
                                        if(livingWith.equalsIgnoreCase("Total orphan(Guardian)")){
                                            score+=10;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                        else if(livingWith.equalsIgnoreCase("Partial Orphan")){
                                            score+=5;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                         else if(livingWith.equalsIgnoreCase("Single Parent")){
                                            score+=10;
                                              if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        else{
                                            score+=5;
                                            if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                    }
                                }
                                else if(disability.equalsIgnoreCase("Not Disable")){
                                    score+=1;
                                    if(disabilityProof.equalsIgnoreCase("Not Disable") || disabilityProof.equalsIgnoreCase("No Document attached")){
                                        score+=4;
                                        if(livingWith.equalsIgnoreCase("Total orphan(Guardian)")){
                                            score+=10;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                        else if(livingWith.equalsIgnoreCase("Partial Orphan")){
                                            score+=5;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                         else if(livingWith.equalsIgnoreCase("Single Parent")){
                                            score+=10;
                                              if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        else{
                                            score+=5;
                                            if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                    }
                                }
                            }
                            else if(perfomance.equalsIgnoreCase("Average")){
                                score+=10;
                                if(disability.equalsIgnoreCase("Disable")){
                                    score+=2;
                                    if(disabilityProof.equalsIgnoreCase("Hospital Document attached") || disabilityProof.equalsIgnoreCase("Studies in a special school")){
                                        score+=8;
                                        if(livingWith.equalsIgnoreCase("Total orphan(Guardian)")){
                                            score+=10;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            
                                        }
                                        else if(livingWith.equalsIgnoreCase("Partial Orphan")){
                                            score+=5;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                           else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            } 
                                        }
                                         else if(livingWith.equalsIgnoreCase("Single Parent")){
                                            score+=10;
                                              if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        else{
                                            score+=5;
                                            if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                    }
                                      else if(disabilityProof.equalsIgnoreCase("No Document Attached")){
                                        score+=0;
                                        if(livingWith.equalsIgnoreCase("Total orphan(Guardian)")){
                                            score+=10;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                        else if(livingWith.equalsIgnoreCase("Partial Orphan")){
                                            score+=5;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                         else if(livingWith.equalsIgnoreCase("Single Parent")){
                                            score+=10;
                                              if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        else{
                                            score+=5;
                                            if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        
                                    }
                                }
                                else if(disability.equalsIgnoreCase("Not Disable")){
                                    score+=1;
                                    if(disabilityProof.equalsIgnoreCase("Not Disable") || disabilityProof.equalsIgnoreCase("No Document attached")){
                                        score+=4;
                                        if(livingWith.equalsIgnoreCase("Total orphan(Guardian)")){
                                            score+=10;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                        else if(livingWith.equalsIgnoreCase("Partial Orphan")){
                                            score+=5;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                         else if(livingWith.equalsIgnoreCase("Single Parent")){
                                            score+=10;
                                              if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        else{
                                            score+=5;
                                            if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                    }
                                }
                            }
                            else{
                               score+=5;
                                if(disability.equalsIgnoreCase("Disable")){
                                    score+=2;
                                    if(disabilityProof.equalsIgnoreCase("Hospital Document attached") || disabilityProof.equalsIgnoreCase("Studies in a special school")){
                                        score+=8;
                                        if(livingWith.equalsIgnoreCase("Total orphan(Guardian)")){
                                            score+=10;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            
                                        }
                                        else if(livingWith.equalsIgnoreCase("Partial Orphan")){
                                            score+=5;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                         else if(livingWith.equalsIgnoreCase("Single Parent")){
                                            score+=10;
                                              if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        else{
                                            score+=5;
                                            if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                    }
                                      else if(disabilityProof.equalsIgnoreCase("No Document Attached")){
                                        score+=0;
                                        if(livingWith.equalsIgnoreCase("Total orphan(Guardian)")){
                                            score+=10;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                        else if(livingWith.equalsIgnoreCase("Partial Orphan")){
                                            score+=5;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                         else if(livingWith.equalsIgnoreCase("Single Parent")){
                                            score+=10;
                                              if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        else{
                                            score+=5;
                                            if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        
                                    }
                                }
                                else if(disability.equalsIgnoreCase("Not Disable")){
                                    score+=1;
                                    if(disabilityProof.equalsIgnoreCase("Not Disable") || disabilityProof.equalsIgnoreCase("No Document attached")){
                                        score+=4;
                                        if(livingWith.equalsIgnoreCase("Total orphan(Guardian)")){
                                            score+=10;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                        else if(livingWith.equalsIgnoreCase("Partial Orphan")){
                                            score+=5;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                         else if(livingWith.equalsIgnoreCase("Single Parent")){
                                            score+=10;
                                              if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        else{
                                            score+=5;
                                            if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                    }
                                }
                            }
                            
                        }
                        
                        //Check for different values and assign scores appropriately for males
                        else if(gender.equalsIgnoreCase("Male")){
                            score+=13;
                            if(perfomance.equalsIgnoreCase("Excellent")){
                                score+=20;
                                if(disability.equalsIgnoreCase("Disable")){
                                    score+=2;
                                    if(disabilityProof.equalsIgnoreCase("Hospital Document attached") || disabilityProof.equalsIgnoreCase("Studies in a special school")){
                                        score+=8;
                                        if(livingWith.equalsIgnoreCase("Total orphan(Guardian)")){
                                            score+=10;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                        else if(livingWith.equalsIgnoreCase("Partial Orphan")){
                                            score+=5;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                         else if(livingWith.equalsIgnoreCase("Single Parent")){
                                            score+=10;
                                              if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        else{
                                            score+=5;
                                            if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                    }
                                      else if(disabilityProof.equalsIgnoreCase("No Document Attached")){
                                        score+=0;
                                        if(livingWith.equalsIgnoreCase("Total orphan(Guardian)")){
                                            score+=10;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                 
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                        
                                    }
                                }
                                else if(disability.equalsIgnoreCase("Not Disable")){
                                    score+=1;
                                    if(disabilityProof.equalsIgnoreCase("Not Disable") || disabilityProof.equalsIgnoreCase("No Document attached")){
                                        score+=4;
                                        if(livingWith.equalsIgnoreCase("Total orphan(Guardian)")){
                                            score+=10;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                        else if(livingWith.equalsIgnoreCase("Partial Orphan")){
                                            score+=5;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                         else if(livingWith.equalsIgnoreCase("Single Parent")){
                                            score+=10;
                                              if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        else{
                                            score+=5;
                                            if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                    }
                                }
                            }
                             else if(perfomance.equalsIgnoreCase("Above average")){
                                score+=15;
                                if(disability.equalsIgnoreCase("Disable")){
                                    score+=2;
                                    if(disabilityProof.equalsIgnoreCase("Hospital Document attached") || disabilityProof.equalsIgnoreCase("Studies in a special school")){
                                        score+=8;
                                        if(livingWith.equalsIgnoreCase("Total orphan(Guardian)")){
                                            score+=10;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            
                                        }
                                    }
                                      else if(disabilityProof.equalsIgnoreCase("No Document Attached")){
                                        score+=0;
                                        if(livingWith.equalsIgnoreCase("Total orphan(Guardian)")){
                                            score+=10;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                        else if(livingWith.equalsIgnoreCase("Partial Orphan")){
                                            score+=5;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                         else if(livingWith.equalsIgnoreCase("Single Parent")){
                                            score+=10;
                                              if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        else{
                                            score+=5;
                                            if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        
                                    }
                                }
                                else if(disability.equalsIgnoreCase("Not Disable")){
                                    score+=1;
                                    if(disabilityProof.equalsIgnoreCase("Not Disable") || disabilityProof.equalsIgnoreCase("No Document attached")){
                                        score+=4;
                                        if(livingWith.equalsIgnoreCase("Total orphan(Guardian)")){
                                            score+=10;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                        else if(livingWith.equalsIgnoreCase("Partial Orphan")){
                                            score+=5;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                         else if(livingWith.equalsIgnoreCase("Single Parent")){
                                            score+=10;
                                              if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        else{
                                            score+=5;
                                            if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                    }
                                }
                            }
                            else if(perfomance.equalsIgnoreCase("Average")){
                                score+=10;
                                if(disability.equalsIgnoreCase("Disable")){
                                    score+=2;
                                    if(disabilityProof.equalsIgnoreCase("Hospital Document attached") || disabilityProof.equalsIgnoreCase("Studies in a special school")){
                                        score+=8;
                                        if(livingWith.equalsIgnoreCase("Total orphan(Guardian)")){
                                            score+=10;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            
                                        }
                                        else if(livingWith.equalsIgnoreCase("Partial Orphan")){
                                            score+=5;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                         else if(livingWith.equalsIgnoreCase("Single Parent")){
                                            score+=10;
                                              if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        else{
                                            score+=5;
                                            if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                    }
                                      else if(disabilityProof.equalsIgnoreCase("No Document Attached")){
                                        score+=0;
                                        if(livingWith.equalsIgnoreCase("Total orphan(Guardian)")){
                                            score+=10;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                        
                                    }
                                }
                                else if(disability.equalsIgnoreCase("Not Disable")){
                                    score+=1;
                                    if(disabilityProof.equalsIgnoreCase("Not Disable") || disabilityProof.equalsIgnoreCase("No Document attached")){
                                        score+=4;
                                        if(livingWith.equalsIgnoreCase("Total orphan(Guardian)")){
                                            score+=10;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                        else if(livingWith.equalsIgnoreCase("Partial Orphan")){
                                            score+=5;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                         else if(livingWith.equalsIgnoreCase("Single Parent")){
                                            score+=10;
                                              if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        else{
                                            score+=5;
                                            if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                    }
                                }
                            }
                            else{
                               score+=5;
                                if(disability.equalsIgnoreCase("Disable")){
                                    score+=2;
                                    if(disabilityProof.equalsIgnoreCase("Hospital Document attached") || disabilityProof.equalsIgnoreCase("Studies in a special school")){
                                        score+=8;
                                        if(livingWith.equalsIgnoreCase("Total orphan(Guardian)")){
                                            score+=10;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            
                                        }
                                        else if(livingWith.equalsIgnoreCase("Partial Orphan")){
                                            score+=5;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                         else if(livingWith.equalsIgnoreCase("Single Parent")){
                                            score+=10;
                                              if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        else{
                                            score+=5;
                                            if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                    }
                                      else if(disabilityProof.equalsIgnoreCase("No Document Attached")){
                                        score+=0;
                                        if(livingWith.equalsIgnoreCase("Total orphan(Guardian)")){
                                            score+=10;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                        else if(livingWith.equalsIgnoreCase("Partial Orphan")){
                                            score+=5;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                         else if(livingWith.equalsIgnoreCase("Single Parent")){
                                            score+=10;
                                              if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        else{
                                            score+=5;
                                            if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        
                                    }
                                }
                                else if(disability.equalsIgnoreCase("Not Disable")){
                                    score+=1;
                                    if(disabilityProof.equalsIgnoreCase("Not Disable") || disabilityProof.equalsIgnoreCase("No Document attached")){
                                        score+=4;
                                        if(livingWith.equalsIgnoreCase("Total orphan(Guardian)")){
                                            score+=10;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                        else if(livingWith.equalsIgnoreCase("Partial Orphan")){
                                            score+=5;
                                            if(supportDOC.equalsIgnoreCase("Death Certificate attached") || supportDOC.equalsIgnoreCase("Burial Permit attached")){
                                                score+=15;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                            else if(supportDOC.equalsIgnoreCase("No Document attached")|| supportDOC.equalsIgnoreCase("Parent(s) Alive")){
                                                score+=0;
                                                if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                            }
                                        }
                                         else if(livingWith.equalsIgnoreCase("Single Parent")){
                                            score+=10;
                                              if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                        else{
                                            score+=5;
                                            if(chiefRecommend.equalsIgnoreCase("Highly Recommended")){
                                                    score+=5;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                 else if(chiefRecommend.equalsIgnoreCase("Average Recommendation")){
                                                    score+=3;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                                else{
                                                    score+=1;
                                                    if(arrears.equalsIgnoreCase("Has school arrears")){
                                                        score+=15;
                                                    }
                                                    else{
                                                        score+=8;
                                                    }
                                                }
                                        }
                                    }
                                }
                            }
                        }
                        
                      String dataquery = "INSERT INTO biaBursaryForm VALUES ('"+stdName+"','"+admNumber+"','"+nationalID+"','"+gender+"','"+phoneNumber+"','"+institutionName+"','"+campus+"','"+educLevel+"','"+perfomance+"','"+yearOfStudy+"','"+disability+"','"+disabilityProof+"','"+livingWith+"','"+supportDOC+"','"+sibling+"','"+chiefRecommend+"','"+arrears+"','Biashara','"+score+"')";
                      InsertUpdateDelete.setData(dataquery, "Data Saved Successfully"); 
                      setVisible(false);
                      new BiasharaWard().setVisible(true);
                      
                      
                    }
                    
                    //If ID Number Does Not Exists in the IEBC Register
                    else{
                        score +=0;
                        String query = "INSERT INTO biaduplicateID VALUES ('"+stdName+"','"+admNumber+"','"+nationalID+"','"+gender+"','"+phoneNumber+"','"+institutionName+"','"+campus+"','"+educLevel+"','"+perfomance+"','"+yearOfStudy+"','"+disability+"','"+disabilityProof+"','"+livingWith+"','"+supportDOC+"','"+sibling+"','"+chiefRecommend+"','"+arrears+"','Biashara','Student Not a resident of constituency')";
                        InsertUpdateDelete.setData(query, "Student not a member of constituency!"); 
                        setVisible(false);
                        new BiasharaWard().setVisible(true);
                    }
                    
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(BiasharaWard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonViewlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewlistActionPerformed
        setVisible(false);
        new NonDuplicateIDList().setVisible(true);
    }//GEN-LAST:event_jButtonViewlistActionPerformed

    private void jButtonrejectedListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonrejectedListActionPerformed
        setVisible(false);
        new DuplicateForm().setVisible(true);
    }//GEN-LAST:event_jButtonrejectedListActionPerformed

    private void jTextFieldIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIDKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            jTextFieldID.setEditable(false);
            jLabelError.setText("ID Cannot contain letters");
        }
        else{
            jTextFieldID.setEditable(true);
            jLabelError.setText("");
        }
    }//GEN-LAST:event_jTextFieldIDKeyPressed

    private void jTextFieldPhoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPhoneKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            jTextFieldPhone.setEditable(false);
            jLabelError2.setText("Phone Number Cannot contain letters");
        }
        else{
            jTextFieldPhone.setEditable(true);
            jLabelError2.setText("");
        }
    }//GEN-LAST:event_jTextFieldPhoneKeyPressed

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
            java.util.logging.Logger.getLogger(BiasharaWard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BiasharaWard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BiasharaWard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BiasharaWard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BiasharaWard().setVisible(true);
            }
        });
    }
    
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonViewlist;
    private javax.swing.JButton jButtonrejectedList;
    private javax.swing.JComboBox<String> jComboBoxArrears;
    private javax.swing.JComboBox<String> jComboBoxChief;
    private javax.swing.JComboBox<String> jComboBoxDisability;
    private javax.swing.JComboBox<String> jComboBoxDisabilityProof;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private javax.swing.JComboBox<String> jComboBoxLiving;
    private javax.swing.JComboBox<String> jComboBoxPerfomance;
    private javax.swing.JComboBox<String> jComboBoxSibling;
    private javax.swing.JComboBox<String> jComboBoxSupportDocs;
    private javax.swing.JComboBox<String> jComboBoxYOS;
    private javax.swing.JComboBox<String> jComboBoxeducLevel;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelError2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextFieldAdm;
    private javax.swing.JTextField jTextFieldCampus;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldSchool;
    // End of variables declaration//GEN-END:variables
}
