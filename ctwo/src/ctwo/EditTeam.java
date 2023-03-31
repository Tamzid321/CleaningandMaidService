
package ctwo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
public class EditTeam extends javax.swing.JFrame {
 
    private Statement st;
    private ResultSet rs;
     private Connection con;
     
    public EditTeam() {
        initComponents();
         
         setLocationRelativeTo(null);
       allstaff.setVisible(false);
       workingTeam.setVisible(false);
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

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        workingTeam = new javax.swing.JScrollPane();
        workingTeamTable = new javax.swing.JTable();
        allstaff = new javax.swing.JScrollPane();
        allStaffTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

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

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 260, 760);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(255, 204, 51));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("See Teams");
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(260, 140, 140, 30);

        jLabel5.setText(",");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(554, 78, 316, 54);

        workingTeamTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Team ID", "ProojectId"
            }
        ));
        workingTeam.setViewportView(workingTeamTable);

        jPanel1.add(workingTeam);
        workingTeam.setBounds(550, 70, 690, 590);

        allStaffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Team ID", "Head", "Member1", "Member2", "Member3", "Member4", "Member5", "Member6", "Member7", "Member8"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        allstaff.setViewportView(allStaffTable);
        if (allStaffTable.getColumnModel().getColumnCount() > 0) {
            allStaffTable.getColumnModel().getColumn(9).setResizable(false);
        }

        jPanel1.add(allstaff);
        allstaff.setBounds(550, 70, 690, 590);

        jLabel6.setBackground(new java.awt.Color(255, 204, 51));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Teams that are currently on work");
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(260, 40, 270, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("Team Id");
        jPanel2.add(jTextField10);
        jTextField10.setBounds(10, 0, 240, 30);

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField17);
        jTextField17.setBounds(20, 300, 90, 30);
        jPanel2.add(jTextField11);
        jTextField11.setBounds(20, 50, 90, 40);
        jPanel2.add(jTextField13);
        jTextField13.setBounds(20, 140, 90, 30);

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField15);
        jTextField15.setBounds(20, 220, 90, 30);

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField12);
        jTextField12.setBounds(20, 100, 90, 30);

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField14);
        jTextField14.setBounds(20, 180, 90, 30);
        jPanel2.add(jTextField16);
        jTextField16.setBounds(20, 260, 90, 30);
        jPanel2.add(jTextField18);
        jTextField18.setBounds(20, 340, 90, 30);

        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(jTextField19);
        jTextField19.setBounds(20, 380, 90, 30);

        jLabel7.setText("Head of the Team");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(130, 380, 100, 20);

        jLabel8.setText("Member1");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(130, 60, 60, 14);

        jLabel9.setText("Member2");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(130, 110, 60, 14);

        jLabel10.setText("Member3");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(130, 150, 60, 14);

        jLabel11.setText("Member4");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(130, 190, 60, 14);

        jLabel12.setText("Member5");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(130, 234, 60, 20);

        jLabel13.setText("Member6");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(130, 270, 60, 20);

        jLabel14.setText("Member7");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(130, 300, 60, 20);

        jLabel16.setText("Member8");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(130, 340, 60, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(270, 180, 260, 450);

        jButton1.setBackground(new java.awt.Color(255, 204, 51));
        jButton1.setText("Save Changes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(280, 640, 170, 23);

        jLabel15.setBackground(new java.awt.Color(255, 204, 51));
        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setText("Update team info");
        jLabel15.setOpaque(true);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15);
        jLabel15.setBounds(260, 90, 190, 33);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -10, 1370, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
          DefaultTableModel StaffTable=(DefaultTableModel)allStaffTable.getModel();
            StaffTable.setRowCount(0);
        try{workingTeam.setVisible(false);
            allstaff.setVisible(true);
          
            String s="select * from Team";
            rs=st.executeQuery(s);
            while(rs.next()){
            String id=String.valueOf(rs.getInt("TeamId"));
            String head=rs.getString("HeadOfTheTeam");
            String m1=rs.getString("Member1");
            String m2=rs.getString("Member2");
            String m3=rs.getString("Member3");
            String m4=rs.getString("Member4");
            String m5=rs.getString("Member5");
            String m6=rs.getString("Member6");
            String m7=rs.getString("Member7");
            String m8=rs.getString("Member8");
            String tbData[]={id,head,m1,m2,m3,m4,m5,m6,m7,m8};
            
            StaffTable.addRow(tbData);
            }
        }catch(Exception e){
            System.out.println("e.getmessage");
        }
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_back_buttonMouseClicked

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
       Team as=new Team();
        as.setVisible(true);
        new EditTeam().setVisible(false);
        dispose();
    }//GEN-LAST:event_back_buttonActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
            DefaultTableModel StaffTable2=(DefaultTableModel)workingTeamTable.getModel();
            StaffTable2.setRowCount(0);
        try{
            allstaff.setVisible(false);
          workingTeam.setVisible(true);
            String s=" (select Team.TeamId,ProjectId from Team inner Join Project on Team.TeamId=Project.TeamId)except(select TeamId,ProjectId from Project where CurrentStatus!='ongoing');";
            rs=st.executeQuery(s);
            while(rs.next()){
            String ti=String.valueOf(rs.getInt("TeamId"));
            String pi=rs.getString("ProjectId");
            String tbData[]={ti,pi};
            
            StaffTable2.addRow(tbData);
            }
        }catch(Exception e){
            System.out.println("e.getmessage");
        }
        
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
   
        
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{int h,ti,m1,m2,m3,m4,m5,m6,m7,m8;
            
            ti=Integer.parseInt(jTextField10.getText());
           
            try{
                m1=Integer.parseInt(jTextField11.getText());
                String s1="Update Team set Member1=? where TeamId=?;";
                PreparedStatement pst=con.prepareStatement(s1);
                 pst.setInt(1,m1);
                 pst.setInt(2,ti);
                 pst.executeUpdate();
                  JOptionPane.showMessageDialog(null,"insert successful");
                
            }catch(Exception e){
            System.out.println(e);
        }
           try{
                m2=Integer.parseInt(jTextField12.getText());
                String s1="Update Team set Member2=? where TeamId=?;";
                PreparedStatement pst=con.prepareStatement(s1);
                 pst.setInt(1,m2);
                 pst.setInt(2,ti);
                 pst.executeUpdate();
                  JOptionPane.showMessageDialog(null,"insert successful");
                
            }catch(Exception e){
            System.out.println(e);
        }
           try{
                m3=Integer.parseInt(jTextField13.getText());
                String s1="Update Team set Member3=? where TeamId=?;";
                PreparedStatement pst=con.prepareStatement(s1);
                 pst.setInt(1,m3);
                 pst.setInt(2,ti);
                 pst.executeUpdate();
                  JOptionPane.showMessageDialog(null,"insert successful");
                
            }catch(Exception e){
            System.out.println(e);
        }
           try{
                m2=Integer.parseInt(jTextField14.getText());
                String s1="Update Team set Member4=? where TeamId=?;";
                PreparedStatement pst=con.prepareStatement(s1);
                 pst.setInt(1,m2);
                 pst.setInt(2,ti);
                 pst.executeUpdate();
                  JOptionPane.showMessageDialog(null,"insert successful");
                
            }catch(Exception e){
            System.out.println(e);
        }
           try{
                m2=Integer.parseInt(jTextField15.getText());
                String s1="Update Team set Member5=? where TeamId=?;";
                PreparedStatement pst=con.prepareStatement(s1);
                 pst.setInt(1,m2);
                 pst.setInt(2,ti);
                 pst.executeUpdate();
                  JOptionPane.showMessageDialog(null,"insert successful");
                
            }catch(Exception e){
            System.out.println(e);
        }
        try{
                m2=Integer.parseInt(jTextField16.getText());
                String s1="Update Team set Member6=? where TeamId=?;";
                PreparedStatement pst=con.prepareStatement(s1);
                 pst.setInt(1,m2);
                 pst.setInt(2,ti);
                 pst.executeUpdate();
                  JOptionPane.showMessageDialog(null,"insert successful");
                
            }catch(Exception e){
            System.out.println(e);
        }
        try{
                m2=Integer.parseInt(jTextField17.getText());
                String s1="Update Team set Member7=? where TeamId=?;";
                PreparedStatement pst=con.prepareStatement(s1);
                 pst.setInt(1,m2);
                 pst.setInt(2,ti);
                 pst.executeUpdate();
                  JOptionPane.showMessageDialog(null,"insert successful");
                
            }catch(Exception e){
            System.out.println(e);
        }
        try{
                m2=Integer.parseInt(jTextField18.getText());
                String s1="Update Team set Member8=? where TeamId=?;";
                PreparedStatement pst=con.prepareStatement(s1);
                 pst.setInt(1,m2);
                 pst.setInt(2,ti);
                 pst.executeUpdate();
                  JOptionPane.showMessageDialog(null,"insert successful");
                
            }catch(Exception e){
            System.out.println(e);
        }
        try{
                m2=Integer.parseInt(jTextField19.getText());
                String s1="Update Team set HeadOfTheTeam=? where TeamId=?;";
                PreparedStatement pst=con.prepareStatement(s1);
                 pst.setInt(1,m2);
                 pst.setInt(2,ti);
                 pst.executeUpdate();
                  JOptionPane.showMessageDialog(null,"insert successful");
                
            }catch(Exception e){
            System.out.println(e);
        }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

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
            java.util.logging.Logger.getLogger(EditTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new EditTeam().setVisible(true);
                
                  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allStaffTable;
    private javax.swing.JScrollPane allstaff;
    private javax.swing.JButton back_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JScrollPane workingTeam;
    private javax.swing.JTable workingTeamTable;
    // End of variables declaration//GEN-END:variables
}
