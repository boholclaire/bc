
package admin;

import config.Session;
import config.dbConnect;
import java.awt.Color;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author clair
 */
public class adminUserf extends javax.swing.JFrame {

     
    public adminUserf() {
        initComponents();
        displayData();
    }

 public void displayData() {
    dbConnect dbc = new dbConnect();
    try {
        String query = "SELECT u_fname, u_lname, u_username, "
                     + "u_email, u_phoneNumber, u_type, u_status FROM tbl_user";
        
        ResultSet rs = dbc.getData(query);
        accounttble.setModel(DbUtils.resultSetToTableModel(rs));
        
       
        rs.close();
    } catch (SQLException ex) {
        System.out.println("Errors: " + ex.getMessage());
    }
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        acc_id = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        accounttble = new javax.swing.JTable();
        edit = new javax.swing.JPanel();
        EDIT = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        border = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(235, 230, 240));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(230, 189, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setBackground(new java.awt.Color(230, 189, 230));
        back.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(102, 102, 102));
        back.setText("BACK");
        back.setToolTipText("");
        back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 90, 30));

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Current User");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 200, -1));

        acc_id.setForeground(new java.awt.Color(102, 102, 102));
        acc_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_id.setText("  id  ");
        jPanel2.add(acc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 200, -1));

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 390));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 410));

        accounttble.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        accounttble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(accounttble);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 460, 230));

        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });

        EDIT.setBackground(new java.awt.Color(235, 230, 240));
        EDIT.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        EDIT.setForeground(new java.awt.Color(102, 102, 102));
        EDIT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EDIT.setText("EDIT");
        EDIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EDITMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout editLayout = new javax.swing.GroupLayout(edit);
        edit.setLayout(editLayout);
        editLayout.setHorizontalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editLayout.createSequentialGroup()
                .addComponent(EDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        editLayout.setVerticalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 80, 30));

        add.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(102, 102, 102));
        add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add.setText("ADD");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, 30));

        border.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        border.setForeground(new java.awt.Color(102, 102, 102));
        border.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        border.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "ADMIN DASHBOARD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 24), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel1.add(border, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 500, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
      ManagerDashboard md = new ManagerDashboard();
            md.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void EDITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EDITMouseClicked
        int rowIndex = accounttble.getSelectedRow();
     if (rowIndex < 0) {
       JOptionPane.showMessageDialog(null, "Please select an Item!");
     } else {
    try {
        dbConnect dbc = new dbConnect();
        TableModel tbl = accounttble.getModel();
       
        String query = "SELECT * FROM tbl_user WHERE u_id = '" + tbl.getValueAt(rowIndex, 0) + "'";
        ResultSet rs = dbc.getData(query);
          if (rs.next()) {
            createUserf crf = new createUserf();
            crf.ID.setText(""+rs.getInt("u_id"));
            crf.fn.setText(""+rs.getString("u_fname")); 
            crf.ln.setText(""+rs.getString("u_lname")); 
            crf.em.setText(""+rs.getString("u_email")); 
            crf.pnr.setText(""+rs.getString("u_phoneNumber")); 
            crf.ty.setSelectedItem(""+rs.getString("u_ty")); 
            crf.usn.setText(""+rs.getString("u_username")); 
            crf.pwd.setText(""+rs.getString("u_password1")); 
            crf.us.setSelectedItem(""+rs.getString("u_status")); 
            crf.add.setEnabled(false);
            crf.update.setEnabled(true);
            crf.setVisible(true);
            this.dispose();
        }
    } catch (SQLException ex) {
        System.out.println("SQL Exception: " + ex.getMessage()); 
    }
}

    }//GEN-LAST:event_EDITMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
     createUserf crf = new createUserf();
         crf.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_addMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    Session sess = Session.getInstance();
        acc_id.setText(""+sess.getID());    }//GEN-LAST:event_formWindowActivated

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
  

    }//GEN-LAST:event_editMouseClicked

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
            java.util.logging.Logger.getLogger(adminUserf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminUserf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminUserf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminUserf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminUserf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EDIT;
    private javax.swing.JLabel acc_id;
    private javax.swing.JTable accounttble;
    private javax.swing.JLabel add;
    private javax.swing.JButton back;
    private javax.swing.JLabel border;
    private javax.swing.JPanel edit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

  
}
