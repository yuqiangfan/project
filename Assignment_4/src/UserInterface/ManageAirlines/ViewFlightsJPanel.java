/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirlines;

import Business.Airliner;
import Business.Flight;
import Business.FlightSchedule;
import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PythonNo1
 */
public class ViewFlightsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewFlightsJPanel
     */
    JPanel userProcessContainer;
    private TravelAgency travelAgency;
    private Airliner airliner;
    public ViewFlightsJPanel(JPanel userProcessContainer, TravelAgency travelAgency, Airliner airliner) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.airliner = airliner;
        this.travelAgency = travelAgency;
        airlinerNameTxt.setText(airliner.getAirlinerName());
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) flightTbl.getModel();
        dtm.setRowCount(0);
//       for (FlightSchedule fS: travelAgency.getMTS().getmTS()) {
//            for(Flight flight: fS.getFlightSchedule()) {
        for (Flight flight: airliner.getFSCatalog().getFlightSchedule()) {//airliner.getFSCatalog().getFlightSchedule()
            Object[] row = new Object[5];
            row[0] = flight;
            row[1] = flight.getDepartAirport();
            row[2] = flight.getArrivalAirport();
            row[3] = flight.getDepartTime();
            row[4] = flight.getArrivalTime();
            dtm.addRow(row);
        }
       //}
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        flightTbl = new javax.swing.JTable();
        updateFlightBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        airlinerNameTxt = new javax.swing.JTextField();
        deleteFlightBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 163, 147));
        setForeground(new java.awt.Color(204, 51, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Flights");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Airliner:");

        flightTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Model No.", "Dep Airport", "Arr Airport", "Dep Time", "Arr Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(flightTbl);

        updateFlightBtn.setBackground(new java.awt.Color(208, 240, 240));
        updateFlightBtn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        updateFlightBtn.setText("Update");
        updateFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateFlightBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(207, 232, 232));
        backBtn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        backBtn.setText("<<back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        airlinerNameTxt.setEditable(false);

        deleteFlightBtn.setBackground(new java.awt.Color(208, 240, 240));
        deleteFlightBtn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        deleteFlightBtn.setText("Delete");
        deleteFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFlightBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deleteFlightBtn)
                                .addGap(18, 18, 18)
                                .addComponent(updateFlightBtn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(airlinerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(backBtn))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airlinerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateFlightBtn)
                    .addComponent(deleteFlightBtn))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateFlightBtnActionPerformed
        // TODO add your handling code here:
        if (flightTbl.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row from table", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Flight flight = new Flight();
        flight = (Flight)flightTbl.getValueAt(flightTbl.getSelectedRow(), 0);
        UpdateFlightJPanel panel = new UpdateFlightJPanel(userProcessContainer, flight, airliner);
        userProcessContainer.add("UpdateFlightJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_updateFlightBtnActionPerformed

    private void deleteFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFlightBtnActionPerformed
        // TODO add your handling code here:
        if (flightTbl.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row from table", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Flight flight = new Flight();
        flight = (Flight)flightTbl.getValueAt(flightTbl.getSelectedRow(), 0);
        airliner.getFSCatalog().deleteFlight(flight);
        JOptionPane.showMessageDialog(null, "Flight deleted!");
        populateTable();
        
    }//GEN-LAST:event_deleteFlightBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airlinerNameTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteFlightBtn;
    private javax.swing.JTable flightTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updateFlightBtn;
    // End of variables declaration//GEN-END:variables
}
