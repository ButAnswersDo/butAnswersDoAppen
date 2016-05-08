package com.example.vbrigel.app00;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class doorError extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_door_error);
    }

    public void doorClicked(View view){
        Intent nextDoorError = new Intent(this, DoorSendPage1.class);
        startActivity(nextDoorError);
    }

}
