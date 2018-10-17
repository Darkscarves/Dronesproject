package com.example.gebruiker.droning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MaintenanceLog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maintenancelog);
    }
    public void toHome(View view)
    {
        Intent intent = new Intent(MaintenanceLog.this, MainActivity.class);
        startActivity(intent);

    }
}