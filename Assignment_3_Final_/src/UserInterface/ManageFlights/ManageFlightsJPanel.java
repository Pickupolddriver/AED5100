/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageFlights;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.Flight;
import Business.MasterSchedule;
import Business.TravelAgency;
import UserInterface.ManageAirliners.JPAddAirliner;
import UserInterface.ManageAirliners.ViewAirlinerJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lijianxi
 */
public class ManageFlightsJPanel extends javax.swing.JPanel {

    private JPanel rightJPanel;
    private TravelAgency travelagency;
    private Airliner airliner;

    /**
     * Creates new form ManageFlightsJPanel
     */
    ManageFlightsJPanel(JPanel upc, TravelAgency ta, Airliner al) {
        initComponents();
        rightJPanel = upc;
        travelagency = ta;
        airliner = al;
        txtAirliner.setText(al.getName());
        refreshTable();
    }

    public void refreshTable() {
        int rowCount = tblFlights.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblFlights.getModel();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        for (Flight fl : airliner.getFs().getAirlinerSchedule()) {
            Object row[] = new Object[6];
            row[0] = fl;
            row[1] = fl.getAirliner();
            row[2] = fl.getDeparture();
            row[3] = fl.getDestination();
            row[4] = fl.getFlytime();
            row[5] = fl.getDate();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFlights = new javax.swing.JTable();
        btnNewFlight = new javax.swing.JButton();
        btnViewFlight = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtAirliner = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();

        jLabel1.setText("Manage Flight");

        tblFlights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Flight ID", "airliner", "Departure", "Destination", "flytime", "Date"
            }
        ));
        jScrollPane1.setViewportView(tblFlights);

        btnNewFlight.setText("New Flight");
        btnNewFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewFlightActionPerformed(evt);
            }
        });

        btnViewFlight.setText("View Flight");
        btnViewFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFlightActionPerformed(evt);
            }
        });

        jLabel2.setText("Airliner Name");

        txtAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAirlinerActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel Flight");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(txtAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNewFlight)
                    .addComponent(btnViewFlight))
                .addGap(158, 158, 158))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnViewFlight)
                                    .addComponent(btnCancel)))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNewFlight)))
                .addContainerGap(224, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewFlightActionPerformed
        AddFlightJPanel afjp = new AddFlightJPanel(rightJPanel, travelagency, airliner);
        rightJPanel.add("AddFlightJPanel", afjp);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_btnNewFlightActionPerformed

    private void btnViewFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFlightActionPerformed
        // TODO add your handling code here:
        int selecteRow = tblFlights.getSelectedRow();
        if (selecteRow < 0) {
            JOptionPane.showMessageDialog(null, "Please selecte a row from the table first!", "Warining", JOptionPane.WARNING_MESSAGE);
        } else {
            Flight flight = (Flight) tblFlights.getValueAt(selecteRow, 0);
            ViewFlightJPanel panel = new ViewFlightJPanel(rightJPanel,travelagency,flight);
            rightJPanel.add("JPViewAirlinerProfiles", panel);
            CardLayout layout = (CardLayout) rightJPanel.getLayout();
            layout.next(rightJPanel);

        }
    }//GEN-LAST:event_btnViewFlightActionPerformed

    private void txtAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAirlinerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAirlinerActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
         int row = tblFlights.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            Flight f1 = (Flight) tblFlights.getValueAt(row, 0);
            airliner.getFs().deleteFlight(f1);
            refreshTable();
            travelagency.getMasterschedule().removeFlight(f1);

        }
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnNewFlight;
    private javax.swing.JButton btnViewFlight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFlights;
    private javax.swing.JTextField txtAirliner;
    // End of variables declaration//GEN-END:variables

}
