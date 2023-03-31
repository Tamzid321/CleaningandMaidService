
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

public class DueServiceClients extends javax.swing.JFrame {

    
    public DueServiceClients() {
        initComponents();
        setLocationRelativeTo(null);
         show_user();
    }
    
    public Connection connection;  
    public ArrayList<User1>userList()
    {
      ArrayList<User1>userList = new ArrayList<>();

         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=CMS", "sa", "62625522");
         
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("select * from Client where ClientId in  (select ClientId from Project where CurrentStatus!='completed' )");
            
        
             User1 user;
            
            while(resultSet.next())
         {
           user = new User1(resultSet.getInt("ClientId"),resultSet.getString("ClientName"),resultSet.getString("ClientContactNumber"),resultSet.getString("ClientEmail"),resultSet.getInt("TakenServices"),resultSet.getString("ClientAddress"));
            
            userList.add(user);

         }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
         return userList;
    
    
    
    }
      
 public void show_user()
 {
   ArrayList<User1>list = userList();
   DefaultTableModel model =(DefaultTableModel) ClientTable.getModel();
   Object[] row = new Object[6];


   for(int i = 0;i<list.size();i++)
   {
     row[0]=list.get(i).getClientId();
     row[1]=list.get(i).getClientName();
     row[2]=list.get(i).getClientContactNumber();
     row[3]=list.get(i).getClientEmail();
     row[4]=list.get(i).getTakenServices();
     row[5]=list.get(i).getClientAddress();
     
     model.addRow(row);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ClientTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SearchClientName = new javax.swing.JTextField();
        SearchClientAddress = new javax.swing.JTextField();
        BackToProject = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ClientId = new javax.swing.JTextField();
        ClientName = new javax.swing.JTextField();
        ClientContactNumber = new javax.swing.JTextField();
        ClientEmail = new javax.swing.JTextField();
        TakenServices = new javax.swing.JTextField();
        ClientAddress = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1228, 780));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(250, 250, 250));
        jLabel2.setText("Maid Service");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 150, 50));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setText("Cleaning &");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 130, 40));

        jLabel3.setBackground(new java.awt.Color(255, 204, 0));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 160, 660));

        ClientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ClientId", "ClientName", "ClientContactNumber", "ClientEmail", "TakenServices", "ClientAddress"
            }
        ));
        ClientTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ClientTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 0, 950, 160));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Search(Enter ClientName)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 180, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Search(Enter ClientAddress)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 200, 30));

        SearchClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchClientNameActionPerformed(evt);
            }
        });
        SearchClientName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchClientNameKeyReleased(evt);
            }
        });
        jPanel1.add(SearchClientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 200, 30));

        SearchClientAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchClientAddressKeyReleased(evt);
            }
        });
        jPanel1.add(SearchClientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 200, 30));

        BackToProject.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BackToProject.setText("BackToProject");
        BackToProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToProjectActionPerformed(evt);
            }
        });
        jPanel1.add(BackToProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, -1));

        Clear.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Clear.setText("CLEAR");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel1.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 120, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ClientId");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 80, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("ClientName");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 90, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("ClientContactNumber");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 150, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("ClientEmail");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 90, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("TakenServices");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 100, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("ClientAddress");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 110, 30));
        jPanel1.add(ClientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 160, 30));
        jPanel1.add(ClientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 160, 30));
        jPanel1.add(ClientContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 160, 30));
        jPanel1.add(ClientEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 160, 30));

        TakenServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TakenServicesActionPerformed(evt);
            }
        });
        jPanel1.add(TakenServices, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 160, 30));
        jPanel1.add(ClientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 160, 30));

        Update.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 90, 40));

        Delete.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1209, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchClientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchClientNameActionPerformed

    private void ClientTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientTableMouseClicked
       int i = ClientTable.getSelectedRow();
        TableModel model = ClientTable.getModel();
        ClientId.setText(model.getValueAt(i,0).toString());
        ClientName.setText(model.getValueAt(i,1).toString());
        ClientContactNumber.setText(model.getValueAt(i,2).toString());
        ClientEmail.setText(model.getValueAt(i,3).toString());
        TakenServices.setText(model.getValueAt(i,4).toString());
        ClientAddress.setText(model.getValueAt(i,5).toString());
        
    }//GEN-LAST:event_ClientTableMouseClicked

    private void SearchClientNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchClientNameKeyReleased
      try {
           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=checkpointnotwo;selectMethod=cursor", "sa", "123456");
            
            String sql ="select * from Client where ClientId in  (select ClientId from Project where CurrentStatus!='completed' and ClientName like ? )";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, SearchClientName.getText()+"%");
            
            ResultSet rs =pst.executeQuery();
            if(rs.next())
            {
              String setClientId = rs.getString("ClientId");
             ClientId.setText(setClientId);
              String setClientName = rs.getString("ClientName");
              ClientName.setText(setClientName);
               String setClientContactNumber= rs.getString("ClientContactNumber");
             ClientContactNumber.setText(setClientContactNumber);
               String setClientEmail= rs.getString("ClientEmail");
             ClientEmail.setText(setClientEmail);
             String setTakenServices= rs.getString("TakenServices");
             TakenServices.setText(setTakenServices);
             String setClientAddress= rs.getString("ClientAddress");
             ClientAddress.setText(setClientAddress);
               
            }
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, e);
         
         }
    }//GEN-LAST:event_SearchClientNameKeyReleased

    private void TakenServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TakenServicesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TakenServicesActionPerformed

    private void SearchClientAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchClientAddressKeyReleased
      try {
           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=checkpointnotwo;selectMethod=cursor", "sa", "123456");
            
            String sql ="select * from Client where ClientId in  (select ClientId from Project where CurrentStatus!='completed' and ClientAddress like ? )";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, SearchClientAddress.getText()+"%");
            
            
            ResultSet rs =pst.executeQuery();
            if(rs.next())
            {
              String setClientId = rs.getString("ClientId");
             ClientId.setText(setClientId);
              String setClientName = rs.getString("ClientName");
              ClientName.setText(setClientName);
               String setClientContactNumber= rs.getString("ClientContactNumber");
             ClientContactNumber.setText(setClientContactNumber);
               String setClientEmail= rs.getString("ClientEmail");
             ClientEmail.setText(setClientEmail);
             String setTakenServices= rs.getString("TakenServices");
             TakenServices.setText(setTakenServices);
             String setClientAddress= rs.getString("ClientAddress");
             ClientAddress.setText(setClientAddress);
               
            }
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, e);
         
         }
    }//GEN-LAST:event_SearchClientAddressKeyReleased

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        ClientId.setText("");
        ClientName.setText("");
        ClientContactNumber.setText("");
        ClientEmail.setText("");
        TakenServices.setText("");
        ClientAddress.setText("");
        
    }//GEN-LAST:event_ClearActionPerformed

    private void BackToProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToProjectActionPerformed
        Project as=new Project();
         as.setVisible(true);
         new DueServiceClients ().setVisible(false);
         dispose();
    }//GEN-LAST:event_BackToProjectActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=checkpointnotwo;selectMethod=cursor", "sa", "123456");
            
            int row = ClientTable.getSelectedRow();
            String Value =(ClientTable.getModel().getValueAt(row,0).toString());
            String query ="UPDATE Client SET ClientName=?,ClientContactNumber=?,ClientEmail=?,TakenServices=?,ClientAddress=? where ClientId="+Value;
              PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, ClientName.getText());
            pst.setString(2, ClientContactNumber.getText());
            pst.setString(3, ClientEmail.getText());
            pst.setString(4, TakenServices.getText());
            pst.setString(5, ClientAddress.getText());
           
            pst.executeUpdate();
            DefaultTableModel model =(DefaultTableModel)ClientTable.getModel();
            model.setRowCount(0);
            show_user();
            JOptionPane.showMessageDialog(null, "Updated Sucessfully");
            
         
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
         
         }
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int opt=JOptionPane.showConfirmDialog(null,"Are You Sure To Delete","Delete",JOptionPane.YES_NO_OPTION);
       if(opt==0){
        try{
        
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
              connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=checkpointnotwo;selectMethod=cursor", "sa", "123456");
              
              int row = ClientTable.getSelectedRow();
              String value = (ClientTable.getModel().getValueAt(row,0).toString());
              String query ="DELETE FROM Client where ClientId="+value;
              PreparedStatement pst = connection.prepareStatement(query);
              pst.executeUpdate();
              DefaultTableModel model =(DefaultTableModel)ClientTable.getModel();
              model.setRowCount(0);
              show_user();
               JOptionPane.showMessageDialog(null, "Deleted Sucessfully");
              
            
        }
        
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,e);
        }
       }
    }//GEN-LAST:event_DeleteActionPerformed

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
            java.util.logging.Logger.getLogger(DueServiceClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DueServiceClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DueServiceClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DueServiceClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DueServiceClients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToProject;
    private javax.swing.JButton Clear;
    private javax.swing.JTextField ClientAddress;
    private javax.swing.JTextField ClientContactNumber;
    private javax.swing.JTextField ClientEmail;
    private javax.swing.JTextField ClientId;
    private javax.swing.JTextField ClientName;
    private javax.swing.JTable ClientTable;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField SearchClientAddress;
    private javax.swing.JTextField SearchClientName;
    private javax.swing.JTextField TakenServices;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
