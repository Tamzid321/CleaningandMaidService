
package ctwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
public class AllstaffLIst extends javax.swing.JFrame {
 
    private Statement st;
    private ResultSet rs;
     private Connection con;
     
    public AllstaffLIst() {
        initComponents();
         
         setLocationRelativeTo(null);
       allstaff.setVisible(false);
       
     
          try{
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CMS", "sa", "62625522");
       st=con.createStatement();
    }catch(Exception e)
    {
        System.out.println(e);
    }
         
              DefaultTableModel StaffTable=(DefaultTableModel)allStaffTable.getModel();
         StaffTable.setRowCount(0);
        try{
            allstaff.setVisible(true);
            String s="select * from Cleaningstaff union select * from Maid";
            rs=st.executeQuery(s);
            while(rs.next()){
            String id=String.valueOf(rs.getInt("CstaffId"));
            String name=rs.getString("CstaffName");
            String cnumb=rs.getString("CstaffContactNumber");
            String email=rs.getString("CstaffEmail");
            String nid=rs.getString("CstaffNidNumber");
            String sec=String.valueOf(rs.getInt("CstaffSection"));
            
            String tbData[]={id,name,cnumb,email,nid,sec};
            StaffTable.addRow(tbData);
            }
        }catch(Exception e){
            System.out.println("e.getmessage");
        }
      
    
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        allstaff = new javax.swing.JScrollPane();
        allStaffTable = new javax.swing.JTable();
        delete_tfld = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        search_fld = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1228, 780));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Maid Service");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 280, 230, 60);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cleaning & ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 190, 210, 100);

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
        back_button.setBounds(0, 0, 70, 30);

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 260, 760);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(255, 204, 51));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText(" All staff");
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 130, 190, 30);

        allStaffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Contact Number", "Email", "Nid number", "Section"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        allStaffTable.setGridColor(new java.awt.Color(255, 255, 255));
        allstaff.setViewportView(allStaffTable);
        if (allStaffTable.getColumnModel().getColumnCount() > 0) {
            allStaffTable.getColumnModel().getColumn(0).setPreferredWidth(35);
            allStaffTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            allStaffTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            allStaffTable.getColumnModel().getColumn(3).setPreferredWidth(200);
            allStaffTable.getColumnModel().getColumn(4).setPreferredWidth(100);
            allStaffTable.getColumnModel().getColumn(5).setPreferredWidth(65);
        }

        jPanel1.add(allstaff);
        allstaff.setBounds(480, 40, 690, 550);

        delete_tfld.setText("  to delete write the  ID ");
        delete_tfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_tfldActionPerformed(evt);
            }
        });
        jPanel1.add(delete_tfld);
        delete_tfld.setBounds(290, 270, 140, 40);

        delete.setText("delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(960, 290, 63, 23);

        jLabel14.setBackground(new java.awt.Color(255, 204, 51));
        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setText("List of unassigned staffs");
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14);
        jLabel14.setBounds(270, 90, 193, 33);

        search_fld.setText("Search by name or Id");
        search_fld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_fldKeyReleased(evt);
            }
        });
        jPanel1.add(search_fld);
        search_fld.setBounds(290, 40, 140, 40);

        jLabel15.setBackground(new java.awt.Color(255, 204, 51));
        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setText("Add Maid");
        jLabel15.setOpaque(true);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15);
        jLabel15.setBounds(270, 220, 190, 33);

        jLabel16.setBackground(new java.awt.Color(255, 204, 51));
        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setText("Add cleaning staff");
        jLabel16.setOpaque(true);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16);
        jLabel16.setBounds(270, 170, 190, 33);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("log out");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(490, 610, 70, 30);

        jTextField1.setBackground(new java.awt.Color(255, 0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(480, 610, 90, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -10, 1370, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
         DefaultTableModel StaffTable=(DefaultTableModel)allStaffTable.getModel();
         StaffTable.setRowCount(0);
        try{
            allstaff.setVisible(true);
            String s="select * from Cleaningstaff union select * from Maid";
            rs=st.executeQuery(s);
            while(rs.next()){
            String id=String.valueOf(rs.getInt("CstaffId"));
            String name=rs.getString("CstaffName");
            String cnumb=rs.getString("CstaffContactNumber");
            String email=rs.getString("CstaffEmail");
            String nid=rs.getString("CstaffNidNumber");
            String sec=String.valueOf(rs.getInt("CstaffSection"));
            
            String tbData[]={id,name,cnumb,email,nid,sec};
            StaffTable.addRow(tbData);
            }
        }catch(Exception e){
            System.out.println("e.getmessage");
        }
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void delete_tfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_tfldActionPerformed
        // TODO add your handling code here:
       delete_tfld.setText(" ");
    }//GEN-LAST:event_delete_tfldActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try{
        String todelete=delete_tfld.getText();
        int tdd=Integer.parseInt(todelete);  
        
        if(todelete.startsWith("1")){
 
         String s="delete from Cleaningstaff where CstaffId=?";
        PreparedStatement pst=con.prepareStatement(s);
        pst.setInt(1,tdd);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null,"Record deleted successfully");
        
        
        }
         if(todelete.startsWith("2")){
        String s="delete from Maid where MaidId=tdd";
        PreparedStatement pst=con.prepareStatement(s);
        pst.setInt(1,tdd);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null,"Record deleted successfully");
    }   }catch(Exception e){
          
             JOptionPane.showMessageDialog(null,"This record can't be deleted.Try to delete  data of this id from other tables first");
        }
        
    }//GEN-LAST:event_deleteActionPerformed
    
    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
         DefaultTableModel StaffTable=(DefaultTableModel)allStaffTable.getModel();
         StaffTable.setRowCount(0);
         try{
            allstaff.setVisible(true);
            String s="select * from Cleaningstaff where not exists(select Team.*,Project.ProjectId,Project.CurrentStatus from team left join project on team.TeamId=Project.TeamId where Project.CurrentStatus='ongoing' and (CstaffId=Member1 or CstaffId=Member2 or CstaffId=Member3 or CstaffId=Member4 or CstaffId=Member5 or CstaffId=Member6 or CstaffId=Member7 or CstaffId=Member8 or CstaffId=HeadOfTheTeam));";
            rs=st.executeQuery(s);
            while(rs.next()){
            String id=String.valueOf(rs.getInt("CstaffId"));
            String name=rs.getString("CstaffName");
            String cnumb=rs.getString("CstaffContactNumber");
            String email=rs.getString("CstaffEmail");
            String nid=rs.getString("CstaffNidNumber");
            String sec=String.valueOf(rs.getInt("CstaffSection"));
            
            String tbData[]={id,name,cnumb,email,nid,sec};
           
            StaffTable.addRow(tbData);
            }
            
           
           
        }catch(Exception e){
            System.out.println("e.getmessage");
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteMouseClicked

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        menu as=new menu();
        as.setVisible(true);
        new AllstaffLIst().setVisible(false);
        dispose();
    }//GEN-LAST:event_back_buttonActionPerformed

    private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_back_buttonMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        start as=new start();
        as.setVisible(true);
        new AllstaffLIst().setVisible(false);
        dispose();

    }//GEN-LAST:event_jLabel7MouseClicked

    private void search_fldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_fldKeyReleased
        // TODO add your handling code here:
              DefaultTableModel StaffTable=(DefaultTableModel)allStaffTable.getModel();
         StaffTable.setRowCount(0);
         try{
              int n1=Integer.parseInt(search_fld.getText());
              try{
            allstaff.setVisible(true);
            String s="select * from Cleaningstaff union select * from Maid";
            rs=st.executeQuery(s);
            while(rs.next()){
            String id=String.valueOf(rs.getInt("CstaffId"));
            String name=rs.getString("CstaffName");
            
             if(id.startsWith(search_fld.getText())){
            String cnumb=rs.getString("CstaffContactNumber");
            String email=rs.getString("CstaffEmail");
            String nid=rs.getString("CstaffNidNumber");
            String sec=String.valueOf(rs.getInt("CstaffSection"));
            
            String tbData[]={id,name,cnumb,email,nid,sec};
            StaffTable.addRow(tbData);
            }}
        }catch(Exception e1){
            System.out.println(e1);
        }
         }catch(Exception e){
             
        try{
            allstaff.setVisible(true);
            String s="select * from Cleaningstaff union select * from Maid";
            rs=st.executeQuery(s);
            while(rs.next()){
            String id=String.valueOf(rs.getInt("CstaffId"));
            String name=rs.getString("CstaffName");
            String n=name.toLowerCase();
             if(n.startsWith(search_fld.getText().toLowerCase())){
            String cnumb=rs.getString("CstaffContactNumber");
            String email=rs.getString("CstaffEmail");
            String nid=rs.getString("CstaffNidNumber");
            String sec=String.valueOf(rs.getInt("CstaffSection"));
            
            String tbData[]={id,name,cnumb,email,nid,sec};
            StaffTable.addRow(tbData);
            }}
        }catch(Exception e1){
            System.out.println(e1);
        }
         }
      
    }//GEN-LAST:event_search_fldKeyReleased

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
            AddStaff1 ad=new AddStaff1();
        ad.setVisible(true);
         new AllstaffLIst().setVisible(false);
         dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        AddStaff ad=new AddStaff();
        ad.setVisible(true);
         new AllstaffLIst().setVisible(false);
         dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(AllstaffLIst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllstaffLIst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllstaffLIst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllstaffLIst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllstaffLIst().setVisible(true);
                
                  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allStaffTable;
    private javax.swing.JScrollPane allstaff;
    private javax.swing.JButton back_button;
    private javax.swing.JButton delete;
    private javax.swing.JTextField delete_tfld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField search_fld;
    // End of variables declaration//GEN-END:variables
}
