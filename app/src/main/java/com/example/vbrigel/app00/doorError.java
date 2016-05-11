package com.example.vbrigel.app00;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DoorError extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_door_error);
    }

    public void frontDoorClicked(View view){
        HelperClass.setErrorSubCategory("front");
        send();
    }
    public void centreDoorClicked(View view){
        HelperClass.setErrorSubCategory("mitten");
        send();
    }
    public void backDoorClicked(View view){
        HelperClass.setErrorSubCategory("bak");
        send();
    }
    public void multipleDoorClicked(View view){
        HelperClass.setErrorSubCategory("flera");
        send();
    }

    private void send(){
        Intent nextDoorError = new Intent(this, DoorSendPage1.class);
        startActivity(nextDoorError);
    }
}
