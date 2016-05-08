package com.example.vbrigel.app00;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
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

    public void doorError(View view){
       Toast.makeText(getApplicationContext(), "Du har valt dörrfel", Toast.LENGTH_LONG).show();
       // myFirebaseRef.child(HelperClass.getBusName()).push().setValue("Framdörren " + HelperClass.getCurrentTimeStamp());
        Intent activityDoorError = new Intent(this, doorError.class);
        startActivity(activityDoorError);
    }

    public void climateError(View view){
        Toast.makeText(getApplicationContext(), "Du har valt klimatfel", Toast.LENGTH_LONG).show();
       // myFirebaseRef.child(HelperClass.getBusName()).push().setValue("Mittendörren " + HelperClass.getCurrentTimeStamp());
    }

    public void driftError(View view){
        Toast.makeText(getApplicationContext(), "Du har valt drivningsfel", Toast.LENGTH_LONG).show();
       // myFirebaseRef.child(HelperClass.getBusName()).push().setValue("Bakdörren " + HelperClass.getCurrentTimeStamp());
    }
}


