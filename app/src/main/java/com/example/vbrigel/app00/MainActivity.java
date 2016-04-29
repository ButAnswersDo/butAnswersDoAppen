package com.example.vbrigel.app00;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.vbrigel.app00.databinding.ActivityMainBinding;
import com.firebase.client.Firebase;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Firebase.setAndroidContext(this);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityHandlers handler = new MainActivityHandlers();
        binding.setHandler(handler);
    }

    
}
