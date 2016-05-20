package com.example.vbrigel.app00;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * This page contains all the sub categorys under the chosen category from the DefaultPage.
 * @author  butAnswersDo
 * @since   2016-05-11
 */
public class SubCategorySeat extends AppCompatActivity {

    /**
     *  Called when the activity is first created and will do all setup of "global" state in onCreate().
     * @param savedInstanceState This is the first parameter to onCreate method.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_seat_error);
    }

    /**
     * This method sets the current sub category error "Förarstolen." and calls the method send().
     * @param view The view that was clicked and created in the driver_seat_error.xml file.
     */

    public void seatClicked(View view){
        HelperClass.setErrorSubCategory("Förarstolen."); //Sets the error sub category to "Förarstolen.".
        send1();
    }

    /**
     * This method sets the current sub category error "Instrumentbräda." and calls the method send().
     * @param view The view that was clicked and created in the driver_seat_error.xml file.
     */
    public void instrumentClicked(View view){
        HelperClass.setErrorSubCategory("Instrumentbräda."); //Sets the error sub category to "Instrumentbräda.".
        send2();
    }

    /**
     * This method sets the current sub category error "Övrigt." and calls the method send().
     * @param view The view that was clicked and created in the driver_seat_error.xml file.
     */
    public void otherClicked(View view){
        HelperClass.setErrorSubCategory("Övrigt."); //Sets the error sub category to "Övrigt.".
        send3();
    }

    /**
     * The method creates a new activity and send the user to it when the bus driver have pressed the "Förarstolen" button.
     */
    private void send1(){
        Intent nextDriverSeatError = new Intent(this, SendSeatErrorChair.class);
        startActivity(nextDriverSeatError);
        onStop();
    }

    /**
     * The method creates a new activity and send the user to it when the bus driver have pressed the "Instrumentbräda" button.
     */
    private void send2(){
        Intent nextDriverSeatError = new Intent(this, SendSeatErrorInstrumentBoard.class);
        startActivity(nextDriverSeatError);
        onStop();
    }

    /**
     * The method creates a new activity and send the user to it when the bus driver have pressed the "Other" button.
     */
    private void send3(){
        Intent nextDriverSeatError = new Intent(this, SendSeatErrorOther.class);
        startActivity(nextDriverSeatError);
        onStop();
    }

}
