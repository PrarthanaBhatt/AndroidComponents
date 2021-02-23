package com.android.androidcomponents.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.androidcomponents.R;

public class ServiceActivity extends AppCompatActivity {

    String msg = "Android : ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
    }

    public void startService(View view) {
        startService(new Intent(getBaseContext(), MyService2.class));
    }

    public void stopService(View view) {
        stopService(new Intent(getBaseContext(), MyService2.class));
    }
}