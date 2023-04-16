package com.example.trivia_night;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.MapView;

import java.util.concurrent.ConcurrentMap;

public class home extends AppCompatActivity {

    MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mapView = findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
    }
}