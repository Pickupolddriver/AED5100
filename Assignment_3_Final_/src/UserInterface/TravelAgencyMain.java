/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.AirlinerDirectory;
import Business.TravelAgency;
import UserInterface.ManageAirliners.ManageAirliners;
import UserInterface.ManageCustomers.GapJP;
import UserInterface.ManageCustomers.ManageCustomersJPanel;
import UserInterface.ManageFlights.LoginAirliner;
import UserInterface.ManageFlights.ManageFlightsJPanel;

import java.awt.CardLayout;

/**
 *
 * @author lijianxi
 */
public class TravelAgencyMain extends javax.swing.JFrame {

    private TravelAgency travelagency;

    //private CustomerDirectory customerdirectory;
    /**
     * Creates new form TravelAgencyMain
     */
    public TravelAgencyMain() {
        initComponents();
        travelagency = new TravelAgency();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        rightJPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CardSequenceJPanel = new javax.swing.JPanel();
        btnManageAirliners = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnManageFlights = new javax.swing.JButton();
        btnManageCustomer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rightJPanel.setLayout(new java.awt.CardLayout());

        jLabel2.setText("jLabel2");
        rightJPanel.add(jLabel2, "card2");

        jSplitPane1.setRightComponent(rightJPanel);

        btnManageAirliners.setText("Manage Airliners");
        btnManageAirliners.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAirlinersActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");

        jLabel1.setText("CardSequenceJPanel");

        btnManageFlights.setText("Manage Flights");
        btnManageFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageFlightsActionPerformed(evt);
            }
        });

        btnManageCustomer.setText("Manage Customers");
        btnManageCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CardSequenceJPanelLayout = new javax.swing.GroupLayout(CardSequenceJPanel);
        CardSequenceJPanel.setLayout(CardSequenceJPanelLayout);
        CardSequenceJPanelLayout.setHorizontalGroup(
            CardSequenceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardSequenceJPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CardSequenceJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CardSequenceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageCustomer)
                    .addComponent(btnManageFlights)
                    .addComponent(btnSearch)
                    .addComponent(btnManageAirliners))
                .addGap(14, 14, 14))
        );
        CardSequenceJPanelLayout.setVerticalGroup(
            CardSequenceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardSequenceJPanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(btnManageAirliners)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageFlights)
                .addGap(18, 18, 18)
                .addComponent(btnManageCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(16, 16, 16))
        );

        jSplitPane1.setLeftComponent(CardSequenceJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageAirlinersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAirlinersActionPerformed
        // TODO add your handling code here:
        ManageAirliners panel = new ManageAirliners(rightJPanel, travelagency);
        rightJPanel.add("ManageAirliners", panel);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_btnManageAirlinersActionPerformed

    private void btnManageFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageFlightsActionPerformed
        LoginAirliner panel=new LoginAirliner(rightJPanel,travelagency);
        rightJPanel.add("LoginAirlinerJPanel", panel);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_btnManageFlightsActionPerformed

    private void btnManageCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCustomerActionPerformed
        GapJP panel=new GapJP(rightJPanel,travelagency);
        rightJPanel.add("GapJP", panel);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_btnManageCustomerActionPerformed

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
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelAgencyMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardSequenceJPanel;
    private javax.swing.JButton btnManageAirliners;
    private javax.swing.JButton btnManageCustomer;
    private javax.swing.JButton btnManageFlights;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel rightJPanel;
    // End of variables declaration//GEN-END:variables
}
