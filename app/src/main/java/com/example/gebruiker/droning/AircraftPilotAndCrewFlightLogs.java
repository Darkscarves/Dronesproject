package com.example.gebruiker.droning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AircraftPilotAndCrewFlightLogs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aircraftpilotandcrewflightlogs);
    }
    public void toHome(View view)
    {
        Intent intent = new Intent(AircraftPilotAndCrewFlightLogs.this, MainActivity.class);
        startActivity(intent);
    }
}