/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageTravelAgency;

import Business.Flight;
import Business.Person;
import Business.Seat;
import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author PhythonNo1
 */
public class ViewTicketJPanel extends javax.swing.JPanel {
private TravelAgency travelAgency;  
    /**
     * Creates new form ViewTicketJPanel
     */
    
    private Person person;
    private Flight flight;
    private Seat seat;
    private JPanel userProcessContainer;
    private String airlinerSelect;
    
    public ViewTicketJPanel(JPanel userProcessContainer, Person person, Flight flight, Seat seat, String airlinerSelect) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.person = person;
        this.flight = flight;
        this.seat = seat;
        this.airlinerSelect = airlinerSelect;
        
        depLocTxt.setText(flight.getDepartAirport());
        arrLocTxt.setText(flight.getArrivalAirport());
        depTimeTxt.setText(flight.getDepartTime());
        arrTimeTxt.setText(flight.getArrivalTime());
        airlinerNameTxt.setText(airlinerSelect);
        flightNumTxt.setText(flight.getFlightNum());
        
        firstNameTxt.setText(person.getFirstName());
        lastNameTxt.setText(person.getLastName());
        
        if (seat.getColGroup() == 1) {
            colGroupTxt.setText("LEFT");
        }
        else {
            colGroupTxt.setText("RIGHT");
        }

        colTxt.setText(String.valueOf(seat.getColPosition()));
        rowTxt.setText(String.valueOf(seat.getRow()));
        
        depLocTxt.setEnabled(false);
        arrLocTxt.setEnabled(false);
        depTimeTxt.setEnabled(false);
        arrTimeTxt.setEnabled(false);
        airlinerNameTxt.setEnabled(false);
        flightNumTxt.setEnabled(false);
        firstNameTxt.setEnabled(false);
        lastNameTxt.setEnabled(false);
        colGroupTxt.setEnabled(false);
        colTxt.setEnabled(false);
        rowTxt.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblHead = new javax.swing.JLabel();
        lastNameTxt = new javax.swing.JTextField();
        firstNameTxt = new javax.swing.JTextField();
        airlinerNameTxt = new javax.swing.JTextField();
        depTimeTxt = new javax.swing.JTextField();
        arrTimeTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        flightNumTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        colGroupTxt = new javax.swing.JTextField();
        colTxt = new javax.swing.JTextField();
        rowTxt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        depLocTxt = new javax.swing.JTextField();
        arrLocTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(159, 169, 138));

        btnBack.setBackground(new java.awt.Color(210, 230, 230));
        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblHead.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblHead.setForeground(new java.awt.Color(255, 255, 255));
        lblHead.setText("Ticket Reserved");

        airlinerNameTxt.setEnabled(false);

        depTimeTxt.setEnabled(false);

        arrTimeTxt.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Flight Information:");

        flightNumTxt.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Passenger:");

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Seat Assigned:");

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("TO");

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("TO");

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Column Group");

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Column");

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Row");

        depLocTxt.setEnabled(false);

        arrLocTxt.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(depLocTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(arrLocTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(airlinerNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(depTimeTxt))
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10)
                                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(colGroupTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel18)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(colTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rowTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnBack)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(flightNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(arrTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(lblHead)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(lblHead)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(depLocTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrLocTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(depTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(arrTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airlinerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flightNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colGroupTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rowTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
//        userProcessContainer.remove(this);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.previous(userProcessContainer);
//        layout.previous(userProcessContainer);
//        layout.previous(userProcessContainer);
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airlinerNameTxt;
    private javax.swing.JTextField arrLocTxt;
    private javax.swing.JTextField arrTimeTxt;
    private javax.swing.JButton btnBack;
    private javax.swing.JTextField colGroupTxt;
    private javax.swing.JTextField colTxt;
    private javax.swing.JTextField depLocTxt;
    private javax.swing.JTextField depTimeTxt;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JTextField flightNumTxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JLabel lblHead;
    private javax.swing.JTextField rowTxt;
    // End of variables declaration//GEN-END:variables
}
