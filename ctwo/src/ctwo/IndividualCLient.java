/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctwo;

import java.sql.Connection;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Lenovo
 */
public class IndividualCLient extends javax.swing.JFrame {

    private Statement st;
    private ResultSet rs;
     private Connection con;
    /**
     * Creates new form Client
     */
    public IndividualCLient() {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display = new javax.swing.JTable();
        ClientId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 780));
        setMinimumSize(new java.awt.Dimension(1280, 780));
        setPreferredSize(new java.awt.Dimension(1280, 780));
        setResizable(false);
        getContentPane().setLayout(null);

        jTable_Display.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ClientId", "ClientName", "ClientContactNumber", "ClientEmail ", "TakenServices", "ClientAddress"
            }
        ));
        jTable_Display.setRowHeight(50);
        jTable_Display.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_DisplayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 210, 900, 383);

        ClientId.setText("your ID");
        ClientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientIdActionPerformed(evt);
            }
        });
        getContentPane().add(ClientId);
        ClientId.setBounds(130, 140, 260, 41);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 2, 36)); // NOI18N
        jLabel1.setText("Client Information");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(690, 50, 330, 44);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 70, 0, 0);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jButton1.setText("<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 60, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("log out");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(100, 790, 50, 20);

        jButton2.setText("see");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(420, 150, 49, 23);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ctwo/cleaning_spray_closeup.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 1230, 820);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_DisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_DisplayMouseClicked
        // TODO add your handling code here:
     
       
    }//GEN-LAST:event_jTable_DisplayMouseClicked

 
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
   
         this.dispose();
         AllClient obj = new  AllClient();
         obj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        start as=new start();
        as.setVisible(true);
        new IndividualCLient().setVisible(false);
        dispose();

    }//GEN-LAST:event_jLabel10MouseClicked

    private void ClientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientIdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel ClientTable=(DefaultTableModel)jTable_Display.getModel();
            ClientTable.setRowCount(0);
            
       try{   
          String i=ClientId.getText();
          int id=Integer.parseInt(i);
          String s="select * from Client where ClientId='"+i+"'";
           rs= st.executeQuery(s);
            while(rs.next()){System.out.println("line 180");
            String cid=String.valueOf(rs.getInt("ClientId"));
            String cname=rs.getString("ClientName");
            String cnumb=rs.getString("ClientContactNumber");
            String cemail=rs.getString("ClientEmail");
            String ts=rs.getString("TakenServices");
            String ca=rs.getString("ClientAddress");
                System.out.println(ca);
            String tbData[]={cid,cname,cnumb,cemail,ts,ca};
            ClientTable.addRow(tbData);
            }
       }
       
       catch(Exception e){
            System.out.println(e);
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
            java.util.logging.Logger.getLogger(IndividualCLient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndividualCLient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndividualCLient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndividualCLient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndividualCLient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ClientId;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display;
    // End of variables declaration//GEN-END:variables
}