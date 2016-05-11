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
public class SubCategorySeat extends AppCompatActivity {

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
        Intent nextDriverSeatError = new Intent(this, SendSeatErrorChair.class);
        startActivity(nextDriverSeatError);
        onStop();
    }

    private void send2(){
        Intent nextDriverSeatError = new Intent(this, SendSeatErrorInstrumentBoard.class);
        startActivity(nextDriverSeatError);
        onStop();
    }

    private void send3(){
        Intent nextDriverSeatError = new Intent(this, SendSeatErrorOther.class);
        startActivity(nextDriverSeatError);
        onStop();
    }

}
