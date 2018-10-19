package com.example.gebruiker.droning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class IncidentLog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.incidentlog);
    }
    public void toHome(View view)
    {
        Intent intent = new Intent(IncidentLog.this, MainActivity.class);
        startActivity(intent);
    }
}

