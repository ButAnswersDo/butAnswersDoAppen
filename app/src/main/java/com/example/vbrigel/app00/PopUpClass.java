package com.example.vbrigel.app00;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;


/**
 * Created by Olof on 11/05/16.
 */
public class PopUpClass extends Activity {

    private Firebase myFirebaseRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popupwindow);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = (int) (dm.widthPixels * 0.8);
        int height = (int) (dm.heightPixels * 0.8);
        getWindow().setLayout(width, height);
        TextView report1 = (TextView) findViewById(R.id.errorLogg1);
        TextView report2 =(TextView) findViewById(R.id.errorLogg2);
        if(HelperClass.getErrorCategory() == "Annat fel")
            report1.setText("Felorsak: "+HelperClass.getErrorCategory());
        else
        report1.setText("Felorsak: "+HelperClass.getErrorCategory()+HelperClass.getErrorSubCategory());

        report2.setText("Kommentar: "+HelperClass.getMessage());
        Firebase.setAndroidContext(this);
        myFirebaseRef = new Firebase("https://crackling-inferno-4580.firebaseio.com");
    }
    public void sendReport(View view) {
        Toast.makeText(getApplicationContext(), "Din felrapport har skickats!", Toast.LENGTH_LONG).show();
        myFirebaseRef.child(HelperClass.getBusName()).push().setValue(HelperClass.getOutput());
        Intent backToDefaultPage = new Intent (this, DefaultPage.class);
        startActivity(backToDefaultPage);
    }

    public void cancelReport(View view){
        Toast.makeText(getApplicationContext(), "Ej skickat!", Toast.LENGTH_LONG).show();
        Intent backToFirst =new Intent(this,DefaultPage.class);
        startActivity(backToFirst);
    }


}
