package com.example.vbrigel.app00;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SubCategoryTechnical extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technical_error);
    }

    public void seatClicked(View view){
        HelperClass.setErrorSubCategory("Display.");
        send1();
    }
    public void instrumentClicked(View view){
        HelperClass.setErrorSubCategory("Biljettautomat.");
        send2();
    }

    private void send1(){
        Intent nextDriverSeatError = new Intent(this, SendSeatErrorChair.class);
        startActivity(nextDriverSeatError);
        onStop();
    }

    private void send2(){
        Intent nextDriverSeatError = new Intent(this, SendSeatErrorInstrumentBoard.class);
        startActivity(nextDriverSeatError);
        onStop();
    }

}
