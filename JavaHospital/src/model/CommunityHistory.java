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
public class CommunityHistory {
    
     private ArrayList<Community> history;
    
    public CommunityHistory(){
        this.history = new ArrayList<Community>();
    }

    public ArrayList<Community> getHistory() {
        return history;
    } 

    public void setHistory(ArrayList<Community> history) {
        this.history = history;
    }
    public Community addNewCommunity(){
        
        Community newCommunity = new Community();
        history.add(newCommunity);
        return newCommunity;
    }
    
    public void deleteEmploys(Community vs){
        history.remove(vs);
    }
    
    
}
