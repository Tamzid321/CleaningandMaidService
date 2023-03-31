
package ctwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Client_team extends javax.swing.JFrame  {

   
     
    public Client_team() {
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
    public ArrayList<Userb>userList()
    {
      ArrayList<Userb>userList = new ArrayList<>();

         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=CMS", "sa", "62625522");
          //  System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("select* from(select C.ClientId,C.ClientName ,P.TeamId,T.HeadOfTheTeam \n" +
"from Client C inner join Project P on(C.ClientId = P.Clientid) \n" +
"inner join Team T on (P.TeamId = T.TeamId))as cp");
            
        
             Userb user;
            
            while(resultSet.next())
         {
           user= new Userb(resultSet.getInt("ClientId"),resultSet.getInt("TeamId"),resultSet.getInt("HeadOfTheTeam"),resultSet.getString("ClientName"));
        
             userList.add(user);
            
 

         }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
         return userList;
    
    
    
    }
    
    
    
    
 public void show_user()
 {
   ArrayList<Userb>list = userList();
   DefaultTableModel model =(DefaultTableModel) jTable_Display.getModel();
   Object[] row = new Object[4];


   for(int i = 0;i<list.size();i++)
   {
     row[0]=list.get(i).getClientId();
     row[1]=list.get(i).getTeamId();
     row[2]=list.get(i).getHeadOfTheTeam();
     row[3]=list.get(i).getClientName();
    
     
     model.addRow(row);
   
   
   }
 
 }

  
    
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display = new javax.swing.JTable();
        OrderDate = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ClientId = new javax.swing.JTextField();
        Search = new javax.swing.JTextField();
        ClientName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        HeadOfTheTeam = new javax.swing.JTextField();
        TeamId = new javax.swing.JTextField();
        Search1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();
        DATE = new javax.swing.JLabel();
        clock = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jTable_Display.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ClientId", "TeamId", "HeadOfTheTeam ", "ClientName "
            }
        ));
        jTable_Display.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_DisplayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(630, 130, 530, 110);

        OrderDate.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        OrderDate.setText("TeamId");
        jPanel1.add(OrderDate);
        OrderDate.setBounds(290, 470, 100, 30);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel7.setText("HeadOfTheTeam");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(270, 400, 170, 30);
        jPanel1.add(ClientId);
        ClientId.setBounds(450, 280, 150, 40);

        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchKeyReleased(evt);
            }
        });
        jPanel1.add(Search);
        Search.setBounds(860, 370, 240, 40);
        jPanel1.add(ClientName);
        ClientName.setBounds(450, 340, 150, 40);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ctwo/search.jpg"))); // NOI18N
        jLabel8.setText("Search by ClientName");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(620, 430, 240, 40);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel9.setText("ClientName");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(290, 340, 110, 30);
        jPanel1.add(HeadOfTheTeam);
        HeadOfTheTeam.setBounds(450, 400, 150, 40);
        jPanel1.add(TeamId);
        TeamId.setBounds(450, 470, 150, 40);

        Search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search1KeyReleased(evt);
            }
        });
        jPanel1.add(Search1);
        Search1.setBounds(870, 430, 230, 40);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel10.setText("ClientId");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(290, 290, 80, 30);

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Pictures\\New folder\\search.jpg")); // NOI18N
        jLabel11.setText("Search by ClientId");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(620, 360, 220, 50);

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 40, 260, 880);

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
        back_button.setBounds(0, 10, 51, 25);

        DATE.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(DATE);
        DATE.setBounds(310, 80, 140, 40);

        clock.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.add(clock);
        clock.setBounds(460, 80, 140, 40);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel4.setText("Cuurent Date and Time");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(290, 30, 200, 30);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel5.setText("Client Team info");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(710, 50, 310, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -10, 1370, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_DisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_DisplayMouseClicked
        // TODO add your handling code here:
        
          int i = jTable_Display.getSelectedRow();
        TableModel model = jTable_Display.getModel();
        ClientId.setText(model.getValueAt(i,0).toString());
        TeamId.setText(model.getValueAt(i,1).toString());
        HeadOfTheTeam.setText(model.getValueAt(i,2).toString());
        ClientName.setText(model.getValueAt(i,3).toString());
         
        
        
        
    }//GEN-LAST:event_jTable_DisplayMouseClicked

    private void SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyReleased
        // TODO add your handling code here:
        
               try {
           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=checkpointnotwo;selectMethod=cursor", "sa", "123456");
            
            String sql ="select* from(select C.ClientId,C.ClientName ,P.TeamId,T.HeadOfTheTeam \n" +
            "from Client C inner join Project P on(C.ClientId = P.Clientid) \n" +
            "inner join Team T on (P.TeamId = T.TeamId))as cp where  ClientId=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, Search.getText());
            ResultSet rs =pst.executeQuery();
            if(rs.next())
            {
              
               String setClientId = rs.getString("ClientId");
             ClientId.setText(setClientId);
                 String setClientName= rs.getString("ClientName");
             ClientName.setText(setClientName);
              String setTeamId= rs.getString("TeamId");
             TeamId.setText(setTeamId);
              String setHeadOfTheTeam= rs.getString("HeadOfTheTeam");
             HeadOfTheTeam.setText(setHeadOfTheTeam);
           
              
               

            
            }
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, e);
         
         }
               
               
    }//GEN-LAST:event_SearchKeyReleased

    private void Search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search1KeyReleased
        // TODO add your handling code here:
        
            try{
            
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
              connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=checkpointnotwo;selectMethod=cursor", "sa", "123456");
        
         String sql="select* from(select C.ClientId,C.ClientName ,P.TeamId,T.HeadOfTheTeam \n" +
            "from Client C inner join Project P on(C.ClientId = P.Clientid) \n" +
            "inner join Team T on (P.TeamId = T.TeamId))as cp where ClientName like ?";
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1,Search1.getText()+"%");
        
        resultSet=pst.executeQuery();
        
       if( resultSet.next())
         {
            String add1= resultSet.getString("ClientId");
            ClientId.setText(add1);
            
              String add2= resultSet.getString("TeamId");
            TeamId.setText(add2);
            
              String add3= resultSet.getString("HeadOfTheTeam");
            HeadOfTheTeam.setText(add3);
            
            String add4= resultSet.getString("ClientName");
            ClientName.setText(add4);  
            
           
        
         }
        
        
        
        }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, e);
         
         }
        
        
       
        
        
        
    }//GEN-LAST:event_Search1KeyReleased

    private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_back_buttonMouseClicked

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
         Client as=new Client();
        as.setVisible(true);
        new Client_team().setVisible(false);
        dispose();
    }//GEN-LAST:event_back_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Client_team.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client_team.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client_team.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client_team.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Client_team().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ClientId;
    private javax.swing.JTextField ClientName;
    private javax.swing.JLabel DATE;
    private javax.swing.JTextField HeadOfTheTeam;
    private javax.swing.JLabel OrderDate;
    private javax.swing.JTextField Search;
    private javax.swing.JTextField Search1;
    private javax.swing.JTextField TeamId;
    private javax.swing.JButton back_button;
    private javax.swing.JLabel clock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display;
    // End of variables declaration//GEN-END:variables
}
