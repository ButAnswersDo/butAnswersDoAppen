package com.example.vbrigel.app00;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
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
public class SendSeatErrorChair extends AppCompatActivity {

    private Boolean checked1 = false;
    private Boolean checked2 = false;
    String message = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_seat_send_page1);
    }

    /**
     * This following three methods checkss if the checkbox #X has been pressed, also known as checked.
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

    public void helpNowDriverSeat1(View view) {
        final EditText myInput1 = (EditText)findViewById(R.id.editText);
        String commentText = (myInput1.getText().toString());
        if (checked1)
            message = message + "Fel på reglage, ";
        if (checked2)
            message = message + "Stolsvärme ur funktion, ";
        HelperClass.setMessage("Skicka hjälp nu! " + message + ", "+commentText);
        message="";
        Intent popup = new Intent (this, PopUpClass.class);
        startActivity(popup);
    }

    public void helpLaterDriverSeat1(View view) {
        final EditText myInput2 = (EditText)findViewById(R.id.editText);
        String commentText2 = (myInput2.getText().toString());
        if (checked1)
            message = message + "Fel på reglage, ";
        if (checked2)
            message = message + "Stolsvärme ur funktion, ";
        HelperClass.setMessage("Åtgärda felet senare " + message+ ", "+commentText2);
        message="";

        Intent popup = new Intent (this, PopUpClass.class);
        startActivity(popup);
    }
}
