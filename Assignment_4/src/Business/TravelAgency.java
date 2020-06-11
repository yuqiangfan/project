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
public class TravelAgency {
    private AirlinerDirectory airlinerDir;
    private MasterTravelSchedule mTS;
    private CustomerDirectory customerDir;

    public AirlinerDirectory getAirlinerDir() {
        return airlinerDir;
    }

    public void setAirlinerDir(AirlinerDirectory airlinerDir) {
        this.airlinerDir = airlinerDir;
    }

    public MasterTravelSchedule getMTS() {
        return mTS;
    }

    public void setMTS(MasterTravelSchedule mTS) {
        this.mTS = mTS;
    }

    public CustomerDirectory getCustomerDir() {
        return customerDir;
    }

    public void setCustomerDir(CustomerDirectory customerDir) {
        this.customerDir = customerDir;
    }
    
    
}
