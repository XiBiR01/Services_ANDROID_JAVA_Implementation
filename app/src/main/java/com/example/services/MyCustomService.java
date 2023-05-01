package com.example.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyCustomService extends Service {
    private int serviceStarted=0;
    public MyCustomService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (serviceStarted==0){
            try {
                Log.i("ServiceStatus","Service Started");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();
            serviceStarted=1;
        }
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        try {
            Log.i("ServiceStatus","Service Stopped");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Toast.makeText(this, "Service Stopped", Toast.LENGTH_SHORT).show();
        serviceStarted=0;
    }

    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }
}