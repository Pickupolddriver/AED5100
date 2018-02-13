/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomers;

import Business.TravelAgency;
import UserInterface.ManageFlights.MasterManagerJP;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author lijianxi
 */
public class GapJP extends javax.swing.JPanel {

    private JPanel rightJPanel;
    private TravelAgency travelagency;

    /**
     * Creates new form GapJP
     */
   
    public GapJP(JPanel upc, TravelAgency ta) {
        initComponents();
        rightJPanel=upc;
        travelagency=ta;
        
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnMngCus = new javax.swing.JButton();
        btnSB = new javax.swing.JButton();

        jLabel1.setText("Choose What you want");

        btnMngCus.setText("Manage Customer");
        btnMngCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngCusActionPerformed(evt);
            }
        });

        btnSB.setText("Search and Book");
        btnSB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnMngCus)
                    .addComponent(btnSB))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMngCus)
                .addGap(18, 18, 18)
                .addComponent(btnSB)
                .addContainerGap(155, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMngCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMngCusActionPerformed
        // TODO add your handling code here:
        ManageCustomersJPanel mmjp =new ManageCustomersJPanel(rightJPanel,travelagency);
        rightJPanel.add("ManageCustomersJPanel", mmjp);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_btnMngCusActionPerformed

    private void btnSBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSBActionPerformed
        // TODO add your handling code here:
        SearchBook mmjp =new SearchBook(rightJPanel,travelagency);
        rightJPanel.add("ManageCustomersJPanel", mmjp);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_btnSBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMngCus;
    private javax.swing.JButton btnSB;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}