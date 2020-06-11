/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirlines;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.Flight;
import Business.FlightSchedule;
import Business.MasterTravelSchedule;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import UserInterface.ManageTravelAgency.ManageTravelAgencyWorkAreaJPanel;
import java.util.ArrayList;
import java.util.HashSet;
import Business.Seat;
import Business.SeatCatalog;

/**
 *
 * @author PythonNo1
 */
public class CreateNewFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewFlightJPanel
     */
    JPanel userProcessContainer;
    private TravelAgency travelAgency;
    private Airliner airliner;
    public SeatCatalog seatList;
    public MasterTravelSchedule mTS;
    public AirlinerDirectory airlinerDir;
    public CreateNewFlightJPanel(JPanel userProcessContainer, TravelAgency travelAgency, Airliner airliner) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.travelAgency = travelAgency;
        this.airliner = airliner;
        airlinerNameTxt.setText(airliner.getAirlinerName());
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
        jLabel4 = new javax.swing.JLabel();
        arrivalTimeTxt = new javax.swing.JTextField();
        saveNewFlight = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        airlinerNameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        flightNumTxt = new javax.swing.JTextField();
        departAirportTxt = new javax.swing.JTextField();
        departTimeTxt = new javax.swing.JTextField();
        arrivalAirportTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        flightpriceTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(143, 167, 131));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create New Flight");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Airliner:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Flight Number:");

        saveNewFlight.setBackground(new java.awt.Color(178, 206, 206));
        saveNewFlight.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        saveNewFlight.setText("Create New Flight");
        saveNewFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNewFlightActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(193, 221, 221));
        backBtn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        backBtn.setText("<<back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        airlinerNameTxt.setEnabled(false);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Arrival Time:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Departure Airport:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Arrival Airport:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Departure Time:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Flight Price:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(departAirportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(82, 82, 82))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(flightNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(airlinerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(departTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(arrivalAirportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(flightpriceTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveNewFlight, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arrivalTimeTxt, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backBtn))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airlinerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(flightNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(departAirportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(arrivalAirportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(departTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(arrivalTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flightpriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addComponent(saveNewFlight)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveNewFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNewFlightActionPerformed
        // TODO add your handling code here:
        //Validation 
        String flightNumber = flightNumTxt.getText();
        String departAirport = departAirportTxt.getText();
        String departTime = departTimeTxt.getText();
        String arrivalAirport = arrivalAirportTxt.getText();
        String arrivalTime = arrivalTimeTxt.getText();
        Integer flightPrice = Integer.valueOf(flightpriceTxt.getText());
        int IntflightPrice = flightPrice.intValue();
        for (Airliner airliner: travelAgency.getAirlinerDir().getAirlinerList())
            //System.out.println(airliner.getAirlinerName());   
        if (flightNumber == null || flightNumber.equals("")){
            flightNumTxt.setBorder(BorderFactory.createLineBorder(Color.red));
            JOptionPane.showConfirmDialog(null, "Flight Number can't be empty!");
            return;
        }
        else {
             flightNumTxt.setBorder(BorderFactory.createLineBorder(Color.green));
        }
        if (departAirport == null || departAirport.equals("")){
            departAirportTxt.setBorder(BorderFactory.createLineBorder(Color.red));
            
            JOptionPane.showConfirmDialog(null, "Departure Airport can't be empty!");
            return;
        }
         else {
             departAirportTxt.setBorder(BorderFactory.createLineBorder(Color.green));
        }
        if (arrivalAirport == null || arrivalAirport.equals("")){
            arrivalAirportTxt.setBorder(BorderFactory.createLineBorder(Color.red));
            JOptionPane.showConfirmDialog(null, "Arrival Airport can't be empty!");
            return;
        }
         else {
             arrivalAirportTxt.setBorder(BorderFactory.createLineBorder(Color.green));
        }
        if (departTime == null || departTime.equals("")){
            departTimeTxt.setBorder(BorderFactory.createLineBorder(Color.red));
            JOptionPane.showConfirmDialog(null, "Departure Airport can't be empty!");
            return;
        }
         else {
             departTimeTxt.setBorder(BorderFactory.createLineBorder(Color.green));
        }
        if (arrivalTime == null || arrivalTime.equals("")){
            arrivalTimeTxt.setBorder(BorderFactory.createLineBorder(Color.red));
            JOptionPane.showConfirmDialog(null, "Arrival Time can't be empty!");
            return;
        }
         else {
             arrivalTimeTxt.setBorder(BorderFactory.createLineBorder(Color.green));
        }
      
         if (airliner.getAirlinerName().equals(airlinerNameTxt.getText())) {
                
                Flight flight = airliner.getFSCatalog().addFlight();
                //airliner.getFSCatalog() = mTS.addFlightSchedule();
                flight.setFlightNum(flightNumTxt.getText());
                flight.setDepartTime(departTimeTxt.getText());
                flight.setArrivalTime(arrivalTimeTxt.getText());
                flight.setDepartAirport(departAirportTxt.getText());
                flight.setArrivalAirport(arrivalAirportTxt.getText());
                airliner.getFSCatalog().setAirliner(airliner);
                //flight.setPrice(150);
                JOptionPane.showMessageDialog(null, "Flight Successfully created.");
                seatList = new SeatCatalog();
                seatList.setFlight(flight);
                flight.setSeat(seatList.getSeatCatalog());
                // Create all the seats
                String[] seatPos = {"window", "middle", "aisle"};
                for (int rowNum=1; rowNum<=25; rowNum++) {
                    for (int colGroup=1; colGroup<=2; colGroup++) {
                        for (int seatPosNum=0; seatPosNum<seatPos.length; seatPosNum++) {
                            Seat seat = new Seat();
                            seat = seatList.addSeat();
                            seat.setPrice(IntflightPrice);
                            seat.setAvailability(true);
                            seat.setFlight(flight);
                            seat.setColGroup(colGroup);
                            seat.setRow(rowNum);
                            seat.setColPosition(seatPos[seatPosNum]);
                        }
                    }
                }
               // addItemToComboBox();
//               ArrayList<String> allAirportNames = new ArrayList<>();
//               for (FlightSchedule fS: travelAgency.getMTS().getmTS()) {
//                    for(Flight flight2: fS.getFlightSchedule()) {
//                    allAirportNames.add(flight2.getDepartAirport());
//                    allAirportNames.add(flight2.getArrivalAirport());
//            }
//        }
//      
//        HashSet<String> hs = new HashSet<>();
//        hs.addAll(allAirportNames);
//        allAirportNames.clear();
//        allAirportNames.addAll(hs);
            }
         
       
        
    }//GEN-LAST:event_saveNewFlightActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airlinerNameTxt;
    private javax.swing.JTextField arrivalAirportTxt;
    private javax.swing.JTextField arrivalTimeTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField departAirportTxt;
    private javax.swing.JTextField departTimeTxt;
    private javax.swing.JTextField flightNumTxt;
    private javax.swing.JTextField flightpriceTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton saveNewFlight;
    // End of variables declaration//GEN-END:variables

}