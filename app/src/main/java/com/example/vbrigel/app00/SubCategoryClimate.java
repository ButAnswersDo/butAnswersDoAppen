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
public class SubCategoryClimate extends AppCompatActivity {

    /**
     *  Called when the activity is first created and will do all setup of "global" state in onCreate().
     * @param savedInstanceState This is the first parameter to onCreate method.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_climate_error);
    }

    /**
     * This method sets the current sub category error "Temperatur förare." and calls the method send().
     * @param view The view that was clicked and created in the climate_error.xml file.
     */
    public void climateDriverClicked(View view){
        HelperClass.setErrorSubCategory("Temperatur förare."); //Sets the error sub category to "Temperatur förare.".
        send();
    }

    /**
     * This method sets the current sub category error "Temperatur buss." and calls the method send().
     * @param view The view that was clicked and created in the climate_error.xml file.
     */
    public void climateBusClicked(View view){
        HelperClass.setErrorSubCategory("Temperatur buss."); //Sets the error sub category to "Temperatur buss."
        send();
    }

    /**
     * The method creates a new activity and send the user to it when the bus driver have pressed the one of the subcategories.
     */
    private void send(){
        Intent nextClimateError = new Intent(this, SendClimateError.class);
        startActivity(nextClimateError);
        onStop();
    }
}
