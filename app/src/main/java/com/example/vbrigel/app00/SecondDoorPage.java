package com.example.vbrigel.app00;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class SecondDoorPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_door_page);

    }
    public void frontBusDoor(View view){
        Toast.makeText(getApplicationContext(), "Bekräftat: Det är fel på framdörren", Toast.LENGTH_LONG).show();
    }

    public void middleBusDoor(View view){
        Toast.makeText(getApplicationContext(), "Bekräftat: Det är fel på mittendörren", Toast.LENGTH_LONG).show();
    }

    public void backBusDoor(View view){
        Toast.makeText(getApplicationContext(), "Bekräftat: Det är fel på bakdörren", Toast.LENGTH_LONG).show();
    }
}


