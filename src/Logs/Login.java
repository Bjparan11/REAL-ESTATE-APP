/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logs;

import InterPage.Register;
import dbconnect.Session;
import dbConnect.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static sun.security.jgss.GSSUtil.login;
import table.AdminDashboard;
import User.UserDashboard;
import dbConnect.PasswordHasher;
import java.security.NoSuchAlgorithmException;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }
    
    
    
    static String status1;
    static String type1;

    
    public static boolean loginAccount(String username, String password)
    {
        dbConnector connector = new dbConnector();
        try
        {
            
            String query = "SELECT * FROM user WHERE i_username='"+ username +"'";
            ResultSet resultSet = connector.getData(query);
            if(resultSet.next())
            {
                

                String hashedPass = resultSet.getString("i_password");
                String rehashedPass = PasswordHasher.hashPassword(password);
                
                if(hashedPass.equals(rehashedPass))
                {
                    

                status1 = resultSet.getString("status");
                type1 = resultSet.getString("i_type");
                Session sess = Session.getInstance();
                sess.setIid(resultSet.getInt("i_id"));
                sess.setFname(resultSet.getString("i_fname"));
                sess.setLname(resultSet.getString("i_lname"));
                sess.setUsername(resultSet.getString("i_username"));
                sess.setType(resultSet.getString("i_type"));
                sess.setEmail(resultSet.getString("i_email"));
                    

                return true;
                }else
                {
                    
                    return false;
                }
            }else
            {
               
                return false;
            }
        }catch(SQLException | NoSuchAlgorithmException ex)
        {
            System.out.println(""+ex); // Always put 
            return false;
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Register = new javax.swing.JButton();
        LOGIN = new javax.swing.JButton();
        User = new javax.swing.JLabel();
        Pass = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pw = new javax.swing.JPasswordField();
        uname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REAL ESTATE MANAGEMENT SYSTEM");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 490, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 50));

        Register.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Register.setText("REGISTER");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        getContentPane().add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 110, 40));

        LOGIN.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        LOGIN.setText("LOGIN");
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });
        getContentPane().add(LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 110, 40));

        User.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        User.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        User.setText("Username :");
        getContentPane().add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 90, 30));

        Pass.setBackground(new java.awt.Color(0, 0, 0));
        Pass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Pass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pass.setText("Password :");
        getContentPane().add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 90, 30));

        jLabel3.setFont(new java.awt.Font("Wide Latin", 3, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOGIN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 180, 40));
        getContentPane().add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 180, 30));

        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 180, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logs/buy-sell-land.jpg"))); // NOI18N
        jLabel5.setText("Username :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 770, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        Register rg = new Register();
        rg.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegisterActionPerformed

    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed
        dbConnector db = new dbConnector();
        
        if (uname.getText().isEmpty() && pw.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your username & password !!.");
        } else if (uname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please cannot be empty.");
        } else if (pw.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password cannot be empty.");
            
        } else if (loginAccount(uname.getText(), pw.getText())) 
            {
                if (!status1.equals("Active")) 
                {
                    JOptionPane.showMessageDialog(null, "Pending Account, Please wait for the approval");
                } else 
                {
                    JOptionPane.showMessageDialog(null, "Login successful!");

                    if (type1.equals("Admin")) 
                    {
                        AdminDashboard ad = new AdminDashboard();
                        ad.setVisible(true);
                        this.dispose();
                    }else if (type1.equals("User")) 
                    {
                        UserDashboard ud = new UserDashboard();
                        ud.setVisible(true);
                        this.dispose();
                    }  else {
                        JOptionPane.showMessageDialog(null, "No account type found!");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Account, Please register first !!" );
            
        }
        //        Login lg = new Login();
        //        lg.setVisible(true);
        //        dispose();
    }//GEN-LAST:event_LOGINActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LOGIN;
    private javax.swing.JLabel Pass;
    private javax.swing.JButton Register;
    private javax.swing.JLabel User;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pw;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
