package com.example.vbrigel.app00;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelperClass {
    public static String bus ="";

    public void setBusName(String busName){
        this.bus = busName;
    }

    //get the name/id of the bus from the scroll down list
    public static String getBusName(){
        return bus;
    }

    //Get time stamp from the android device
    public static String getCurrentTimeStamp(){
        try {

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String currentTimeStamp = dateFormat.format(new Date()); // Find todays date

            return currentTimeStamp;
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }
}
