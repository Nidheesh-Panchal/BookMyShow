/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.*;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.time.LocalDateTime;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author nilu1
 */
public class mainpage extends javax.swing.JFrame {

    /**
     * Creates new form mainpage
     */
    String username;
    private final login log;
    
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
    String moviename;
    int hallid;
    String hall;
    int movieno;
    String dat;
    JPanel a=new javax.swing.JPanel();
    JPanel b=new javax.swing.JPanel();
    JButton s[]=new JButton[100];
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    DefaultComboBoxModel location=new DefaultComboBoxModel();
    int index;
    ActionListener listen=new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if (e.getSource() instanceof JButton) 
            {
                //JButton mov=(JButton)e.getsource();
                Icon i=((JButton)e.getSource()).getIcon();
                String loc=i.toString();
                //JOptionPane.showMessageDialog(null,loc);
                int j=loc.length();
                loc=loc.substring(j-6,j);
                if( '/'==loc.charAt(0))
                {
                    loc=loc.substring(1);
                }
                loc=loc.substring(0,loc.length()-4);
                index=Integer.valueOf(loc);
                movieno=index;
//                JOptionPane.showMessageDialog(null,movieno);
                String sql="select * from movie where movieid=?;";
                try
                {
                    pst = conn.prepareStatement(sql);
                    pst.setString(1,Integer.toString(index));
                    rs=pst.executeQuery();
                    if(rs.next())
                    {
                        mname_label.setText(rs.getNString("mname"));
                        genre_label.setText(rs.getNString("genre"));
                        mdesc_label.setText(rs.getNString("mdescription"));
                        screen.setViewportView(movie_desc);
                        moviename=mname_label.getText();
                    }
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null,ex);
                }
//                for (int i = 0; i < s.length; i++)
//                {
//                    if (e.getSource() == s[i])
//                    {
//                        //s[i].setIcon(); //my particular action for that button
//                        JOptionPane.showMessageDialog(null,i);
//                    }                                       
//                }
            }
        }
    };
    
    ActionListener halllisten=new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if (e.getSource() instanceof JButton) 
            {
                //JButton mov=(JButton)e.getsource();
                //Icon i=((JButton)e.getSource()).getIcon();
//                JOptionPane.showMessageDialog(null,"not here");
                hall=((JButton)e.getSource()).getText();
                //JOptionPane.showMessageDialog(null,loc);
                int j=hall.length();
                //loc=loc.substring(j-6,j);
//                if( '/'==loc.charAt(0))
//                {
//                    loc=loc.substring(1);
//                }
//                loc=loc.substring(0,loc.length()-4);
//                index=Integer.valueOf(loc);
                //JOptionPane.showMessageDialog(null,index);
                int i;
                for(i=0;i<j;i++)
                {
                    if(hall.charAt(i)=='.')
                        break;
                }
                hallid=Integer.parseInt(hall.substring(0,i));
                for(;i<j;i++)
                {
                    if(hall.charAt(i)==' ')
                        break;
                }
                hall=hall.substring(2,i);
                calling();
//                seat s=new seat(username,this);
//        s.setVisible(true);
//        this.setVisible(false);
//        this.dispose();
//                
//                String sql="select * from movie where movieid=?;";
//                try
//                {
//                    pst = conn.prepareStatement(sql);
//                    pst.setString(1,Integer.toString(index));
//                    rs=pst.executeQuery();
//                    if(rs.next())
//                    {
//                        mname_label.setText(rs.getNString("mname"));
//                        genre_label.setText(rs.getNString("genre"));
//                        mdesc_label.setText(rs.getNString("mdescription"));
//                        screen.setViewportView(movie_desc);
//                        movie=mname_label.toString();
//                    }
//                }
//                catch(Exception ex)
//                {
//                    JOptionPane.showMessageDialog(null,ex);
//                }
//                for (int i = 0; i < s.length; i++)
//                {
//                    if (e.getSource() == s[i])
//                    {
//                        //s[i].setIcon(); //my particular action for that button
//                        JOptionPane.showMessageDialog(null,i);
//                    }                                       
//                }
            }
        }
    };
        
    
    public mainpage(String use,login form) {
        initComponents();
        username=use;
        conn=connecrDb();
        log=form;
    }

    private mainpage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        updateprofile_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        username_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        password_txt = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        repass_txt = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        fname_txt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lname_txt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        mail_txt = new javax.swing.JTextField();
        update_button = new javax.swing.JButton();
        logout_button = new javax.swing.JButton();
        screen = new javax.swing.JScrollPane();
        movie_desc = new javax.swing.JPanel();
        mname_label = new javax.swing.JLabel();
        genre_label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mdesc_label = new javax.swing.JTextArea();
        go_button = new javax.swing.JButton();
        movpic = new javax.swing.JScrollPane();
        location_combo = new javax.swing.JComboBox<>();
        date_choose = new com.toedter.calendar.JDateChooser();

        jTextField1.setText("jTextField1");

        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "History", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );

        updateprofile_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        updateprofile_panel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                updateprofile_panelComponentShown(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Username");

        username_txt.setEditable(false);
        username_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                username_txtKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("New Password");

        password_txt.setEchoChar('\u2022');

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Retype Password");

        repass_txt.setEchoChar('\u2022');

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("First Name");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Last Name");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Email Id");

        mail_txt.setEditable(false);

        update_button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        update_button.setText("Update");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updateprofile_panelLayout = new javax.swing.GroupLayout(updateprofile_panel);
        updateprofile_panel.setLayout(updateprofile_panelLayout);
        updateprofile_panelLayout.setHorizontalGroup(
            updateprofile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateprofile_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updateprofile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateprofile_panelLayout.createSequentialGroup()
                        .addGroup(updateprofile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(27, 27, 27)
                        .addGroup(updateprofile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lname_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(fname_txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username_txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password_txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(repass_txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mail_txt, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(updateprofile_panelLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(update_button)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        updateprofile_panelLayout.setVerticalGroup(
            updateprofile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateprofile_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updateprofile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateprofile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateprofile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(repass_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateprofile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(mail_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateprofile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(fname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateprofile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(update_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateprofile_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateprofile_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        logout_button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        logout_button.setText("Log Out");
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });

        screen.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        screen.setMaximumSize(new java.awt.Dimension(438, 224));
        screen.setMinimumSize(new java.awt.Dimension(438, 224));
        screen.setPreferredSize(new java.awt.Dimension(438, 224));

        movie_desc.setPreferredSize(new java.awt.Dimension(438, 224));

        mname_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mname_label.setText("M");

        genre_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        genre_label.setText("g");

        mdesc_label.setColumns(20);
        mdesc_label.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        mdesc_label.setLineWrap(true);
        mdesc_label.setRows(5);
        jScrollPane2.setViewportView(mdesc_label);

        javax.swing.GroupLayout movie_descLayout = new javax.swing.GroupLayout(movie_desc);
        movie_desc.setLayout(movie_descLayout);
        movie_descLayout.setHorizontalGroup(
            movie_descLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movie_descLayout.createSequentialGroup()
                .addGroup(movie_descLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(movie_descLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(mname_label))
                    .addGroup(movie_descLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(movie_descLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genre_label)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        movie_descLayout.setVerticalGroup(
            movie_descLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movie_descLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(mname_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genre_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        screen.setViewportView(movie_desc);

        go_button.setText("Go");
        go_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go_buttonActionPerformed(evt);
            }
        });

        movpic.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        location_combo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        date_choose.setDateFormatString("yyyy-MM-dd");
        date_choose.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        date_choose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                date_chooseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(screen, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                            .addComponent(movpic, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(logout_button)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(location_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date_choose, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(go_button)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logout_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(movpic)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(go_button)
                            .addComponent(date_choose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(location_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(screen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void username_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_username_txtKeyTyped
        // TODO add your handling code here:
        if(' '==evt.getKeyChar())
        {
            evt.consume();
        }
    }//GEN-LAST:event_username_txtKeyTyped

    private void updateprofile_panelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_updateprofile_panelComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_updateprofile_panelComponentShown
    private void calling()
    {
//        JOptionPane.showMessageDialog(null,Integer.parseInt(hall)+".");
        //hallid=Integer.parseInt(hall);
        String som="select chname from cinemahall where challid=?;";
        try
        {
            pst=conn.prepareStatement(som);
            pst.setString(1,Integer.toString(hallid));
            rs=pst.executeQuery();
            int count=0;
            if(rs.next())
            {
                hall=rs.getNString(1);
            }
            location_combo.setModel(location);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        seat s=new seat(username,this);
        s.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }
    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
        // TODO add your handling code here:        
        if(password_txt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter password in the password field");
            return;
        }
        if(fname_txt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter First Name in the field");
            return;
        }
        if(lname_txt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter Last Name in the field");
            return;
        }
        if(!password_txt.getText().equals(repass_txt.getText()))
        {
            JOptionPane.showMessageDialog(null,"Passwords do not match");
            password_txt.setText("");
            repass_txt.setText("");
            return;
        }
        String sql = "update customer set password=?,firstname=?,lastname=? where username=?;";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,password_txt.getText());
            pst.setString(2,fname_txt.getText());
            pst.setString(3,lname_txt.getText());
            pst.setString(4,username);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Updated Successfully");
            password_txt.setText("");
            repass_txt.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_update_buttonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        JPanel temp=new JPanel();
        screen.setViewportView(temp);
       // JPanel a=new javax.swing.JPanel();
	//a.setLayout(new BoxLayout(a,BoxLayout.Y_AXIS));
        a.setLayout(new BoxLayout(a, BoxLayout.Y_AXIS));
        a.setSize(438,224);
        b.setLayout(new BoxLayout(b, BoxLayout.X_AXIS));
//        JButton b = new javax.swing.JButton("Hello world!");
//        JButton c = new javax.swing.JButton("Hello world!");
//        JButton d = new javax.swing.JButton("Hello world!");
//        JButton e = new javax.swing.JButton("Hello world!");
//        JButton f = new javax.swing.JButton("Hello world!");
//        JButton g = new javax.swing.JButton("Hello world!");
//        JButton h = new javax.swing.JButton("Hello world!");
//        JButton i = new javax.swing.JButton("Hello world!");
//        JButton j = new javax.swing.JButton("Hello world!");
//        JButton k = new javax.swing.JButton("Hello world!");
//        JButton l = new javax.swing.JButton("Hello world!");
//        JButton m = new javax.swing.JButton("Hello world!");
//        JButton n = new javax.swing.JButton("Hello world!");
//        JButton o = new javax.swing.JButton("Hello world!");
//        JButton p = new javax.swing.JButton("Hello world!");
//        JButton q = new javax.swing.JButton("Hello world!");
//        a.add((Component)b);
//        a.add((Component)c);
//        a.add((Component)d);
//        a.add((Component)e);
//        a.add((Component)f);
//        a.add((Component)g);
//        a.add((Component)h);
//        a.add((Component)i);
//        a.add((Component)j);
//        a.add((Component)k);
//        a.add((Component)l);
//        a.add((Component)m);
//        a.add((Component)n);
//        a.add((Component)o);
//        a.add((Component)p);
//        a.add((Component)q);
//        
//        a.setAutoscrolls(true);
//        //JScrollPane sp=new javax.swing.JScrollPane(a);
//        //screen.add(sp,0);
//        //screen.setViewportView(a);
//        screen.getViewport().add(a);
//        screen.repaint();
//        screen.updateUI();
        java.util.Date daty=new Date(System.currentTimeMillis());
        //System.out.println(dat);
        date_choose.setDate(daty);
        date_choose.setMinSelectableDate(daty);
        String loc="select distinct(chlocation) from cinemahall;";
        try
        {
            pst=conn.prepareStatement(loc);
            rs=pst.executeQuery();
            int count=0;
            while(rs.next())
            {
                location.addElement(rs.getNString(1));
                if(count==0)
                {
                    location.setSelectedItem(rs.getNString(1));
                    count++;
                }
            }
            location_combo.setModel(location);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        //location.
        String sql = "select * from customer where username=?;";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,username);
            //pst.setString(2,password_txt.getText());
            rs = pst.executeQuery();
            
            if (rs.next())
            {
                username_txt.setText(rs.getNString("username"));
                fname_txt.setText(rs.getNString("firstname"));
                lname_txt.setText(rs.getNString("lastname"));
                mail_txt.setText(rs.getNString("emailid"));
                //JOptionPane.showMessageDialog(null, "username and password are correct");
//                String pass=password_txt.getText();
//                if (rs.getNString("password").equals(pass))
//                {
//                    JOptionPane.showMessageDialog(null, "username and password are correct");
//                    String username=username_txt.getText();
//                    mainpage mainp=new mainpage(username);
//                    mainp.setVisible(true);
//                }
//                else
//                {
//                    JOptionPane.showMessageDialog(null, "Either username or password is incorrect");
//                }
                
            }
//            else
//            {
//                JOptionPane.showMessageDialog(null, "no username");
//            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        // TODO add your handling code here:
        String moviepic="select movieid from movie order by movieid";
        JButton[] movie=new JButton[100];
        try
        {
            pst = conn.prepareStatement(moviepic);
            rs=pst.executeQuery();
            while (rs.next())
            {
                int i=rs.getInt(1);
                String movno=Integer.toString(i);
//                System.out.println(movno);
                movie[i]=new JButton();
                movie[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/moviepos/"+movno+".jpg")));
                movie[i].addActionListener(listen);
                b.add((Component)movie[i]);
               
            }
             b.setAutoscrolls(true);
        }
        catch(Exception e)
        { 
            JOptionPane.showMessageDialog(null, e);
        }
//        String ik="1";
//        JButton d = new javax.swing.JButton();
//        JButton e = new javax.swing.JButton();
//        JButton f = new javax.swing.JButton();
//        JButton g = new javax.swing.JButton();
//        JButton h = new javax.swing.JButton();
//        JButton i = new javax.swing.JButton();
//        d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/"+ik+".jpg")));
//        e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/TheNunPoster.jpg")));
//        f.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/TheNunPoster.jpg")));
//        g.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/TheNunPoster.jpg")));
//        h.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/TheNunPoster.jpg")));
//        i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/TheNunPoster.jpg")));
//        b.add((Component)d);
//        b.add((Component)e);
//        b.add((Component)f);
//        b.add((Component)g);
//        b.add((Component)h);
//        b.add((Component)i);
        
//        b.setAutoscrolls(true);
        //JScrollPane sp=new javax.swing.JScrollPane(a);
        //screen.add(sp,0);
        //screen.setViewportView(a);
        movpic.getViewport().add(b);
        movpic.repaint();
        movpic.updateUI();

//thenun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/TheNunPoster.jpg")));
        

//thenun.setIcon(abc);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowClosed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        // TODO add your handling code here:
        log.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void go_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_buttonActionPerformed
        // TODO add your handling code here:
//        JButton b = new javax.swing.JButton("Hello");
//        Component a=b;
//        screen.add(a, 0);

//        JPanel a=new javax.swing.JPanel();
//        a.setPreferredSize(new Dimension(500, 75));
//	a.setLayout(new FlowLayout());
//        JButton b = new javax.swing.JButton("Hello world!");
//        a.add((Component)b);
//        a.updateUI();
//        screen.setViewportView(a);
//        screen.updateUI();
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
//        javaDate date = new Date();  
//        //System.out.println(formatter.format(date));  
//        date_choose.set'
        a.removeAll();
        java.util.Date date=date_choose.getDate();
        String dd=Integer.toString(date.getDate());
        String mm=Integer.toString(date.getMonth()+1);
        String yy=Integer.toString(date.getYear()+1900);
       
        //System.out.println(yy);
        String book_date=yy+"-"+mm+"-"+dd;
        dat=book_date;
        
        String find="select s.challid,c.chname from screening s inner join cinemahall c on s.challid=c.challid where c.chlocation=? and s.movieid=? and s.date=? group by s.challid;";
        int count=0;
        try
        {
            pst = conn.prepareStatement(find);
            pst.setString(1,(String)location.getSelectedItem());
            pst.setString(2,Integer.toString(movieno));
            pst.setString(3,book_date);
            rs = pst.executeQuery();
            //JOptionPane.showMessageDialog(null,location.getSelectedItem());
//            System.out.println(book_date);
            while(rs.next())
            {
////                System.out.println(rs.getInt(1));
//                JOptionPane.showMessageDialog(null,movieno);
                PreparedStatement p;
                ResultSet r;
                String insert="";
                String show="select distinct(time) from screening where challid=? and movieid=? and date=? order by time";
                try
                {
                    p=conn.prepareStatement(show);
                    String temp=Integer.toString(rs.getInt(1));
                    p.setString(1,temp);
                    p.setString(2,Integer.toString(movieno));
                    p.setString(3,book_date);
                    r=p.executeQuery();
                    while(r.next())
                    {
                        String t=Integer.toString(r.getInt(1));
                        insert=insert+" "+t;
//                        System.out.println(insert);
                    }                    
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null,ex);
                }
                s[count]=new JButton(rs.getInt(1)+"."+ rs.getNString(2) +"\n"+insert);
                s[count].addActionListener(halllisten);
                a.add((Component)s[count]);
                count++;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        a.updateUI();
        screen.getViewport().add(a);
        screen.repaint();
        screen.updateUI();
    }//GEN-LAST:event_go_buttonActionPerformed

    private void date_chooseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_date_chooseMouseClicked
        // TODO add your handling code here:
  
    }//GEN-LAST:event_date_chooseMouseClicked

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
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser date_choose;
    private javax.swing.JTextField fname_txt;
    private javax.swing.JLabel genre_label;
    private javax.swing.JButton go_button;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField lname_txt;
    private javax.swing.JComboBox<String> location_combo;
    private javax.swing.JButton logout_button;
    private javax.swing.JTextField mail_txt;
    private javax.swing.JTextArea mdesc_label;
    private javax.swing.JLabel mname_label;
    private javax.swing.JPanel movie_desc;
    private javax.swing.JScrollPane movpic;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JPasswordField repass_txt;
    public javax.swing.JScrollPane screen;
    private javax.swing.JButton update_button;
    private javax.swing.JPanel updateprofile_panel;
    private javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
}
