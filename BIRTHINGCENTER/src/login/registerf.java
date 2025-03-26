
package login;

import config.dbConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class registerf extends javax.swing.JFrame {

 
    public registerf() {
        initComponents();
    }

    
    public static String phone,usname;
    
   public boolean duplicateCheck()
    {
        dbConnect dbc = new dbConnect();
        String pn = phoneN.getText().trim();
        String us = un.getText().trim();
        
        try
        {
            String query = "SELECT * FROM tbl_user WHERE u_username='"+ us +"'OR u_phoneNumber='"+ pn +"'";
            ResultSet resultSet = dbc.getData(query);
            if(resultSet.next())
            {
                phone = resultSet.getString("u_phoneNumber");
                if(phone.equals(pn))
                {
                    JOptionPane.showMessageDialog(null, "Phone Number is Already Used");
                    phoneN.setText("");
                }
                
                usname = resultSet.getString("u_username");
                if(usname.equals(us))
                {
                    JOptionPane.showMessageDialog(null, "Username is Already Used");
                    un.setText("");
                }
                return true;
            }else
            {
                return false;
            }
        }catch(SQLException ex)
        {
            System.out.println(""+ex);
            return false;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        pd = new javax.swing.JTextField();
        un = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        phoneN = new javax.swing.JTextField();
        ty = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(230, 189, 230));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGISTRATION");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 320, -1));

        fname.setBackground(new java.awt.Color(230, 189, 230));
        fname.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        fname.setForeground(new java.awt.Color(102, 102, 102));
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "FIRSTNAME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 290, 40));

        lname.setBackground(new java.awt.Color(230, 189, 230));
        lname.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lname.setForeground(new java.awt.Color(102, 102, 102));
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "LASTNAME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 290, 40));

        pd.setBackground(new java.awt.Color(230, 189, 230));
        pd.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        pd.setForeground(new java.awt.Color(102, 102, 102));
        pd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pd.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "PASSWORD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.add(pd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 290, 40));

        un.setBackground(new java.awt.Color(230, 189, 230));
        un.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        un.setForeground(new java.awt.Color(102, 102, 102));
        un.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        un.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "USERNAME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        un.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unActionPerformed(evt);
            }
        });
        jPanel2.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 290, 40));

        em.setBackground(new java.awt.Color(230, 189, 230));
        em.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        em.setForeground(new java.awt.Color(102, 102, 102));
        em.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        em.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "EMAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 290, 40));

        phoneN.setBackground(new java.awt.Color(230, 189, 230));
        phoneN.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        phoneN.setForeground(new java.awt.Color(102, 102, 102));
        phoneN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phoneN.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "PHONENUMBER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.add(phoneN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 290, 40));

        ty.setBackground(new java.awt.Color(230, 189, 230));
        ty.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ty.setForeground(new java.awt.Color(102, 102, 102));
        ty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MANAGER", "NURSE" }));
        ty.setBorder(null);
        jPanel2.add(ty, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 120, 30));

        jButton1.setBackground(new java.awt.Color(230, 189, 230));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("CANCEL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        jButton2.setBackground(new java.awt.Color(230, 189, 230));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 102, 102));
        jButton2.setText("REGISTER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("TYPE:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

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

    private void unActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    loginf lf = new loginf();
     lf.setVisible(true);
     this.dispose();              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
     dbConnect dbc = new dbConnect();
    String fn = fname.getText().trim();
    String ln = lname.getText().trim();
    String uname = un.getText().trim();
    String email = em.getText().trim();
    String pass = pd.getText().trim();
    String pn = phoneN.getText().trim();
    String at = ty.getSelectedItem().toString().trim();
    



        if(uname.isEmpty() || pass.isEmpty() ||  ln.isEmpty() || fn.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please Fill All Boxes");
    
        }else if(!pn.matches("\\d+"))
        {
            JOptionPane.showMessageDialog(null, "Phone Must Only Contain Numbers");
        }else if(pass.length() <= 7)
        {
       }else if(pass.length() != 8)  // Must be exactly 8
       { 
    JOptionPane.showMessageDialog(null, "Password must be exactly 8 characters long.");

            JOptionPane.showMessageDialog(null, "Invalid Phone num");
        }else if(duplicateCheck())
        {
            System.out.println("Duplicate Exists");
        }else if (dbc.insertData("INSERT INTO tbl_user (u_fname, u_lname, u_username, u_email, u_phoneNumber, u_password,u_type, u_status) "
       + "VALUES ('" + fn + "', '" + ln + "', '" + uname + "', '"+email+"', '" + pn + "', '" + pass+ "', '"+at+"', 'Pending')"))
        {
            JOptionPane.showMessageDialog(null, "Registered succesfully!");
            loginf lf = new loginf();
             lf.setVisible(true);
              this.dispose(); 
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(registerf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerf().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField pd;
    private javax.swing.JTextField phoneN;
    private javax.swing.JComboBox<String> ty;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}
