
package rodrigoservicecenter.views;

import rodrigoservicecenter.model.entity.Employee;

import java.awt.Color;
import javax.swing.JFrame;

public class Dashboard extends javax.swing.JFrame {

   
    Color DefaultColor, ClickedColor;

    Employee employee;
    
    public Dashboard(Employee employee) {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setLocationRelativeTo(null);
        setVisible(true);
        DefaultColor=new Color (0,51,153); 
        ClickedColor=new Color(255,153,0); 
        
        sell.setBackground (DefaultColor); 
        book.setBackground (DefaultColor); 
        register.setBackground (DefaultColor); 
        customer.setBackground (DefaultColor); 
        appoinment.setBackground (DefaultColor); 
        stock.setBackground (DefaultColor);

        this.employee = employee;

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sell = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        book = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        register = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        customer = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        stock = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        appoinment = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        mainpanel = new javax.swing.JDesktopPane();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rodrigo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Service Center");

        sell.setBackground(new java.awt.Color(0, 51, 153));
        sell.setForeground(new java.awt.Color(255, 255, 255));
        sell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sellMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rodrigoservicecenter/icons8-sell-40.png"))); // NOI18N
        jLabel5.setText("  Sell Products");

        javax.swing.GroupLayout sellLayout = new javax.swing.GroupLayout(sell);
        sell.setLayout(sellLayout);
        sellLayout.setHorizontalGroup(
            sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sellLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sellLayout.setVerticalGroup(
            sellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sellLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(15, 15, 15))
        );

        book.setBackground(new java.awt.Color(0, 51, 153));
        book.setForeground(new java.awt.Color(255, 255, 255));
        book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bookMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rodrigoservicecenter/icons8-appointment-40.png"))); // NOI18N
        jLabel6.setText("  Appointment");

        javax.swing.GroupLayout bookLayout = new javax.swing.GroupLayout(book);
        book.setLayout(bookLayout);
        bookLayout.setHorizontalGroup(
            bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        bookLayout.setVerticalGroup(
            bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        register.setBackground(new java.awt.Color(0, 51, 153));
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registerMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rodrigoservicecenter/icons8-register-40.png"))); // NOI18N
        jLabel7.setText("  Register Customer");

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18))
        );

        customer.setBackground(new java.awt.Color(0, 51, 153));
        customer.setForeground(new java.awt.Color(255, 255, 255));
        customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                customerMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rodrigoservicecenter/icons8-user-35.png"))); // NOI18N
        jLabel8.setText("   View Customer");

        javax.swing.GroupLayout customerLayout = new javax.swing.GroupLayout(customer);
        customer.setLayout(customerLayout);
        customerLayout.setHorizontalGroup(
            customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        customerLayout.setVerticalGroup(
            customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        stock.setBackground(new java.awt.Color(0, 51, 153));
        stock.setForeground(new java.awt.Color(255, 255, 255));
        stock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                stockMousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rodrigoservicecenter/icons8-product-40.png"))); // NOI18N
        jLabel10.setText("  Check Stock");

        javax.swing.GroupLayout stockLayout = new javax.swing.GroupLayout(stock);
        stock.setLayout(stockLayout);
        stockLayout.setHorizontalGroup(
            stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stockLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        stockLayout.setVerticalGroup(
            stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stockLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        appoinment.setBackground(new java.awt.Color(0, 51, 153));
        appoinment.setForeground(new java.awt.Color(255, 255, 255));
        appoinment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appoinmentMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                appoinmentMousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rodrigoservicecenter/icons8-time-40.png"))); // NOI18N
        jLabel9.setText(" Check Appointment");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout appoinmentLayout = new javax.swing.GroupLayout(appoinment);
        appoinment.setLayout(appoinmentLayout);
        appoinmentLayout.setHorizontalGroup(
            appoinmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appoinmentLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        appoinmentLayout.setVerticalGroup(
            appoinmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appoinmentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sell, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(book, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(appoinment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(sell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(appoinment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 820));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 3)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 0));
        jButton1.setText("Sign Out");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 60, 60, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Registation");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 285, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rodrigoservicecenter/icons8-sign-out-48.png"))); // NOI18N
        jLabel4.setText("Sign Out");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 20, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 63, 310, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1260, 90));

        mainpanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rodrigoservicecenter/mechanic-auto-rapair-icon_18591-14025.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 204));
        jLabel12.setText("HI,");

        username.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        username.setForeground(new java.awt.Color(0, 102, 204));
        username.setText("NIMAL");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 153, 0));
        jLabel14.setText("Welcome to Rodrigo Service Center");

        jLabel15.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. ");

        mainpanel.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainpanel.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainpanel.setLayer(username, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainpanel.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainpanel.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(514, 514, 514)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(380, Short.MAX_VALUE))
        );
        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(username))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        getContentPane().add(mainpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 1250, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sellMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellMousePressed
        // TODO add your handling code here:
        sell.setBackground (ClickedColor); 
        book.setBackground (DefaultColor); 
        register.setBackground (DefaultColor); 
        customer.setBackground (DefaultColor); 
        appoinment.setBackground (DefaultColor); 
        stock.setBackground (DefaultColor);
    }//GEN-LAST:event_sellMousePressed

    private void bookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookMousePressed
        // TODO add your handling code here:
        sell.setBackground (DefaultColor); 
        book.setBackground (ClickedColor); 
        register.setBackground (DefaultColor); 
        customer.setBackground (DefaultColor); 
        appoinment.setBackground (DefaultColor); 
        stock.setBackground (DefaultColor);
    }//GEN-LAST:event_bookMousePressed

    private void registerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMousePressed
        // TODO add your handling code here:
        sell.setBackground (DefaultColor); 
        book.setBackground (DefaultColor); 
        register.setBackground (ClickedColor); 
        customer.setBackground (DefaultColor); 
        appoinment.setBackground (DefaultColor); 
        stock.setBackground (DefaultColor);
    }//GEN-LAST:event_registerMousePressed

    private void customerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerMousePressed
        // TODO add your handling code here:
        sell.setBackground (DefaultColor); 
        book.setBackground (DefaultColor); 
        register.setBackground (DefaultColor); 
        customer.setBackground (ClickedColor); 
        appoinment.setBackground (DefaultColor); 
        stock.setBackground (DefaultColor);
    }//GEN-LAST:event_customerMousePressed

    private void stockMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockMousePressed
        // TODO add your handling code here:
        sell.setBackground (DefaultColor); 
        book.setBackground (DefaultColor); 
        register.setBackground (DefaultColor); 
        customer.setBackground (DefaultColor); 
        appoinment.setBackground (DefaultColor); 
        stock.setBackground (ClickedColor);
    }//GEN-LAST:event_stockMousePressed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
       sell.setBackground (DefaultColor); 
        book.setBackground (DefaultColor); 
        register.setBackground (DefaultColor); 
        customer.setBackground (DefaultColor); 
        appoinment.setBackground (ClickedColor); 
        stock.setBackground (DefaultColor);
        
        AppoinmentPanel AppoinmentPanel1=new AppoinmentPanel(); 
        mainpanel.removeAll(); 
        mainpanel.add(AppoinmentPanel1).setVisible(true);
        // TODO add your handling code here: ///////////////////////////////////////////////miss clicked lable on appoiment check lable
    }//GEN-LAST:event_jLabel9MousePressed

    private void appoinmentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appoinmentMousePressed
        // TODO add your handling code here:
        sell.setBackground (DefaultColor); 
        book.setBackground (DefaultColor); 
        register.setBackground (DefaultColor); 
        customer.setBackground (DefaultColor); 
        appoinment.setBackground (ClickedColor); 
        stock.setBackground (DefaultColor);
    }//GEN-LAST:event_appoinmentMousePressed

    private void sellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellMouseClicked
        // TODO add your handling code here:
        SellPanel SellPanel1=new SellPanel(); 
        mainpanel.removeAll(); 
        mainpanel.add(SellPanel1).setVisible(true);
    }//GEN-LAST:event_sellMouseClicked

    private void bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookMouseClicked
        // TODO add your handling code here:
        BookPanel BookPanel1=new BookPanel(); 
        mainpanel.removeAll(); 
        mainpanel.add(BookPanel1).setVisible(true);
    }//GEN-LAST:event_bookMouseClicked

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
        // TODO add your handling code here:
        RegisterPanel RegisterPanel1=new RegisterPanel(); 
        mainpanel.removeAll(); 
        mainpanel.add(RegisterPanel1).setVisible(true);
    }//GEN-LAST:event_registerMouseClicked

    private void customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerMouseClicked
        // TODO add your handling code here:
        CustomerPanel CustomerPanel1=new CustomerPanel(); 
        mainpanel.removeAll(); 
        mainpanel.add(CustomerPanel1).setVisible(true);
    }//GEN-LAST:event_customerMouseClicked

    private void stockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockMouseClicked
        // TODO add your handling code here:
        StockPanel StockPanel1=new StockPanel(); 
        mainpanel.removeAll(); 
        mainpanel.add(StockPanel1).setVisible(true);
    }//GEN-LAST:event_stockMouseClicked

    private void appoinmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appoinmentMouseClicked
        // TODO add your handling code here:
        AppoinmentPanel AppoinmentPanel1=new AppoinmentPanel(); 
        mainpanel.removeAll(); 
        mainpanel.add(AppoinmentPanel1).setVisible(true);
        
    }//GEN-LAST:event_appoinmentMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel appoinment;
    private javax.swing.JPanel book;
    private javax.swing.JPanel customer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JDesktopPane mainpanel;
    private javax.swing.JPanel register;
    private javax.swing.JPanel sell;
    private javax.swing.JPanel stock;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
