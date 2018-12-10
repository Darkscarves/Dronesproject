package com.example.gebruiker.droning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class PreSiteSurvey extends AppCompatActivity {

    DatabaseHelper myDb;
    EditText StudentNaamEdit,DateEdit, JobNumberEdit, PilotInCommandEdit,ObserverEdit, uavEdit,Helper1Edit,Helper2Edit,LatitudeAmpEdit, AltitudeFromEdit, WorkReqEdit, DateWorkEdit, VehicularAccesEdit, AirspaceEdit, TerrainEdit,
            ProximityEdit, HazardsEdit, RestrictionsEdit, SensitivitiesEdit, PeopleEdit, LivestockEdit, PermissionEdit, AccesEdit, FootpathsEdit, AlternateEdit, RiskReductionEdit, WeatherEdit, NotamsEdit, LocalAirEdit,
            RegionalAirEdit, MilitaryControlEdit, NoticeToAirmenEdit;
    Button SubmitBTN;
    CheckBox DownloadedMapCBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presitesurvey);
        myDb = new DatabaseHelper(this);
        StudentNaamEdit = (EditText)findViewById(R.id.StudentennaamEdit);
        DateEdit = (EditText)findViewById(R.id.DateEdit);
        JobNumberEdit = (EditText)findViewById(R.id.JobNumberEdit);
        LatitudeAmpEdit = (EditText)findViewById(R.id.LatitudeAmpEdit);
        AltitudeFromEdit = (EditText)findViewById(R.id.AltitudeFromEdit);
        WorkReqEdit = (EditText)findViewById(R.id.WorkReqEdit);
        DateWorkEdit = (EditText)findViewById(R.id.DateWorkEdit);
        DownloadedMapCBox = (CheckBox) findViewById(R.id.DownloadedMapCBox);
        VehicularAccesEdit = (EditText) findViewById(R.id.VehicularAccesEdit);
        PilotInCommandEdit = (EditText)findViewById(R.id.PilotInCommandEdit);
        ObserverEdit = (EditText)findViewById(R.id.ObserverEdit);
        uavEdit = (EditText)findViewById(R.id.uavEdit);
        Helper1Edit = (EditText)findViewById(R.id.Helper1Edit);
        Helper2Edit = (EditText)findViewById(R.id.Helper2Edit);
        AirspaceEdit = (EditText)findViewById(R.id.AirspaceEdit);
        TerrainEdit = (EditText)findViewById(R.id.TerrainEdit);
        ProximityEdit = (EditText)findViewById(R.id.ProximityEdit);
        HazardsEdit = (EditText)findViewById(R.id.HazardsEdit);
        RestrictionsEdit = (EditText)findViewById(R.id.RestrictionsEdit);
        SensitivitiesEdit = (EditText)findViewById(R.id.SensitivitiesEdit);
        PeopleEdit = (EditText)findViewById(R.id.PeopleEdit);
        LivestockEdit = (EditText) findViewById(R.id.LivestockEdit);
        PermissionEdit = (EditText) findViewById(R.id.PermissionEdit);
        AccesEdit = (EditText)findViewById(R.id.AccesEdit);
        FootpathsEdit = (EditText)findViewById(R.id.FootpathsEdit);
        AlternateEdit = (EditText)findViewById(R.id.AlternateEdit);
        RiskReductionEdit = (EditText)findViewById(R.id.RiskReductionEdit);
        WeatherEdit = (EditText)findViewById(R.id.WeatherEdit);
        NotamsEdit = (EditText) findViewById(R.id.NotamsEdit);
        LocalAirEdit = (EditText) findViewById(R.id.LocalAirEdit);
        RegionalAirEdit = (EditText)findViewById(R.id.RegionalAirEdit);
        MilitaryControlEdit = (EditText) findViewById(R.id.MilitaryControlEdit);
        NoticeToAirmenEdit = (EditText) findViewById(R.id.NoticeToAirmenEdit);
        SubmitBTN = (Button)findViewById(R.id.SubmitBTN);
   //    AddData();
    }


 /*   public void AddData() {
        SubmitBTN.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertDataPreSiteSurvey(StudentNaamEdit.getText().toString(),
                                DateEdit.getText().toString(),
                                JobNumberEdit.getText().toString(),
                                LatitudeAmpEdit.getText().toString(),
                                AltitudeFromEdit.getText().toString(),
                                WorkReqEdit.getText().toString(),
                                DateWorkEdit.getText().toString(),
                                DownloadedMapCBox.getText().toString(),
                                VehicularAccesEdit.getText().toString(),
                                PilotInCommandEdit.getText().toString(),
                                ObserverEdit.getText().toString(),
                                uavEdit.getText().toString() ,
                                Helper1Edit.getText().toString(),
                                Helper2Edit.getText().toString(),
                                AirspaceEdit.getText().toString(),
                                TerrainEdit.getText().toString(),
                                ProximityEdit.getText().toString(),
                                HazardsEdit.getText().toString(),
                                RestrictionsEdit.getText().toString(),
                                SensitivitiesEdit.getText().toString(),
                                PeopleEdit.getText().toString(),
                                LivestockEdit.getText().toString(),
                                PermissionEdit.getText().toString(),
                                AccesEdit.getText().toString(),
                                FootpathsEdit.getText().toString() ,
                                AlternateEdit.getText().toString(),
                                RiskReductionEdit.getText().toString(),
                                WeatherEdit.getText().toString(),
                                NotamsEdit.getText().toString(),
                                LocalAirEdit.getText().toString(),
                                RegionalAirEdit.getText().toString(),
                                MilitaryControlEdit.getText().toString() ,
                                NoticeToAirmenEdit.getText().toString() );

                        if(isInserted =true)
                            Toast.makeText(PreSiteSurvey.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(PreSiteSurvey.this, "Data not Inserted", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }*/
    public void toHome(View view)
    {
        Intent intent = new Intent(PreSiteSurvey.this, MainActivity.class);
        startActivity(intent);
    }
}
