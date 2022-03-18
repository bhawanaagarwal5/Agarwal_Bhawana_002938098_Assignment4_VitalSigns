/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functionality;

import java.util.ArrayList;

/**
 *
 * @author agarw
 */
public class vitalSignHistory {
    
    private  ArrayList<vitalReadings>  vitalSignHistory;

    public vitalSignHistory() {
        this.vitalSignHistory = new ArrayList<vitalReadings>();
    }


    public ArrayList<vitalReadings> getVitalSignHistory() {
        return vitalSignHistory;
    }
    
     public ArrayList<vitalReadings> getVitalSignHistoryByPatientName(String fnameToSearch) {
         
         ArrayList<vitalReadings>  vitalSignHistoryList = new ArrayList<>();
         for(int i =0; i< vitalSignHistory.size(); i++){
             vitalReadings vr = vitalSignHistory.get(i);
             //System.out.println(vr);
             if(vr.getPatientName().equals(fnameToSearch)){
                 vitalSignHistoryList.add(vr);
             }
         }
         //System.out.println(vitalSignHistoryList);
        return vitalSignHistoryList;
    }

    public void setVitalSignHistory(ArrayList<vitalReadings> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public void  deleteVitalSignDetails(vitalReadings vitalSignHistoryToBeRemoved)
    {
        vitalSignHistory.remove(vitalSignHistoryToBeRemoved);
        
    }
   
    public vitalReadings addVital()
    {
        vitalReadings readings = new vitalReadings();
        vitalSignHistory.add(readings);
        return readings;
    }
}
