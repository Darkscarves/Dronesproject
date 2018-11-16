package com.example.gebruiker.droning;

        import android.content.Intent;
        import android.database.sqlite.SQLiteDatabase;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;

        import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SQLiteDatabase testDB = this.openOrCreateDatabase("testDB", MODE_PRIVATE, null);
        File test = getDatabasePath("testDB");
        if(test.exists()) {
            Log.i("database testDB", "Bestaat");
        } else {
            Log.i("database testDB", "Bestaat niet");
        }
        testDB.execSQL("CREATE TABLE IF NOT EXISTS "
                + "IncidentLog"
                + "( ID Interger, NaamStudent VARCHAR(255), Datum DATE, IncidentTime VARCHAR(255), Damage VARCHAR(255), Details VARCHAR(255), ActionTaken VARCHAR(255), Notes VARCHAR(255));");
        testDB.execSQL("CREATE TABLE IF NOT EXISTS "
                + "PostFlightChecklist"
                + "( ID Interger, NaamStudent VARCHAR(255), Datum DATE, Touchdown Boolean, Powerdown Boolean, Removal Boolean, DataRecording Boolean, Transmitter Boolean, Camera Boolean, Airframe Boolean, Airframe Boolean, Battery Boolean, MemoryCard Boolean, Review Boolean);");
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



}
