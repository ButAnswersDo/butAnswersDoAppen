package com.example.vbrigel.app00;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelperClass {
    private static String bus;
    private static String error;
    private static String subError;
    private static String message;
    private static String criticality;

    //Set the busName
    public static void setBusName(String busName){
        bus = busName;
    }
    //Set the error category
    public static void setErrorCategory (String errorCategory){
        error=errorCategory;
    }
    //Set the error sub category
    public static void setErrorSubCategory (String errorSubCategory){
        subError="_"+errorSubCategory;
    }
    //Set the message
    public static void setMessage(String errorMessage){
        message=errorMessage;
    }
    //Set the criticality for the error report
    public static void setCriticality(String critical){
        criticality=critical;
    }


    //Get the name/id of the bus
    public static String getBusName(){
        return bus;
    }
    //Get the error category
    public static String getErrorCategory(){
        return error;
    }
    //Get the erro sub category
    public static String getErrorSubCategory(){
        return subError;
    }
    //Get the message
    public static String getMessage(){
        return message;
    }
    //Get the criticality
    public static String getCriticality(){
        return criticality;
    }

    //Get the current time stamp from the android device
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

    //Get the error report tree combined with the time stamp
    public static String getOutput() {
        return getCurrentTimeStamp()+"   "+error+subError+","+criticality+","+message;
    }
}
