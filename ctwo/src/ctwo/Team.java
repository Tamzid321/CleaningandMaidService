
package ctwo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
public class Team extends javax.swing.JFrame {
 
    private Statement st;
    private ResultSet rs;
     private Connection con;
     
    public Team() {
        initComponents();
         
         setLocationRelativeTo(null);
       allstaff.setVisible(false);
       workingTeam.setVisible(false);
       jPanel2.setVisible(false);
     
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
        delete_tfld = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
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
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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
        jLabel4.setBounds(260, 210, 200, 40);

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

        delete_tfld.setText("to delete a team write the Team Id  here");
        delete_tfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_tfldActionPerformed(evt);
            }
        });
        jPanel1.add(delete_tfld);
        delete_tfld.setBounds(260, 670, 270, 30);

        delete.setText("delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(540, 670, 63, 23);

        jLabel14.setBackground(new java.awt.Color(255, 204, 51));
        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setText("Add a new Team");
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14);
        jLabel14.setBounds(260, 110, 240, 40);

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
        jLabel6.setBounds(260, 60, 270, 40);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("Id of the Head");
        jPanel2.add(jTextField10);
        jTextField10.setBounds(10, 10, 230, 40);

        jTextField17.setText("Member7");
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField17);
        jTextField17.setBounds(20, 180, 90, 30);

        jTextField11.setText("Member1");
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField11);
        jTextField11.setBounds(20, 60, 90, 30);

        jTextField13.setText("Member3");
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField13);
        jTextField13.setBounds(20, 100, 90, 30);

        jTextField15.setText("Member5");
        jPanel2.add(jTextField15);
        jTextField15.setBounds(20, 140, 90, 30);

        jTextField12.setText("Member2");
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField12);
        jTextField12.setBounds(150, 60, 90, 30);

        jTextField14.setText("Member4");
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField14);
        jTextField14.setBounds(150, 100, 90, 30);

        jTextField16.setText("Member6");
        jPanel2.add(jTextField16);
        jTextField16.setBounds(150, 140, 90, 30);

        jTextField18.setText("Member8");
        jPanel2.add(jTextField18);
        jTextField18.setBounds(150, 180, 90, 30);

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(90, 240, 53, 23);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(260, 350, 260, 280);

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
        jLabel15.setBounds(260, 160, 220, 40);

        jLabel7.setBackground(new java.awt.Color(255, 204, 51));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("See Staffs");
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(260, 260, 180, 40);

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

    private void delete_tfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_tfldActionPerformed
        // TODO add your handling code here:
       delete_tfld.setText(" ");
    }//GEN-LAST:event_delete_tfldActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
         try{
        String todelete=delete_tfld.getText();
        int tdd=Integer.parseInt(todelete);  
        
     
 
         String s="delete from Team where TeamId=?";
        PreparedStatement pst=con.prepareStatement(s);
        pst.setInt(1,tdd);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null,"Record deleted successfully");
        
        
        
           }catch(Exception e){
          
             JOptionPane.showMessageDialog(null,"This record can't be deleted.Try to delete  data of this id from other tables first");
        } 
    }//GEN-LAST:event_deleteActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
       jPanel2.setVisible(true);
      
       
    }//GEN-LAST:event_jLabel14MouseClicked

    private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_back_buttonMouseClicked

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        menu as=new menu();
        as.setVisible(true);
        new Team().setVisible(false);
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
        EditTeam et=new EditTeam();
        et.setVisible(true);
          new Team().setVisible(false);
        
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try{int h,ti=0,m1,m2,m3,m4,m5,m6,m7,m8;
            
          
             try{
                m2=Integer.parseInt(jTextField10.getText());
                //String s1="Update Team set HeadOfTheTeam=? where TeamId=?;";
                String s="Insert into Team(HeadOfTheTeam) values(?)";
                PreparedStatement pst=con.prepareStatement(s);
                 pst.setInt(1,m2);
                 pst.executeQuery();
                  
            }catch(Exception e){
            System.out.println(e);
        }
              
              try{
            String sr=" select TeamId from Team ";
            rs=st.executeQuery(sr);
            while(rs.next()){
            ti=rs.getInt("TeamId");
               
            }
        }catch(Exception e){
          
        } 
            try{
                m1=Integer.parseInt(jTextField11.getText());
                String s1="Update Team set Member1=? where TeamId=?;";
                PreparedStatement pst=con.prepareStatement(s1);
                 pst.setInt(1,m1);
                 pst.setInt(2,ti);
                 pst.executeUpdate();
                
                
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
                 
                
            }catch(Exception e){
            System.out.println(e);
        }
       JOptionPane.showMessageDialog(null,"insert successful");
        }catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        AllstaffLIst al=new AllstaffLIst();
        al.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(Team.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Team.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Team.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Team.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Team().setVisible(true);
                
                  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allStaffTable;
    private javax.swing.JScrollPane allstaff;
    private javax.swing.JButton back_button;
    private javax.swing.JButton delete;
    private javax.swing.JTextField delete_tfld;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JScrollPane workingTeam;
    private javax.swing.JTable workingTeamTable;
    // End of variables declaration//GEN-END:variables
}
