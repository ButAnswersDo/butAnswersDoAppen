package com.example.vbrigel.app00;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.Firebase;

public class DoorSendPage1 extends Activity {
    private Firebase myFirebaseRef;
    private Boolean checked1 = false;
    private Boolean checked2 = false;
    private Boolean checked3 = false;
    String message = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_door1);
        Firebase.setAndroidContext(this);
        myFirebaseRef = new Firebase("https://crackling-inferno-4580.firebaseio.com");
    }

    public void onClickCheckBox1(View view) {
        CheckBox box1 = (CheckBox) view;
        checked1 = box1.isChecked();
    }
    public void onClickCheckBox2(View view) {
        CheckBox box2 = (CheckBox) view;
        checked2 = box2.isChecked();
    }
    public void onClickCheckBox3(View view) {
        CheckBox box3 = (CheckBox) view;
        checked3 = box3.isChecked();
    }

    public void helpNow(View view) {
        final EditText myInput1 = (EditText)findViewById(R.id.editText);
        String commentText = (myInput1.getText().toString());
            if (checked1)
                message = message + "Dörren gnisslar, ";
            if (checked2)
                message = message + "Dörren kan inte stängas, ";
            if (checked3)
                message = message + "Dörren kan inte öppnas, ";
        Toast.makeText(getApplicationContext(), "Bekräftat: Vi skickar hjälp direkt!", Toast.LENGTH_LONG).show();
        myFirebaseRef.child(HelperClass.getBusName()).push().setValue(HelperClass.getMessage() +" Skicka hjälp direkt. Anledning: " + message + commentText);
        message = "";

        Intent backToFirst = new Intent (this, MainActivity.class);
        startActivity(backToFirst);
    }

    public void helpLater(View view) {
        final EditText myInput2 = (EditText)findViewById(R.id.editText);
        String commentText2 = (myInput2.getText().toString());
        if (checked1)
            message = message + "Dörren gnisslar, ";
        if (checked2)
            message = message + "Dörren kan inte stängas, ";
        if (checked3)
            message = message + "Dörren kan inte öppnas, ";
        Toast.makeText(getApplicationContext(), "Bekräftat: Tack för informationen!", Toast.LENGTH_LONG).show();
        myFirebaseRef.child(HelperClass.getBusName()).push().setValue(HelperClass.getMessage()+" Åtgärda dessa fel senare: " + message + commentText2);
        message = "";

        Intent backToFirst = new Intent (this, MainActivity.class);
        startActivity(backToFirst);
    }
}
