/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.MinerRole;

import Blockchain.Block;
import Blockchain.BlockChain;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.MinerEnterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Blockchain.updateBlockChainAPI;
import Blockchain.searchNewestBlockAPI;
import static Blockchain.searchNewestBlockAPI.searchNewestBlock;
import static Blockchain.updateBlockChainAPI.updateBlockchain;

/**
 *
 * @author lijianxi
 */
public class MinerWorkAreaJPanel extends javax.swing.JPanel implements updateBlockChainAPI, searchNewestBlockAPI {

    /**
     * Creates new form MinerJPanel
     */
    private JPanel processPanel;
    private EcoSystem business;
    private DB4OUtil dB4OUtil;
    private UserAccount user;
    private MinerEnterprise me;

    public MinerWorkAreaJPanel(JPanel processPanel, EcoSystem business, DB4OUtil dB4OUtil, UserAccount u, MinerEnterprise e) {
        initComponents();
        this.processPanel = processPanel;
        this.business = business;
        this.dB4OUtil = dB4OUtil;
        this.user = u;
        this.me = e;
        e.getWallet().setBlockChaine(searchNewestBlockAPI.searchNewestBlock(business));
        //updateBlockChainAPI.updateBlockchain(business, me);
        populateOrder();
         blockChainUpdate();
    }
    public void blockChainUpdate(){
       updateBlockchain(business,me);   
    }
    public void populateOrder() {
        txtBitcoin.setText(" "+me.getWallet().refreshCount());
        DefaultTableModel dtm = (DefaultTableModel) TblMWR.getModel();
        dtm.setRowCount(0);
        for (WorkRequest o : business.getWorkQueue().getWorkRequestList()) {
    
            if (o.getStatus().equals("P2P Confirm Needed") || o.getStatus().equals("Withdraw Confirm needed now")
                    || o.getStatus().equals("Cash TX Confirm needed") || o.getStatus().equals("Confirmed")) {
                System.out.println(1);
                Object row[] = new Object[4];
                row[0] = o;
                row[1] = o.getT().getTo();
                row[2] = o.getT().getBtcAmount();
                row[3] = o.getStatus();
                dtm.addRow(row);
            }
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

        enterpriseLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblMWR = new javax.swing.JTable();
        BtnValidate = new javax.swing.JButton();
        BtnMining = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtBitcoin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BtnLogOut = new javax.swing.JButton();
        BtnAllTransaction = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        TblMWR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "From", "To", "Amount", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblMWR);

        BtnValidate.setText("Validate the Transaction");
        BtnValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnValidateActionPerformed(evt);
            }
        });

        BtnMining.setText("Start Mining for a new Block");
        BtnMining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMiningActionPerformed(evt);
            }
        });

        jLabel2.setText("WorkRuquests");

        txtBitcoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBitcoinActionPerformed(evt);
            }
        });

        jLabel3.setText("Bitconins You have Earned");

        BtnLogOut.setText("LogOut");
        BtnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogOutActionPerformed(evt);
            }
        });

        BtnAllTransaction.setText("Show All transactions");
        BtnAllTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAllTransactionActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("My Work Area -Wecomle! ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel6))
                            .addComponent(BtnValidate)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnAllTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BtnMining)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnValidate)
                .addGap(18, 18, 18)
                .addComponent(BtnMining)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnLogOut)
                    .addComponent(BtnAllTransaction))
                .addContainerGap(132, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnValidateActionPerformed
        int rowSelect = TblMWR.getSelectedRow();
        if (rowSelect >= 0) {
            WorkRequest w = (WorkRequest) TblMWR.getValueAt(rowSelect, 0);
           
            if(w.getMinerList().contains(user.getEmployee())){
                    JOptionPane.showMessageDialog(null, "You have already confirm this");
            }
            else{ 
                     Enterprise ee = null;
            //get enterprise
//            for (Enterprise e : business.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()) {
////                if (e.getenterpriseId() == w.getT().getFrom()) {
////                    ee = e;
////                }
//            }
            for (Network n : business.getNetworkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    if (e.getenterpriseId() == w.getT().getFrom()) {
                        ee = e;
                    }
                }

            }
            if (w.getMinerList().size() < 2) {
                //check amount

                if (ee.getWallet().refreshCount() >=w.getT().getBtcAmount()) {
                    
               

                    w.addMiner(user.getEmployee());
                    w.setStatus("Confirmed");
                    populateOrder();
                    if (w.getMinerList().size() == 1) {
                        w.getT().setMinerOrganization(me);
                          JOptionPane.showMessageDialog(null, "You are the first one!");
                    }else{                  
                          JOptionPane.showMessageDialog(null, "You are the second!");
                    }
                 
                         populateOrder();
                } else {
                    if(w.getStatus().equals("Cash TX Confirm needed")){ 
                           for (Network n : business.getNetworkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    if (e.getenterpriseId() == w.getT().getFrom()) {
                       float a=e.getBalance()-w.getCashTotal();
                       e.setBalance(a);
                    }
                }
            }

                    }
                    
                    
                    JOptionPane.showMessageDialog(null, "Transaction Declined");
                    w.setStatus("Failed due to Insufficient balance");
                    populateOrder();
                }
            } else if (w.getMinerList().size() == 2) {
                if (ee.getWallet().refreshCount()>= w.getT().getBtcAmount()) {
                    w.addMiner(user.getEmployee());
//                    if (w.getStatus().equals("Confirmed")) {
//                        w.setStatus("P2P Comfirmed");
//                        populateOrder();
//                    } else if (w.getStatus().equals("Withdraw Confirm needed")) {
//                        w.setStatus("Withdraw approved");
//                   
//                        populateOrder();
//                    } else if (w.getStatus().equals("Cash TX Confirm needed")) {
//                        w.setStatus("Cash Transaction completed");
   
                     
//                    }
                    // add the transaction to the most recent block
                   w.setStatus("P2P Confirmed");
                    BlockChain bc =searchNewestBlock(business);
                    Block block = bc.getHm().get(bc.getHm().size());
                    block.getBody().addTransaction(w.getT(), me);
                    //sending a new work request containing the most updated blockchain
                    WorkRequest wr = new WorkRequest();
                    wr.setBc(bc);
                    wr.setStatus("Update Needed");
                    business.getWorkQueue().getWorkRequestList().add(wr);
                     JOptionPane.showMessageDialog(null, "This transaction is in chain");
                     blockChainUpdate();
                            populateOrder();
                    /*
                    //broadcast
                    for (Network n : business.getNetworkList()) {
                        for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                            int index = e.getW().getBlockChaine().getHm().size();
                            Block b = e.getW().getBlockChaine().getHm().get(index);
                            b.getBody().addTransaction(w.getT(), me);

                        }
                    }
                     */
                } else {
                    JOptionPane.showMessageDialog(null, "Transaction Cancle");
                    w.setStatus("gg");
                    populateOrder();
                }
            }
            }
       } else {
                JOptionPane.showMessageDialog(null, "Please select any row");
                       populateOrder();
            }
            // TODO add your handling code here:
    }//GEN-LAST:event_BtnValidateActionPerformed

    private void BtnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogOutActionPerformed
        // TODO add your handling code here:
        processPanel.remove(this);
        Component[] componentArray = processPanel.getComponents();
        Component comp = componentArray[componentArray.length - 1];
        JPanel firstPagepanel = (JPanel) comp;
        CardLayout card = (CardLayout) processPanel.getLayout();
        card.previous(processPanel);
        dB4OUtil.storeSystem(business);
    }//GEN-LAST:event_BtnLogOutActionPerformed

    private void BtnMiningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMiningActionPerformed

        MiningJPanel mjp = new MiningJPanel(processPanel, business, me);
        processPanel.add("MiningJPanel", mjp);
        CardLayout card = (CardLayout) processPanel.getLayout();
        card.next(processPanel);
    }//GEN-LAST:event_BtnMiningActionPerformed

    private void BtnAllTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAllTransactionActionPerformed
        // TODO add your handling code here:
        allTransactionHistory ath = new allTransactionHistory(processPanel, business, me);
        processPanel.add("allTransactionHistory", ath);
        CardLayout card = (CardLayout) processPanel.getLayout();
        card.next(processPanel);
    }//GEN-LAST:event_BtnAllTransactionActionPerformed

    private void txtBitcoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBitcoinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBitcoinActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAllTransaction;
    private javax.swing.JButton BtnLogOut;
    private javax.swing.JButton BtnMining;
    private javax.swing.JButton BtnValidate;
    private javax.swing.JTable TblMWR;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBitcoin;
    // End of variables declaration//GEN-END:variables
}