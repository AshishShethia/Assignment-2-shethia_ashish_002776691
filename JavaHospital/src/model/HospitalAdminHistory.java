/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ashis
 */
public class HospitalAdminHistory {
    
     private ArrayList<HospitalAdmin> history;
     
     public HospitalAdminHistory(){
        this.history = new ArrayList<HospitalAdmin>();
    }

    public ArrayList<HospitalAdmin> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<HospitalAdmin> history) {
        this.history = history;
    }
    public HospitalAdmin addNewHospitalAdmin(){
        
        HospitalAdmin newHospitalAdmin = new HospitalAdmin();
        history.add(newHospitalAdmin);
        return newHospitalAdmin;
    }
    
    public void deleteHospitalAdmin(HospitalAdmin vs){
        history.remove(vs);
    }
    
}
     
    

