package com.example.vbrigel.app00;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The purpose with this class is to spread the information between the classes and offer the functionalty to all classes.
 * @author  butAnswersDo
 * @since   2016-05-11
 */

public class HelperClass {
    private static String busName;
    private static String errorCategory;
    private static String errorSubCategory;
    private static String message;


    /**
     * This method sets the busname.
     * @param newBusName This variabel takes in the busname
     */
    public static void setBusName(String newBusName){
        busName = newBusName;
    }

    /**
     * This method sets the error category.
     * @param newErrorCategory
     */
    public static void setErrorCategory (String newErrorCategory){
        errorCategory=newErrorCategory;
    }

    /**
     * This method sets the sub category of the error.
     * @param newErrorSubCategory
     */
    public static void setErrorSubCategory (String newErrorSubCategory){
        errorSubCategory=newErrorSubCategory;
    }

    /**
     * This method sets the message from the bus drivers choices.
     * @param errorMessage
     */
    public static void setMessage(String errorMessage){
        message=errorMessage;
    }

    /**
     * This method get and returns the name/ID of the bus.
     * @return Returns the name/ID of the bus as a string.
     */
    public static String getBusName(){
        return busName;
    }

    /**
     * This method get and return the error category.
     * @return Returns the error category as a string.
     */
    public static String getErrorCategory(){
        return errorCategory;
    }

    /**
     * This method get and return the error sub category.
     * @return Returns the error sub category.
     */
    public static String getErrorSubCategory(){
        return errorSubCategory;
    }

    /**
     * This methodget and  return the current message.
     * @return Returns a string with information.
     */    public static String getMessage(){
        return message;
    }

    /**
     * This method gets the current time stamp from the android device.
     * @return Returns a string with the time and date or null when the date is now a valid date.
     */
    public static String getCurrentTimeStamp() {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String currentTimeStamp = dateFormat.format(new Date()); // Find todays date
            return currentTimeStamp;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * This method gets the error report tree and combines it with the time stamp.
     * @return Returns a string with all the information regarding errors and timestamp.
     */
    public static String getOutput() {
        return getCurrentTimeStamp()+", "+errorCategory+", "+errorSubCategory+", "+message;
    }
}
