package com.example.gebruiker.droning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;

public class PreFlightChecklist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preflightchecklist);
    }
    public void toHome(View view)
    {
        Intent intent = new Intent(PreFlightChecklist.this, MainActivity.class);
        startActivity(intent);
    }
}

