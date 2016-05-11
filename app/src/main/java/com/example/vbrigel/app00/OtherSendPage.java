package com.example.vbrigel.app00;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class OtherSendPage extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_other);
    }

    public void helpNow(View view) {
        final EditText myInput1 = (EditText)findViewById(R.id.editTextOther);
        String commentText = (myInput1.getText().toString());

        HelperClass.setMessage(commentText);
        HelperClass.setCriticality("Fixa snarast");
        Intent popup = new Intent(this, PopUpClass.class);
        startActivity(popup);
    }

    public void helpLater(View view) {
        final EditText myInput2 = (EditText)findViewById(R.id.editTextOther);
        String commentText2 = (myInput2.getText().toString());

        HelperClass.setMessage(commentText2);
        HelperClass.setCriticality("Fixa det senare");
        Intent popup = new Intent(this, PopUpClass.class);
        startActivity(popup);
    }
}
