package com.example.vbrigel.app00;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

/**
 * The XXX application have been developed for bus 55. The purpose is to make the reporting process of errors on the bus easier.
 * This is the login screen, the first screen that comes up for the user after starting the application,
 * where the bus driver chooses which bus he/she is on and then log in.
 * @author  butAnswersDo
 * @since   2016-05-11
 */

public class LoginScreen extends Activity {

    /**
     *  Called when the activity is first created and will do all setup of "global" state in onCreate().
     * @param savedInstanceState This is the first parameter to onCreate method.
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
    }

    /**
     * This method lets the bus driver select which bus he/she is on by choosing all available busses from a spinner.
     * The method also creates a new activity and send the user to it when the bus driver have pressed the button "okej".
     * @param view The view that was clicked and created in the activity_login_screen.xml file.
     */
    public void selectBuss(View view){
        Intent startDefaultPage = new Intent (this, DefaultPage.class);
        startActivity(startDefaultPage);
        final Spinner spinnerbus = (Spinner) findViewById(R.id.spin); //Creates a spinner
        String busName = spinnerbus.getSelectedItem().toString();
        HelperClass.setBusName(busName);
    }
}
