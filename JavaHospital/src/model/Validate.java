/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ashis
 */
public class Validate {
    
    public static boolean validateEmail(String email){
    
        boolean status = false;
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            status = true;
        }else{
            status = false;
        }
        return status;
    }
    
    public static boolean validatePhone(String number){
        boolean status1 = false;
        String regex = "(0/91)?[7-9][0-9]{9}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        if(matcher.matches()){
            status1 = true;
        }else{
            status1 = false;
        }
        return status1;
    }
    
    public static boolean validateTime(String time){
        boolean status2 = false;
        String regex = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(time);
        if(matcher.matches()){
            status2 = true;
        }else{
            status2 = false;
        }
        return status2;
    }
    
    
    public static boolean validateDate(String date){
        boolean status3 = false;
        String regex = "^(1[0-2]|0[1-9])/(3[01]" + "|[12][0-9]|0[1-9])/[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        if(matcher.matches()){
            status3 = true;
        }else{
            status3 = false;
        }
        return status3;
    }
    
   
    
    
}
