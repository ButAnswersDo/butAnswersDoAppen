package com.example.vbrigel.app00;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClickDoorButton(View view) {
        HelperClass.setErrorCategory("Dörrar");
        Intent nextDoorPage = new Intent (this, DoorError.class);
        startActivity(nextDoorPage);
    }

    
}
