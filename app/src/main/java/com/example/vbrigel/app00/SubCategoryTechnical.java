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

    public void displayClicked(View view){
        HelperClass.setErrorSubCategory("Display.");
        send1();
    }
    public void ticketClicked(View view){
        HelperClass.setErrorSubCategory("Biljettautomat.");
        send2();
    }

    private void send1(){
        Intent nextTechnicalError = new Intent(this, SendTechnicalErrorDisplay.class);
        startActivity(nextTechnicalError);
        onStop();
    }

    private void send2(){
        Intent nextTechnicalError = new Intent(this, SendTechnicalErrorTicket.class);
        startActivity(nextTechnicalError);
        onStop();
    }

}
