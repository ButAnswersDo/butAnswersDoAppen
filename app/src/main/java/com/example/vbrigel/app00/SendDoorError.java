package com.example.vbrigel.app00;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.firebase.client.Firebase;

/**
 * This page is the last page before returning sending the bus driver back to the DefaultPage.
 * This class lets the bus drives add more details to the error both by pressing on checkboxes filled with standardized quotes
 * and by filling in some extra information in a separate text field if needed.
 * Before sending the message a confirmation window will pop up.
 * The bus driver also chooses if the error need to be handled right now or not,
 * giving us two methods with same functionality linked to the buttons in the XML file.
 * @author  butAnswersDo
 * @since   2016-05-11
 */
public class SendDoorError extends AppCompatActivity{
    private Boolean checkBox1 = false; //A boolean variable tied to each checkbox containing a quote.
    private Boolean checkBox2 = false;
    private Boolean checkBox3 = false;
    String message = "";

    /**
     *  Called when the activity is first created and will do all setup of "global" state in onCreate().
     *  This method also creates a reference to the database service.
     * @param savedInstanceState This is the first parameter to onCreate method.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_door1);
        Firebase.setAndroidContext(this);
    }

    /**
     * The following three methods checks if the checkbox #X has been pressed, also known as checked.
     * @param view Takes in a view(checkbox) generated from the activity_send_door1.xml.
     */
    public void onClickCheckBox1(View view) {
        if(view instanceof CheckBox){
            CheckBox box1 = (CheckBox) view;
            checkBox1 = box1.isChecked();
        }
    }

    public void onClickCheckBox2(View view) {
        if(view instanceof CheckBox) {
            CheckBox box2 = (CheckBox) view;
            checkBox2 = box2.isChecked();
        }
    }

    public void onClickCheckBox3(View view) {
        if(view instanceof CheckBox) {
            CheckBox box3 = (CheckBox) view;
            checkBox3 = box3.isChecked();
        }
    }

    /**
     * This method is created for the button "HelpNow" and renders a message to be sent to the database. It also displays a message that the error will be handled immediately.
     * @param view Takes in a view(button) generated from the activity_send_door1.xml.
     */
    public void helpNowDoor(View view) {
        View check = findViewById(R.id.editText);
        if(check instanceof EditText) {
            final EditText myInput1 = (EditText) check;
            String commentText = (myInput1.getText().toString());
            if (checkBox1)
                message = message + "Dörren gnisslar, ";
            if (checkBox2)
                message = message + "Dörren kan inte stängas, ";
            if (checkBox3)
                message = message + "Dörren kan inte öppnas, ";
            HelperClass.setMessage("Åtgärda felet under dagen! " + message + ", " + commentText);
            message = ""; //Resets the message
            Intent popup = new Intent(this, PopUpClass.class);
            startActivity(popup);
        }
    }

    /**
     * This method is created for the button "HelpLater" and renders a message to be sent to the database.
     * @param view Takes in a view(button) generated from the activity_send_door1.xml.
     */
    public void helpLaterDoor(View view) {

        View check = findViewById(R.id.editText);
        if(check instanceof EditText) {
            final EditText myInput2 = (EditText) check;
            String commentText2 = (myInput2.getText().toString());
            if (checkBox1)
                message = message + "Dörren gnisslar, ";
            if (checkBox2)
                message = message + "Dörren kan inte stängas, ";
            if (checkBox3)
                message = message + "Dörren kan inte öppnas, ";
            HelperClass.setMessage("Åtgärda felet ikväll! " + message + ", " + commentText2);
            message = ""; //Resets the message
            Intent popup = new Intent(this, PopUpClass.class);
            startActivity(popup);
        }
    }
}

