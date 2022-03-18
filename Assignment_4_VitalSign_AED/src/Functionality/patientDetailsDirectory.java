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

public class patientDetailsDirectory {
    public ArrayList<patientDetails> patientDirectory;

    

    public patientDetailsDirectory() {
            patientDirectory = new ArrayList<>();
    }

    public ArrayList<patientDetails> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<patientDetails> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    public void  deletePatientDetails(patientDetails patientToBeDeleted)
    {
        patientDirectory.remove(patientToBeDeleted);
        
    }
    
    public patientDetails addPatient()
    {
       patientDetails pd = new patientDetails();
       patientDirectory.add(pd);
       return pd;
    }
    
}
