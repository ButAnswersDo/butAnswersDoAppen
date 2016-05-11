package com.example.vbrigel.app00;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * This page contains all the sub categorys under the chosen category from the DefaultPage.
 * @author  butAnswersDo
 * @since   2016-05-11
 */
public class SubCategoryCharging extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charge_error);
    }

    public void johannebergClicked(View view){
        HelperClass.setErrorSubCategory("Laddstation Johanneberg");
        send();
    }
    public void lindholmenClicked(View view){
        HelperClass.setErrorSubCategory("Laddstation Lindholmen");
        send();
    }

    private void send(){
        Intent nextChargeError = new Intent(this, SendChargingError.class);
        startActivity(nextChargeError);
        onStop();
    }
}
