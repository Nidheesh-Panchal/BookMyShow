/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.*;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.*;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author nilu
 */
public class login extends javax.swing.JFrame {

    public static Connection connecrDb() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "root");
            return conn;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            System.out.println("Connection failure");
        }
        return null;
    }

    /**
     * Creates new form login
     */
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public login() {
        initComponents();
        conn = connecrDb();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jToggleButton2 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        login_button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        username_txt = new javax.swing.JTextField();
        password_txt = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        register_button = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jTextField1.setText("jTextField1");

        jPasswordField1.setText("jPasswordField1");

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(35, 35, 35)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jButton1)))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jToggleButton1.setText("jToggleButton1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jToggleButton2.setText("jToggleButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        login_button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        login_button.setText("Login");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });
        login_button.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                login_buttonKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Password");

        username_txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        username_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_txtActionPerformed(evt);
            }
        });
        username_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                username_txtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                username_txtKeyTyped(evt);
            }
        });

        password_txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        password_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_txtActionPerformed(evt);
            }
        });
        password_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                password_txtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                password_txtKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Username");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("New User? ");

        register_button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        register_button.setText("Register");
        register_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(13, 13, 13)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(login_button)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(password_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                .addComponent(username_txt))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(register_button)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(login_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(register_button))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void password_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_txtActionPerformed

    private void username_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_txtActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        // TODO add your handling code here:
        if(password_txt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter password in the password field");
            return;
        }
        if(username_txt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter valid username");
            return;
        }
        String sql = "select * from customer where username=?;";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,username_txt.getText());
            //pst.setString(2,password_txt.getText());
            rs = pst.executeQuery();
            if (rs.next())
            {
                //JOptionPane.showMessageDialog(null, "username and password are correct");
                String pass=password_txt.getText();
                if (rs.getNString("password").equals(pass))
                {
                    JOptionPane.showMessageDialog(null, "username and password are correct");
                    String username=username_txt.getText();
                    mainpage mainp=new mainpage(username);
                    mainp.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Either username or password is incorrect");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "no username");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_login_buttonActionPerformed

    private void register_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_buttonActionPerformed
        // TODO add your handling code here:
        register r=new register();
        r.setVisible(true);
        password_txt.setText("");
        username_txt.setText("");
    }//GEN-LAST:event_register_buttonActionPerformed

    private void username_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_username_txtKeyPressed
        // TODO add your handling code here:
        if(KeyEvent.VK_ENTER==evt.getKeyChar())
        {
            if(password_txt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter password in the password field");
            return;
        }
        if(username_txt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter valid username");
            return;
        }
        String sql = "select * from customer where username=?;";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,username_txt.getText());
            //pst.setString(2,password_txt.getText());
            rs = pst.executeQuery();
            if (rs.next())
            {
                //JOptionPane.showMessageDialog(null, "username and password are correct");
                String pass=password_txt.getText();
                if (rs.getNString("password").equals(pass))
                {
                    JOptionPane.showMessageDialog(null, "username and password are correct");
                    String username=username_txt.getText();
                    mainpage mainp=new mainpage(username);
                    mainp.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Either username or password is incorrect");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "no username");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        }
    }//GEN-LAST:event_username_txtKeyPressed

    private void username_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_username_txtKeyTyped
        // TODO add your handling code here:
        if(' '==evt.getKeyChar())
        {
            evt.consume();
        }
    }//GEN-LAST:event_username_txtKeyTyped

    private void password_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_txtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_password_txtKeyTyped

    private void login_buttonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_login_buttonKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_login_buttonKeyTyped

    private void password_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_txtKeyPressed
        // TODO add your handling code here:
        if(KeyEvent.VK_ENTER==evt.getKeyChar())
        {
            if(password_txt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter password in the password field");
            return;
        }
        if(username_txt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter valid username");
            return;
        }
        String sql = "select * from customer where username=?;";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,username_txt.getText());
            //pst.setString(2,password_txt.getText());
            rs = pst.executeQuery();
            if (rs.next())
            {
                //JOptionPane.showMessageDialog(null, "username and password are correct");
                String pass=password_txt.getText();
                if (rs.getNString("password").equals(pass))
                {
                    JOptionPane.showMessageDialog(null, "username and password are correct");
                    String username=username_txt.getText();
                    mainpage mainp=new mainpage(username);
                    mainp.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Either username or password is incorrect");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "no username");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        }
    }//GEN-LAST:event_password_txtKeyPressed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JButton login_button;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JButton register_button;
    private javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
}
