/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Flight;
import Business.FlightHistory;
import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lijianxi
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private FlightHistory fh;
    public MainJFrame() {
        initComponents();
        fh= new FlightHistory();  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        leftJPanel = new javax.swing.JPanel();
        bthCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        BtnReadCsv = new javax.swing.JButton();
        rightJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bthCreate.setText("Create");
        bthCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthCreateActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        BtnReadCsv.setText("Read Csv");
        BtnReadCsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReadCsvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftJPanelLayout = new javax.swing.GroupLayout(leftJPanel);
        leftJPanel.setLayout(leftJPanelLayout);
        leftJPanelLayout.setHorizontalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnReadCsv)
                    .addComponent(btnView)
                    .addComponent(bthCreate))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        leftJPanelLayout.setVerticalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(bthCreate)
                .addGap(49, 49, 49)
                .addComponent(btnView)
                .addGap(39, 39, 39)
                .addComponent(BtnReadCsv)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        SplitPane.setLeftComponent(leftJPanel);

        javax.swing.GroupLayout rightJPanelLayout = new javax.swing.GroupLayout(rightJPanel);
        rightJPanel.setLayout(rightJPanelLayout);
        rightJPanelLayout.setHorizontalGroup(
            rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );
        rightJPanelLayout.setVerticalGroup(
            rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        SplitPane.setRightComponent(rightJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(SplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SplitPane))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bthCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthCreateActionPerformed
        CreateJPanel flightPanel= new CreateJPanel(fh);
        SplitPane.setRightComponent(flightPanel);
        // TODO add your handling code here:
    }//GEN-LAST:event_bthCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        ViewPanel viewpanel=new ViewPanel(fh);
        SplitPane.setRightComponent(viewpanel);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewActionPerformed

    private void BtnReadCsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReadCsvActionPerformed
        // TODO add your handling code here:
        String csvFile = "/Users/lijianxi/Assignment2_ORIGIN/FlightDataNOSS.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] colum = line.split(cvsSplitBy);

                //System.out.println( colum[0]+"," + colum[1]+"," + colum[2]+"," + colum[3]+"," + colum[4] + " , " + colum[5]+ " , " + colum[6]+ " , " + colum[7]+ " , " + colum[8]+ " , " + colum[9]+ " , " + colum[10]);

         String airport=colum[0];
         
        //cloum[1] is type String, 
       
        DateFormat dq = new SimpleDateFormat("MM/dd/yyyy HH:mm");
        Date flighttime = null;
                try {
                    flighttime = dq.parse(colum[1]);
                } catch (ParseException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
         int serialnum=Integer.parseInt(colum[2]);
         String ava=colum[3];
         String manuf= colum[4];
         int manuyear=Integer.parseInt( colum[5]);
         String modelnum= colum[6];
         int seats= Integer.parseInt(colum[7]);
        DateFormat ud = new SimpleDateFormat("MM/dd/yyyy");
          Date updatedate = null;
                try {
                    updatedate = ud.parse(colum[8]);
                } catch (ParseException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
         
         
         String expdate=colum[9];
         String airliner =colum[10];
         
         Flight f=fh.addFlights();
         
         f.setAirport(airport);
         String strflighttime = dq.format(flighttime);
                try {
                    f.setFlighttime(strflighttime);
                } catch (ParseException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
         f.getAirplane().setAirliner(airliner);
         f.getAirplane().setExpired(expdate);
         f.getAirplane().setAvalable(ava);
         f.getAirplane().setManufacturer(manuf);
         f.getAirplane().setManufactureyear(manuyear);
         f.getAirplane().setModelnumber(modelnum);
         f.getAirplane().setSeatnumber(seats);
         f.getAirplane().setSerialnumber(serialnum);
         String strupdatedate = ud.format(updatedate);
                try {
                    f.getAirplane().setUpdatedate(strupdatedate);
                } catch (ParseException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
         
         
         
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_BtnReadCsvActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnReadCsv;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton bthCreate;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel leftJPanel;
    private javax.swing.JPanel rightJPanel;
    // End of variables declaration//GEN-END:variables
}
