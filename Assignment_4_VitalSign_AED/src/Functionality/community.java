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
public class community extends city {
    
    String communityName;
    static HashMap<String,List<house>> communitymap = new HashMap();

    public static HashMap<String, List<house>> getCommunitymap() {
        return communitymap;
    }
    public void setHouseList(house house)
    {
        List<house> list = communitymap.getOrDefault(this.getCommunityName(), new ArrayList());
        list.add(house);
        communitymap.put(this.getCommunityName(), list);
        //System.out.println(" Map Size "+communitymap.size() +" "+ this.getCommunityName());
    }
  
    
    public String getCommunityName() {
        return communityName;
    }
    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

}