
package bursaryManagement;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import projectConnectors.InsertUpdateDelete;

public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jButtonRegClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextRegName = new javax.swing.JTextField();
        jTextRegEmail = new javax.swing.JTextField();
        jTextRegAnswer = new javax.swing.JTextField();
        jTextRegPassword = new javax.swing.JPasswordField();
        jComboBoxRegSecurityQuestion = new javax.swing.JComboBox<>();
        jComboBoxRegWard = new javax.swing.JComboBox<>();
        jButtonRegister = new javax.swing.JButton();
        jButtonlogin = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("NAKURU TOWN EAST BURSARY MANAGEMENT SYSTEM");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonRegClose.setBackground(new java.awt.Color(204, 0, 0));
        jButtonRegClose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonRegClose.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegClose.setText("EXIT");
        jButtonRegClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegCloseActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 40, 90, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 180, 32));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("YOUR NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 154, 26));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("EMAIL ADDRESS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 154, 26));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("PASSWORD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 154, 26));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("SECURITY QUESTION");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, 26));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("ANSWER");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 154, 26));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("COUNTY WARD");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 154, 26));

        jTextRegName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(jTextRegName, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 340, 30));

        jTextRegEmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(jTextRegEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 340, 26));

        jTextRegAnswer.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(jTextRegAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 340, 30));

        jTextRegPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(jTextRegPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 340, 26));

        jComboBoxRegSecurityQuestion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBoxRegSecurityQuestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your childhood nickname?", "What is your favorite teacher name?", "What is your favorite city?", "What is your favorite song?" }));
        getContentPane().add(jComboBoxRegSecurityQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 340, 30));

        jComboBoxRegWard.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBoxRegWard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Biashara Ward", "Flamingo Ward", "Menengai Ward", "Nakuru East Ward" }));
        getContentPane().add(jComboBoxRegWard, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 340, 30));

        jButtonRegister.setBackground(new java.awt.Color(204, 0, 0));
        jButtonRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonRegister.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegister.setText("Register");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 140, 40));

        jButtonlogin.setBackground(new java.awt.Color(204, 0, 0));
        jButtonlogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonlogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonlogin.setText("Log In");
        jButtonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonloginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, 140, 40));

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 20, 470));

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 630, 20));

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 610, -1, -1));

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("NAKURU TOWN EAST CONSTITUENCY  ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 440, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("BURSARY MANAGEMENT SYSTEM ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 350, 40));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 780, -1, -1));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonloginActionPerformed
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButtonloginActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        //Encrypt password and answer
        String p=jTextRegPassword.getText();
        String password1=encryptPassword(p);
        String a=jTextRegAnswer.getText();
        String answer1=encryptPassword(a);
 
        //Getting registration details
        
        String regName = jTextRegName.getText();
        String regEmail = jTextRegEmail.getText();
        String regPassword = password1;
        String securityQuestion = jComboBoxRegSecurityQuestion.getSelectedItem().toString();
        String regAnswer = answer1;
        String regWard = jComboBoxRegWard.getSelectedItem().toString();
       
        //Ensuring the fields are not empty
        
        if(regName.isEmpty()|| regEmail.isEmpty()|| regPassword.isEmpty()|| securityQuestion.isEmpty() || regAnswer.isEmpty()|| regWard.isEmpty()){
            JOptionPane.showMessageDialog(null, "All Fields are required!");
        }
        else if(!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", regEmail))){
            JOptionPane.showMessageDialog(null, "Please enter a valid Email Address","Invalid",JOptionPane.ERROR_MESSAGE);
        }
        else{
            
            String regQuery = "INSERT INTO users VALUES('"+regName+"','"+regEmail+"','"+regPassword+"','"+securityQuestion+"','"+regAnswer+"','"+regWard+"','Inactive')";
            InsertUpdateDelete.setData(regQuery,"Registered Successfully");
            setVisible(false);
            new Login().setVisible(true);
            

        }
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jButtonRegCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegCloseActionPerformed
        int close = JOptionPane.showConfirmDialog(null, "Are you sure you want to close the application?","Select",JOptionPane.YES_NO_OPTION);
        if(close==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonRegCloseActionPerformed
    // method for MD5 Encryption
    private String encryptPassword(String input){
        String encPass=null;
        if(input==null) return null;
        try{
            MessageDigest digest=MessageDigest.getInstance("MD5");
            digest.update(input.getBytes(),0,input.length());
            encPass=new BigInteger(1,digest.digest()).toString(16);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return encPass;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegClose;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JButton jButtonlogin;
    private javax.swing.JComboBox<String> jComboBoxRegSecurityQuestion;
    private javax.swing.JComboBox<String> jComboBoxRegWard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextRegAnswer;
    private javax.swing.JTextField jTextRegEmail;
    private javax.swing.JTextField jTextRegName;
    private javax.swing.JPasswordField jTextRegPassword;
    // End of variables declaration//GEN-END:variables
}
