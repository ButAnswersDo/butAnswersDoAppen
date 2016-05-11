package com.example.vbrigel.app00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DriverSeatError extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_seat_error);
    }

    public void seatClicked(View view){
        HelperClass.setErrorSubCategory("Förarstolen.");
        send1();
    }
    public void instrumentClicked(View view){
        HelperClass.setErrorSubCategory("Instrumentbräda.");
        send2();
    }

    public void otherClicked(View view){
        HelperClass.setErrorSubCategory("Övrigt.");
        send3();
    }

    private void send1(){
        Intent nextDriverSeatError = new Intent(this, DriverSeatSendPage1.class);
        startActivity(nextDriverSeatError);
    }

    private void send2(){
        Intent nextDriverSeatError = new Intent(this, DriverSeatSendPage2.class);
        startActivity(nextDriverSeatError);
    }

    private void send3(){
        Intent nextDriverSeatError = new Intent(this, DriverSeatSendPage3.class);
        startActivity(nextDriverSeatError);
    }

}
