package com.example.vbrigel.app00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class SendTechnicalErrorTicket extends AppCompatActivity {

    private Boolean checked1 = false;
    private Boolean checked2 = false;
    String message = "";

    /**
     *  Called when the activity is first created and will do all setup of "global" state in onCreate().
     *  This method also creates a reference to the database service.
     * @param savedInstanceState This is the first parameter to onCreate method.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_technical_error_ticket);
    }

    /**
     * This following two methods checks if the checkbox #X has been pressed, also known as checked.
     * @param view Takes in a view(checkbox) generated from the activity_send_door1.xml.
     */

    public void onClickCheckBox1(View view) {
        if(view instanceof CheckBox) {
            CheckBox box1 = (CheckBox) view;
            checked1 = box1.isChecked();
        }
    }

    public void onClickCheckBox2(View view) {
        if(view instanceof CheckBox) {
            CheckBox box2 = (CheckBox) view;
            checked1 = box2.isChecked();
        }
    }

    /**
     * This method is created for the button "HelpNow" and renders a message to be sent to the database. It also displays a message that the error will be handled immediately.
     * @param view Takes in a view(button) generated from the activity_send_technical_error_display.xml.
     */

    public void helpNowTechnical2(View view) {
        final EditText myInput1 = (EditText)findViewById(R.id.editText);
        String commentText = (myInput1.getText().toString());
        if (checked1)
            message = message + "Kortläsare fram ur funktion, ";
        if (checked2)
            message = message + "Kortläsare bak ur funktion, ";
        HelperClass.setMessage(message+commentText);
        HelperClass.setCriticality("Fixa snarast");
        message="";
        Intent popup = new Intent (this, PopUpClass.class);
        startActivity(popup);
    }

    /**
     * This method is created for the button "HelpLater" and renders a message to be sent to the database.
     * @param view Takes in a view(button) generated from the activity_send_technical_error_ticket.xml.
     */

    public void helpLaterTechnical2(View view) {
        final EditText myInput2 = (EditText)findViewById(R.id.editText);
        String commentText2 = (myInput2.getText().toString());
        if (checked1)
            message = message + "Kortläsare fram ur funktion, ";
        if (checked2)
            message = message + "Kortläsare bak ur funktion, ";
        HelperClass.setMessage(message+commentText2);
        HelperClass.setCriticality("Fixa senare");
        message="";

        Intent popup = new Intent (this, PopUpClass.class);
        startActivity(popup);
    }
}