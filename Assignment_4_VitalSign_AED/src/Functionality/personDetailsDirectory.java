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
//import BusinessLayer.personDetails;
import java.util.ArrayList;


public class personDetailsDirectory {
    public personDetails personDetails;
    private ArrayList<personDetails> personDirectory;
      public personDetailsDirectory()
    {
        personDirectory = new ArrayList<>();
    }

    public ArrayList<personDetails> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<personDetails> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public void  deletePersonDetails(personDetails personToBeDeleted)
    {
        personDirectory.remove(personToBeDeleted);
        
    }


    public personDetails addPerson()
    {
     personDetails pd = new personDetails();
     personDirectory.add(pd);
     return pd;
    }
    
    
    
}
