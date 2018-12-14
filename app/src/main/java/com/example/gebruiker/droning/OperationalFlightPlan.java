package com.example.gebruiker.droning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OperationalFlightPlan extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText StudentennaamEdit, DateEdit, JobNumberEdit, VersionEdit, PilotInCommandEdit, ObserverEdit, PayloadOperatorEdit, Helper1Edit, AddressEdit, LattitudeAmpLongitudeEdit, ElevationEdit, VehicularAccesEdit, PurposeOfFlightEdit,
            TypeOperationEdit, DateWorkEdit, MissionDurationEdit, CruisingAltitudeEdit, MaximumAltitudeEdit, MaximumDistanceEdit, SatellitePictureEdit, BAGViewerEdit, PositionOfCrewEdit, FlightboxEdit, AlternateLandingEdit,
            DistanceToPeopleEdit, RiskAssessmentEdit, LocalAirEdit,RegionalAirEdit, MilitaryControlEdit, CoordinatorLowEdit, C1Edit, C2Edit, C3Edit, C4Edit, C5Edit, C6Edit, C7Edit, C8Edit, C9Edit, C10Edit,
            C11Edit, C12Edit, C13Edit, C14Edit, C15Edit, C16Edit, C17Edit, C18Edit, C19Edit, C20Edit, C21Edit, C22Edit;
    Button SubmitBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.operationalflightplan);
        myDb = new DatabaseHelper(this);

        StudentennaamEdit = (EditText)findViewById(R.id.StudentennaamEdit);
        DateEdit = (EditText)findViewById(R.id.DateEdit);
        JobNumberEdit = (EditText)findViewById(R.id.JobNumberEdit);
        VersionEdit = (EditText)findViewById(R.id.VersionEdit);
        PilotInCommandEdit = (EditText)findViewById(R.id.PilotInCommandEdit);
        ObserverEdit = (EditText)findViewById(R.id.ObserverEdit);
        PayloadOperatorEdit = (EditText)findViewById(R.id.PayloadOperatorEdit);
        Helper1Edit = (EditText)findViewById(R.id.Helper1Edit);
        AddressEdit = (EditText)findViewById(R.id.AddressEdit);
        LattitudeAmpLongitudeEdit = (EditText)findViewById(R.id.LattitudeAmpLongitudeEdit);
        ElevationEdit = (EditText)findViewById(R.id.ElevationEdit);
        VehicularAccesEdit = (EditText)findViewById(R.id.VehicularAccesEdit);
        PurposeOfFlightEdit = (EditText)findViewById(R.id.PurposeOfFlightEdit);
        TypeOperationEdit = (EditText)findViewById(R.id.TypeOperationEdit);
        DateWorkEdit = (EditText)findViewById(R.id.DateWorkEdit);
        MissionDurationEdit = (EditText)findViewById(R.id.MissionDurationEdit);
        CruisingAltitudeEdit = (EditText)findViewById(R.id.CruisingAltitudeEdit);
        MaximumAltitudeEdit = (EditText)findViewById(R.id.MaximumAltitudeEdit);
        MaximumDistanceEdit = (EditText)findViewById(R.id.MaximumDistanceEdit);
        SatellitePictureEdit = (EditText)findViewById(R.id.SatellitePictureEdit);
        BAGViewerEdit = (EditText)findViewById(R.id.BAGViewerEdit);
        PositionOfCrewEdit = (EditText)findViewById(R.id.PositionOfCrewEdit);
        FlightboxEdit = (EditText)findViewById(R.id.FlightboxEdit);
        AlternateLandingEdit = (EditText)findViewById(R.id.AlternateLandingEdit);
        DistanceToPeopleEdit = (EditText)findViewById(R.id.DistanceToPeopleEdit);
        RiskAssessmentEdit = (EditText)findViewById(R.id.RiskAssessmentEdit);
        LocalAirEdit = (EditText)findViewById(R.id.LocalAirEdit);
        RegionalAirEdit = (EditText)findViewById(R.id.RegionalAirEdit);
        MilitaryControlEdit = (EditText)findViewById(R.id.MilitaryControlEdit);
        CoordinatorLowEdit = (EditText)findViewById(R.id.CoordinatorLowEdit);
        C1Edit = (EditText)findViewById(R.id.C1Edit);
        C2Edit = (EditText)findViewById(R.id.C2Edit);
        C3Edit = (EditText)findViewById(R.id.C3Edit);
        C4Edit = (EditText)findViewById(R.id.C4Edit);
        C5Edit = (EditText)findViewById(R.id.C5Edit);
        C6Edit = (EditText)findViewById(R.id.C6Edit);
        C7Edit = (EditText)findViewById(R.id.C7Edit);
        C8Edit = (EditText)findViewById(R.id.C8Edit);
        C9Edit = (EditText)findViewById(R.id.C9Edit);
        C10Edit = (EditText)findViewById(R.id.C10Edit);
        C11Edit = (EditText)findViewById(R.id.C11Edit);
        C12Edit = (EditText)findViewById(R.id.C12Edit);
        C13Edit = (EditText)findViewById(R.id.C13Edit);
        C14Edit = (EditText)findViewById(R.id.C14Edit);
        C15Edit = (EditText)findViewById(R.id.C15Edit);
        C16Edit = (EditText)findViewById(R.id.C16Edit);
        C17Edit = (EditText)findViewById(R.id.C17Edit);
        C18Edit = (EditText)findViewById(R.id.C18Edit);
        C19Edit = (EditText)findViewById(R.id.C19Edit);
        C20Edit = (EditText)findViewById(R.id.C20Edit);
        C21Edit = (EditText)findViewById(R.id.C21Edit);
        C22Edit = (EditText)findViewById(R.id.C22Edit);
        SubmitBTN = (Button)findViewById(R.id.SubmitBTN);
        AddData();
    }

    public void AddData() {
        SubmitBTN.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertDataOperationFlightPlan(
                                StudentennaamEdit.getText().toString(),
                                DateEdit.getText().toString(),
                                JobNumberEdit.getText().toString(),
                                VersionEdit.getText().toString(),
                                PilotInCommandEdit.getText().toString(),
                                ObserverEdit.getText().toString(),
                                PayloadOperatorEdit.getText().toString(),
                                Helper1Edit.getText().toString(),
                                AddressEdit.getText().toString(),
                                LattitudeAmpLongitudeEdit.getText().toString(),
                                ElevationEdit.getText().toString(),
                                VehicularAccesEdit.getText().toString(),
                                PurposeOfFlightEdit.getText().toString(),
                                TypeOperationEdit.getText().toString(),
                                DateWorkEdit.getText().toString(),
                                MissionDurationEdit.getText().toString(),
                                CruisingAltitudeEdit.getText().toString(),
                                MaximumAltitudeEdit.getText().toString(),
                                MaximumDistanceEdit.getText().toString(),
                                SatellitePictureEdit.getText().toString(),
                                BAGViewerEdit.getText().toString(),
                                PositionOfCrewEdit.getText().toString(),
                                FlightboxEdit.getText().toString(),
                                AlternateLandingEdit.getText().toString(),
                                DistanceToPeopleEdit.getText().toString(),
                                RiskAssessmentEdit.getText().toString(),
                                LocalAirEdit.getText().toString(),
                                RegionalAirEdit.getText().toString(),
                                MilitaryControlEdit.getText().toString(),
                                CoordinatorLowEdit.getText().toString(),
                                C1Edit.getText().toString(),
                                C2Edit.getText().toString(),
                                C3Edit.getText().toString(),
                                C4Edit.getText().toString(),
                                C5Edit.getText().toString(),
                                C6Edit.getText().toString(),
                                C7Edit.getText().toString(),
                                C8Edit.getText().toString(),
                                C9Edit.getText().toString(),
                                C10Edit.getText().toString(),
                                C11Edit.getText().toString(),
                                C12Edit.getText().toString(),
                                C13Edit.getText().toString(),
                                C14Edit.getText().toString(),
                                C15Edit.getText().toString(),
                                C16Edit.getText().toString(),
                                C17Edit.getText().toString(),
                                C18Edit.getText().toString(),
                                C19Edit.getText().toString(),
                                C20Edit.getText().toString(),
                                C21Edit.getText().toString(),
                                C22Edit.getText().toString() );
                        if(isInserted =true)
                            Toast.makeText(OperationalFlightPlan.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(OperationalFlightPlan.this, "Data not Inserted", Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }
    public void toHome(View view)
    {
        Intent intent = new Intent(OperationalFlightPlan.this, MainActivity.class);
        startActivity(intent);
    }
}
