package ctwo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
public class AddStaff1 extends javax.swing.JFrame {
private Connection con;
    private Statement st;
    private ResultSet rs;
    int loginapproval = 0;
    int idd=0;
    String pw2;
    String iddd="";
   

    
 public AddStaff1() {
        initComponents();
         setLocationRelativeTo(null);
        
    
            try{
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CMS", "sa", "62625522");
       st=con.createStatement();
      
    }catch(Exception e)
    {
        System.out.println(e);
        
    } 
          
 }
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
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
        back_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 220, 60, 30);

        Name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Name.setOpaque(false);
        jPanel1.add(Name);
        Name.setBounds(180, 210, 360, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Contact Number");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 290, 111, 17);

        Cn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Cn.setOpaque(false);
        Cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CnActionPerformed(evt);
            }
        });
        jPanel1.add(Cn);
        Cn.setBounds(180, 280, 360, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Email address");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 360, 94, 20);

        Ea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Ea.setOpaque(false);
        Ea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EaActionPerformed(evt);
            }
        });
        jPanel1.add(Ea);
        Ea.setBounds(180, 350, 360, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("NID Number");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 430, 94, 17);

        Nn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Nn.setOpaque(false);
        jPanel1.add(Nn);
        Nn.setBounds(180, 420, 360, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Section");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 490, 51, 17);

        Sc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Sc.setOpaque(false);
        jPanel1.add(Sc);
        Sc.setBounds(180, 480, 360, 40);

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(60, 560, 80, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(240, 0, 1010, 800);

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
        getContentPane().add(back_button);
        back_button.setBounds(10, 10, 49, 23);

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 260, 760);

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
           try{int h,ti=0,m1,m2,m3,m4,m5,m6,m7,m8;
            
          String n=Name.getText();
          String cm=Cn.getText();
          String em=Ea.getText();
          String nd=Nn.getText();
          int sc=Integer.parseInt(Sc.getText());
           String s="Insert into Maid (MaidName,MaidContactNumber,MaidEmail,MaidNidNumber,MaidSection) values(?,?,?,?,?)";
                PreparedStatement pst=con.prepareStatement(s);
                 pst.setString(1,n);
                 pst.setString(2,cm);
                 pst.setString(3,em);
                 pst.setString(4,nd);
                 pst.setInt(5,sc);
                 pst.executeUpdate();
       JOptionPane.showMessageDialog(null,"insert successful");
        }catch(Exception e){
            System.out.println(e);
             JOptionPane.showMessageDialog(null,"Please check the data again");
        }
        
      
       
       
       
      
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        start as=new start();
        as.setVisible(true);
        new AddStaff1().setVisible(false);
        dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_back_buttonMouseClicked

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
       AllstaffLIst as=new AllstaffLIst();
        as.setVisible(true);
        new Maid().setVisible(false);
        dispose();
    }//GEN-LAST:event_back_buttonActionPerformed
    
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
            java.util.logging.Logger.getLogger(AddStaff1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStaff1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStaff1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStaff1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStaff1().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cn;
    private javax.swing.JTextField Ea;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Nn;
    private javax.swing.JTextField Sc;
    private javax.swing.JButton back_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
