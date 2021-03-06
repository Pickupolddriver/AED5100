/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.BuyerMgt;

import Business.*;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raywa
 */
public class checkoutPanel extends javax.swing.JPanel {

    /**
     * Creates new form checkoutPanel
     */
    private JPanel processPanel;
    private Buyer buyer;
    private Business business;

    public checkoutPanel(JPanel processPanel, Buyer buyer, Business business) {
        initComponents();
        this.processPanel = processPanel;
        this.buyer = buyer;
        this.business = business;
        this.showCardInfo();
        this.showMailInfo();
        refreshTransaction1();

    }

    public void refreshTransaction1() {
        int rowCount = tblTransaction1.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblTransaction1.getModel();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        //System.out.print("OK");

        for (Wine w1 : buyer.getCart()) {
            Object row[] = new Object[4];
            row[0] = w1;
            row[1] = w1.getSeller().getFirstName() + " " + w1.getSeller().getLastName();
            row[2] = w1.getNumberofInventory();
            row[3] = w1.getPrice() * w1.getNumberofInventory();

            //row[2]=s.getNumplane();
            model.addRow(row);
        }
        double sumMoney = 0;
        for (Wine w1 : buyer.getCart()) {
            sumMoney = sumMoney + w1.getPrice() * w1.getNumberofInventory();

        }
        txtTotal.setText(String.valueOf(sumMoney));
    }

    public void showCardInfo() {
        txtCardNo.setText(String.valueOf(buyer.getBank().getCardNumber()));
        txtExpDate.setText(buyer.getBank().getExpDate());
        txtSecureCode.setText(String.valueOf(buyer.getBank().getSecureCode()));
        txtNameOnCard.setText(buyer.getBank().getNameOnCard());
    }

    public void showMailInfo() {

        txtStreetOne.setText(buyer.getMailingAddress().getStreetOne());
        txtStreetTwo.setText(buyer.getMailingAddress().getStreetTwo());
        txtMailCity.setText(buyer.getMailingAddress().getCity());
        txtMailState.setText(buyer.getMailingAddress().getState());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel19 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCardNo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtExpDate = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtSecureCode = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblTransaction1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNameOnCard = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtStreetTwo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtMailCity = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtMailState = new javax.swing.JTextField();
        txtStreetOne = new javax.swing.JTextField();
        btnPlaceOrder = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 102, 102));
        jLabel19.setText("Payment Method:");

        jLabel6.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("Card Number:");

        txtCardNo.setEnabled(false);
        txtCardNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCardNoActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 102, 102));
        jLabel20.setText("Exp Date:");

        txtExpDate.setEnabled(false);
        txtExpDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExpDateActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 102, 102));
        jLabel21.setText("Secure Code:");

        txtSecureCode.setEnabled(false);
        txtSecureCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecureCodeActionPerformed(evt);
            }
        });

        tblTransaction1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Wine Name", "Seller", "Quantity", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblTransaction1);

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("Order Sub Total:");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 102));
        jButton1.setText("Ship to a different Address");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 102, 102));
        jButton2.setText("Use a different payment method");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Name on Card:");

        txtNameOnCard.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 102, 102));
        jLabel13.setText("Street Address #1:");

        jLabel14.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 102));
        jLabel14.setText("Maill Address:");

        jLabel15.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 102, 102));
        jLabel15.setText("Street Address #2:");

        txtStreetTwo.setEnabled(false);
        txtStreetTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStreetTwoActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 102, 102));
        jLabel16.setText("City:");

        txtMailCity.setEnabled(false);
        txtMailCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailCityActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 102, 102));
        jLabel17.setText("State:");

        txtMailState.setEnabled(false);
        txtMailState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailStateActionPerformed(evt);
            }
        });

        txtStreetOne.setEnabled(false);
        txtStreetOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStreetOneActionPerformed(evt);
            }
        });

        btnPlaceOrder.setBackground(new java.awt.Color(255, 255, 255));
        btnPlaceOrder.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        btnPlaceOrder.setForeground(new java.awt.Color(255, 102, 102));
        btnPlaceOrder.setText("Place my order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 102, 102));
        btnBack.setText("Cancel and go back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtStreetOne, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMailState, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStreetTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMailCity, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtExpDate)
                            .addComponent(txtCardNo)
                            .addComponent(txtSecureCode)
                            .addComponent(txtNameOnCard, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(btnPlaceOrder)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCardNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(txtSecureCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNameOnCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtStreetOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtStreetTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtMailCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtMailState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlaceOrder)
                    .addComponent(btnBack))
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCardNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCardNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCardNoActionPerformed

    private void txtExpDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExpDateActionPerformed

    private void txtSecureCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecureCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecureCodeActionPerformed

    private void txtStreetTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStreetTwoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStreetTwoActionPerformed

    private void txtMailCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailCityActionPerformed

    private void txtMailStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailStateActionPerformed

    private void txtStreetOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStreetOneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStreetOneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        differentAddressPanel dap = new differentAddressPanel(processPanel, buyer);
        processPanel.add("differentAddressPanel", dap);
        CardLayout card = (CardLayout) processPanel.getLayout();
        card.next(processPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        differentPaymentPanel dpp = new differentPaymentPanel(processPanel, buyer);
        processPanel.add("differentPaymentPanel", dpp);
        CardLayout card = (CardLayout) processPanel.getLayout();
        card.next(processPanel);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        /* processPanel.remove(this);
        Component[] componentArray = processPanel.getComponents();
        Component comp = componentArray[componentArray.length - 1];
        JPanel mycarPanel = (JPanel) comp;
        CardLayout card = (CardLayout) processPanel.getLayout();
        card.previous(processPanel);*/
        Component[] componentArray = processPanel.getComponents();
        Component comp = componentArray[componentArray.length - 1];
        //JPanel mycarPanel = (JPanel) comp;

        CardLayout card = (CardLayout) processPanel.getLayout();
        card.previous(processPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
        //one order only present a single product;
        //Still need to validate the numebr?? 

        for (Wine w1 : buyer.getCart()) {
            //从购物车里面读取Wine
            Order o1 = buyer.addOrder();
            int winenum = w1.getNumberofInventory();
            //这个是在cart里面的Wine的数量； 因为装的是Wine只是数量表示是Inventory
            
            //Here we need to check the number of wine in the seller 
            for (Seller sls : business.getSd().getSellerList()) {
                if (sls.equals(w1.getSeller())) {
                    //meet the seller
                    for (Wine wx : sls.getWineList()) {
                        //meet the wine;
                        if (wx.getWineName().equals(w1.getWineName())) {
                            //对比在对应商家里面的同一类酒的数量
                            //compare the number 
                            if (winenum <= wx.getNumberofInventory()) {
                                //假如此次order的酒的数量<商家此类酒的库存
                                //so this is a validated order;
                                o1.setBuyer(buyer);
                                // Date d1 = new Date();
                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                                String str = sdf.format(new Date());
                                o1.setOrderDate(str);
                                //Generate a unique orderNumber
                                o1.setOrderNum(GenerateNum.getInstance().GenerateOrder());
                                o1.setOrderStatus("Payed");
                                o1.setQty(w1.getNumberofInventory());
                                o1.setSellerNameName(w1.getSeller());
                                o1.setTotal(w1.getNumberofInventory() * w1.getPrice());
                                o1.setWineName(w1);
                                business.addOrder(o1);
                                //And I need to substract the number of this wine in seller;
                                wx.setNumberofInventory(wx.getNumberofInventory() - winenum);
                            } else {
                                JOptionPane.showMessageDialog(null, "Qty in cart > Avail", "Warning", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                        }
                    }
                }

            }

            //add order into the master order List;
            //System.out.println(o1.getOrderNum());
        }

        JOptionPane.showMessageDialog(null, "Successfully Checked Out");
        //clear the cart;
        buyer.getCart().clear();
        processPanel.remove(this);
        Component[] componentArray = processPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        buyerStartPanel bsp = (buyerStartPanel) component;
        bsp.showMailInfo();
        bsp.showCardInfo();
        bsp.refreshTable();
        bsp.refreshOrder();
        bsp.refreshCarts();
        CardLayout layout = (CardLayout) processPanel.getLayout();
        layout.previous(processPanel);
    }//GEN-LAST:event_btnPlaceOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tblTransaction1;
    private javax.swing.JTextField txtCardNo;
    private javax.swing.JTextField txtExpDate;
    private javax.swing.JTextField txtMailCity;
    private javax.swing.JTextField txtMailState;
    private javax.swing.JTextField txtNameOnCard;
    private javax.swing.JTextField txtSecureCode;
    private javax.swing.JTextField txtStreetOne;
    private javax.swing.JTextField txtStreetTwo;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
