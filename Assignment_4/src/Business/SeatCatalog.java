/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author PythonNo1
 */
public class SeatCatalog {
    private ArrayList<Seat> seatCatalog;
    private Flight flight;
    
    public SeatCatalog() {
        seatCatalog = new ArrayList<Seat>();
    }

    public ArrayList<Seat> getSeatCatalog() {
        return seatCatalog;
    }

    public void setSeatCatalog(ArrayList<Seat> seatCatalog) {
        this.seatCatalog = seatCatalog;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    
    public Seat addSeat() {
        Seat seat = new Seat();
        seatCatalog.add(seat);
        return seat;
    }
    
    public void deleteSeat(Seat seat) {
        seatCatalog.remove(seat);
    }
}
