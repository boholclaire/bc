/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import config.dbConnect;
import static config.passwordHasher.hashPassword;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author clair
 */
public class registerf1 extends javax.swing.JFrame {

    /**
     * Creates new form registerf1
     */
    public registerf1() {
        initComponents();
    }

     public boolean duplicateCheck()
    {
       dbConnect dbc = new dbConnect();
       try{
           String query = "SELECT * FROM tbl_user  WHERE u_username = '" + un.getText()+ "'OR u_email ='" + em.getText()+ "'";
            ResultSet resultSet = dbc.getData(query);
            if(resultSet.next()){
               String  email =resultSet.getString("u_email");
                if(em.equals(em.getText())){
                    JOptionPane.showMessageDialog(null, "Email is already used!");
                    em.setText("");
                }
                 String username =resultSet.getString("u_usname");
                if(un.equals(un.getText())){
                    JOptionPane.showMessageDialog(null, "Username is already used!!");
                    un.setText("");
                }
                 return true;
            }else{  
                return false;
            }
       }catch(SQLException ex){
           System.out.println(""+ex);
           return false;
        } }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        un = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        phoneN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pd = new javax.swing.JPasswordField();
        ty = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(230, 189, 230));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fname.setBackground(new java.awt.Color(230, 189, 230));
        fname.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        fname.setForeground(new java.awt.Color(102, 102, 102));
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "FIRSTNAME", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 290, 50));

        lname.setBackground(new java.awt.Color(230, 189, 230));
        lname.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lname.setForeground(new java.awt.Color(102, 102, 102));
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "LASTNAME", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 290, -1));

        un.setBackground(new java.awt.Color(230, 189, 230));
        un.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        un.setForeground(new java.awt.Color(102, 102, 102));
        un.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        un.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "USERNAME", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        un.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unActionPerformed(evt);
            }
        });
        jPanel2.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 290, 50));

        em.setBackground(new java.awt.Color(230, 189, 230));
        em.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        em.setForeground(new java.awt.Color(102, 102, 102));
        em.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        em.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "EMAIL", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 290, 50));

        phoneN.setBackground(new java.awt.Color(230, 189, 230));
        phoneN.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        phoneN.setForeground(new java.awt.Color(102, 102, 102));
        phoneN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phoneN.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "PHONENUMBER", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.add(phoneN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 290, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-hide-24.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        pd.setBackground(new java.awt.Color(230, 189, 230));
        pd.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pd.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "PASSWORD", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.add(pd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 290, -1));

        ty.setBackground(new java.awt.Color(230, 189, 230));
        ty.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ty.setForeground(new java.awt.Color(102, 102, 102));
        ty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MANAGER", "NURSE" }));
        ty.setBorder(null);
        jPanel2.add(ty, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 120, 30));

        jButton1.setBackground(new java.awt.Color(230, 189, 230));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("CANCEL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 90, -1));

        jButton2.setBackground(new java.awt.Color(230, 189, 230));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 102, 102));
        jButton2.setText("REGISTER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("TYPE:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "REGISTRATION", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 24), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 310, 400));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 330, 410));

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

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed

    }//GEN-LAST:event_lnameActionPerformed

    private void unActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loginf lf = new loginf();
        lf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (fname.getText().isEmpty()
            || lname.getText().isEmpty()
            || un.getText().isEmpty()
            || em.getText().isEmpty()
            || phoneN.getText().isEmpty()
            || pd.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All field are required");
            return;
        }
        String contactPattern = "^[0-9]{11}$";
        if (!phoneN.getText().matches(contactPattern)) {
            JOptionPane.showMessageDialog(null, "Invalid contact number. It must be exactly 11 digits and contain numbers only.");
            phoneN.setText("");
            return;
        }

        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        if (!em.getText().matches(emailPattern)) {
            JOptionPane.showMessageDialog(null, "Invalid email format. Please enter a valid email.");
            em.setText("");
            return;

        }else if(pd.getText().length()< 8){
            JOptionPane.showMessageDialog(null, "Password should have at least 8 characters");
            pd.setText("");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist");

        }else{
            dbConnect dbc = new dbConnect();

            try {
                    String Pass = hashPassword(pd.getText());
           

                String sql = "INSERT INTO tbl_user (u_lname, u_username, u_fname, u_email, u_phoneNumber, u_password, u_type, u_status) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

                PreparedStatement pst = dbc.getConnection().prepareStatement(sql);
                pst.setString(1, lname.getText());
                pst.setString(2, un.getText());
                pst.setString(3, fname.getText());
                pst.setString(4, em.getText());
                pst.setString(5, phoneN.getText());
                pst.setString(6, Pass);
                pst.setString(7, ty.getSelectedItem().toString());
                pst.setString(8, "Pending");

                int rowsInserted = pst.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(null, "Registration Successful!");
                    loginf lf = new loginf();
                    lf.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Connection Error");
                }
      
            } catch(SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
        }   catch (NoSuchAlgorithmException ex) {
                System.out.println("Error: " + ex);
            }}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if (pd.getEchoChar() == '\u2022') { 
        pd.setEchoChar((char) 0); 
    } else {
        pd.setEchoChar('\u2022'); 
    }
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(registerf1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerf1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerf1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerf1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerf1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField em;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField pd;
    private javax.swing.JTextField phoneN;
    private javax.swing.JComboBox<String> ty;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}
