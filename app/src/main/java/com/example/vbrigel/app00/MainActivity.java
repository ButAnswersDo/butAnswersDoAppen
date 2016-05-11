package com.example.vbrigel.app00;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

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

    public void onClickBackButton(View view) {
        Intent backPage = new Intent (this, LoginScreen.class);
        startActivity(backPage);
    }
    public void onClickOtherButton(View view) {
        HelperClass.setErrorCategory("Annat fel");
        Intent nextOtherPage = new Intent (this, OtherSendPage.class);
        startActivity(nextOtherPage);
    }
    public void onClickChargeButton(View view) {
        HelperClass.setErrorCategory("Laddningsfel");
        Intent nextChargePage = new Intent (this, ChargeError.class);
        startActivity(nextChargePage);
    }
}
