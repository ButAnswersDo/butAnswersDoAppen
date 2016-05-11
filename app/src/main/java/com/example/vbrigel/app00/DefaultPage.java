package com.example.vbrigel.app00;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * This page contains the different error categorys identified by butAnswersDo, Veolia and Volvo.
 *The bus driver selects which area a error lies within.
 * @author  butAnswersDo
 * @since   2016-05-11
 */

public class DefaultPage extends AppCompatActivity {

    /**
     *  Called when the activity is first created and will do all setup of "global" state in onCreate().
     * @param savedInstanceState This is the first parameter to onCreate method.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * The section contains methods creating a new activity and send the user to it when the bus driver have pressed a category.
     * @param view The view that was clicked and created in the activity_main.xml file.
     */
    public void onClickDoorButton(View view) {
        HelperClass.setErrorCategory("Dörrar"); //Sets the error category to "Dörrar".
        Intent nextDoorPage = new Intent (this, SubCategoryDoors.class);
        startActivity(nextDoorPage);
        onStop(); //Pauses this activity to gain more process power to current active activity.
    }

    public void onClickBackButton(View view) {
        Intent backPage = new Intent (this, LoginScreen.class);
        startActivity(backPage);
        onStop();
    }
    public void onClickOtherButton(View view) {
        HelperClass.setErrorCategory("Annat fel");
        Intent nextOtherPage = new Intent (this, SubCategoryOther.class);
        startActivity(nextOtherPage);
        onStop();
    }
    public void onClickChargeButton(View view) {
        HelperClass.setErrorCategory("Laddningsfel");
        Intent nextChargePage = new Intent(this, SubCategoryCharging.class);
        startActivity(nextChargePage);
        onStop();
    }
    public void onClickClimateButton(View view) {
        HelperClass.setErrorCategory("Klimat");
        Intent nextClimatePage = new Intent (this, SubCategoryClimate.class);
        startActivity(nextClimatePage);
        onStop();
    }
    public void onClickDriverSeatButton(View view) {
        HelperClass.setErrorCategory("Förarsätet");
        Intent nextDriverSeatPage = new Intent (this, SubCategorySeat.class);
        startActivity(nextDriverSeatPage);
        onStop();
    }
}
