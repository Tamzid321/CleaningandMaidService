package ctwo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
public class ClientOwn extends javax.swing.JFrame {
private Connection con;
    private Statement st;
    private ResultSet rs;
    int loginapproval = 0;
    int idd=0;
    String pw2;
    String iddd="";
    int cid;
    String j,cnum,email,nid,sec;
    public ClientOwn() {
        initComponents();
        setLocationRelativeTo(null);
         }

    
 public ClientOwn(String cid,String password) {
        initComponents();
         setLocationRelativeTo(null);
         jPanel2.setVisible(false);
        idd=Integer.parseInt(cid);
         pw2=password;
            try{
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CMS", "sa", "62625522");
       st=con.createStatement();
      
    }catch(Exception e)
    {
        System.out.println(e);
        
    } 
        
    ID.setText(cid);
    pw.setText(password);
       try {
           String query = " Select * FROM Client;";
           rs = st.executeQuery(query);
           
           while (rs.next() ) {
                  int d=rs.getInt("ClientId"); 
            
            if(String.valueOf(d).equals(cid)){
            //String name=rs.getString("Name");
           j=rs.getString("ClientName");
            idd=d;
             cnum=rs.getString("ClientContactNumber");
             email=rs.getString("ClientEmail");
             nid=rs.getString("TakenServices");
            sec=rs.getString("CLientAddress");
            ID.setText(String.valueOf(cid));
            Name.setText(j);
            Cn.setText(cnum);
            Ea.setText(email);
            Nn.setText(nid);
            Sc.setText(sec);
            }
           }  
            } catch (Exception e) {
                System.out.println(e);
            }
       
       
 }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Cn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Ea = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Nn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Sc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        pw = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cnumb = new javax.swing.JButton();
        snumb = new javax.swing.JButton();
        cname = new javax.swing.JButton();
        sname = new javax.swing.JButton();
        cea = new javax.swing.JButton();
        sea = new javax.swing.JButton();
        cpass = new javax.swing.JButton();
        spass = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1228, 780));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("log out");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13);
        jLabel13.setBounds(174, 727, 50, 20);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cleaning & ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 190, 210, 100);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Maid Service");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 280, 230, 60);

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 260, 760);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("ID");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(61, 141, 68, 32);

        ID.setEditable(false);
        ID.setOpaque(false);
        jPanel1.add(ID);
        ID.setBounds(167, 142, 130, 32);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(61, 216, 51, 15);

        Name.setEditable(false);
        Name.setOpaque(false);
        jPanel1.add(Name);
        Name.setBounds(177, 208, 110, 32);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Contact Number");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(61, 288, 111, 15);

        Cn.setEditable(false);
        Cn.setOpaque(false);
        Cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CnActionPerformed(evt);
            }
        });
        jPanel1.add(Cn);
        Cn.setBounds(177, 282, 110, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Email address");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(61, 379, 94, 15);

        Ea.setEditable(false);
        Ea.setOpaque(false);
        Ea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EaActionPerformed(evt);
            }
        });
        jPanel1.add(Ea);
        Ea.setBounds(177, 368, 110, 35);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Taken Service");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(61, 453, 94, 15);

        Nn.setEditable(false);
        Nn.setOpaque(false);
        jPanel1.add(Nn);
        Nn.setBounds(177, 440, 110, 33);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Address");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(61, 512, 51, 15);

        Sc.setEditable(false);
        Sc.setOpaque(false);
        jPanel1.add(Sc);
        Sc.setBounds(177, 506, 110, 29);

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(61, 634, 80, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Password");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(61, 561, 101, 15);

        pw.setEditable(false);
        pw.setOpaque(false);
        jPanel1.add(pw);
        pw.setBounds(177, 555, 110, 29);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        cnumb.setBackground(new java.awt.Color(255, 204, 51));
        cnumb.setText("Edit");
        cnumb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnumbActionPerformed(evt);
            }
        });

        snumb.setBackground(new java.awt.Color(255, 204, 102));
        snumb.setText("Save");
        snumb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snumbActionPerformed(evt);
            }
        });

        cname.setBackground(new java.awt.Color(255, 204, 51));
        cname.setText("Edit");
        cname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnameActionPerformed(evt);
            }
        });

        sname.setBackground(new java.awt.Color(255, 204, 102));
        sname.setText("Save");
        sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameActionPerformed(evt);
            }
        });

        cea.setBackground(new java.awt.Color(255, 204, 51));
        cea.setText("Edit");
        cea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceaActionPerformed(evt);
            }
        });

        sea.setBackground(new java.awt.Color(255, 204, 102));
        sea.setText("Save");
        sea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seaActionPerformed(evt);
            }
        });

        cpass.setBackground(new java.awt.Color(255, 204, 51));
        cpass.setText("Edit");
        cpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpassActionPerformed(evt);
            }
        });

        spass.setBackground(new java.awt.Color(255, 204, 102));
        spass.setText("Save");
        spass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cnumb)
                        .addGap(58, 58, 58)
                        .addComponent(snumb))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cpass)
                        .addGap(58, 58, 58)
                        .addComponent(spass))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cea)
                        .addGap(58, 58, 58)
                        .addComponent(sea))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cname)
                        .addGap(58, 58, 58)
                        .addComponent(sname)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cname)
                    .addComponent(sname))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnumb)
                    .addComponent(snumb))
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cea)
                    .addComponent(sea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpass)
                    .addComponent(spass))
                .addGap(26, 26, 26))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(310, 150, 186, 457);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Place a Order");
        jLabel12.setOpaque(true);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12);
        jLabel12.setBounds(190, 630, 259, 33);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(260, 0, 1010, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CnActionPerformed

    private void EaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     
        jPanel2.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnameActionPerformed
        // TODO add your handling code here:
         Name.setEditable(true);
    }//GEN-LAST:event_cnameActionPerformed

    private void cnumbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnumbActionPerformed
        // TODO add your handling code here:
         Cn.setEditable(true);
    }//GEN-LAST:event_cnumbActionPerformed

    private void ceaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceaActionPerformed
        // TODO add your handling code here:
         Ea.setEditable(true);
    }//GEN-LAST:event_ceaActionPerformed

    private void cpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpassActionPerformed
        // TODO add your handling code here:
           pw.setEditable(true);
    }//GEN-LAST:event_cpassActionPerformed

    private void snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameActionPerformed
        // TODO add your handling code here:
        String nm=Name.getText();
      
         try {
             System.out.println(idd);
           String query = "Update Client set ClientName=? where ClientId=?";
          PreparedStatement pst=con.prepareStatement(query);
        pst.setString(1,nm);
        pst.setInt(2, idd);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null,"Edited successfully");
          
            } catch (Exception e) {
                System.out.println(e);
            }
        
        
     
        
        
    }//GEN-LAST:event_snameActionPerformed

    private void snumbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snumbActionPerformed
        // TODO add your handling code here:
          String nm=Cn.getText();
      
         try {
             System.out.println(idd);
           String query = "Update Client set ClientContactNumber=? where ClientId=?";
          PreparedStatement pst=con.prepareStatement(query);
        pst.setString(1,nm);
        pst.setInt(2, idd);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null,"Edited successfully");
          
            } catch (Exception e) {
                System.out.println(e);
            }
        
        
       
    }//GEN-LAST:event_snumbActionPerformed

    private void seaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seaActionPerformed
        // TODO add your handling code here:
          String nm=Ea.getText();
        if (idd<2000){
         try {
             System.out.println(idd);
           String query = "Update Update Client set ClientEmail=? where ClientId=?";
          PreparedStatement pst=con.prepareStatement(query);
        pst.setString(1,nm);
        pst.setInt(2, idd);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null,"Edited successfully");
          
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
       
    }//GEN-LAST:event_seaActionPerformed

    private void spassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spassActionPerformed
        // TODO add your handling code here:
            String nm=pw.getText();
       
         try {
             System.out.println(idd);
           String query = "Update Clientlogin set UserPassword=? where ID=?";
          PreparedStatement pst=con.prepareStatement(query);
        pst.setString(1,nm);
        pst.setInt(2, idd);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null,"Edited successfully");
          
            } catch (Exception e) {
                System.out.println(e);
            }
        
        
        
    }//GEN-LAST:event_spassActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        start as=new start();
        as.setVisible(true);
        new ClientOwn().setVisible(false);
        dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        
        Client_ownorder c = new Client_ownorder(idd,j,cnum,email,sec);
        c.setVisible(true);
        new start().setVisible(false);
        dispose();
    }//GEN-LAST:event_jLabel12MouseClicked
    
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
            java.util.logging.Logger.getLogger(ClientOwn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientOwn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientOwn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientOwn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientOwn().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cn;
    private javax.swing.JTextField Ea;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Nn;
    private javax.swing.JTextField Sc;
    private javax.swing.JButton cea;
    private javax.swing.JButton cname;
    private javax.swing.JButton cnumb;
    private javax.swing.JButton cpass;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField pw;
    private javax.swing.JButton sea;
    private javax.swing.JButton sname;
    private javax.swing.JButton snumb;
    private javax.swing.JButton spass;
    // End of variables declaration//GEN-END:variables
}
