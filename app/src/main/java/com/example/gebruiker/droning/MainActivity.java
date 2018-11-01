package com.example.gebruiker.droning;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toBatteryLog(View view)
    {
        Intent intent = new Intent(MainActivity.this, BatteryLog.class);
        startActivity(intent);
    }

    public void toMaintenanceLog(View view)

    {
        Intent intent = new Intent(MainActivity.this, MaintenanceLog.class);
        startActivity(intent);
    }

    public void toIncidentLog(View view)
    {
        Intent intent = new Intent(MainActivity.this, IncidentLog.class);
        startActivity(intent);
    }


    public void toArrivalAndPostFlightChecklists(View view)
    {
        Intent intent = new Intent(MainActivity.this, EmbarkationChecklist.class);
        startActivity(intent);
    }
    public void toPreFlightChecklist(View view)
    {
        Intent intent = new Intent(MainActivity.this, PreFlightChecklist.class);
        startActivity(intent);
    }
    public void toEmbarkationChecklist(View view)
    {
        Intent intent = new Intent(MainActivity.this, PreFlightChecklist.class);
        startActivity(intent);
    }




}
