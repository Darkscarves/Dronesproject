package com.example.gebruiker.droning;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class AircraftPilotAndCrewFlightLogs extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText StudentennaamEdit, DateEdit, TakeOffTimeEdit, LandingTimeEdit, DurationEdit, AircraftEdit, AircraftSystemEdit, EngineBatteryEdit, PilotInCommandEdit, ObserverEdit, PayloadOperatorEdit, LocationEdit, PurposeOfFlightEdit, CommentAndMinorIncidentEdit;
    Button SubmitBTN;
    DatePickerDialog datePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aircraftpilotandcrewflightlogs);
        DateEdit=findViewById(R.id.DateEdit);
        DateEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar= Calendar.getInstance();
                final int year=calendar.get(Calendar.YEAR);
                final int month=calendar.get(Calendar.MONTH);
                final int day=calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog=new DatePickerDialog(AircraftPilotAndCrewFlightLogs.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        DateEdit.setText(year+"-"+(month+1)+"-"+day);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });
        myDb = new DatabaseHelper(this);

        StudentennaamEdit = (EditText)findViewById(R.id.StudentennaamEdit);
        DateEdit = (EditText)findViewById(R.id.DateEdit);
        TakeOffTimeEdit = (EditText)findViewById(R.id.TakeOffTimeEdit);
        LandingTimeEdit = (EditText)findViewById(R.id.LandingTimeEdit);
        DurationEdit = (EditText)findViewById(R.id.DurationEdit);
        AircraftEdit = (EditText)findViewById(R.id.AircraftEdit);
        AircraftSystemEdit = (EditText)findViewById(R.id.AircraftSystemEdit);
        EngineBatteryEdit = (EditText)findViewById(R.id.EngineBatteryEdit);
        PilotInCommandEdit = (EditText)findViewById(R.id.PilotInCommandEdit);
        ObserverEdit = (EditText)findViewById(R.id.ObserverEdit);
        PayloadOperatorEdit = (EditText)findViewById(R.id.PayloadOperatorEdit);
        LocationEdit = (EditText)findViewById(R.id.LocationEdit);
        PurposeOfFlightEdit = (EditText)findViewById(R.id.PurposeOfFlightEdit);
        CommentAndMinorIncidentEdit = (EditText)findViewById(R.id.CommentAndMinorIncidentEdit);
        SubmitBTN = (Button)findViewById(R.id.SubmitBTN);
        AddData();
    }

    public void AddData() {
        SubmitBTN.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertDataFlightLog(
                                StudentennaamEdit.getText().toString(),
                                DateEdit.getText().toString(),
                                TakeOffTimeEdit.getText().toString(),
                                LandingTimeEdit.getText().toString(),
                                DurationEdit.getText().toString(),
                                AircraftEdit.getText().toString(),
                                AircraftSystemEdit.getText().toString(),
                                EngineBatteryEdit.getText().toString(),
                                PilotInCommandEdit.getText().toString(),
                                ObserverEdit.getText().toString(),
                                PayloadOperatorEdit.getText().toString(),
                                LocationEdit.getText().toString(),
                                PurposeOfFlightEdit.getText().toString(),
                                CommentAndMinorIncidentEdit.getText().toString() );
                        if(isInserted =true)
                            Toast.makeText(AircraftPilotAndCrewFlightLogs.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(AircraftPilotAndCrewFlightLogs.this, "Data not Inserted", Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }
    public void toHome(View view)
    {
        Intent intent = new Intent(AircraftPilotAndCrewFlightLogs.this, MainActivity.class);
        startActivity(intent);
    }
}