/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomers;

import Business.Flight;
import Business.FlightSchedule;
import Business.Person;
import Business.Seat;
import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author PythonNo1
 */
public class BookCustomersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookCustomersJPanel
     */
    private JPanel userProcessContainer;
    private TravelAgency travelAgency;
    private Flight flight;
    private String airlinerSelect;
    
    public BookCustomersJPanel(JPanel userProcessContainer, TravelAgency travelAgency, Flight flight,String airlinerSelect) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.travelAgency = travelAgency;
        this.flight = flight;
        this.airlinerSelect = airlinerSelect;
        flightNumTxt.setText(flight.getFlightNum());
        airlinerNameTxt.setText(airlinerSelect);
        depTimeTxt.setText(flight.getDepartTime());
        arrTimeTxt.setText(flight.getArrivalTime());
        depAirportTxt.setText(flight.getDepartAirport());
        arrAirportTxt.setText(flight.getArrivalAirport());
        try{//priceTxt.setText(String.valueOf(flight.getPrice()));
            priceTxt.setText(String.valueOf(flight.getSeat().get(0).getPrice()));
        }catch(Exception e){
            e.printStackTrace();
        }
//        for (FlightSchedule fS: travelAgency.getMTS().getmTS()) {//dont know why this version cannot find every flight
//            for(Flight flight2: fS.getFlightSchedule()) {
//                if (flight2.equals(flight)) {                    
//                                    
//                //flightNumTxt.setText(flight.getFlightNum());
//                    //airlinerNameTxt.setText(fS.getAirliner().getAirlinerName());
//                    
//                    //airlinerSelect = fS.getAirliner().getAirlinerName();
//                    airlinerNameTxt.setText(airlinerSelect);
//                    flightNumTxt.setText(flight.getFlightNum());
//                    depTimeTxt.setText(flight.getDepartTime());
//                    arrTimeTxt.setText(flight.getArrivalTime());
//                    depAirportTxt.setText(flight.getDepartAirport());
//                    arrAirportTxt.setText(flight.getArrivalAirport());
//                    priceTxt.setText(String.valueOf(flight.getSeat().get(0).getPrice()));
//                }
//            }
//        }
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bookBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        airlinerNameTxt = new javax.swing.JTextField();
        depAirportTxt = new javax.swing.JTextField();
        arrAirportTxt = new javax.swing.JTextField();
        depTimeTxt = new javax.swing.JTextField();
        arrTimeTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        flightNumTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lastNameTxt = new javax.swing.JTextField();
        ssnTxt = new javax.swing.JTextField();
        seatPosCBox = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        genderCBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(149, 157, 132));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Airliner:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Source: ");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Destination:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Departure Time:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Arrival Time:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Customer Details");

        bookBtn.setBackground(new java.awt.Color(214, 236, 236));
        bookBtn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        bookBtn.setText("Book the flight");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("First Name:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Book Flight for the Customer");

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        backBtn.setText("<<back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        airlinerNameTxt.setEnabled(false);

        depAirportTxt.setEnabled(false);

        arrAirportTxt.setEnabled(false);

        depTimeTxt.setEnabled(false);

        arrTimeTxt.setEnabled(false);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Price:");

        priceTxt.setEnabled(false);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Flight No.");

        flightNumTxt.setEnabled(false);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("$");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Last Name:");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Gender:");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("SSN:");

        seatPosCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "window", "middle", "aisle" }));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Seat Prefer:");

        genderCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(backBtn)
                        .addGap(123, 123, 123)
                        .addComponent(bookBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel6)
                                        .addGap(3, 3, 3)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(depTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(airlinerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(depAirportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(arrTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(flightNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(arrAirportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ssnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(genderCBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 75, Short.MAX_VALUE)
                                        .addComponent(lastNameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(firstNameTxt, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(seatPosCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(203, 203, 203))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(airlinerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(flightNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(depAirportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(arrAirportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(depTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(arrTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(genderCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ssnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(seatPosCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(bookBtn)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        // TODO add your handling code here:
        if (firstNameTxt.getText().equals("") || 
                lastNameTxt.getText().equals("") || ssnTxt.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill out all passenger information.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;   
        }
        
        Person person = travelAgency.getCustomerDir().addPerson();
        person.setFirstName(firstNameTxt.getText());
        person.setLastName(lastNameTxt.getText());;
        person.setGender(genderCBox.getSelectedItem().toString());
        person.setSsn(ssnTxt.getText());
        
        
        Seat seatSelect = new Seat();
        for (Seat seat: flight.getSeat()) {
            if (seat.getColPosition().equals(seatPosCBox.getSelectedItem().toString()) 
                    && seat.isAvailability()) {
                seat.setAvailability(false);
                seat.setPerson(person);
                person.setSeat(seat);
                seatSelect = seat;
                
                
                ViewTicketJPanel panel = new ViewTicketJPanel(userProcessContainer ,person, flight, seatSelect, airlinerSelect);
                userProcessContainer.add("ViewTicketJPanel", panel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No seats are available, try others", "Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_bookBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airlinerNameTxt;
    private javax.swing.JTextField arrAirportTxt;
    private javax.swing.JTextField arrTimeTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookBtn;
    private javax.swing.JTextField depAirportTxt;
    private javax.swing.JTextField depTimeTxt;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JTextField flightNumTxt;
    private javax.swing.JComboBox<String> genderCBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JComboBox<String> seatPosCBox;
    private javax.swing.JTextField ssnTxt;
    // End of variables declaration//GEN-END:variables
}