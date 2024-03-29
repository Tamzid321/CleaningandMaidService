
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

public class NewandOldServices extends javax.swing.JFrame {

    
    public NewandOldServices() {
        initComponents();
        setLocationRelativeTo(null);
         show_user();
    }
    public Connection connection;  
    public ArrayList<UserT>userList()
    {
      ArrayList<UserT>userList = new ArrayList<>();

         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=CMS", "sa", "62625522");
          
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("(select * from OurService) Union (select * from New_OurService)");
            
        
             UserT user;
            
            while(resultSet.next())
         {
            user = new UserT(resultSet.getInt("ServiceId"),resultSet.getString("ServiceName"),resultSet.getString("Cost"),resultSet.getString("Unit"));
            userList.add(user);

         }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
         return userList;
    
    
    
    }
      
 public void show_user()
 {
   ArrayList<UserT>list = userList();
   DefaultTableModel model =(DefaultTableModel) AllServiceTable.getModel();
   Object[] row = new Object[4];


   for(int i = 0;i<list.size();i++)
   {
     row[0]=list.get(i).getServiceId();
     row[1]=list.get(i).getServiceName();
     row[2]=list.get(i).getCost();
     row[3]=list.get(i).getUnit();
    
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BackToService = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AllServiceTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        SearchServiceId = new javax.swing.JTextField();
        ServiceId = new javax.swing.JTextField();
        ServiceName = new javax.swing.JTextField();
        Cost = new javax.swing.JTextField();
        Unit = new javax.swing.JTextField();
        Insert = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setText("Cleaning &");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 256, -1, 30));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(250, 250, 250));
        jLabel2.setText("Maid Service");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 150, -1));

        jLabel3.setBackground(new java.awt.Color(255, 204, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 160, 770));

        BackToService.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BackToService.setText("BackToService");
        BackToService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToServiceActionPerformed(evt);
            }
        });
        jPanel1.add(BackToService, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, -1));

        AllServiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ServiceId", "ServiceName", "Cost", "Unit"
            }
        ));
        AllServiceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AllServiceTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AllServiceTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 1060, 190));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Search(Enter ServiceId)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 170, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ServiceId");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 100, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("ServiceName");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 90, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Cost");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 60, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Unit");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 60, 30));

        Clear.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Clear.setText("CLEAR");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel1.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 90, -1));

        SearchServiceId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchServiceIdKeyReleased(evt);
            }
        });
        jPanel1.add(SearchServiceId, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 190, 30));
        jPanel1.add(ServiceId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 200, 30));
        jPanel1.add(ServiceName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 200, 30));
        jPanel1.add(Cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 200, 30));
        jPanel1.add(Unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 200, 30));

        Insert.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Insert.setText("INSERT");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });
        jPanel1.add(Insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, -1, -1));

        Delete.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, -1, -1));

        Update.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1224, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        ServiceId.setText("");
         ServiceName.setText("");
         Cost.setText("");
         Unit.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void AllServiceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllServiceTableMouseClicked
            int i = AllServiceTable.getSelectedRow();
        TableModel model = AllServiceTable.getModel();
        ServiceId.setText(model.getValueAt(i,0).toString());
        ServiceName.setText(model.getValueAt(i,1).toString());
        Cost.setText(model.getValueAt(i,2).toString());
        Unit.setText(model.getValueAt(i,3).toString());
    }//GEN-LAST:event_AllServiceTableMouseClicked

    private void SearchServiceIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchServiceIdKeyReleased
        try {
           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=checkpointnotwo;selectMethod=cursor", "sa", "123456");
            
            String sql ="Select * from  OurService Union Select * from New_OurService where  ServiceId=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, SearchServiceId.getText());
            ResultSet rs =pst.executeQuery();
            if(rs.next())
            {
              String setServiceId = rs.getString("ServiceId");
             ServiceId.setText(setServiceId);
               String setServiceName = rs.getString("ServiceName");
              ServiceName.setText(setServiceName);
               String setCost= rs.getString("Cost");
             Cost.setText(setCost);
               String setUnit = rs.getString("Unit");
             Unit.setText(setUnit);
               
            
            }
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, e);
         
         }
    }//GEN-LAST:event_SearchServiceIdKeyReleased

    private void BackToServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToServiceActionPerformed
         Service as=new Service();
         as.setVisible(true);
         new NewandOldServices ().setVisible(false);
         dispose();
    }//GEN-LAST:event_BackToServiceActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        try {
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
              connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=checkpointnotwo;selectMethod=cursor", "sa", "123456");
            
           
            String query ="INSERT into OurService(ServiceName,Cost,Unit) Values(?,?,?)";
            
             PreparedStatement pst = connection.prepareStatement(query);
      
            pst.setString(1, ServiceName.getText());
            pst.setString(2, Cost.getText());
            pst.setString(3, Unit.getText());
           
            
            pst.executeUpdate();
            DefaultTableModel model =(DefaultTableModel)AllServiceTable.getModel();
            model.setRowCount(0);
            show_user();
            JOptionPane.showMessageDialog(null, "Inserted Sucessfully");
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, e);
         
         }
    }//GEN-LAST:event_InsertActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=checkpointnotwo;selectMethod=cursor", "sa", "123456");
            
            int row = AllServiceTable.getSelectedRow();
            String Value =(AllServiceTable.getModel().getValueAt(row,0).toString());
            String query ="UPDATE OurService SET ServiceName=?,Cost=?,Unit=? where ServiceId="+Value;
              PreparedStatement pst = connection.prepareStatement(query);
         
            pst.setString(1, ServiceName.getText());
            pst.setString(2, Cost.getText());
            pst.setString(3, Unit.getText());
           
            pst.executeUpdate();
            DefaultTableModel model =(DefaultTableModel)AllServiceTable.getModel();
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
              
              int row = AllServiceTable.getSelectedRow();
              String value = (AllServiceTable.getModel().getValueAt(row,0).toString());
              String query ="DELETE FROM OurService WHERE ServiceId="+value;
              PreparedStatement pst = connection.prepareStatement(query);
              pst.executeUpdate();
              DefaultTableModel model =(DefaultTableModel)AllServiceTable.getModel();
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
            java.util.logging.Logger.getLogger(NewandOldServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewandOldServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewandOldServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewandOldServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new NewandOldServices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AllServiceTable;
    private javax.swing.JButton BackToService;
    private javax.swing.JButton Clear;
    private javax.swing.JTextField Cost;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Insert;
    private javax.swing.JTextField SearchServiceId;
    private javax.swing.JTextField ServiceId;
    private javax.swing.JTextField ServiceName;
    private javax.swing.JTextField Unit;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
