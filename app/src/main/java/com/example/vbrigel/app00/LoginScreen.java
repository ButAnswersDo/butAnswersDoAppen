package com.example.vbrigel.app00;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;


public class LoginScreen extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
    }
    public void reportError(View view){
        Intent nextDoorPage = new Intent (this, MainActivity.class);
        startActivity(nextDoorPage);
        final Spinner spinnerbus = (Spinner) findViewById(R.id.spin);
        String busName = spinnerbus.getSelectedItem().toString();
        HelperClass.setBusName(busName);
    }

}
