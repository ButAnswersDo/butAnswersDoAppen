package com.example.vbrigel.app00;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.firebase.client.Firebase;
public class SecondDoorPage extends AppCompatActivity {
    private Firebase myFirebaseRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_door_page);
        Firebase.setAndroidContext(this);
        myFirebaseRef = new Firebase("https://crackling-inferno-4580.firebaseio.com");
    }

    public void frontBusDoor(View view){

        Toast.makeText(getApplicationContext(), "Bekräftat: Det är fel på framdörren", Toast.LENGTH_LONG).show();
        myFirebaseRef.child(HelperClass.getBusName()).push().setValue("Framdörren " + HelperClass.getCurrentTimeStamp());
    }

    public void middleBusDoor(View view){
        Toast.makeText(getApplicationContext(), "Bekräftat: Det är fel på mittendörren", Toast.LENGTH_LONG).show();
        myFirebaseRef.child(HelperClass.getBusName()).push().setValue("Mittendörren " + HelperClass.getCurrentTimeStamp());
    }

    public void backBusDoor(View view){
        Toast.makeText(getApplicationContext(), "Bekräftat: Det är fel på bakdörren", Toast.LENGTH_LONG).show();
        myFirebaseRef.child(HelperClass.getBusName()).push().setValue("Bakdörren " + HelperClass.getCurrentTimeStamp());
    }
}


