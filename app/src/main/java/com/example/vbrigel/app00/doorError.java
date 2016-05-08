package com.example.vbrigel.app00;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class doorError extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_door_error);
    }

    public void doorError(View view){
        Toast.makeText(getApplicationContext(), "Fel på XXX", Toast.LENGTH_LONG).show();
        // Här länkar vi sedan till sida nummer fyra(slutsidan).
        // Intent activityDoorError = new Intent(this, pageNumberFour.class);
        // startActivity(pageNumberFour);
    }

}
