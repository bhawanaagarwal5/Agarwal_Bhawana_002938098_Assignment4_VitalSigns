/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functionality;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author agarw
 */
public class city {
      
    String cityName;
    static HashMap<String, List<community>> citymap = new HashMap();

    public static HashMap<String, List<community>> getCitymap() {
        return citymap;
    }

    public static void setCitymap(HashMap<String, List<community>> citymap) {
        city.citymap = citymap;
    }


   
   public  void  setCommunityList(community community)
   {
       List<community> list = citymap.getOrDefault(this.getCityName(), new ArrayList());
       boolean result = true;
       for(community c : list){
           if(c.getCommunityName().equals(community.getCommunityName()))
           {
               result = false;
               break;
           }
       }
       
       if(result)
       {
           list.add(community);
       }
       
       citymap.put(this.getCityName(), list);
       
   }
    public int getPincode() {
        return 0;
    }

    public void setPincode(int pincode) {
        
    }

    public String getCommunityName() {
        return "";
    }

    public void setCommunityName(String communityName) {
        
    }
   
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
    
    
    
    public int getHouseNo() {
        return 0;
    }

    public void setHouseNo(int houseNo) {
        
    }

    public void setHouseList(house house)
    {
     
    }
    
}
