/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnect;
import config.passwordHasher;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author clair
 */
public class createUserf extends javax.swing.JFrame {

    /**
     * Creates new form createUserf
     */
    public createUserf() {
        initComponents();
    }

     public boolean duplicateCheck(){
     dbConnect dbc = new dbConnect();
       try{
           String query = "SELECT * FROM tbl_user  WHERE u_username = '" + usn.getText()+ "'OR u_email ='" + em.getText()+ "'";
            ResultSet resultSet = dbc.getData(query);
            if(resultSet.next()){
              String email =resultSet.getString("u_email");
                if(email.equals(em.getText())){
                    JOptionPane.showMessageDialog(null, "Email is already used!");
                    em.setText("");
                }
               String username =resultSet.getString("u_username");
                if(username.equals(usn.getText())){
                    JOptionPane.showMessageDialog(null, "Username is already used!!");
                    usn.setText("");
                }
                 return true;
            }else{  
                return false;
            }
       }catch(SQLException ex){
           System.out.println(""+ex);
           return false;
           
   }
}
     
     public boolean updateCheck() {
   dbConnect dbc = new dbConnect();
       try{
           String query = "SELECT * FROM tbl_user  WHERE (u_username = '" + usn.getText()+ "'OR u_email ='" + em.getText()+ "')AND u_id !='"+ID.getText()+"'";
            ResultSet resultSet = dbc.getData(query);
            if(resultSet.next()){
                String email =resultSet.getString("u_email");
                if(email.equals(em.getText())){
                    JOptionPane.showMessageDialog(null, "Email is already used!");
                    em.setText("");
                }
                String username =resultSet.getString("u_username");
                if(username.equals(usn.getText())){
                    JOptionPane.showMessageDialog(null, "Username is already used!!");
                    usn.setText("");
                }
                 return true;
            }else{  
                return false;
            }
       }catch(SQLException ex){
           System.out.println(""+ex);
           return false;
           
   }
    }
 
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        pwd = new javax.swing.JTextField();
        usn = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        pnr = new javax.swing.JTextField();
        us = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ty = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        ID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(230, 189, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fn.setBackground(new java.awt.Color(230, 189, 230));
        fn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        fn.setForeground(new java.awt.Color(102, 102, 102));
        fn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fn.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "FIRSTNAME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 290, 40));

        ln.setBackground(new java.awt.Color(230, 189, 230));
        ln.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ln.setForeground(new java.awt.Color(102, 102, 102));
        ln.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ln.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "LASTNAME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 290, 40));

        pwd.setBackground(new java.awt.Color(230, 189, 230));
        pwd.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        pwd.setForeground(new java.awt.Color(102, 102, 102));
        pwd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwd.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "PASSWORD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 290, 40));

        usn.setBackground(new java.awt.Color(230, 189, 230));
        usn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        usn.setForeground(new java.awt.Color(102, 102, 102));
        usn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usn.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "USERNAME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        usn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usnActionPerformed(evt);
            }
        });
        jPanel2.add(usn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 290, 40));

        em.setBackground(new java.awt.Color(230, 189, 230));
        em.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        em.setForeground(new java.awt.Color(102, 102, 102));
        em.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        em.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "EMAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 290, 40));

        pnr.setBackground(new java.awt.Color(230, 189, 230));
        pnr.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        pnr.setForeground(new java.awt.Color(102, 102, 102));
        pnr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnr.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "PHONENUMBER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.add(pnr, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 290, 40));

        us.setBackground(new java.awt.Color(230, 189, 230));
        us.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        us.setForeground(new java.awt.Color(102, 102, 102));
        us.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending", " " }));
        us.setBorder(null);
        jPanel2.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 120, 30));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("USER STATUS:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("TYPE:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        ty.setBackground(new java.awt.Color(230, 189, 230));
        ty.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ty.setForeground(new java.awt.Color(102, 102, 102));
        ty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MANAGER", "NURSE" }));
        ty.setBorder(null);
        jPanel2.add(ty, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 120, 30));

        jButton1.setBackground(new java.awt.Color(230, 189, 230));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("DELETE");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 100, 30));

        jButton2.setBackground(new java.awt.Color(230, 189, 230));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 102, 102));
        jButton2.setText("UPDATE");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 100, 30));

        jButton3.setBackground(new java.awt.Color(230, 189, 230));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 102));
        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 100, 30));

        jButton4.setBackground(new java.awt.Color(230, 189, 230));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 102, 102));
        jButton4.setText("CANCEL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 100, 30));

        ID.setBackground(new java.awt.Color(230, 189, 230));
        ID.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ID.setForeground(new java.awt.Color(102, 102, 102));
        ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ID.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "USER ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        ID.setEnabled(false);
        jPanel2.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 300, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 410));

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

    private void usnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        adminUserf au = new  adminUserf();
        au.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     if (fn.getText().isEmpty()   || ln.getText().isEmpty()   || em.getText().isEmpty() 
                || pnr.getText().isEmpty()|| usn.getText().isEmpty() || pwd.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "All field are required");
            }else if(pwd.getText().length()< 8){
            JOptionPane.showMessageDialog(null, "Password should have at least 8 characters");
        pwd.setText("");
        }else if(duplicateCheck()){
           System.out.println("Duplicate Exist");
     
         }else{
            
        
        dbConnect dbc = new dbConnect();
         if (dbc.insertData("INSERT INTO tbl_user(u_fname, u_lname, u_email, u_phoneNumber, u_type, u_username, u_password, u_status) "
                + "VALUES ('" + fn.getText() + "','" + ln.getText() + "','" + em.getText() + "',"
                + "'" + pnr.getText() + "','" + ty.getSelectedItem() + "','" + usn.getText() + "','" + pwd.getText()+"','"+us.getSelectedItem()+"')"))
                    {
            JOptionPane.showMessageDialog(null, "Registration Successful!");
          adminUserf au = new  adminUserf();
           au.setVisible(true);
           this.dispose();
       } else {
          JOptionPane.showMessageDialog(null, "Connection Error");

         }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   String uid = ID.getText().trim();
    String email = em.getText().trim();
    String username = usn.getText().trim();
   String password = pwd.getText().trim();
   String firstName = fn.getText().trim();  // First name
   String lastName = ln.getText().trim();   // Last name
   String type = ty.getSelectedItem().toString();  // User type
   String statusValue = us.getSelectedItem().toString(); // User status

// Validation
if (uid.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Error: User ID is missing.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

if (firstName.isEmpty() || lastName.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Error: First Name and Last Name are required.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

// Email validation
String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
if (!email.matches(emailRegex)) {
    JOptionPane.showMessageDialog(this, "Invalid Email! Please enter a valid email address.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

// Username validation
if (!username.matches("[a-zA-Z0-9_]{5,}")) {
    JOptionPane.showMessageDialog(this, "Invalid Username! Must be at least 5 characters and contain only letters, numbers, and underscores.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

try {
    // Hash the password using SHA-256 before storing
   String hashedPassword = passwordHasher.hashPassword(password);

    dbConnect dbc = new dbConnect();
    String checkQuery = "SELECT COUNT(*) FROM tbl_user WHERE (u_username = ? OR u_email = ?) AND u_id != ?";

    try (Connection conn = dbc.getConnection();
         PreparedStatement pst = conn.prepareStatement(checkQuery)) {

        pst.setString(1, username);
        pst.setString(2, email);
        pst.setInt(3, Integer.parseInt(uid));

        try (ResultSet rs = pst.executeQuery()) {
            if (rs.next() && rs.getInt(1) > 0) {
                JOptionPane.showMessageDialog(this, "Username or Email already exists! Please use different credentials.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // ✅ Corrected the column order in the UPDATE query
        String updateQuery = "UPDATE tbl_user SET u_fname = ?, u_lname = ?, u_username = ?, u_email = ?, u_password = ?, u_status = ?, u_type = ? WHERE u_id = ?";

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/birthingcenter", "root", "");
             PreparedStatement updatePst = con.prepareStatement(updateQuery)) {

            updatePst.setString(1, firstName);   // First name
            updatePst.setString(2, lastName);    // Last name
            updatePst.setString(3, username);    // Username
            updatePst.setString(4, email);       // Email
            updatePst.setString(5, hashedPassword);  // Store hashed password
            updatePst.setString(6, statusValue); // Status (Corrected order)
            updatePst.setString(7, type);        // Type (Corrected order)
            updatePst.setInt(8, Integer.parseInt(uid));  // User ID

            int updated = updatePst.executeUpdate();
            if (updated > 0) {
                JOptionPane.showMessageDialog(this, "User updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                new createUserf().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Update failed!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
} catch (Exception ex) {
    JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(createUserf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createUserf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createUserf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createUserf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createUserf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField ID;
    public javax.swing.JTextField em;
    public javax.swing.JTextField fn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField ln;
    public javax.swing.JTextField pnr;
    public javax.swing.JTextField pwd;
    public javax.swing.JComboBox<String> ty;
    public javax.swing.JComboBox<String> us;
    public javax.swing.JTextField usn;
    // End of variables declaration//GEN-END:variables
}
