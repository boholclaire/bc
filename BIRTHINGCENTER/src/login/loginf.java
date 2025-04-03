/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import Worker.NurseDashboard;
import admin.ManagerDashboard;
import config.Session;
import config.dbConnect;
import config.passwordHasher;
import static config.passwordHasher.hashPassword;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static javax.management.remote.JMXConnectorFactory.connect;
import javax.swing.JOptionPane;

/**
 *
 * @author clair
 */
public class loginf extends javax.swing.JFrame {

    /**
     * Creates new form loginf
     */
    public loginf() {
        initComponents();
    }

     static String status;
    static String type;
    
    
      public static boolean logAcc(String username, String password)
    {
       dbConnect connector = new dbConnect();
    try {
        
      String query = "SELECT * FROM tbl_user WHERE u_username = ?";
      PreparedStatement pst = connector.getConnection().prepareStatement(query);
      pst.setString(1, username);
      ResultSet resultSet = pst.executeQuery();

        if (resultSet.next()) {
            String hashedPass = resultSet.getString("u_password");
            String rehashedPass = hashPassword(password); 

            System.out.println("Stored Password: " + hashedPass);
            System.out.println("Entered Password (Hashed): " + rehashedPass);

            if (hashedPass.equals(rehashedPass)) {
                status = resultSet.getString("u_status");
                type = resultSet.getString("u_type");
             
               Session  sess = Session.getInstance();
                  sess.setID(resultSet.getInt("u_id"));
                  sess.setLname(resultSet.getNString("u_lname"));
                  sess.setUsername(resultSet.getNString("u_username"));
                  sess.setFname(resultSet.getNString("u_fname"));
                  sess.setEmail(resultSet.getNString("u_email"));
                  sess.setPhoneNumber(resultSet.getNString("u_phoneNumber"));
                  sess.setType(resultSet.getNString("u_type"));
                  sess.setStatus(resultSet.getNString("u_status"));

                  return true;
            }      }
    } catch (SQLException | NoSuchAlgorithmException ex) {
        ex.printStackTrace();
    }  return false;
}
      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        us = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(230, 189, 230));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        us.setBackground(new java.awt.Color(230, 189, 230));
        us.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        us.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        us.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "USERNAME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        jPanel2.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 280, 50));

        login.setBackground(new java.awt.Color(230, 189, 230));
        login.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(102, 102, 102));
        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel2.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 90, 30));

        jLabel5.setBackground(new java.awt.Color(230, 189, 230));
        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-hide-24.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, 20));

        pass.setBackground(new java.awt.Color(230, 189, 230));
        pass.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pass.setForeground(new java.awt.Color(153, 153, 153));
        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "PASSWORD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel2.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 280, 50));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Don't have an account? REGISTER");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 320, -1));

        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 390));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 320, 410));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BIRTHING CENTER.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -30, 450, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
     registerf1 rf = new registerf1();
      rf.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
         String uname = us.getText().trim();
        String password = new String(pass.getPassword()).trim();

     if (password.isEmpty() || uname.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please Fill all Boxes");
     } else if (logAcc(uname, password)) {

    if (!status.equalsIgnoreCase("Active")) {
        JOptionPane.showMessageDialog(null, "Inactive Account, Contact the Admin");
    } else {
        JOptionPane.showMessageDialog(null, "Login Successfully");

        if (type.equalsIgnoreCase("Manager")) {  
            ManagerDashboard md = new ManagerDashboard();
            md.setVisible(true);
            this.dispose();
        } else if (type.equalsIgnoreCase("Nurse")) {  
            NurseDashboard nd = new NurseDashboard();
            nd.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Unknown Account Type, Contact the Admin");
        }
    }
} else {
    JOptionPane.showMessageDialog(null, "Invalid Account");
}
    }//GEN-LAST:event_loginActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
     if (pass.getEchoChar() == '\u2022') { 
        pass.setEchoChar((char) 0); 
    } else {
        pass.setEchoChar('\u2022'); 
    }
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(loginf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField us;
    // End of variables declaration//GEN-END:variables
}
