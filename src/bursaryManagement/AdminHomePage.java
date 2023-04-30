
package bursaryManagement;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class AdminHomePage extends javax.swing.JFrame {

    /**
     * Creates new form AdminHomePage
     */
    public AdminHomePage() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonlogout = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonapproveusers = new javax.swing.JButton();
        jButtonDisapproved = new javax.swing.JButton();
        jButtonPending = new javax.swing.JButton();
        jButtonIEBC = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonApproved = new javax.swing.JButton();
        jButtonReport = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblDateTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("ADMIN HOME PAGE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 250, -1));

        jButtonlogout.setBackground(new java.awt.Color(204, 0, 0));
        jButtonlogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonlogout.setForeground(new java.awt.Color(255, 255, 255));
        jButtonlogout.setText("LOG OUT");
        jButtonlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 128, 51));

        jButtonExit.setBackground(new java.awt.Color(204, 0, 0));
        jButtonExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExit.setText("EXIT");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 30, 128, 51));

        jButtonapproveusers.setBackground(new java.awt.Color(204, 0, 0));
        jButtonapproveusers.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonapproveusers.setForeground(new java.awt.Color(255, 255, 255));
        jButtonapproveusers.setText("APPROVE OR DISMISS USERS");
        jButtonapproveusers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonapproveusersActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonapproveusers, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 368, 59));

        jButtonDisapproved.setBackground(new java.awt.Color(204, 0, 0));
        jButtonDisapproved.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonDisapproved.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDisapproved.setText("DISAPPROVED APPLICANT LIST");
        jButtonDisapproved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDisapprovedActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDisapproved, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 370, 59));

        jButtonPending.setBackground(new java.awt.Color(204, 0, 0));
        jButtonPending.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonPending.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPending.setText("PENDING APPROVAL LIST");
        jButtonPending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPendingActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPending, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 490, 375, 59));

        jButtonIEBC.setBackground(new java.awt.Color(204, 0, 0));
        jButtonIEBC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonIEBC.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIEBC.setText("IEBC REGISTER");
        jButtonIEBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIEBCActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIEBC, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, 368, 59));

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 20, 420));

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 250, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 1010, 20));

        jPanel4.setBackground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 670, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("BURSARY MANAGEMENT SYSTEM ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 330, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("NAKURU TOWN EAST CONSTITUENCY  ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 440, 40));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 780, -1, -1));

        jButtonApproved.setBackground(new java.awt.Color(204, 0, 0));
        jButtonApproved.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonApproved.setForeground(new java.awt.Color(255, 255, 255));
        jButtonApproved.setText("APPROVED APPLICANT LIST");
        jButtonApproved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApprovedActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonApproved, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 420, 60));

        jButtonReport.setBackground(new java.awt.Color(204, 0, 0));
        jButtonReport.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonReport.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReport.setText("ALLOCATION REPORT");
        jButtonReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 580, 370, 60));

        jPanel5.setBackground(new java.awt.Color(0, 0, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 700, 469, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDateTime.setFont(new java.awt.Font("Open Sans Semibold", 1, 18)); // NOI18N
        lblDateTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDateTime.setText("time stamb");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 700, 410, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlogoutActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?","select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButtonlogoutActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Are you sure you want to close the application?","select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonapproveusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonapproveusersActionPerformed
        setVisible(false);
        new AdminApproval().setVisible(true);
    }//GEN-LAST:event_jButtonapproveusersActionPerformed

    private void jButtonIEBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIEBCActionPerformed
        setVisible(false);
        new IEBERegister().setVisible(true);
    }//GEN-LAST:event_jButtonIEBCActionPerformed

    private void jButtonApprovedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApprovedActionPerformed
        setVisible(false);
        new ApprovedList().setVisible(true);
    }//GEN-LAST:event_jButtonApprovedActionPerformed

    private void jButtonDisapprovedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDisapprovedActionPerformed
        setVisible(false);
        new DisApprovedList().setVisible(true);
    }//GEN-LAST:event_jButtonDisapprovedActionPerformed

    private void jButtonPendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPendingActionPerformed
        setVisible(false);
        new PendingApproval().setVisible(true);
    }//GEN-LAST:event_jButtonPendingActionPerformed

    private void jButtonReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportActionPerformed
        setVisible(false);
        new report().setVisible(true);
    }//GEN-LAST:event_jButtonReportActionPerformed

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
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomePage().setVisible(true);
            }
        });
    }
{

        // Update the label with your current machine time
        Thread updateTimeThread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss | dd/MM/yyyy");
                    Date now = new Date();
                    String dateTime = dateFormat.format(now);
                    lblDateTime.setText(dateTime);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        updateTimeThread.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApproved;
    private javax.swing.JButton jButtonDisapproved;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonIEBC;
    private javax.swing.JButton jButtonPending;
    private javax.swing.JButton jButtonReport;
    private javax.swing.JButton jButtonapproveusers;
    private javax.swing.JButton jButtonlogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblDateTime;
    // End of variables declaration//GEN-END:variables
}
