/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lijianxi
 */
public class ManageAirliners extends javax.swing.JPanel {

    private JPanel rightJPanel;
    private TravelAgency travelagency;

    /**
     * Creates new form ManageAirlinersJPanel
     */
    public ManageAirliners(JPanel upc, TravelAgency ta) {
        initComponents();
        rightJPanel = upc;
        travelagency = ta;
        refreshTable();
    }

    public void refreshTable() {
        int rowCount = tblAirliner.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblAirliner.getModel();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        //System.out.print("OK");
        AirlinerDirectory ad = this.travelagency.getAirlinerdirectory();

        for (Airliner s : ad.getAirlinerList()) {
            Object row[] = new Object[3];
            row[0] = s;
            row[1] = s.getLocation();
            //row[2]=s.getNumplane();
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
        tblAirliner = new javax.swing.JTable();
        btnAddAirliner = new javax.swing.JButton();
        btnViewAirliner = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        jLabel1.setText("Manage Airliners");

        tblAirliner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Airliner Name", "Location", "Fleet Size"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAirliner);

        btnAddAirliner.setText("Add Airliner");
        btnAddAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAirlinerActionPerformed(evt);
            }
        });

        btnViewAirliner.setText("View Detail");
        btnViewAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAirlinerActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update Airliner");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Airliner");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewAirliner)
                    .addComponent(btnAddAirliner))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(282, 282, 282))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddAirliner)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewAirliner)
                    .addComponent(btnDelete))
                .addContainerGap(141, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAirlinerActionPerformed
        JPAddAirliner as = new JPAddAirliner(rightJPanel, travelagency);
        rightJPanel.add("AddSupplier", as);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_btnAddAirlinerActionPerformed

    private void btnViewAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAirlinerActionPerformed
        int selecteRow = tblAirliner.getSelectedRow();
        if (selecteRow < 0) {
            JOptionPane.showMessageDialog(null, "Please selecte a row from the table first!", "Warining", JOptionPane.WARNING_MESSAGE);
        } else {
            Airliner airliner = (Airliner) tblAirliner.getValueAt(selecteRow, 0);
            ViewAirlinerJPanel panel = new ViewAirlinerJPanel(rightJPanel, airliner);
            rightJPanel.add("JPViewAirlinerProfiles", panel);
            CardLayout layout = (CardLayout) rightJPanel.getLayout();
            layout.next(rightJPanel);

        }
    }//GEN-LAST:event_btnViewAirlinerActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        int selecteRow = tblAirliner.getSelectedRow();
        if (selecteRow < 0) {
            JOptionPane.showMessageDialog(null, "Please selecte a row from the table first!", "Warining", JOptionPane.WARNING_MESSAGE);
        } else {
            Airliner airliner = (Airliner) tblAirliner.getValueAt(selecteRow, 0);
            UpdateAirlinerJP panel = new UpdateAirlinerJP(rightJPanel, airliner);
            rightJPanel.add("UpdateAirlinerJP", panel);
            CardLayout layout = (CardLayout) rightJPanel.getLayout();
            layout.next(rightJPanel);

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row = tblAirliner.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            Airliner a = (Airliner) tblAirliner.getValueAt(row, 0);
            travelagency.getAirlinerdirectory().deleteAirliner(a);
            refreshTable();

        }

    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAirliner;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewAirliner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAirliner;
    // End of variables declaration//GEN-END:variables
}
