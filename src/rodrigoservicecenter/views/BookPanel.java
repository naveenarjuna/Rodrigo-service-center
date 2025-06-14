/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package rodrigoservicecenter.views;

import rodrigoservicecenter.model.entity.Employee;

import javax.swing.plaf.basic.BasicInternalFrameUI;


public class BookPanel extends javax.swing.JInternalFrame {

  
    public BookPanel(Employee employee) {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0)); 
        BasicInternalFrameUI ui= (BasicInternalFrameUI) this.getUI(); 
        ui.setNorthPane (null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        time_select = new com.toedter.calendar.JDateChooser();
        serviceid = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        date_select = new com.toedter.calendar.JDateChooser();
        search_appointment_bt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextPane();
        cancel_appointment_bt = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        mobile_number = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        upcoming_appointment = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        search_appointment = new javax.swing.JTextField();
        update_appointment_time = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        update_appointment_date = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        update_apponitment_serviceid = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        clear_bt = new javax.swing.JButton();
        book_bt = new javax.swing.JButton();
        update_appointment_bt = new javax.swing.JButton();
        refresh_bt = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1240, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(time_select, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 160, 30));

        serviceid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        serviceid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceidActionPerformed(evt);
            }
        });
        getContentPane().add(serviceid, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 160, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Customer Mobile :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 170, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Select Time :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 130, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("Upcoming Appoinments");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 230, 30));
        getContentPane().add(date_select, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 160, 30));

        search_appointment_bt.setForeground(new java.awt.Color(102, 102, 102));
        search_appointment_bt.setText("Search");
        search_appointment_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_appointment_btActionPerformed(evt);
            }
        });
        getContentPane().add(search_appointment_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 160, 30));

        jScrollPane1.setViewportView(description);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 330, 120));

        cancel_appointment_bt.setBackground(new java.awt.Color(255, 51, 0));
        cancel_appointment_bt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancel_appointment_bt.setForeground(new java.awt.Color(255, 255, 255));
        cancel_appointment_bt.setText("Cancel");
        cancel_appointment_bt.setBorder(null);
        cancel_appointment_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_appointment_btActionPerformed(evt);
            }
        });
        getContentPane().add(cancel_appointment_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 620, 160, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Select Service       :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 170, 30));
        getContentPane().add(mobile_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 160, 30));

        upcoming_appointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(upcoming_appointment);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 690, 350));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Select Date :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 130, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 153));
        jLabel12.setText("Book Appoinment");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 230, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 330, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rodrigoservicecenter/resources/icons8-search-40.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 40, 50));
        getContentPane().add(search_appointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 250, 30));
        getContentPane().add(update_appointment_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 580, 160, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Select Time :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, 130, 30));
        getContentPane().add(update_appointment_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, 160, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 153));
        jLabel14.setText("Update Appoinments");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 240, 30));

        update_apponitment_serviceid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        update_apponitment_serviceid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_apponitment_serviceidActionPerformed(evt);
            }
        });
        getContentPane().add(update_apponitment_serviceid, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 540, 160, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Select Service       :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 540, 170, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Select Date :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, 130, 30));

        clear_bt.setBackground(new java.awt.Color(0, 51, 153));
        clear_bt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clear_bt.setForeground(new java.awt.Color(255, 255, 255));
        clear_bt.setText("Clear");
        clear_bt.setBorder(null);
        clear_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btActionPerformed(evt);
            }
        });
        getContentPane().add(clear_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 160, 30));

        book_bt.setBackground(new java.awt.Color(0, 51, 153));
        book_bt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        book_bt.setForeground(new java.awt.Color(255, 255, 255));
        book_bt.setText("Book");
        book_bt.setBorder(null);
        book_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_btActionPerformed(evt);
            }
        });
        getContentPane().add(book_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 160, 30));

        update_appointment_bt.setBackground(new java.awt.Color(0, 51, 153));
        update_appointment_bt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update_appointment_bt.setForeground(new java.awt.Color(255, 255, 255));
        update_appointment_bt.setText("Update");
        update_appointment_bt.setBorder(null);
        update_appointment_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_appointment_btActionPerformed(evt);
            }
        });
        getContentPane().add(update_appointment_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 580, 160, 30));

        refresh_bt.setForeground(new java.awt.Color(102, 102, 102));
        refresh_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rodrigoservicecenter/resources/refresh-3104 (1).png"))); // NOI18N
        refresh_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_btActionPerformed(evt);
            }
        });
        getContentPane().add(refresh_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 80, 30, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void serviceidActionPerformed(java.awt.event.ActionEvent evt) {}

    private void update_apponitment_serviceidActionPerformed(java.awt.event.ActionEvent evt) {}

    private void clear_btActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void book_btActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void search_appointment_btActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void refresh_btActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void update_appointment_btActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void cancel_appointment_btActionPerformed(java.awt.event.ActionEvent evt) {

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton book_bt;
    private javax.swing.JButton cancel_appointment_bt;
    private javax.swing.JButton clear_bt;
    private com.toedter.calendar.JDateChooser date_select;
    private javax.swing.JTextPane description;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField mobile_number;
    private javax.swing.JButton refresh_bt;
    private javax.swing.JTextField search_appointment;
    private javax.swing.JButton search_appointment_bt;
    private javax.swing.JComboBox<String> serviceid;
    private com.toedter.calendar.JDateChooser time_select;
    private javax.swing.JTable upcoming_appointment;
    private javax.swing.JButton update_appointment_bt;
    private com.toedter.calendar.JDateChooser update_appointment_date;
    private com.toedter.calendar.JDateChooser update_appointment_time;
    private javax.swing.JComboBox<String> update_apponitment_serviceid;
    // End of variables declaration//GEN-END:variables
}
