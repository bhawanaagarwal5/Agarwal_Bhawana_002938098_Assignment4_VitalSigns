/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functionality;

/**
 *
 * @author agarw
 */
public class patientDetails {
    private String patientFirstName;
    private String patientID;
    private int age;
    private String doctorName;
    private String prefPharmacy;
    private vitalReadings vitalSign;

    public vitalReadings getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(vitalReadings vitalSign) {
        this.vitalSign = vitalSign;
    }
    private vitalSignHistory vitalSignHisotry;

    public vitalSignHistory getVitalSignHisotry() {
        return vitalSignHisotry;
    }

    public void setVitalSignHisotry(vitalSignHistory vitalSignHisotry) {
        this.vitalSignHisotry = vitalSignHisotry;
    }

    /*public vitalReadings getVitalSign() {
        return vitalSign;
    }*/

   /* public void setVitalSign(vitalReadings vitalSign) {
        this.vitalSign = vitalSign;
    }*/
    
    public String getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }





    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPrefPharmacy() {
        return prefPharmacy;
    }

    public void setPrefPharmacy(String prefPharmacy) {
        this.prefPharmacy = prefPharmacy;
    }

    @Override
    public String toString()
    {
        return patientFirstName;
    }
    
    
}
