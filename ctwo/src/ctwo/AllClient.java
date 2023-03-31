
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
public class AllClient extends javax.swing.JFrame {
 
    private Statement st;
    private ResultSet rs;
     private Connection con;
     
    public AllClient() {
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
    
  
    
     ResultSet resultSet;
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
                    .executeQuery("(select ClientId,ClientName,ClientContactNumber, ClientEmail,TakenServices,CLientAddress from Client)Union\n" +
"(select ClientId,ClientName,ClientContactNumber, ClientEmail,TakenServices,CLientAddress from Client)");
            
        
             UserTam user;
            
            while(resultSet.next())
         {
            user = new UserTam(resultSet.getInt("ClientId"),resultSet.getString("ClientName"),resultSet.getString("ClientContactNumber"),resultSet.getString("ClientEmail"),resultSet.getInt("TakenServices"),resultSet.getString("ClientAddress"));
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
     row[0]=list.get(i).getClientId();
     row[1]=list.get(i).getClientName();
     row[2]=list.get(i).getClientContactNumber();
     row[3]=list.get(i).getClientEmail();
     row[4]=list.get(i).getTakenServices();
     row[5]=list.get(i).getClientAddress();
     
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Search1 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        ClientId = new javax.swing.JTextField();
        ClientName = new javax.swing.JTextField();
        ClientContactNumber = new javax.swing.JTextField();
        ClientEmail = new javax.swing.JTextField();
        TakenServices = new javax.swing.JTextField();
        ClientAddress = new javax.swing.JTextField();
        Insert = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DATE = new javax.swing.JLabel();
        clock = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

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

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(630, 170, 570, 383);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel5.setText("Search(Name)");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(270, 230, 170, 29);

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 260, 790);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel6.setText("ClientName");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(280, 360, 120, 29);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel4.setText("ContactNumber");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(280, 420, 150, 29);

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel12.setText("ClientEmail");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(280, 490, 110, 29);

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel13.setText("ClientId");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(280, 290, 150, 29);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel8.setText("ClientAddress");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(280, 560, 140, 29);

        Search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search1ActionPerformed(evt);
            }
        });
        Search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search1KeyReleased(evt);
            }
        });
        jPanel1.add(Search1);
        Search1.setBounds(440, 168, 180, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(440, 220, 180, 40);

        ClientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientIdActionPerformed(evt);
            }
        });
        jPanel1.add(ClientId);
        ClientId.setBounds(440, 281, 180, 40);

        ClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientNameActionPerformed(evt);
            }
        });
        ClientName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ClientNameKeyReleased(evt);
            }
        });
        jPanel1.add(ClientName);
        ClientName.setBounds(440, 351, 180, 40);

        ClientContactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientContactNumberActionPerformed(evt);
            }
        });
        jPanel1.add(ClientContactNumber);
        ClientContactNumber.setBounds(440, 420, 180, 40);

        ClientEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientEmailActionPerformed(evt);
            }
        });
        jPanel1.add(ClientEmail);
        ClientEmail.setBounds(440, 490, 180, 30);

        TakenServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TakenServicesActionPerformed(evt);
            }
        });
        jPanel1.add(TakenServices);
        TakenServices.setBounds(440, 630, 180, 40);

        ClientAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientAddressActionPerformed(evt);
            }
        });
        jPanel1.add(ClientAddress);
        ClientAddress.setBounds(440, 560, 170, 40);

        Insert.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        Insert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ctwo/insert.png"))); // NOI18N
        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });
        jPanel1.add(Insert);
        Insert.setBounds(664, 590, 140, 50);

        Update.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ctwo/update.png"))); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update);
        Update.setBounds(854, 590, 130, 50);

        delete.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ctwo/delete.png"))); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(1024, 590, 130, 50);

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel14.setText("TakenServices");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(290, 630, 150, 29);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel9.setText("Search(ClientId)");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(270, 170, 170, 29);

        DATE.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(DATE);
        DATE.setBounds(310, 100, 140, 40);

        clock.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(clock);
        clock.setBounds(470, 100, 140, 40);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel7.setText("Cuurent Date and Time");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(300, 60, 200, 30);

        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1100, 120, 100, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1350, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_back_buttonMouseClicked

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        menu as=new menu();
        as.setVisible(true);
        new AllClient().setVisible(false);
        dispose();
    }//GEN-LAST:event_back_buttonActionPerformed

    private void jTable_DisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_DisplayMouseClicked
        // TODO add your handling code here:

        int i = jTable_Display.getSelectedRow();
        TableModel model = jTable_Display.getModel();
        ClientId.setText(model.getValueAt(i,0).toString());
        ClientName.setText(model.getValueAt(i,1).toString());
        ClientContactNumber.setText(model.getValueAt(i,2).toString());
        ClientEmail.setText(model.getValueAt(i,3).toString());
        TakenServices.setText(model.getValueAt(i,4).toString());
        ClientAddress.setText(model.getValueAt(i,5).toString());
    }//GEN-LAST:event_jTable_DisplayMouseClicked

    private void Search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_Search1ActionPerformed

    private void Search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search1KeyReleased
        // TODO add your handling code here:
        
      try {
           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=checkpointnotwo;selectMethod=cursor", "sa", "123456");
            
            String sql ="Select*from  Client where  ClientId=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, Search1.getText());
            ResultSet rs =pst.executeQuery();
            if(rs.next())
            {
              String setClientId = rs.getString("ClientId");
             ClientId.setText(setClientId);
               String setClientName = rs.getString("ClientName");
              ClientName.setText(setClientName);
               String setClientContactNumber= rs.getString("ClientContactNumber");
             ClientContactNumber.setText(setClientContactNumber);
               String setClientEmail = rs.getString("ClientEmail");
             ClientEmail.setText(setClientEmail);
               String setTakenServices = rs.getString("TakenServices");
               TakenServices.setText(setTakenServices);
               String setClientAddress = rs.getString("ClientAddress");
              ClientAddress.setText(setClientAddress);
            
            }
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, e);
         
         }   
    }//GEN-LAST:event_Search1KeyReleased

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:

        try{

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=checkpointnotwo;selectMethod=cursor", "sa", "123456");

            String sql="select * from Client where ClientName like ?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,jTextField1.getText()+"%");

            resultSet=pst.executeQuery();

            if( resultSet.next())
            {
                String add1= resultSet.getString("ClientId");
                ClientId.setText(add1);
                String add2= resultSet.getString("ClientName");
                ClientName.setText(add2);
                String add3= resultSet.getString("ClientContactNumber");
                ClientContactNumber.setText(add3);
                String add4= resultSet.getString("ClientEmail");
                ClientEmail.setText(add4);

                String add5= resultSet.getString("TakenServices");
                TakenServices.setText(add1);

                String add6= resultSet.getString("ClientAddress");
                ClientAddress.setText(add6);

            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_jTextField1KeyReleased

    private void ClientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientIdActionPerformed

    private void ClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientNameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ClientNameActionPerformed

    private void ClientNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ClientNameKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_ClientNameKeyReleased

    private void ClientContactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientContactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientContactNumberActionPerformed

    private void ClientEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientEmailActionPerformed

    private void TakenServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TakenServicesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TakenServicesActionPerformed

    private void ClientAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientAddressActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        // TODO add your handling code here:

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=checkpointnotwo;selectMethod=cursor", "sa", "123456");

            // int row = jTable_Display.getSelectedRow();
            //   String Value =(jTable_Display.getModel().getValueAt(row,0).toString());
            String query ="INSERT into Client(ClientName,ClientContactNumber,ClientEmail,TakenServices ,ClientAddress) Values(?,?,?,?,?)";

            PreparedStatement pst = connection.prepareStatement(query);
            //   pst.setString(0, CstaffId.getText());
            pst.setString(1, ClientName.getText());
            pst.setString(2, ClientContactNumber.getText());
            pst.setString(3, ClientEmail.getText());
            pst.setString(4, TakenServices .getText());
            pst.setString(5, ClientAddress.getText());

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
            String query ="UPDATE Client SET ClientName=?,ClientContactNumber=?,ClientEmail=?,TakenServices=?,ClientAddress=? where ClientId="+Value;
            PreparedStatement pst = connection.prepareStatement(query);
            //   pst.setString(0, CstaffId.getText());
            pst.setString(1, ClientName.getText());
            pst.setString(2, ClientContactNumber.getText());
            pst.setString(3, ClientEmail.getText());
            pst.setString(4, TakenServices .getText());
            pst.setString(5, ClientAddress.getText());

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
            String query ="DELETE FROM Client WHERE ClientId="+value;
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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Client c=new Client();
        c.setVisible(true);
       new AllClient().setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AllClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AllClient().setVisible(true);
                
                  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ClientAddress;
    private javax.swing.JTextField ClientContactNumber;
    private javax.swing.JTextField ClientEmail;
    private javax.swing.JTextField ClientId;
    private javax.swing.JTextField ClientName;
    private javax.swing.JLabel DATE;
    private javax.swing.JButton Insert;
    private javax.swing.JTextField Search1;
    private javax.swing.JTextField TakenServices;
    private javax.swing.JButton Update;
    private javax.swing.JButton back_button;
    private javax.swing.JLabel clock;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTable jTable_Display;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
