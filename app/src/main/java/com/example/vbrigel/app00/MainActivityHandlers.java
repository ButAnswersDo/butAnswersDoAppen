package com.example.vbrigel.app00;

/**
 * Created by Anton on 2016-04-27.
 */

import android.content.Context;
import android.content.Intent;
import android.databinding.BaseObservable;
import android.view.View;
import android.widget.Toast;


public class MainActivityHandlers extends BaseObservable{
    private Context contextdoor;
    private Context contextwhichdoor;
    public void onClickDoorButton(View view) {

        contextdoor = view.getContext();
        Intent nextDoorPage = new Intent (contextdoor, SecondDoorPage.class);
        contextdoor.startActivity(nextDoorPage);
        }

    public void onClickWhichDoorButton (View view){
        contextwhichdoor = view.getContext();
        Toast.makeText(contextwhichdoor, "Bekräftat, något är fel med bakre dörr", Toast.LENGTH_LONG).show();
    }

}

