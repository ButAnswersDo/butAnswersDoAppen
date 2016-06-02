package com.example.vbrigel.app00;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * This page contains all the sub categorys under the chosen category from the DefaultPage.
 * @author  butAnswersDo
 * @since   2016-05-11
 */
public class SubCategoryOther extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_other);
    }

    public void helpNow(View view) {
        HelperClass.setErrorSubCategory("Annat fel");
<<<<<<< HEAD
        View check = findViewById(R.id.editText);
=======
        View check = findViewById(R.id.editTextOther);
>>>>>>> master
        if(check instanceof EditText) {
            final EditText myInput1 = (EditText) check;
            HelperClass.setMessage("Åtgärda felet under dagen! " + myInput1.getText().toString()); //Takes the message typed by the bus driver and set it with the helper class.
            Intent popup = new Intent(this, PopUpClass.class);
            startActivity(popup);
        }
    }

    public void helpLater(View view) {
        HelperClass.setErrorSubCategory("Annat fel");
<<<<<<< HEAD
        View check = findViewById(R.id.editText);
=======
        View check = findViewById(R.id.editTextOther);
>>>>>>> master
        if(check instanceof EditText) {
            final EditText myInput2 = (EditText) check;
            HelperClass.setMessage("Åtgärda felet ikväll! " + myInput2.getText().toString()); //Takes the message typed by the bus driver and set it with the helper class.
            Intent popup = new Intent(this, PopUpClass.class);
            startActivity(popup);
        }
    }
}