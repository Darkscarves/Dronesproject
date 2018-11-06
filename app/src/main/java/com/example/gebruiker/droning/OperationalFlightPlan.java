package com.example.gebruiker.droning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class OperationalFlightPlan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.operationalflightplan);
    }
    public void toHome(View view)
    {
        Intent intent = new Intent(OperationalFlightPlan.this, MainActivity.class);
        startActivity(intent);
    }
}
