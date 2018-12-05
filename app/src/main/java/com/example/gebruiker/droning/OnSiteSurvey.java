package com.example.gebruiker.droning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class OnSiteSurvey extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText StudentennaamEdit, DatumEdit, PilotInCommandEdit, ObserverEdit, KnottsEdit, DirectionEdit, ObstructionEdit, ViewLimitationEdit, PeopleEdit, LivestockEdit, TemperatureEdit, VisibilityEdit, SurfaceEdit, PermissionEdit, PublicEdit, AirTrafficEdit, CommunicationEdit, ProximityEdit, TakeOffAreaEdit, LandingAreaEdit, OperationalZoneEdit, EmergencyAreaEdit, HoldingAreaEdit;
    Button SubmitBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onsitesurvey);
        myDb = new DatabaseHelper(this);

        StudentennaamEdit = (EditText)findViewById(R.id.StudentennaamEdit);
        DatumEdit = (EditText)findViewById(R.id.DatumEdit);
        PilotInCommandEdit = (EditText)findViewById(R.id.PilotInCommandEdit);
        ObserverEdit = (EditText)findViewById(R.id.ObserverEdit);
        KnottsEdit = (EditText)findViewById(R.id.KnottsEdit);
        DirectionEdit = (EditText)findViewById(R.id.DirectionEdit);
        ObstructionEdit = (EditText)findViewById(R.id.ObstructionEdit);
        ViewLimitationEdit = (EditText)findViewById(R.id.ViewLimitationEdit);
        PeopleEdit = (EditText)findViewById(R.id.PeopleEdit);
        LivestockEdit = (EditText)findViewById(R.id.LivestockEdit);
        TemperatureEdit = (EditText)findViewById(R.id.TemperatureEdit);
        VisibilityEdit = (EditText)findViewById(R.id.VisibilityEdit);
        SurfaceEdit = (EditText)findViewById(R.id.SurfaceEdit);
        PermissionEdit = (EditText)findViewById(R.id.PermissionEdit);
        PublicEdit = (EditText)findViewById(R.id.PublicEdit);
        AirTrafficEdit = (EditText)findViewById(R.id.AirTrafficEdit);
        CommunicationEdit = (EditText)findViewById(R.id.CommunicationEdit);
        ProximityEdit = (EditText)findViewById(R.id.ProximityEdit);
        TakeOffAreaEdit = (EditText)findViewById(R.id.TakeOffAreaEdit);
        LandingAreaEdit = (EditText)findViewById(R.id.LandingAreaEdit);
        OperationalZoneEdit = (EditText)findViewById(R.id.OperationalZoneEdit);
        EmergencyAreaEdit = (EditText)findViewById(R.id.EmergencyAreaEdit);
        HoldingAreaEdit = (EditText)findViewById(R.id.HoldingAreaEdit);
        SubmitBTN = (Button)findViewById(R.id.SubmitBTN);
        AddData();
    }

    public void AddData() {
        SubmitBTN.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertDataOnSiteSurvey(
                                StudentennaamEdit.getText().toString(),
                                DatumEdit.getText().toString(),
                                PilotInCommandEdit.getText().toString(),
                                ObserverEdit.getText().toString(),
                                KnottsEdit.getText().toString(),
                                DirectionEdit.getText().toString(),
                                ObstructionEdit.getText().toString(),
                                ViewLimitationEdit.getText().toString(),
                                PeopleEdit.getText().toString(),
                                LivestockEdit.getText().toString(),
                                TemperatureEdit.getText().toString(),
                                VisibilityEdit.getText().toString(),
                                SurfaceEdit.getText().toString(),
                                PermissionEdit.getText().toString(),
                                PublicEdit.getText().toString(),
                                AirTrafficEdit.getText().toString(),
                                CommunicationEdit.getText().toString(),
                                ProximityEdit.getText().toString(),
                                TakeOffAreaEdit.getText().toString(),
                                LandingAreaEdit.getText().toString(),
                                OperationalZoneEdit.getText().toString(),
                                EmergencyAreaEdit.getText().toString(),
                                HoldingAreaEdit.getText().toString() );
                        if(isInserted =true)
                            Toast.makeText(OnSiteSurvey.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(OnSiteSurvey.this, "Data not Inserted", Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }
    public void toHome(View view)
    {
        Intent intent = new Intent(OnSiteSurvey.this, MainActivity.class);
        startActivity(intent);
    }
}
