package com.android.androidcomponents.service;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.android.androidcomponents.R;


public class ServiceFragment extends Fragment {

    String msg = "Android : ";
    Button StartBtn,StopButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_service, container, false);

        StartBtn = (Button) view.findViewById(R.id.StartBtn);
        StopButton = (Button) view.findViewById(R.id.StopButton);

        StartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

        StopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return view;
    }

//    public void startService(Intent view) {
//        startService(new Intent(getContext(), MyService2.class));
//    }
//
//    // Method to stop the service
//    public void stopService(Intent view) {
//        stopService(new Intent(getContext(), MyService2.class));
//    }


}