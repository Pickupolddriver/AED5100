/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Admin;

import Business.Account;
import Business.Business;
import Interface.BuyerMgt.buyerStartPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raywa
 */
public class accountMgtPanel extends javax.swing.JPanel {

    /**
     * Creates new form accountMgtPanel
     */
    private JPanel processPanel;
    private Business business;
    public accountMgtPanel(JPanel processPanel, Business business) {
        initComponents();
        this.processPanel = processPanel;
        this.business = business;
        refreshTbl();
    }
    public void refreshTbl(){
        int rowCount = tblAccount.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblAccount.getModel();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for (Account a: business.getAd().getAccountList()){
            Object row[] = new Object[6];
            row[0] = a;
            row[1] = a.getPassword();
            row[2] = a.getRole();
            row[3] = a.getPerson().getFirstName();
            row[4] = a.getPerson().getLastName();
            row[5] = a.getStatus();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAccount = new javax.swing.JTable();
        btnLock = new javax.swing.JButton();
        btnUnlock = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblAccount.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        tblAccount.setForeground(new java.awt.Color(255, 102, 102));
        tblAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Password", "Role", "First Name", "Last Name", "Account Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAccount);

        btnLock.setBackground(new java.awt.Color(255, 255, 255));
        btnLock.setFont(new java.awt.Font("Viner Hand ITC", 2, 18)); // NOI18N
        btnLock.setForeground(new java.awt.Color(255, 102, 102));
        btnLock.setText("Lock an account");
        btnLock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLockActionPerformed(evt);
            }
        });

        btnUnlock.setBackground(new java.awt.Color(255, 255, 255));
        btnUnlock.setFont(new java.awt.Font("Viner Hand ITC", 2, 18)); // NOI18N
        btnUnlock.setForeground(new java.awt.Color(255, 102, 102));
        btnUnlock.setText("Unlock an account");
        btnUnlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnlockActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Viner Hand ITC", 2, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 102, 102));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rage Italic", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Manage Accounts");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnLock)
                        .addGap(62, 62, 62)
                        .addComponent(btnUnlock)
                        .addGap(48, 48, 48)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLock)
                    .addComponent(btnUnlock)
                    .addComponent(btnBack))
                .addGap(95, 95, 95))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLockActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAccount.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "pls select a row");
            return;
        }
        Account a = (Account)tblAccount.getValueAt(selectedRow, 0);
        a.setStatus("Locked");
        refreshTbl();
    }//GEN-LAST:event_btnLockActionPerformed

    private void btnUnlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnlockActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAccount.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "pls select a row");
            return;
        }
        Account a = (Account)tblAccount.getValueAt(selectedRow, 0);
        a.setStatus("Active");
        refreshTbl();
    }//GEN-LAST:event_btnUnlockActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        processPanel.remove(this);
        Component[] componentArray = processPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        adminStartPanel asp = (adminStartPanel) component;
        CardLayout layout = (CardLayout) processPanel.getLayout();
        layout.previous(processPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLock;
    private javax.swing.JButton btnUnlock;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAccount;
    // End of variables declaration//GEN-END:variables
}
