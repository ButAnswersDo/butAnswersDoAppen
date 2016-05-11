package com.example.vbrigel.app00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;


public class DriverSeatSendPage2 extends AppCompatActivity {

    private Boolean checked1 = false;
    private Boolean checked2 = false;
    String message = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_seat_send_page2);
    }

    public void onClickCheckBox1(View view) {
        CheckBox box1 = (CheckBox) view;
        checked1 = box1.isChecked();
    }

    public void onClickCheckBox2(View view) {
        CheckBox box2 = (CheckBox) view;
        checked2 = box2.isChecked();
    }

    public void helpNowDriverSeat2(View view) {
        final EditText myInput1 = (EditText)findViewById(R.id.editText);
        String commentText = (myInput1.getText().toString());
        if (checked1)
            message = message + "Varnar för lågt lufttryck, ";
        if (checked2)
            message = message + "Gul varning: Stanna, säkerhet, dieselmotor, ";
        HelperClass.setMessage(message+commentText);
        HelperClass.setCriticality("Fixa snarast");
        message="";
        Intent popup = new Intent (this, PopUpClass.class);
        startActivity(popup);
    }

    public void helpLaterDriverSeat2(View view) {
        final EditText myInput2 = (EditText)findViewById(R.id.editText);
        String commentText2 = (myInput2.getText().toString());
        if (checked1)
            message = message + "Varnar för lågt lufttryck, ";
        if (checked2)
            message = message + "Gul varning: Stanna, säkerhet, dieselmotor, ";
        HelperClass.setMessage(message+commentText2);
        HelperClass.setCriticality("Fixa senare");
        message="";
        Intent popup = new Intent (this, PopUpClass.class);
        startActivity(popup);
    }
}
