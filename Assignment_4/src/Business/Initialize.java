package Business;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PythonNo1
 */
public class Initialize {
    public AirlinerDirectory airlinerDir;
    public FlightSchedule fS;
    public Fleet fleet;
    public SeatCatalog seatList;
    public CustomerDirectory customerDir;
    public MasterTravelSchedule mTS;
    public TravelAgency travelAgency;
    
    public Initialize() {
        mTS = new MasterTravelSchedule();
        airlinerDir = new AirlinerDirectory();
        travelAgency = new TravelAgency();
        customerDir = new CustomerDirectory();
        
        travelAgency.setAirlinerDir(airlinerDir);
        travelAgency.setMTS(mTS);
        travelAgency.setCustomerDir(customerDir);
        
        ReadAirlinerList();
        ReadAirlinerData();
        ReadPersonData();
    }
    
    public void ReadAirlinerList() {
        // Read the list of airliners
        String csvFile = "airliner.txt";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] airlinerElement = line.split(cvsSplitBy);

                Airliner airliner = airlinerDir.addAirliner();
                airliner.setAirlinerName(airlinerElement[0]);
                airliner.setIataCode(airlinerElement[1]);
            }
            
            //for (Airplane a : airplaneList.getAirplaneList()) {

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
    }
 
    public void ReadAirlinerData() {
        // Read airliner data file
    for (int i=1; i<=airlinerDir.getAirlinerList().size(); i++) {
            StringBuffer sb = new StringBuffer();
            sb.append("airliner");
            sb.append(i);
            sb.append(".txt");
            String csvFile = sb.toString();

        BufferedReader br = null;
        String line = "";
        String airlinerName = "";
        String cvsSplitBy = ",";
        
        fS = new FlightSchedule();
        fleet = new Fleet();
        fS = mTS.addFlightSchedule();
        
        try {
            br = new BufferedReader(new FileReader(csvFile));
            airlinerName = br.readLine();
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] flightElement = line.split(cvsSplitBy); 

                Flight flight = fS.addFlight();
                flight.setFlightNum(flightElement[0]);
                flight.setDepartTime(flightElement[1]);
                flight.setArrivalTime(flightElement[2]);
                flight.setDepartAirport(flightElement[3]);
                flight.setArrivalAirport(flightElement[4]);

                Airplane airplane = fleet.addAirplane();
                airplane.setSerialNum(flightElement[5]);
                airplane.setModelNum(flightElement[6]);
                airplane.setMenufacture(flightElement[7]);
                airplane.setSeatCapacity(Integer.parseInt(flightElement[8]));
                
                // Assign airplane to the flight
                flight.setAirplane(airplane);
                // Create seat catalog to the flight
                seatList = new SeatCatalog();
                seatList.setFlight(flight);
                flight.setSeat(seatList.getSeatCatalog());
                // Create all the seats
                String[] seatPos = {"window", "middle", "aisle"};
                for (int rowNum=1; rowNum<=Seat.maxRow; rowNum++) {
                    for (int colGroup=1; colGroup<=2; colGroup++) {
                        for (int seatPosNum=0; seatPosNum<seatPos.length; seatPosNum++) {
                            Seat seat = new Seat();
                            seat = seatList.addSeat();
                            seat.setPrice(Integer.parseInt(flightElement[9]));
                            seat.setAvailability(true);
                            seat.setFlight(flight);
                            seat.setColGroup(colGroup);
                            seat.setRow(rowNum);
                            seat.setColPosition(seatPos[seatPosNum]);
                        }
                    }
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
        // Assign flight to airliner
        for (Airliner airliner: airlinerDir.getAirlinerList()) {
            if (airliner.getAirlinerName().equals(airlinerName)) {
                airliner.setFSCatalog(fS);
                airliner.setFleetCatalog(fleet);
                fS.setAirliner(airliner);
            }
        }
    }
    }
    
    public void ReadPersonData() {
        // Read Personvdata file
        String csvFile = "person.txt";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
                
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] PersonElement = line.split(cvsSplitBy); 

                Person person = customerDir.addPerson();
                person.setFirstName(PersonElement[0]);
                person.setLastName(PersonElement[1]);
                person.setGender(PersonElement[2]);
                person.setSsn(PersonElement[3]);

                // set between flight and seat
                for (FlightSchedule fS : mTS.getmTS()) {
                    for (Flight flight : fS.getFlightSchedule()) {
                        if (flight.getFlightNum().equals(PersonElement[4])) {
                            for(Seat seat: flight.getSeat()) {
                                if (Integer.parseInt(PersonElement[5]) == seat.getColGroup() &&
                                      PersonElement[6].equals(seat.getColPosition()) &&
                                        Integer.parseInt(PersonElement[7]) == seat.getRow()) {
                                    // Assign person with seat
                                    person.setSeat(seat);
                                    seat.setPerson(person);
                                    seat.setAvailability(false);
                                }
                            }
                        }
                    }
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
    }         
    
}
