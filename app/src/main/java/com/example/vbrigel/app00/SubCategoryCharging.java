package com.example.vbrigel.app00;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * This page contains all the sub categorys under the chosen category from the DefaultPage.
 * @author  butAnswersDo
 * @since   2016-05-11
 */
public class SubCategoryCharging extends Activity {

    /**
     *  Called when the activity is first created and will do all setup of "global" state in onCreate().
     * @param savedInstanceState This is the first parameter to onCreate method.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charge_error);
    }

    /**
     * This method sets the current sub category error "Laddstation Johanneberg" and calls the method send().
     * @param view The view that was clicked and created in the charge_error.xml file.
     */
    public void johannebergClicked(View view){
        HelperClass.setErrorSubCategory("Laddstation Johanneberg"); //Sets the error sub category to "Laddstation Johanneberg".
        send();
    }

    /**
     * This method sets the current sub category error "Laddstation Lindholmen" and calls the method send().
     * @param view The view that was clicked and created in the charge_error.xml file.
     */
    public void lindholmenClicked(View view){
        HelperClass.setErrorSubCategory("Laddstation Lindholmen");//Sets the error sub category to "Laddstation Lindholmen".
        send();
    }

    /**
     * The method creates a new activity and send the user to it when the bus driver have pressed the one of the subcategorys.
     */
    private void send(){
        Intent nextChargeError = new Intent(this, SendChargingError.class);
        startActivity(nextChargeError);
        onStop();
    }
}
