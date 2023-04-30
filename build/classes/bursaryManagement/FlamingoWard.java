
package bursaryManagement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import projectConnectors.InsertUpdateDelete;
import projectConnectors.SelectFromDB;

public class FlamingoWard extends javax.swing.JFrame {

    /**
     * Creates new form FlamingoWard
     */
    public FlamingoWard() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldAdm = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jTextFieldSchool = new javax.swing.JTextField();
        jTextFieldCampus = new javax.swing.JTextField();
        jComboBoxeducLevel = new javax.swing.JComboBox<>();
        jComboBoxDisability = new javax.swing.JComboBox<>();
        jComboBoxLiving = new javax.swing.JComboBox<>();
        jComboBoxSibling = new javax.swing.JComboBox<>();
        jComboBoxChief = new javax.swing.JComboBox<>();
        jComboBoxGender = new javax.swing.JComboBox<>();
        jComboBoxPerfomance = new javax.swing.JComboBox<>();
        jComboBoxYOS = new javax.swing.JComboBox<>();
        jComboBoxDisabilityProof = new javax.swing.JComboBox<>();
        jComboBoxSupportDocs = new javax.swing.JComboBox<>();
        jComboBoxArrears = new javax.swing.JComboBox<>();
        jLabelID = new javax.swing.JLabel();
        jLabelPhone = new javax.swing.JLabel();
        jLabelIDs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FLAMINGO WARD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 216, 48));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOG OUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, 130, 48));

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 130, 48));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 11, -1, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 789, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 710, 1100, 20));

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 100, 20, 610));

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 20, 610));

        jPanel4.setBackground(new java.awt.Color(0, 153, 0));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 1100, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BURSARY APPLICATION FORM");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 480, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Student Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Admission Number");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("National ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Phone Number");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Institution Name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Level of Education");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Any Disability");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Disability Proof");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Living With");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Recommendation");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("No. Of Siblings");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Gender");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Perfomance");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("School Arrears");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 580, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Supporting Docs");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Year Of Study");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Campus");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 153, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Save Data");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 640, 150, 50));

        jButton4.setBackground(new java.awt.Color(0, 153, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("View List");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 640, 150, 50));

        jButton5.setBackground(new java.awt.Color(0, 153, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("View Rejected List");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 640, -1, 50));

        jTextFieldName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 300, 30));

        jTextFieldID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldIDKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 300, 30));

        jTextFieldAdm.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jTextFieldAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 300, 30));

        jTextFieldPhone.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPhoneKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 300, 30));

        jTextFieldSchool.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jTextFieldSchool, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 300, 30));

        jTextFieldCampus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jTextFieldCampus, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 340, 300, 30));

        jComboBoxeducLevel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBoxeducLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Special School", "Secondary School", "Tertiary institutions" }));
        getContentPane().add(jComboBoxeducLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 300, 30));

        jComboBoxDisability.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBoxDisability.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disable", "Not Disable" }));
        getContentPane().add(jComboBoxDisability, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 300, 30));

        jComboBoxLiving.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBoxLiving.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Both Parents ", "Total Orphan(Guardian)", "Partial Orphan", "Single Parent" }));
        getContentPane().add(jComboBoxLiving, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 300, 30));

        jComboBoxSibling.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBoxSibling.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 and Below", "4 and Above" }));
        getContentPane().add(jComboBoxSibling, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 300, 30));

        jComboBoxChief.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBoxChief.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Highly Recommended", "Average Recommended", "No Recommendation" }));
        getContentPane().add(jComboBoxChief, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, 300, 30));

        jComboBoxGender.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(jComboBoxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 180, 300, 30));

        jComboBoxPerfomance.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBoxPerfomance.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Excellent", "Above Average", "Average", "Below Average" }));
        getContentPane().add(jComboBoxPerfomance, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 220, 300, 30));

        jComboBoxYOS.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBoxYOS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade 4", "Grade 5", "Grade 6", "Form 1", "Form 2", "Form 3", "Form 4", "Year 1", "Year 2", "Year 3", "Year 4", "Year 5", "Year 6" }));
        getContentPane().add(jComboBoxYOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 390, 300, 30));

        jComboBoxDisabilityProof.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBoxDisabilityProof.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hospital Document attached", "Studies in a special school", "No Document attached", "Not Disable" }));
        getContentPane().add(jComboBoxDisabilityProof, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, 300, 30));

        jComboBoxSupportDocs.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBoxSupportDocs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Death Certificate attached", "Burial Permit Attached", "No Document attached", "Parent (s) Alive" }));
        getContentPane().add(jComboBoxSupportDocs, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 480, 300, 30));

        jComboBoxArrears.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBoxArrears.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Has School Arrears", "No  School Arrears" }));
        getContentPane().add(jComboBoxArrears, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 570, 300, 30));

        jLabelID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, 20));

        jLabelPhone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPhone.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(jLabelPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 250, 10));

        jLabelIDs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelIDs.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(jLabelIDs, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 190, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Are you sure you want to Log Out?","select",JOptionPane.YES_NO_OPTION );
        if(a==0){
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int close = JOptionPane.showConfirmDialog(null, "Are you sure you want to close the application?","Select",JOptionPane.YES_NO_OPTION);
        if(close==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

       int score = 0;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
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
        
        // Checking the text fields are not empty
        if(stdName.isEmpty() || admNumber.isEmpty()||nationalID.isEmpty()|| phoneNumber.isEmpty() ||institutionName.isEmpty()||educLevel.isEmpty()||disability.isEmpty()||livingWith.isEmpty()||chiefRecommend.isEmpty()||gender.isEmpty()||perfomance.isEmpty()||yearOfStudy.isEmpty()||disabilityProof.isEmpty()||supportDOC.isEmpty()||arrears.isEmpty()||sibling.isEmpty()){
            JOptionPane.showMessageDialog(null, "Some Fields are Missing!");    
        }
        
        //Check ID Number
        else{
            //Confirm ID not supporting another form
            ResultSet rs = SelectFromDB.getData("SELECT * FROM flaBursaryForm WHERE nationalID='"+nationalID+"'");
            try {
                if(rs.next()){  
                    String query = "INSERT INTO flaDuplicateID VALUES ('"+stdName+"','"+admNumber+"','"+nationalID+"','"+gender+"','"+phoneNumber+"','"+institutionName+"','"+campus+"','"+educLevel+"','"+perfomance+"','"+yearOfStudy+"','"+disability+"','"+disabilityProof+"','"+livingWith+"','"+supportDOC+"','"+sibling+"','"+chiefRecommend+"','"+arrears+"','Flamingo','ID Already supporting another form')";
                    InsertUpdateDelete.setData(query, " ID Number "+nationalID+" Already Filled in another form ");
                    setVisible(false);
                    new FlamingoWard().setVisible(true);
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
                        
                      String dataquery = "INSERT INTO flaBursaryForm VALUES ('"+stdName+"','"+admNumber+"','"+nationalID+"','"+gender+"','"+phoneNumber+"','"+institutionName+"','"+campus+"','"+educLevel+"','"+perfomance+"','"+yearOfStudy+"','"+disability+"','"+disabilityProof+"','"+livingWith+"','"+supportDOC+"','"+sibling+"','"+chiefRecommend+"','"+arrears+"','Flamingo','"+score+"')";
                      InsertUpdateDelete.setData(dataquery, "Data Saved Successfully"); 
                      setVisible(false);
                      new FlamingoWard().setVisible(true);
                      
                      
                    }
                    
                    //If ID Number Does Not Exists in the IEBC Register
                    else{
                        score +=0;
                        String dataquery = "INSERT INTO flaBursaryForm VALUES ('"+stdName+"','"+admNumber+"','"+nationalID+"','"+gender+"','"+phoneNumber+"','"+institutionName+"','"+campus+"','"+educLevel+"','"+perfomance+"','"+yearOfStudy+"','"+disability+"','"+disabilityProof+"','"+livingWith+"','"+supportDOC+"','"+sibling+"','"+chiefRecommend+"','"+arrears+"','Flamingo','"+score+"')";
                        InsertUpdateDelete.setData(dataquery, "Data Saved Successfully"); 
                        setVisible(false);
                        new FlamingoWard().setVisible(true);
                    }
                    
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(BiasharaWard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setVisible(false);
        new FlaNonDuplicateID().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setVisible(false);
        new FlaDuplicateID().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextFieldIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIDKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            jTextFieldID.setEditable(false);
            jLabelIDs.setText("ID Cannot contain letters");
        }
        else{
            jTextFieldID.setEditable(true);
            jLabelIDs.setText("");
        }
    }//GEN-LAST:event_jTextFieldIDKeyPressed

    private void jTextFieldPhoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPhoneKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            jTextFieldPhone.setEditable(false);
            jLabelPhone.setText("Phone Number Cannot contain letters");
        }
        else{
            jTextFieldPhone.setEditable(true);
            jLabelPhone.setText("");
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
            java.util.logging.Logger.getLogger(FlamingoWard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlamingoWard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlamingoWard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlamingoWard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlamingoWard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelIDs;
    private javax.swing.JLabel jLabelPhone;
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
