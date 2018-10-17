package com.example.gebruiker.droning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class BatteryLog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.batterylog);
    }
    public void toHome(View view)
    {
        Intent intent = new Intent(BatteryLog.this, MainActivity.class);
        startActivity(intent);
    }
}
