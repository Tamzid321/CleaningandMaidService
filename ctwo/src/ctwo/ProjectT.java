
package ctwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
public class ProjectT extends javax.swing.JFrame {
 
    private Statement st;
    private ResultSet rs;
     private Connection con;
     
    public ProjectT() {
        initComponents();
         
         setLocationRelativeTo(null);
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

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        allstaff = new javax.swing.JScrollPane();
        allStaffTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ProjectId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ServiceId = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        MaidId = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ClientId = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        ServiceFee = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        OrderDate = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        StartingDate = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Deadline = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        CurrentStatus = new javax.swing.JTextField();
        sname = new javax.swing.JButton();
        snumb = new javax.swing.JButton();
        sea = new javax.swing.JButton();
        spass = new javax.swing.JButton();
        spass1 = new javax.swing.JButton();
        spass3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1450, 780));
        setMinimumSize(new java.awt.Dimension(1450, 780));
        setPreferredSize(new java.awt.Dimension(1450, 780));
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

        jLabel5.setText(",");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(554, 78, 316, 54);

        allStaffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Task Id", "ServiceId", "MaidId", "ClientId", "FeePErHour", "Order Date", "Starting Date", "HoursPerDay", "Current Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        allstaff.setViewportView(allStaffTable);

        jPanel1.add(allstaff);
        allstaff.setBounds(270, 20, 800, 590);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("All Tasks");
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(280, 630, 100, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Ongoing");
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(420, 630, 100, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Pending");
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(570, 630, 100, 33);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Accepted Order");
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(700, 630, 130, 33);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Completed Tasks");
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(860, 630, 170, 33);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Update ");
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(1050, 630, 170, 33);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("TaskId");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("ServiceId");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("MaidId");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("ClientId");

        ClientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientIdActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("FeePerHour");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("OrderDate");

        OrderDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderDateActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("StartingDate");

        StartingDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartingDateActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("HoursPerDay");

        Deadline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeadlineActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("CurrentStatus");

        sname.setBackground(new java.awt.Color(255, 204, 102));
        sname.setText("Save");
        sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameActionPerformed(evt);
            }
        });

        snumb.setBackground(new java.awt.Color(255, 204, 102));
        snumb.setText("Save");
        snumb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snumbActionPerformed(evt);
            }
        });

        sea.setBackground(new java.awt.Color(255, 204, 102));
        sea.setText("Save");
        sea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seaActionPerformed(evt);
            }
        });

        spass.setBackground(new java.awt.Color(255, 204, 102));
        spass.setText("Save");
        spass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spassActionPerformed(evt);
            }
        });

        spass1.setBackground(new java.awt.Color(255, 204, 102));
        spass1.setText("Save");
        spass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spass1ActionPerformed(evt);
            }
        });

        spass3.setBackground(new java.awt.Color(255, 204, 102));
        spass3.setText("Save");
        spass3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spass3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel18)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(StartingDate, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(OrderDate)
                                    .addComponent(ProjectId)
                                    .addComponent(ServiceId)
                                    .addComponent(MaidId)
                                    .addComponent(ClientId)
                                    .addComponent(ServiceFee)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(Deadline, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CurrentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spass1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spass3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sea))
                        .addComponent(sname, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(snumb))
                .addGap(142, 142, 142))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProjectId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ServiceId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sname)))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaidId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(snumb))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(ClientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(ServiceFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sea))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(OrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(StartingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(Deadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(CurrentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(spass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spass1)
                        .addGap(18, 18, 18)
                        .addComponent(spass3)
                        .addGap(14, 14, 14)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(1090, 30, 380, 580);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -10, 1560, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_back_buttonMouseClicked

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        menu as=new menu();
        as.setVisible(true);
        new ProjectT().setVisible(false);
        dispose();
    }//GEN-LAST:event_back_buttonActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

        DefaultTableModel ProjectTable=(DefaultTableModel)allStaffTable.getModel();
        ProjectTable.setRowCount(0);
        try{
            
           allstaff.setVisible(true);
            String s="select * from MaidTask";
            rs=st.executeQuery(s);
            while(rs.next()){
                String id=String.valueOf(rs.getInt("TaskId"));
                String sid=String.valueOf(rs.getInt("ServiceId"));
                String tid=String.valueOf(rs.getInt("MaidID"));
                String cid=String.valueOf(rs.getInt("ClientId"));
                String fee=rs.getString("FeePerHour");
                String ordate=rs.getString("OrderDate");
                String stdate=rs.getString("StartingDate");
                String deadline=rs.getString("HoursPerDay");
                String crstatus=rs.getString("CurrentStatus");

                String tbData[]={id,sid,tid,cid,fee,ordate,stdate,deadline,crstatus};
                ProjectTable.addRow(tbData);

            }
        }catch(Exception e){
            System.out.println("e.getmessage");
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        DefaultTableModel ProjectTable=(DefaultTableModel)allStaffTable.getModel();
        ProjectTable.setRowCount(0);
        try{
          
            String s="select * from Project where CurrentStatus='ongoing'";
            rs=st.executeQuery(s);
            while(rs.next()){
                String id=String.valueOf(rs.getInt("ProjectId"));
                 String sid=String.valueOf(rs.getInt("ServiceId"));
                String tid=String.valueOf(rs.getInt("TeamId"));
                String cid=String.valueOf(rs.getInt("ClientId"));
                String fee=rs.getString("ServiceFee");
                String ordate=rs.getString("OrderDate");
                String stdate=rs.getString("StartingDate");
                String deadline=rs.getString("Deadline");
                String crstatus=rs.getString("CurrentStatus");

                String tbData[]={id,sid,tid,cid,fee,ordate,stdate,deadline,crstatus};

                ProjectTable.addRow(tbData);
            }
        }catch(Exception e){
            System.out.println("e.getmessage");
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        DefaultTableModel ProjectTable=(DefaultTableModel)allStaffTable.getModel();
        ProjectTable.setRowCount(0);
        ProjectTable.setRowCount(0);
        try{
          
            String s="select * from Project where CurrentStatus='pending'";
            rs=st.executeQuery(s);
            while(rs.next()){
                String id=String.valueOf(rs.getInt("ProjectId"));
                String sid=String.valueOf(rs.getInt("ServiceId"));
                String tid=String.valueOf(rs.getInt("TeamId"));
                String cid=String.valueOf(rs.getInt("ClientId"));
                String fee=rs.getString("ServiceFee");
                String ordate=rs.getString("OrderDate");
                String stdate=rs.getString("StartingDate");
                String deadline=rs.getString("Deadline");
                String crstatus=rs.getString("CurrentStatus");

                String tbData[]={id,sid,tid,cid,fee,ordate,stdate,deadline,crstatus};

                ProjectTable.addRow(tbData);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        DefaultTableModel ProjectTable=(DefaultTableModel)allStaffTable.getModel();
        ProjectTable.setRowCount(0);
        try{
         
            String s="select * from Project where CurrentStatus='order accepted'";
            rs=st.executeQuery(s);
            while(rs.next()){
                String id=String.valueOf(rs.getInt("ProjectId"));
                 String sid=String.valueOf(rs.getInt("ServiceId"));
                String tid=String.valueOf(rs.getInt("TeamId"));
                String cid=String.valueOf(rs.getInt("ClientId"));
                String fee=rs.getString("ServiceFee");
                String ordate=rs.getString("OrderDate");
                String stdate=rs.getString("StartingDate");
                String deadline=rs.getString("Deadline");
                String crstatus=rs.getString("CurrentStatus");

                String tbData[]={id,sid,tid,cid,fee,ordate,stdate,deadline,crstatus};

                ProjectTable.addRow(tbData);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
          DefaultTableModel ProjectTable=(DefaultTableModel)allStaffTable.getModel();
        ProjectTable.setRowCount(0);
        try{
         
            String s="select * from Project where CurrentStatus='completed'";
            rs=st.executeQuery(s);
            while(rs.next()){
                String id=String.valueOf(rs.getInt("ProjectId"));
                 String sid=String.valueOf(rs.getInt("ServiceId"));
                String tid=String.valueOf(rs.getInt("TeamId"));
                String cid=String.valueOf(rs.getInt("ClientId"));
                String fee=rs.getString("ServiceFee");
                String ordate=rs.getString("OrderDate");
                String stdate=rs.getString("StartingDate");
                String deadline=rs.getString("Deadline");
                String crstatus=rs.getString("CurrentStatus");

                String tbData[]={id,sid,tid,cid,fee,ordate,stdate,deadline,crstatus};

                ProjectTable.addRow(tbData);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        jPanel2.setVisible(true);
            try {
         
            int row = allStaffTable.getSelectedRow();
            String Value =(allStaffTable.getModel().getValueAt(row,0).toString());
            String query ="UPDATE Project SET ServiceId=?,TeamId=?,ClientId=?,ServiceFee=?,OrderDate=?,StartingDate=?,Deadline=?,CurrentStatus=? where ProjectId="+Value;
              PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, ServiceId.getText());
            pst.setString(2, MaidId.getText());
            pst.setString(3, ClientId.getText());
            pst.setString(4, ServiceFee.getText());
            pst.setString(5, OrderDate.getText());
            pst.setString(6, StartingDate.getText());
            pst.setString(7, Deadline.getText());
            pst.setString(8, CurrentStatus.getText());
           
            pst.executeUpdate();
            DefaultTableModel model =(DefaultTableModel)allStaffTable.getModel();
            model.setRowCount(0);
          
            JOptionPane.showMessageDialog(null, "Updated Sucessfully");
            
         
         }
         catch(Exception e)
         {
            // JOptionPane.showMessageDialog(null,e);
         
         }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void ClientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientIdActionPerformed

    private void OrderDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderDateActionPerformed

    private void StartingDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartingDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartingDateActionPerformed

    private void DeadlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeadlineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeadlineActionPerformed

    private void snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameActionPerformed
        // TODO add your handling code here:
        String nm=ServiceId.getText();
        String ti=ProjectId.getText();
            try {
             
                String query = "Update MaidTask set ServiceId=? where TaskId=?";
                PreparedStatement pst=con.prepareStatement(query);
                pst.setInt(1,Integer.parseInt(nm));
                pst.setInt(2, Integer.parseInt(ti));
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Edited successfully");

            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null,"Invalid Data");
            }
        

     

    }//GEN-LAST:event_snameActionPerformed

    private void snumbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snumbActionPerformed
        // TODO add your handling code here:
        String nm=MaidId.getText();
        String ti=ProjectId.getText();
            try {
             
                String query = "Update MaidTask set MaidId=? where TaskId=?";
                PreparedStatement pst=con.prepareStatement(query);
                pst.setInt(1,Integer.parseInt(nm));
                pst.setInt(2, Integer.parseInt(ti));
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Edited successfully");

            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null,"Invalid Data");
            }
        
    }//GEN-LAST:event_snumbActionPerformed

    private void seaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seaActionPerformed
        // TODO add your handling code here:
        String nm=ServiceFee.getText();
        String ti=ProjectId.getText();
            try {
             
                String query = "Update MaidTask set FeePerHour=? where TaskId=?";
                PreparedStatement pst=con.prepareStatement(query);
                pst.setInt(1,Integer.parseInt(nm));
                pst.setInt(2, Integer.parseInt(ti));
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Edited successfully");

            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null,"Invalid Data");
            }
        
    }//GEN-LAST:event_seaActionPerformed

    private void spassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spassActionPerformed
         String nm=StartingDate.getText();
        String ti=ProjectId.getText();
            try {
             
                String query = "Update MaidTask set StartingDate=? where TaskId=?";
                PreparedStatement pst=con.prepareStatement(query);
                pst.setString(1,nm);
                pst.setInt(2, Integer.parseInt(ti));
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Edited successfully");

            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null,"Invalid Data");
            }

    }//GEN-LAST:event_spassActionPerformed

    private void spass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spass1ActionPerformed
        // TODO add your handling code here:
          String nm=Deadline.getText();
        String ti=ProjectId.getText();
            try {
             
                String query = "Update MaidTask set HoursPerDay=? where TaskId=?";
                PreparedStatement pst=con.prepareStatement(query);
                pst.setInt(1,Integer.parseInt(nm));
                pst.setInt(2, Integer.parseInt(ti));
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Edited successfully");

            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null,"Invalid Data");
            }
    }//GEN-LAST:event_spass1ActionPerformed

    private void spass3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spass3ActionPerformed
        // TODO add your handling code here:
           String nm=CurrentStatus.getText();
        String ti=ProjectId.getText();
            try {
             
                String query = "Update MaidTask set CurrentStatus=? where TaskId=?";
                PreparedStatement pst=con.prepareStatement(query);
                pst.setString(1,nm);
                pst.setInt(2, Integer.parseInt(ti));
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Edited successfully");

            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null,"INvalid Data");
            }
        
    }//GEN-LAST:event_spass3ActionPerformed

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
            java.util.logging.Logger.getLogger(ProjectT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectT().setVisible(true);
                
                  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ClientId;
    private javax.swing.JTextField CurrentStatus;
    private javax.swing.JTextField Deadline;
    private javax.swing.JTextField MaidId;
    private javax.swing.JTextField OrderDate;
    private javax.swing.JTextField ProjectId;
    private javax.swing.JTextField ServiceFee;
    private javax.swing.JTextField ServiceId;
    private javax.swing.JTextField StartingDate;
    private javax.swing.JTable allStaffTable;
    private javax.swing.JScrollPane allstaff;
    private javax.swing.JButton back_button;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JButton sea;
    private javax.swing.JButton sname;
    private javax.swing.JButton snumb;
    private javax.swing.JButton spass;
    private javax.swing.JButton spass1;
    private javax.swing.JButton spass3;
    // End of variables declaration//GEN-END:variables
}
