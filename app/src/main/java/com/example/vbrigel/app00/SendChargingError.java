package com.example.vbrigel.app00;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

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

public class SendChargingError extends Activity {
    private Boolean checked1 = false;
    private Boolean checked2 = false;
    private Boolean checked3 = false;
    String message = "";

    /**
     *  Called when the activity is first created and will do all setup of "global" state in onCreate().
     *  This method also creates a reference to the database service.
     * @param savedInstanceState This is the first parameter to onCreate method.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_charge);
    }
    /**
     * This following three methods checks if the checkbox #X has been pressed, also known as checked.
     * @param view Takes in a view(checkbox) generated from the activity_send_charge.xml.
     */
    public void onClickCharge1(View view) {
        if(view instanceof CheckBox) {
            CheckBox box1 = (CheckBox) view;
            checked1 = box1.isChecked();
        }
    }

    public void onClickCharge2(View view) {
        if(view instanceof CheckBox) {
            CheckBox box2 = (CheckBox) view;
            checked2 = box2.isChecked();
        }
    }
    public void onClickCharge3(View view) {
        if(view instanceof CheckBox) {
            CheckBox box3 = (CheckBox) view;
            checked3 = box3.isChecked();
        }
    }

    /**
     * This method is created for the button "HelpNow" and renders a message to be sent to the database. It also displays a message that the error will be handled immediately.
     * @param view Takes in a view(button) generated from the activity_send_charge.xml.
     */

    public void helpNowCharging(View view) {
        View check = findViewById(R.id.editTextCharge);
        if(check instanceof EditText) {
            final EditText myInput1 = (EditText) check;
            String commentText = (myInput1.getText().toString());
            if (checked1)
                message = message + "Laddstation ur funktion, ";
            if (checked2)
                message = message + "Bussen laddades inte fullt, ";
            if (checked3)
                message = message + "Pantografen fäster inte, ";
            HelperClass.setMessage("Åtgärda felet under dagen! " + message + ", " + commentText);
            message = "";
            Intent popup = new Intent(this, PopUpClass.class);
            startActivity(popup);
        }
    }

    /**
     * This method is created for the button "HelpLater" and renders a message to be sent to the database.
     * @param view Takes in a view(button) generated from the activity_send_charge1.xml.
     */

    public void helpLaterCharging(View view) {
        View check = findViewById(R.id.editTextCharge);
        if(check instanceof EditText) {
            final EditText myInput2 = (EditText) check;
                    String commentText2 = (myInput2.getText().toString());
            if (checked1)
                message = message + "Laddstation ur funktion, ";
            if (checked2)
                message = message + "Bussen laddades inte fullt, ";
            if (checked3)
                message = message + "Pantografen fäster inte, ";
            HelperClass.setMessage("Åtgärda felet ikväll! " + message + ", " + commentText2);
            message = "";
            Intent popup = new Intent(this, PopUpClass.class);
            startActivity(popup);
        }
    }
}
