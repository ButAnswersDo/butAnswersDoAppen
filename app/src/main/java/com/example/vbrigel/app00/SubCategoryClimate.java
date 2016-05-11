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
public class SubCategoryClimate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_climate_error);
    }

    public void climateDriverClicked(View view){
        HelperClass.setErrorSubCategory("Temperatur förare.");
        send();
    }
    public void climateBusClicked(View view){
        HelperClass.setErrorSubCategory("Temperatur buss.");
        send();
    }

    private void send(){
        Intent nextClimateError = new Intent(this, SendClimateError.class);
        startActivity(nextClimateError);
        onStop();
    }
}
