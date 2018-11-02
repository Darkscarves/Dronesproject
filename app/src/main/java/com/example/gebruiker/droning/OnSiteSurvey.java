package com.example.gebruiker.droning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class OnSiteSurvey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onsitesurvey);
    }
    public void toHome(View view)
    {
        Intent intent = new Intent(OnSiteSurvey.this, MainActivity.class);
        startActivity(intent);
    }
}
