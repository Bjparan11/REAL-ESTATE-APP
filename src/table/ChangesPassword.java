/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import User.UserDashboard;
import dbConnect.dbConnector;
import dbconnect.Session;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import dbConnect.PasswordHasher;

/**
 *
 * @author Windows 10
 */
public class ChangesPassword extends javax.swing.JFrame {

    /**
     * Creates new form ChangesPassword
     */
    public ChangesPassword() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        LastName = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Cpassword = new javax.swing.JPasswordField();
        oldPassword = new javax.swing.JPasswordField();
        newPassword = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 153, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USER DASHBOARD");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 260, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("CHANGESPASSWORD");
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 210, 40));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 60));

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Enter Old Pass :");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, 30));

        LastName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LastName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LastName.setText("Enter New Pass :");
        jPanel1.add(LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, 30));

        user.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user.setText("Confirm Pass    :");
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 120, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 130, 40));
        jPanel1.add(Cpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 260, 30));
        jPanel1.add(oldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 260, 30));
        jPanel1.add(newPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 260, 30));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 470, 310));

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Back.setText("Back");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        jPanel2.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 110, 40));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 140, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        UserDashboard ud = new UserDashboard();
        ud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String passw = new String(newPassword.getPassword()).trim();
        String Cpassw = new String(Cpassword.getPassword()).trim();


        if(passw.isEmpty() || Cpassw.isEmpty() || oldPassword.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please Fill all Boxes");
        }else if(passw.length() <= 7)
        {
            JOptionPane.showMessageDialog(null, "Password Must be Exactly 8 Characters Long");
        }else if(!passw.equals(Cpassw))
        {
            JOptionPane.showMessageDialog(null, "Password does not match");
        }else if(passw.equals(Cpassw))
        {
            try
            {
                dbConnector dbc = new dbConnector();
                Session sess = Session.getInstance();


                String query = "SELECT * FROM user WHERE i_id='"+ sess.getIid() +"'";
                ResultSet rs = dbc .getData(query);
                if(rs.next())
                {
                    String olddbPassword = rs.getString("i_password");  
                    String oldhash = PasswordHasher.hashPassword(oldPassword.getText());
                    



                    if(olddbPassword.equals(oldhash))
                    {

                        
                        String npass = PasswordHasher.hashPassword(newPassword.getText());
                        dbc.updateData("UPDATE user SET i_password = '"+npass+"'WHERE i_id = '"+sess.getIid()+"'");
                        System.out.println("/n2");

                        JOptionPane.showMessageDialog(null, "Updated Succesfully");
                        UserDashboard ud = new UserDashboard();
                        ud.setVisible(true);
                        this.dispose();
                        


                    }else
                    {
                        JOptionPane.showMessageDialog(null, "Old Password is Incorrect");
                    }
                }
            } catch(SQLException | NoSuchAlgorithmException ex)
            {
                System.out.println(""+ex);
            }
        }else
        {
            JOptionPane.showMessageDialog(null, "Unknown Error Occured");
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
            java.util.logging.Logger.getLogger(ChangesPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangesPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangesPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangesPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangesPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JPasswordField Cpassword;
    private javax.swing.JLabel LastName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel name;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JPasswordField oldPassword;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
