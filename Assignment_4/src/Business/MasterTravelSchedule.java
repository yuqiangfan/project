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
public class MasterTravelSchedule {
    private ArrayList<FlightSchedule> mTS;
    private int totalRevenue;

    public MasterTravelSchedule() {
        mTS = new ArrayList<FlightSchedule>();
    }
    
    public ArrayList<FlightSchedule> getmTS() {
        return mTS;
    }

    public void setmTS(ArrayList<FlightSchedule> mFS) {
        this.mTS = mFS;
    }


    public int getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(int totalRevenue) {
        this.totalRevenue = totalRevenue;
    }
    
    public FlightSchedule addFlightSchedule() {
        FlightSchedule fS = new FlightSchedule();
        mTS.add(fS);
        return fS;
    }
    
    public void deleteFlightSchedule(FlightSchedule fS) {
        mTS.remove(fS);
    }
}
