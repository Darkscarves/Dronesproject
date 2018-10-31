package com.example.gebruiker.droning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ArrivalAndPostFlightChecklists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arrivalandpostflightchecklists);
    }
    public void toHome(View view)
    {
        Intent intent = new Intent(ArrivalAndPostFlightChecklists.this, MainActivity.class);
        startActivity(intent);
    }
}
