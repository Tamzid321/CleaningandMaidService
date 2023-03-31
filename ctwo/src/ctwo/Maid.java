
package ctwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
public class Maid extends javax.swing.JFrame {
 
    private Statement st;
    private ResultSet rs;
     private Connection con;
     
    public Maid() {
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
          
            String s="select * from Maid";
            rs=st.executeQuery(s);
            while(rs.next()){
            String id=String.valueOf(rs.getInt("MaidId"));
            String name=rs.getString("MaidName");
            String cnumb=rs.getString("MaidContactNumber");
            String email=rs.getString("MaidEmail");
            String nid=rs.getString("MaidNidNumber");
            String sec=String.valueOf(rs.getInt("MaidSection"));
            
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
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        allstaff = new javax.swing.JScrollPane();
        allStaffTable = new javax.swing.JTable();
        delete_tfld = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        search_fld = new javax.swing.JTextField();

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
        back_button.setBounds(0, 0, 49, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("log out");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(174, 727, 50, 20);

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 260, 760);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(255, 204, 51));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("All Maids");
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(260, 200, 230, 40);

        jLabel5.setText(",");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(554, 78, 316, 54);

        jLabel6.setBackground(new java.awt.Color(255, 204, 51));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Baby sitting");
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(260, 260, 230, 33);

        jLabel7.setBackground(new java.awt.Color(255, 204, 51));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("House Maid");
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(260, 320, 230, 33);

        jLabel10.setBackground(new java.awt.Color(255, 204, 102));
        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText(" After Party & Event Cleaning");
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(260, 440, 233, 33);

        jLabel11.setBackground(new java.awt.Color(255, 204, 51));
        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Attendant for elderly,patient");
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(260, 380, 230, 33);

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
        allstaff.setBounds(520, 60, 740, 590);

        delete_tfld.setText("to delete an entry write the  ID of the staff here");
        delete_tfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_tfldActionPerformed(evt);
            }
        });
        jPanel1.add(delete_tfld);
        delete_tfld.setBounds(270, 690, 290, 30);

        delete.setText("delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(570, 700, 63, 23);

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
        jLabel14.setBounds(260, 500, 230, 33);

        search_fld.setText("Search by name or id");
        search_fld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_fldKeyReleased(evt);
            }
        });
        jPanel1.add(search_fld);
        search_fld.setBounds(270, 50, 200, 40);

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
          
            String s="select * from Maid";
            rs=st.executeQuery(s);
            while(rs.next()){
            String id=String.valueOf(rs.getInt("MaidId"));
            String name=rs.getString("MaidName");
            String cnumb=rs.getString("MaidContactNumber");
            String email=rs.getString("MaidEmail");
            String nid=rs.getString("MaidNidNumber");
            String sec=String.valueOf(rs.getInt("MaidSection"));
            
            String tbData[]={id,name,cnumb,email,nid,sec};
            
            StaffTable.addRow(tbData);
            }
        }catch(Exception e){
            System.out.println("e.getmessage");
        }
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
          DefaultTableModel StaffTable=(DefaultTableModel)allStaffTable.getModel();
            StaffTable.setRowCount(0);
        try{
          
           
            String s="select * from Maid where MaidSection=10 ";
            rs=st.executeQuery(s);
            while(rs.next()){
            String id=String.valueOf(rs.getInt("MaidId"));
            String name=rs.getString("MaidName");
            String cnumb=rs.getString("MaidContactNumber");
            String email=rs.getString("MaidEmail");
            String nid=rs.getString("MaidNidNumber");
            String sec=String.valueOf(rs.getInt("MaidSection"));
            String tbData[]={id,name,cnumb,email,nid,sec};
            StaffTable.addRow(tbData);
            }
        }catch(Exception e){
            System.out.println("e.getmessage");
        }
    }//GEN-LAST:event_jLabel6MouseClicked

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
 
         String s="delete from Maid where MaidId=?";
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
            String s="select * from Maid where not exists(select * from MaidTask where CurrentStatus='ongoing' and Maid.MaidId=MaidTask.MaidId)";
            rs=st.executeQuery(s);
            while(rs.next()){
            String id=String.valueOf(rs.getInt("MaidId"));
            String name=rs.getString("MaidName");
            String cnumb=rs.getString("MaidContactNumber");
            String email=rs.getString("MaidEmail");
            String nid=rs.getString("MaidNidNumber");
            String sec=String.valueOf(rs.getInt("MaidSection"));
            
            String tbData[]={id,name,cnumb,email,nid,sec};
           
            StaffTable.addRow(tbData);
            }
            
           
           
        }catch(Exception e){
            System.out.println("e.getmessage");
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
          DefaultTableModel StaffTable=(DefaultTableModel)allStaffTable.getModel();
            StaffTable.setRowCount(0);
         try{
          
           
            String s="select * from Maid where MaidSection=11 ";
            rs=st.executeQuery(s);
            while(rs.next()){
            String id=String.valueOf(rs.getInt("MaidId"));
            String name=rs.getString("MaidName");
            String cnumb=rs.getString("MaidContactNumber");
            String email=rs.getString("MaidEmail");
            String nid=rs.getString("MaidNidNumber");
            String sec=String.valueOf(rs.getInt("MaidSection"));
            String tbData[]={id,name,cnumb,email,nid,sec};
            StaffTable.addRow(tbData);
            }
        }catch(Exception e){
            System.out.println("e.getmessage");
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
         DefaultTableModel StaffTable=(DefaultTableModel)allStaffTable.getModel();
            StaffTable.setRowCount(0);
         try{
           
           
            String s="select * from Maid where MaidSection=12";
            rs=st.executeQuery(s);
            while(rs.next()){
            String id=String.valueOf(rs.getInt("MaidId"));
            String name=rs.getString("MaidName");
            String cnumb=rs.getString("MaidContactNumber");
            String email=rs.getString("MaidEmail");
            String nid=rs.getString("MaidNidNumber");
            String sec=String.valueOf(rs.getInt("MaidSection"));
            String tbData[]={id,name,cnumb,email,nid,sec};
            StaffTable.addRow(tbData);
            }
        }catch(Exception e){
            System.out.println("e.getmessage");
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
         DefaultTableModel StaffTable=(DefaultTableModel)allStaffTable.getModel();
          StaffTable.setRowCount(0);
         try{
           
           
            String s="select * from Maid where MaidSection=9 ";
            rs=st.executeQuery(s);
            while(rs.next()){
            String id=String.valueOf(rs.getInt("MaidId"));
            String name=rs.getString("MaidName");
            String cnumb=rs.getString("MaidContactNumber");
            String email=rs.getString("MaidEmail");
            String nid=rs.getString("MaidNidNumber");
            String sec=String.valueOf(rs.getInt("MaidSection"));
            String tbData[]={id,name,cnumb,email,nid,sec};
            StaffTable.addRow(tbData);
            }
        }catch(Exception e){
            System.out.println("e.getmessage");
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_back_buttonMouseClicked

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        menu as=new menu();
        as.setVisible(true);
        new Maid().setVisible(false);
        dispose();
    }//GEN-LAST:event_back_buttonActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        start as=new start();
        as.setVisible(true);
        new Maid().setVisible(false);
        dispose();

    }//GEN-LAST:event_jLabel8MouseClicked

    private void search_fldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_fldKeyReleased
        // TODO add your handling code here:
       
            DefaultTableModel StaffTable=(DefaultTableModel)allStaffTable.getModel();
          StaffTable.setRowCount(0);
          try{int n1=Integer.parseInt(search_fld.getText());
                 String s="select * from Maid";
            rs=st.executeQuery(s);
            while(rs.next()){
            String id=String.valueOf(rs.getInt("MaidId"));
            String name=rs.getString("MaidName");
           
            if(id.startsWith(search_fld.getText())){
           String cnumb=rs.getString("MaidContactNumber");
            String email=rs.getString("MaidEmail");
            String nid=rs.getString("MaidNidNumber");
            String sec=String.valueOf(rs.getInt("MaidSection"));
            
            String tbData[]={id,name,cnumb,email,nid,sec};
            StaffTable.addRow(tbData);
            }}
          
          }catch(Exception e1){
           try{
            String s="select * from Maid";
            rs=st.executeQuery(s);
            while(rs.next()){
            String id=String.valueOf(rs.getInt("MaidId"));
            String name=rs.getString("MaidName");
            String n=name.toLowerCase();
            if(n.startsWith(search_fld.getText().toLowerCase())){
           String cnumb=rs.getString("MaidContactNumber");
            String email=rs.getString("MaidEmail");
            String nid=rs.getString("MaidNidNumber");
            String sec=String.valueOf(rs.getInt("MaidSection"));
            
            String tbData[]={id,name,cnumb,email,nid,sec};
            StaffTable.addRow(tbData);
            }}
        }catch(Exception e){
            System.out.println("e.getmessage");
        }
          }
      
    }//GEN-LAST:event_search_fldKeyReleased

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
            java.util.logging.Logger.getLogger(Maid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maid().setVisible(true);
                
                  
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField search_fld;
    // End of variables declaration//GEN-END:variables
}
