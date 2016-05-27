package com.example.vbrigel.app00;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * This page contains all the sub categorys under the chosen category from the DefaultPage.
 * @author  butAnswersDo
 * @since   2016-05-11
 */
public class SubCategoryDoors extends AppCompatActivity {

    /**
     *  Called when the activity is first created and will do all setup of "global" state in onCreate().
     * @param savedInstanceState This is the first parameter to onCreate method.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_door_error);
    }

    /**
     * This method sets the current sub category error "fram" and calls the method send().
     * @param view The view that was clicked and created in the door_error.xml file.
     */
    public void frontDoorClicked(View view){
        HelperClass.setErrorSubCategory("fram"); //Sets the error sub category to "fram".
        send();
    }

    /**
     * This method sets the current sub category error "mitten" and calls the method send().
     * @param view The view that was clicked and created in the door_error.xml file.
     */
    public void centreDoorClicked(View view){
        HelperClass.setErrorSubCategory("mitten"); //Sets the error sub category to "mitten".
        send();
    }

    /**
     * This method sets the current sub category error "bak" and calls the method send().
     * @param view The view that was clicked and created in the door_error.xml file.
     */
    public void backDoorClicked(View view){
        HelperClass.setErrorSubCategory("bak"); //Sets the error sub category to "bak".
        send();
    }

    /**
     * This method sets the current sub category error "flera" and calls the method send().
     * @param view The view that was clicked and created in the door_error.xml file.
     */
    public void multipleDoorClicked(View view){
        HelperClass.setErrorSubCategory("flera"); //Sets the error sub category to "flera".
        send();
    }

    /**
     * The method creates a new activity and send the user to it when the bus driver have pressed the one of the subcategorys.
     */
    private void send(){
        Intent nextDoorError = new Intent(this, SendDoorError.class);
        startActivity(nextDoorError);
        onStop();
    }
}