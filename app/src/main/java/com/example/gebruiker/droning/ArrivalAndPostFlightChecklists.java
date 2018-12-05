package com.example.gebruiker.droning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class ArrivalAndPostFlightChecklists extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText StudentennaamEdit, DatumEdit, Studentennaam2Edit, Datum2Edit;
    CheckBox SiteSurveyCBox, FligtPlanCBox, AirframeCBox, CameraCBox, AVConnectCBox, PropellersCBox, CalibrationCBox, GroundStationCBox, AVMonitorCBox, CrewidentifiCBox, HardHatCBox, TwoWayRadiosCBox, FirstAidKitCBox, FireExtingCBox, CordensSingsCBox, TouchdownCBox, PowerDownCBox, RemovalCBox, DataRecCBox, TransmitterCBox, Camera2Cbox, Airframe3CBox, BatteryCBox, MemoryCardCBox, ReviewCBox;
    Button SubmitBTN, SubmitBTN2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arrivalandpostflightchecklists);
        myDb = new DatabaseHelper(this);

        StudentennaamEdit = (EditText)findViewById(R.id.StudentennaamEdit);
        DatumEdit = (EditText)findViewById(R.id.DatumEdit);
        SiteSurveyCBox = (CheckBox)findViewById(R.id.SiteSurveyCBox);
        FligtPlanCBox = (CheckBox) findViewById(R.id.FligtPlanCBox);
        AirframeCBox = (CheckBox)findViewById(R.id.AirframeCBox);
        CameraCBox = (CheckBox)findViewById(R.id.CameraCBox);
        AVConnectCBox = (CheckBox)findViewById(R.id.AVConnectCBox);
        PropellersCBox = (CheckBox)findViewById(R.id.PropellersCBox);
        CalibrationCBox = (CheckBox)findViewById(R.id.CalibrationCBox);
        GroundStationCBox = (CheckBox)findViewById(R.id.GroundStationCBox);
        AVMonitorCBox = (CheckBox)findViewById(R.id.AVMonitorCBox);
        CrewidentifiCBox = (CheckBox) findViewById(R.id.CrewidentifiCBox);
        HardHatCBox = (CheckBox)findViewById(R.id.HardHatCBox);
        TwoWayRadiosCBox = (CheckBox)findViewById(R.id.TwoWayRadiosCBox);
        FirstAidKitCBox = (CheckBox)findViewById(R.id.FirstAidKitCBox);
        FireExtingCBox = (CheckBox)findViewById(R.id.FireExtingCBox);
        CordensSingsCBox = (CheckBox)findViewById(R.id.CordensSingsCBox);
        SubmitBTN = (Button)findViewById(R.id.SubmitBTN);
        AddData();
        Studentennaam2Edit = (EditText)findViewById(R.id.Studentennaam2Edit);
        Datum2Edit = (EditText)findViewById(R.id.Datum2Edit);
        TouchdownCBox = (CheckBox)findViewById(R.id.TouchdownCBox);
        PowerDownCBox = (CheckBox)findViewById(R.id.PowerDownCBox);
        RemovalCBox = (CheckBox)findViewById(R.id.RemovalCBox);
        DataRecCBox = (CheckBox) findViewById(R.id.DataRecCBox);
        TransmitterCBox = (CheckBox)findViewById(R.id.TransmitterCBox);
        Camera2Cbox = (CheckBox)findViewById(R.id.Camera2Cbox);
        Airframe3CBox = (CheckBox)findViewById(R.id.Airframe3CBox);
        BatteryCBox = (CheckBox)findViewById(R.id.BatteryCBox);
        MemoryCardCBox = (CheckBox)findViewById(R.id.MemoryCardCBox);
        ReviewCBox = (CheckBox)findViewById(R.id.ReviewCBox);
        SubmitBTN2 = (Button)findViewById(R.id.SubmitBTN2);
        AddData2();

    }

    public void AddData() {
        SubmitBTN.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertDataArrivalChecklist(
                                StudentennaamEdit.getText().toString(),
                                DatumEdit.getText().toString(),
                                SiteSurveyCBox.getText().toString(),
                                FligtPlanCBox.getText().toString(),
                                AirframeCBox.getText().toString(),
                                CameraCBox.getText().toString(),
                                AVConnectCBox.getText().toString(),
                                PropellersCBox.getText().toString(),
                                CalibrationCBox.getText().toString(),
                                GroundStationCBox.getText().toString(),
                                AVMonitorCBox.getText().toString(),
                                CrewidentifiCBox.getText().toString(),
                                HardHatCBox.getText().toString(),
                                TwoWayRadiosCBox.getText().toString(),
                                FirstAidKitCBox.getText().toString(),
                                FireExtingCBox.getText().toString(),
                                CordensSingsCBox.getText().toString() );
                        if(isInserted =true)
                            Toast.makeText(ArrivalAndPostFlightChecklists.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(ArrivalAndPostFlightChecklists.this, "Data not Inserted", Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }

    public void AddData2() {
        SubmitBTN2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertPostFlightChecklist(
                                Studentennaam2Edit.getText().toString(),
                                Datum2Edit.getText().toString(),
                                TouchdownCBox.getText().toString(),
                                PowerDownCBox.getText().toString(),
                                RemovalCBox.getText().toString(),
                                DataRecCBox.getText().toString(),
                                TransmitterCBox.getText().toString(),
                                Camera2Cbox.getText().toString(),
                                Airframe3CBox.getText().toString(),
                                BatteryCBox.getText().toString(),
                                MemoryCardCBox.getText().toString(),
                                ReviewCBox.getText().toString() );

                        if(isInserted =true)
                            Toast.makeText(ArrivalAndPostFlightChecklists.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(ArrivalAndPostFlightChecklists.this, "Data not Inserted", Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }
    public void toHome(View view)
    {
        Intent intent = new Intent(ArrivalAndPostFlightChecklists.this, MainActivity.class);
        startActivity(intent);
    }
}
