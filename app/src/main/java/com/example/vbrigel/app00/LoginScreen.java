package com.example.vbrigel.app00;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;


public class LoginScreen extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
    }
    public void reportError(View view){
        Intent nextDoorPage = new Intent (this, MainActivity.class);
        startActivity(nextDoorPage);
        final Spinner spinnerbus = (Spinner) findViewById(R.id.spin);
        String busName = spinnerbus.getSelectedItem().toString();
        HelperClass help = new HelperClass();
        help.setBusName(busName);
        Toast.makeText(getApplicationContext(), busName, Toast.LENGTH_LONG).show();

    }

}
