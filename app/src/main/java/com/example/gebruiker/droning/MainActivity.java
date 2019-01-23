package com.example.gebruiker.droning;

        import android.content.Intent;
        import android.database.Cursor;
        import android.database.sqlite.SQLiteDatabase;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;

        import java.io.File;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb = new DatabaseHelper(this);

        // testen DB
        SQLiteDatabase DroningDB = this.openOrCreateDatabase("Droning", MODE_PRIVATE, null);

        File dbFile = getDatabasePath("Droning");
        if(dbFile.exists()){
            Log.i("Droning database", "Exists");
        }else{
            Log.i("Droning database", "Does not exists");
        }


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
        Intent intent = new Intent(MainActivity.this, ArrivalAndPostFlightChecklists.class);
        startActivity(intent);
    }
    public void toPreFlightChecklist(View view)
    {
        Intent intent = new Intent(MainActivity.this, PreFlightChecklist.class);
        startActivity(intent);
    }
    public void toEmbarkationChecklist(View view)
    {
        Intent intent = new Intent(MainActivity.this, EmbarkationChecklist.class);
        startActivity(intent);
    }
    public void toOnSiteSurvey(View view)
    {
        Intent intent = new Intent(MainActivity.this, OnSiteSurvey.class);
        startActivity(intent);
    }
    public void toOperationFlightPlan(View view)
    {
        Intent intent = new Intent(MainActivity.this, OperationalFlightPlan.class);
        startActivity(intent);
    }
    public void toAircraftPilotAndCrewFlightLogs(View view)
    {
        Intent intent = new Intent(MainActivity.this, AircraftPilotAndCrewFlightLogs.class);
        startActivity(intent);
    }
    public void toPreSiteSurvey(View view)
    {
        Intent intent = new Intent(MainActivity.this, PreSiteSurvey.class);
        startActivity(intent);
    }

    public void toTest(View view)
    {
        Intent intent = new Intent(MainActivity.this, apiTest.class);
        startActivity(intent);
    }



}
