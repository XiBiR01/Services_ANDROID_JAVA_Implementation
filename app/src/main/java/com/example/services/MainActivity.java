package com.example.services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button startServiceBtn, stopServiceBtn;
//Basic Implementation of a Service-->
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startServiceBtn=findViewById(R.id.startServiceBtn);
        stopServiceBtn=findViewById(R.id.stopServiceBtn);
    }

    public void startSomething(View view) {
        Intent started=new Intent(this,MyCustomService.class);
        startService(started);
    }

    public void stopSomething(View view) {
        Intent stopped=new Intent(this,MyCustomService.class);
        stopService(stopped);
    }
}