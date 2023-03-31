
package ctwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class AdminLogin extends javax.swing.JFrame {
private Connection con;
    private Statement st;
    private ResultSet rs;
    int loginapproval = 0;
    public AdminLogin() {
        initComponents();
         setLocationRelativeTo(null);
         
          try{
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
              
             //"jdbc:sqlserver://localhost:1433;\\SQLEXPRESS;databaseName=Tema6","sa","123456"\\selectMethod=cursor"
       con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CMS","sa","62625522");
       st=con.createStatement();
    }catch(Exception e)
    {
        //System.out.println(e);
    }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        username_tfld = new javax.swing.JTextField();
        password_tfld = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1228, 780));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username_tfld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username_tfld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                username_tfldFocusGained(evt);
            }
        });
        username_tfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_tfldActionPerformed(evt);
            }
        });
        jPanel1.add(username_tfld, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 339, 40));

        password_tfld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password_tfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_tfldActionPerformed(evt);
            }
        });
        jPanel1.add(password_tfld, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 340, 40));

        login.setBackground(new java.awt.Color(255, 204, 51));
        login.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        login.setText("login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 170, 30));

        back_button.setBackground(new java.awt.Color(255, 204, 0));
        back_button.setText("<<");
        back_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_buttonMouseClicked(evt);
            }
        });
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 60, -1));

        jTextField1.setBackground(new java.awt.Color(255, 204, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setText("Username:");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 247, 100, -1));

        jTextField2.setBackground(new java.awt.Color(255, 204, 204));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setText("Password:");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 307, 100, -1));

        jTextField3.setBackground(new java.awt.Color(255, 255, 0));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 210, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("ADMIN LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 190, 30));

        jTextField4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 530, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        start as=new start();
        as.setVisible(true);
        new AdminLogin().setVisible(false);
        dispose();
    }//GEN-LAST:event_back_buttonActionPerformed

    private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_back_buttonMouseClicked

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        String username = username_tfld.getText();
        String password = password_tfld.getText();
        if (username.isEmpty() || password.isEmpty())
        JOptionPane.showMessageDialog(null, "please give valid username and password");
        else {
            String query = "Select * FROM admin";
            try {
                rs = st.executeQuery(query);
                //     System.out.println("results from the query :");
                while (rs.next()) {
                    String uname = rs.getString("username");
                    String p = rs.getString("password");
                    System.out.println(uname + "   " + p);
                    if (username.equals(uname) && password.equals(p)) {
                        loginapproval = 1;
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            if (loginapproval == 1) {
                menu m = new menu();
                m.setVisible(true);
                new AdminLogin().setVisible(false);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "this account does not exist");
            }

        }
    }//GEN-LAST:event_loginActionPerformed

    private void password_tfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_tfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_tfldActionPerformed

    private void username_tfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_tfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_tfldActionPerformed

    private void username_tfldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_tfldFocusGained

    }//GEN-LAST:event_username_tfldFocusGained

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed
    
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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton login;
    private javax.swing.JTextField password_tfld;
    private javax.swing.JTextField username_tfld;
    // End of variables declaration//GEN-END:variables
}
