
package ctwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Client_ownorder extends javax.swing.JFrame  {
public Client_ownorder(){
initComponents();
}
     
    public Client_ownorder(int cid,String j,String cnumb,String email,String sec) {
        initComponents();
       jScrollPane1.setVisible(false);
       ClientId.setText(String.valueOf(cid));
       ClientName.setText(j);
       ClientContactNumber.setText(cnumb);
       ClientEmail.setText(email);
       ClientAddress.setText(sec);
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
    public ArrayList<Usera>userList()
    {
      ArrayList<Usera>userList = new ArrayList<>();

         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=CMS", "sa", "62625522");
          //  System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("select * from ClientOrder");
            
        
             Usera user;
            
            while(resultSet.next())
         {
            //user = new User(resultSet.getInt("ClientId"),resultSet.getString("ClientName"),resultSet.getString("ClientContactNumber"),resultSet.getString("ClientEmail"),resultSet.getInt("TakenServices"),resultSet.getString("ClientAddress"));
              user = new Usera(resultSet.getInt("OrderId"),resultSet.getInt("ClientId"),resultSet.getString("ClientName"),resultSet.getString("ClientContactNumber"),resultSet.getString("ClientEmail"),resultSet.getString("ClientAddress"),resultSet.getString("OrderDate"),resultSet.getString("ServiceName"),resultSet.getString("Payment"));
             
             userList.add(user);
            
 

         }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
         return userList;
    
    
    
    }
    
    
    
    
 public void show_user()
 {
   ArrayList<Usera>list = userList();
   DefaultTableModel model =(DefaultTableModel) jTable_Display.getModel();
   Object[] row = new Object[9];


   for(int i = 0;i<list.size();i++)
   {
     row[0]=list.get(i).getOrderId();  
     row[1]=list.get(i).getClientId();
     row[2]=list.get(i).getClientName();
     row[3]=list.get(i).getClientContactNumber();
     row[4]=list.get(i).getClientEmail();
     row[5]=list.get(i).getClientAddress();
     row[6]=list.get(i).getOrderDate();
     row[7]=list.get(i).getServiceName();
     row[8]=list.get(i).getPayment();
     
     model.addRow(row);
   
   
   }
 
 }

  
    
  
    
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ClientName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jlevel1 = new javax.swing.JLabel();
        jlevel2 = new javax.swing.JLabel();
        jlevel5 = new javax.swing.JLabel();
        ServiceName = new javax.swing.JTextField();
        ClientEmail = new javax.swing.JTextField();
        ClientContactNumber = new javax.swing.JTextField();
        ClientId = new javax.swing.JTextField();
        ClientAddress = new javax.swing.JTextField();
        jlevel3 = new javax.swing.JLabel();
        jlevel4 = new javax.swing.JLabel();
        Payment = new javax.swing.JComboBox<>();
        OrderId = new javax.swing.JTextField();
        jlevel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jlevel8 = new javax.swing.JLabel();
        clock = new javax.swing.JLabel();
        DATE = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        OrderDate = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 260, 780);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jTable_Display.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderId", "ClientId", "ClientName", "ClientContactNumber", "ClientEmail", "ClientAddress", "OrderDate", "ServiceName", "Payment "
            }
        ));
        jTable_Display.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_DisplayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(290, 110, 900, 130);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel7.setText("ClientEmail");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(310, 580, 140, 30);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jButton1.setText("Add order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(930, 570, 230, 50);

        ClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientNameActionPerformed(evt);
            }
        });
        jPanel1.add(ClientName);
        ClientName.setBounds(530, 450, 240, 40);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel8.setText("ClientName");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(310, 450, 120, 30);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel9.setText("ClientContactNumber");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(310, 520, 210, 30);

        jlevel1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jlevel1.setText("Client Id");
        jPanel1.add(jlevel1);
        jlevel1.setBounds(310, 390, 100, 30);

        jlevel2.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jlevel2.setText("ServiceName");
        jPanel1.add(jlevel2);
        jlevel2.setBounds(310, 700, 140, 30);

        jlevel5.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jlevel5.setText("Payment");
        jPanel1.add(jlevel5);
        jlevel5.setBounds(810, 460, 100, 30);
        jPanel1.add(ServiceName);
        ServiceName.setBounds(530, 700, 240, 40);
        jPanel1.add(ClientEmail);
        ClientEmail.setBounds(530, 580, 240, 40);
        jPanel1.add(ClientContactNumber);
        ClientContactNumber.setBounds(530, 520, 240, 40);
        jPanel1.add(ClientId);
        ClientId.setBounds(530, 390, 240, 40);
        jPanel1.add(ClientAddress);
        ClientAddress.setBounds(530, 640, 240, 40);

        jlevel3.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jlevel3.setText("ClientAddress");
        jPanel1.add(jlevel3);
        jlevel3.setBounds(310, 640, 140, 30);

        jlevel4.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jlevel4.setText("OrderDate");
        jPanel1.add(jlevel4);
        jlevel4.setBounds(790, 290, 140, 30);

        Payment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Checks", "Debit cards", "Credit cards", "Mobile payments", "Electronic bank transfers", "Pay Order" }));
        jPanel1.add(Payment);
        Payment.setBounds(940, 460, 240, 40);
        jPanel1.add(OrderId);
        OrderId.setBounds(530, 330, 230, 40);

        jlevel7.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jlevel7.setText("Search by OrderId");
        jPanel1.add(jlevel7);
        jlevel7.setBounds(300, 270, 190, 30);

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
        jTextField1.setBounds(530, 270, 230, 40);

        jlevel8.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jlevel8.setText("OrderId");
        jPanel1.add(jlevel8);
        jlevel8.setBounds(310, 330, 100, 30);

        clock.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(clock);
        clock.setBounds(410, 60, 140, 40);

        DATE.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(DATE);
        DATE.setBounds(290, 60, 140, 40);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel4.setText("Cuurent Date and Time");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(290, 30, 200, 30);

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
        jPanel1.add(back_button);
        back_button.setBounds(0, 20, 49, 23);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cleaning & ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 190, 210, 100);

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Maid Service");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 270, 230, 60);

        jLabel11.setBackground(new java.awt.Color(255, 204, 0));
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 20, 260, 790);
        jPanel1.add(OrderDate);
        OrderDate.setBounds(940, 280, 220, 40);

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jButton3.setText("Our Services");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(940, 660, 230, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -10, 1370, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
  
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=checkpointnotwo;selectMethod=cursor", "sa", "123456");

            // int row = jTable_Display.getSelectedRow();
            //   String Value =(jTable_Display.getModel().getValueAt(row,0).toString());
            String query ="INSERT into  ClientOrder(ClientId,ClientName,ClientContactNumber,ClientEmail,ClientAddress,ServiceName,OrderDate,Payment) Values(?,?,?,?,?,?,?,?)";

            PreparedStatement pst = connection.prepareStatement(query);
            
            pst.setString(1,ClientId.getText() );
            pst.setString(2, ClientName.getText());
            pst.setString(3,ClientContactNumber.getText());
            pst.setString(4, ClientEmail.getText());
            pst.setString(5,ClientAddress.getText());
           // pst.setString(6, ServiceName.getText());
          //  pst.setString(6, OrderDate((JTextField)OrderDate.getDateEditor().getUiComponent()).getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(OrderDate.getDate());
            pst.setString(7, date);
            pst.setString(6, ServiceName.getText());
           // pst.setString(8, Payment.getText());         
           String payment;
           payment =Payment.getSelectedItem().toString();
           pst.setString(8, payment);
            
     
    

            pst.executeUpdate();
            DefaultTableModel model =(DefaultTableModel)jTable_Display.getModel();
            model.setRowCount(0);
            show_user();
            JOptionPane.showMessageDialog(null, "We record your order.After accept it we'll let you know over phone  ");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);

        }

        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        
        
        try {
           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=checkpointnotwo;selectMethod=cursor", "sa", "123456");
            
            String sql ="Select*from  ClientOrder where  OrderId=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, jTextField1.getText());
            ResultSet rs =pst.executeQuery();
            if(rs.next())
            {
                
              String setOrderId = rs.getString("OrderId");
             OrderId.setText(setOrderId);
              String setClientId = rs.getString("ClientId");
             ClientId.setText(setClientId);
               String setClientName = rs.getString("ClientName");
              ClientName.setText(setClientName);
               String setClientContactNumber= rs.getString("ClientContactNumber");
             ClientContactNumber.setText(setClientContactNumber);
               String setClientEmail = rs.getString("ClientEmail");
             ClientEmail.setText(setClientEmail);
              
               String setClientAddress = rs.getString("ClientAddress");
              ClientAddress.setText(setClientAddress);
              
          String setServiceName = rs.getString("ServiceName");
          ServiceName.setText(setServiceName);
              
              
            
              String payment1 = rs.getString("Payment");
              
              switch(payment1){
       case "Cash":
           Payment.setSelectedIndex(0);
           break;
           
         case "Checks":
           Payment.setSelectedIndex(1);
           break;
           
             case "Debit cards":
           Payment.setSelectedIndex(2);
           break;
           
             case "Credit cards":
           Payment.setSelectedIndex(3);
           break;
           
           
             case "Mobile payments":
           Payment.setSelectedIndex(4);
           break;
           
           
             case "Electronic bank transfers":
           Payment.setSelectedIndex(5);
           break;
           
           
           case "Pay Order":
           Payment.setSelectedIndex(6);
           break;
       
              }    
 
  
              
            
            }
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, e);
         
         } 
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_back_buttonMouseClicked

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
      Client as=new Client();
        as.setVisible(true);
        new Client_ownorder().setVisible(false);
        dispose();
    }//GEN-LAST:event_back_buttonActionPerformed

    private void jTable_DisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_DisplayMouseClicked
        // TODO add your handling code here:

        int i = jTable_Display.getSelectedRow();
        TableModel model = jTable_Display.getModel();
        OrderId.setText(model.getValueAt(i,0).toString());
        ClientId.setText(model.getValueAt(i,1).toString());
        ClientName.setText(model.getValueAt(i,2).toString());
        ClientContactNumber.setText(model.getValueAt(i,3).toString());
        ClientEmail.setText(model.getValueAt(i,4).toString());
        // TakenServices.setText(model.getValueAt(i,4).toString());
        ClientAddress.setText(model.getValueAt(i,5).toString());
        ServiceName.setText(model.getValueAt(i,7).toString());

        //   OrderDate.setDate((Date) model.getValueAt(i,6));
        /* String payment1=model.getValueAt(i,8).toString();

        switch(payment1){
            case "Cash":
            Payment.setSelectedIndex(0);
            break;

            case "Checks":
            Payment.setSelectedIndex(1);
            break;

            case "Debit cards":
            Payment.setSelectedIndex(2);
            break;

            case "Credit cards":
            Payment.setSelectedIndex(3);
            break;

            case "Mobile payments":
            Payment.setSelectedIndex(4);
            break;

            case "Electronic bank transfers":
            Payment.setSelectedIndex(5);
            break;

            case "Pay Order":
            Payment.setSelectedIndex(6);
            break;

        }*/

        String combo = model.getValueAt(i, 8).toString();
        for(i=0;i<Payment.getItemCount();i++)
        {
            if(Payment.getItemAt(i).toString().equalsIgnoreCase(combo)){
                Payment.setSelectedIndex(i);

            }

        }
        try{

            int srow = jTable_Display.getSelectedRow();
            Date date = new SimpleDateFormat("yyy-MM-dd").parse((String)model.getValueAt(srow, 6));
            OrderDate.setDate(date);

        }

        catch(Exception ex){

            JOptionPane.showMessageDialog(null,ex);
        }

    }//GEN-LAST:event_jTable_DisplayMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Service c=new Service();
        c.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientNameActionPerformed

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
            java.util.logging.Logger.getLogger(Client_ownorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client_ownorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client_ownorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client_ownorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Client_ownorder().setVisible(true);
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
    private com.toedter.calendar.JDateChooser OrderDate;
    private javax.swing.JTextField OrderId;
    private javax.swing.JComboBox<String> Payment;
    private javax.swing.JTextField ServiceName;
    private javax.swing.JButton back_button;
    private javax.swing.JLabel clock;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jlevel1;
    private javax.swing.JLabel jlevel2;
    private javax.swing.JLabel jlevel3;
    private javax.swing.JLabel jlevel4;
    private javax.swing.JLabel jlevel5;
    private javax.swing.JLabel jlevel7;
    private javax.swing.JLabel jlevel8;
    // End of variables declaration//GEN-END:variables
}
