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
public class vitalReadings {
    
    private String patientName;
    private float respiratoryRate;
    private float heartRate;
    private float systolicPressure;
    private float weightPounds;
    private String vitalSign;
    private String dateTime;
    private String cityName;
    private String CommunityName;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCommunityName() {
        return CommunityName;
    }

    public void setCommunityName(String CommunityName) {
        this.CommunityName = CommunityName;
    }
    
    
    
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    
    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public float getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(float respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public float getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(float heartRate) {
        this.heartRate = heartRate;
    }

    public float getSystolicPressure() {
        return systolicPressure;
    }

    public void setSystolicPressure(float systolicPressure) {
        this.systolicPressure = systolicPressure;
    }

    public float getWeightPounds() {
        return weightPounds;
    }

    public void setWeightPounds(float weightPounds) {
        this.weightPounds = weightPounds;
    }

    public String getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(String vitalSign) {
        this.vitalSign = vitalSign;
    }
    //private String dateTime;

    @Override
    public String toString() {
        //return  String.valueOf(respiratoryRate);
        return patientName;
    }
 
}
