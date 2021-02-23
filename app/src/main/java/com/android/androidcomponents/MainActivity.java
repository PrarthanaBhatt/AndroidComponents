package com.android.androidcomponents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.android.androidcomponents.contentproviders.ContentProviderActivity;
import com.android.androidcomponents.contentproviders.ContentProviderFragment;
import com.android.androidcomponents.notification.NotificationActivity;
import com.android.androidcomponents.notification.NotificationFragment;
import com.android.androidcomponents.service.ServiceActivity;
import com.android.androidcomponents.service.ServiceFragment;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button1....", Toast.LENGTH_SHORT).show();

//                FragmentManager manager = getSupportFragmentManager();
////                int count = manager.getBackStackEntryCount();
//
//                getSupportFragmentManager().popBackStack();
//
//                FragmentTransaction ft = manager.beginTransaction();
//                ft.replace(R.id.mainContener, new NotificationFragment());
//                ft.commit();


                Intent intent = new Intent(MainActivity.this, NotificationActivity.class);
                startActivity(intent);


            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button2....", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ServiceActivity.class);
                startActivity(intent);
//                FragmentManager manager = getSupportFragmentManager();
//                int count = manager.getBackStackEntryCount();
//
//                getSupportFragmentManager().popBackStack();
//
//                FragmentTransaction ft = manager.beginTransaction();
//                ft.replace(R.id.mainContener, new ServiceFragment());
//                ft.commit();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button3....", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ContentProviderActivity.class);
                startActivity(intent);

//                FragmentManager manager = getSupportFragmentManager();
//                int count = manager.getBackStackEntryCount();
//
//                getSupportFragmentManager().popBackStack();
//
//                FragmentTransaction ft = manager.beginTransaction();
//                ft.replace(R.id.mainContener, new ContentProviderFragment());
//                ft.commit();
            }
        });

    }
}