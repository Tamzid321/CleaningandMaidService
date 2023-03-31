
package ctwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class AllClient_Project extends javax.swing.JFrame {
 
    private Statement st;
    private ResultSet rs;
     private Connection con;
     
    public AllClient_Project() {
        initComponents();
  setLocationRelativeTo(null);
      show_user(); 
       
       
            CurrentDate();
    }
        
      public void CurrentDate(){
    
    Calendar cal = new GregorianCalendar();
    int month = cal.get(Calendar.MONTH);
    int year = cal.get(Calendar.YEAR);
    int day = cal.get(Calendar.DAY_OF_MONTH);
    DATE.setText(year+"/"+(month+1)+"/"+day);
    
    int second = cal.get(Calendar.SECOND);
    int minute = cal.get(Calendar.MINUTE);
    int hour = cal.get(Calendar.HOUR);
    clock.setText(hour+":"+(minute)+":"+second);
    
    
    }
   public Connection connection;  
    public ArrayList<UserTam>userList()
    {
      ArrayList<UserTam>userList = new ArrayList<>();

         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=CMS", "sa", "62625522");
          //  System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("select ProjectId, ClientId,ServiceFee,OrderDate,CurrentStatus from  Project");
            
        
             UserTam user;
            
            while(resultSet.next())
         {
            user = new UserTam(resultSet.getInt("ProjectId"),resultSet.getInt("ClientId"),resultSet.getString("ServiceFee"),resultSet.getString("OrderDate"),resultSet.getString("CurrentStatus"));
         
             userList.add(user);

         }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
         return userList;
    
    
    
    }
    
    
    
    
 public void show_user()
 {
   ArrayList<UserTam>list = userList();
   DefaultTableModel model =(DefaultTableModel) jTable_Display.getModel();
   Object[] row = new Object[6];


   for(int i = 0;i<list.size();i++)
   {
     row[0]=list.get(i).getProjectId();
     row[1]=list.get(i).getClientId();
     row[2]=list.get(i).getServiceFee();
     row[3]=list.get(i).getOrderDate();
     row[4]=list.get(i).getCurrentStatus();
     model.addRow(row);
   
   
   }
 
 }
    
 
    

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display = new javax.swing.JTable();
        Insert = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        ProjectId = new javax.swing.JTextField();
        ClientId = new javax.swing.JTextField();
        ServiceFee = new javax.swing.JTextField();
        OrderDate = new javax.swing.JTextField();
        CurrentStatus = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        DATE = new javax.swing.JLabel();
        clock = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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
        back_button.setBounds(0, 0, 51, 25);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 10, 260, 790);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 2, 36)); // NOI18N
        jLabel7.setText("Client  Project Information");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(680, 10, 590, 60);

        jTable_Display.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ClientId", "ProjectId", "ServiceFee", "OrderDate ", "CurrentStatus"
            }
        ));
        jTable_Display.setRowHeight(50);
        jTable_Display.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_DisplayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(640, 120, 560, 280);

        Insert.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        Insert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ctwo/insert.png"))); // NOI18N
        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });
        jPanel1.add(Insert);
        Insert.setBounds(664, 440, 130, 50);

        Update.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        Update.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Pictures\\New folder\\update.png")); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update);
        Update.setBounds(844, 440, 130, 50);

        delete.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Pictures\\New folder\\delete.png")); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(1034, 440, 120, 50);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel10.setText("CurrentStatus");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(280, 600, 170, 29);

        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchKeyReleased(evt);
            }
        });
        jPanel1.add(Search);
        Search.setBounds(440, 180, 190, 38);

        ProjectId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProjectIdActionPerformed(evt);
            }
        });
        jPanel1.add(ProjectId);
        ProjectId.setBounds(440, 310, 190, 41);
        jPanel1.add(ClientId);
        ClientId.setBounds(440, 380, 190, 41);

        ServiceFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServiceFeeActionPerformed(evt);
            }
        });
        jPanel1.add(ServiceFee);
        ServiceFee.setBounds(440, 450, 190, 40);

        OrderDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderDateActionPerformed(evt);
            }
        });
        jPanel1.add(OrderDate);
        OrderDate.setBounds(440, 520, 190, 40);

        CurrentStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurrentStatusActionPerformed(evt);
            }
        });
        jPanel1.add(CurrentStatus);
        CurrentStatus.setBounds(440, 590, 190, 40);

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel11.setText("OrderDate");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(270, 530, 170, 29);

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel15.setText("ServiceFee");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(280, 460, 170, 29);

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel16.setText("ClientId");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(270, 390, 170, 29);

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel17.setText("ProjectId");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(270, 320, 170, 29);

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel18.setText("Search(ClientId)");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(270, 180, 170, 29);

        DATE.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(DATE);
        DATE.setBounds(290, 60, 140, 40);

        clock.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(clock);
        clock.setBounds(470, 60, 140, 40);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel4.setText("Cuurent Date and Time");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(290, 10, 200, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 10, 1350, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_back_buttonMouseClicked

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        Client as=new Client();
        as.setVisible(true);
        new AllClient_Project().setVisible(false);
        dispose();
    }//GEN-LAST:event_back_buttonActionPerformed

    private void jTable_DisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_DisplayMouseClicked
        // TODO add your handling code here:

        int i = jTable_Display.getSelectedRow();
        TableModel model = jTable_Display.getModel();
        ClientId.setText(model.getValueAt(i,0).toString());
        ProjectId.setText(model.getValueAt(i,1).toString());
        ServiceFee.setText(model.getValueAt(i,2).toString());
        OrderDate.setText(model.getValueAt(i,3).toString());
        CurrentStatus.setText(model.getValueAt(i,4).toString());
        //ClientAddress.setText(model.getValueAt(i,5).toString());
    }//GEN-LAST:event_jTable_DisplayMouseClicked

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        // TODO add your handling code here:

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=checkpointnotwo;selectMethod=cursor", "sa", "123456");

            // int row = jTable_Display.getSelectedRow();
            //   String Value =(jTable_Display.getModel().getValueAt(row,0).toString());
            String query ="INSERT into Project(ClientId,ServiceFee,OrderDate,CurrentStatus) Values(?,?,?,?)";

            PreparedStatement pst = connection.prepareStatement(query);
            //   pst.setString(0, CstaffId.getText());
            //    pst.setString(1, ProjectId.getText());
            pst.setString(1, ClientId.getText());
            pst.setString(2, ServiceFee.getText());
            pst.setString(3, OrderDate.getText());
            pst.setString(4, CurrentStatus .getText());

            pst.executeUpdate();
            DefaultTableModel model =(DefaultTableModel)jTable_Display.getModel();
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
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=checkpointnotwo;selectMethod=cursor", "sa", "123456");

            int row = jTable_Display.getSelectedRow();
            String Value =(jTable_Display.getModel().getValueAt(row,0).toString());
            String query ="UPDATE Project SET ServiceFee=?,OrderDate=?,CurrentStatus=? where ClientId="+Value;
            PreparedStatement pst = connection.prepareStatement(query);
            //   pst.setString(0, CstaffId.getText());
            //  pst.setString(1, ProjectId.getText());
            pst.setString(1, ServiceFee.getText());
            pst.setString(2, OrderDate.getText());
            pst.setString(3, CurrentStatus .getText());

            pst.executeUpdate();
            DefaultTableModel model =(DefaultTableModel)jTable_Display.getModel();
            model.setRowCount(0);
            show_user();
            JOptionPane.showMessageDialog(null, "Updated Sucessfully");

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);

        }

    }//GEN-LAST:event_UpdateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:

        try{

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=checkpointnotwo;selectMethod=cursor", "sa", "123456");

            int row = jTable_Display.getSelectedRow();
            String value = (jTable_Display.getModel().getValueAt(row,0).toString());
            String query ="DELETE FROM Project WHERE ClientId="+value;
            PreparedStatement pst = connection.prepareStatement(query);
            pst.executeUpdate();
            DefaultTableModel model =(DefaultTableModel)jTable_Display.getModel();
            model.setRowCount(0);
            show_user();
            JOptionPane.showMessageDialog(null, "Deleted Sucessfully");

        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

    private void SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyReleased
        // TODO add your handling code here:

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=checkpointnotwo;selectMethod=cursor", "sa", "123456");

            String sql ="Select*from  Project where  ClientId=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, Search.getText());
            ResultSet rs =pst.executeQuery();
            if(rs.next())
            {
                String setProjectId = rs.getString("ProjectId");
                ProjectId.setText(setProjectId);
                String setClientId = rs.getString("ClientId");
                ClientId.setText(setClientId);
                String setServiceFee= rs.getString("ServiceFee");
                ServiceFee.setText(setServiceFee);
                String setOrderDate= rs.getString("OrderDate");
                OrderDate.setText(setOrderDate);
                String setCurrentStatus = rs.getString("CurrentStatus");
                CurrentStatus.setText(setCurrentStatus);

            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_SearchKeyReleased

    private void ProjectIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProjectIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProjectIdActionPerformed

    private void ServiceFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServiceFeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ServiceFeeActionPerformed

    private void OrderDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderDateActionPerformed

    private void CurrentStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurrentStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CurrentStatusActionPerformed

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
            java.util.logging.Logger.getLogger(AllClient_Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllClient_Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllClient_Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllClient_Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AllClient_Project().setVisible(true);
                
                  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ClientId;
    private javax.swing.JTextField CurrentStatus;
    private javax.swing.JLabel DATE;
    private javax.swing.JButton Insert;
    private javax.swing.JTextField OrderDate;
    private javax.swing.JTextField ProjectId;
    private javax.swing.JTextField Search;
    private javax.swing.JTextField ServiceFee;
    private javax.swing.JButton Update;
    private javax.swing.JButton back_button;
    private javax.swing.JLabel clock;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display;
    // End of variables declaration//GEN-END:variables
}
