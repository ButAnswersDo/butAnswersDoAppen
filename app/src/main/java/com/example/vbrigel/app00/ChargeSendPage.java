package com.example.vbrigel.app00;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class ChargeSendPage extends Activity {
    private Boolean checked1 = false;
    private Boolean checked2 = false;
    private Boolean checked3 = false;
    String message = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_charge);
    }

    public void onClickCharge1(View view) {
        CheckBox box1 = (CheckBox) view;
        checked1 = box1.isChecked();
    }
    public void onClickCharge2(View view) {
        CheckBox box2 = (CheckBox) view;
        checked2 = box2.isChecked();
    }
    public void onClickCharge3(View view) {
        CheckBox box3 = (CheckBox) view;
        checked3 = box3.isChecked();
    }

    public void helpNow(View view) {
        final EditText myInput1 = (EditText)findViewById(R.id.editTextCharge);
        String commentText = (myInput1.getText().toString());
        if (checked1)
            message = message + "Laddstation ur funktion, ";
        if (checked2)
            message = message + "Bussen laddades inte fullt, ";
        if (checked3)
            message = message + "Pantografen fäster inte, ";
        HelperClass.setMessage(message+commentText);
        HelperClass.setCriticality("Fixa snarast");
        message="";
        Intent popup = new Intent(this, PopUpClass.class);
        startActivity(popup);
    }

    public void helpLater(View view) {
        final EditText myInput2 = (EditText)findViewById(R.id.editTextCharge);
        String commentText2 = (myInput2.getText().toString());
        if (checked1)
            message = message + "Laddstation ur funktion, ";
        if (checked2)
            message = message + "Bussen laddades inte fullt, ";
        if (checked3)
            message = message + "Pantografen fäster inte, ";
        HelperClass.setMessage(message+commentText2);
        HelperClass.setCriticality("Fixa det senare");
        message="";
        Intent popup = new Intent(this, PopUpClass.class);
        startActivity(popup);
    }
}
