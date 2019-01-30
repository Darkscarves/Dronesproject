package com.example.gebruiker.droning;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class PreFlightChecklist extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText StudentennaamEdit, DatumEdit;
    Button SubmitBTN;
    DatePickerDialog datePickerDialog;
    CheckBox AirframeCBox, FlightBatteryCBox, TransmittersCBox, CameraCBox, Airframe2CBox, FlightBattery2CBox, SelfDiagCBox, MonitorCBox, CalibrationCBox, SaveCalibCBox, CameraPlatCBox, TelemetryCBox, FlightPlanCBox, Camera2CBox, AircraftAlignCBox, CrewPublicCBox, ClearenceCBox, PowerUpCBox, TakeOffCBox, CommunicationCBox, LandingCBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preflightchecklist);
        DatumEdit=findViewById(R.id.DatumEdit);
        DatumEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar= Calendar.getInstance();
                final int year=calendar.get(Calendar.YEAR);
                final int month=calendar.get(Calendar.MONTH);
                final int day=calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog=new DatePickerDialog(PreFlightChecklist.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        DatumEdit.setText(year+"-"+(month+1)+"-"+day);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

        myDb = new DatabaseHelper(this);

        StudentennaamEdit = (EditText)findViewById(R.id.StudentennaamEdit);
        DatumEdit = (EditText)findViewById(R.id.DatumEdit);
        AirframeCBox = (CheckBox)findViewById(R.id.AirframeCBox);
        FlightBatteryCBox = (CheckBox)findViewById(R.id.FlightBatteryCBox);
        TransmittersCBox = (CheckBox)findViewById(R.id.TransmittersCBox);
        CameraCBox = (CheckBox)findViewById(R.id.CameraCBox);
        Airframe2CBox = (CheckBox)findViewById(R.id.Airframe2CBox);
        FlightBattery2CBox = (CheckBox)findViewById(R.id.FlightBattery2CBox);
        SelfDiagCBox = (CheckBox)findViewById(R.id.SelfDiagCBox);
        MonitorCBox = (CheckBox)findViewById(R.id.MonitorCBox);
        CalibrationCBox = (CheckBox)findViewById(R.id.CalibrationCBox);
        SaveCalibCBox = (CheckBox)findViewById(R.id.SaveCalibCBox);
        CameraPlatCBox = (CheckBox)findViewById(R.id.CameraPlatCBox);
        TelemetryCBox = (CheckBox)findViewById(R.id.TelemetryCBox);
        FlightPlanCBox = (CheckBox)findViewById(R.id.FlightPlanCBox);
        Camera2CBox = (CheckBox)findViewById(R.id.Camera2CBox);
        AircraftAlignCBox = (CheckBox)findViewById(R.id.AircraftAlignCBox);
        CrewPublicCBox = (CheckBox)findViewById(R.id.CrewPublicCBox);
        ClearenceCBox = (CheckBox)findViewById(R.id.ClearenceCBox);
        PowerUpCBox = (CheckBox)findViewById(R.id.PowerUpCBox);
        TakeOffCBox = (CheckBox)findViewById(R.id.TakeOffCBox);
        CommunicationCBox = (CheckBox)findViewById(R.id.CommunicationCBox);
        LandingCBox = (CheckBox)findViewById(R.id.LandingCBox);
        SubmitBTN = (Button)findViewById(R.id.SubmitBTN);
        AddData();
    }



   public void AddData() {
        SubmitBTN.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertDataPreFlightChecklist(
                                StudentennaamEdit.getText().toString(),
                                DatumEdit.getText().toString(),
                                AirframeCBox.getText().toString(),
                                FlightBatteryCBox.getText().toString(),
                                TransmittersCBox.getText().toString(),
                                CameraCBox.getText().toString(),
                                Airframe2CBox.getText().toString(),
                                FlightBattery2CBox.getText().toString(),
                                SelfDiagCBox.getText().toString(),
                                MonitorCBox.getText().toString(),
                                CalibrationCBox.getText().toString(),
                                SaveCalibCBox.getText().toString(),
                                CameraPlatCBox.getText().toString(),
                                TelemetryCBox.getText().toString(),
                                FlightPlanCBox.getText().toString(),
                                Camera2CBox.getText().toString(),
                                AircraftAlignCBox.getText().toString(),
                                CrewPublicCBox.getText().toString(),
                                ClearenceCBox.getText().toString(),
                                PowerUpCBox.getText().toString(),
                                TakeOffCBox.getText().toString(),
                                CommunicationCBox.getText().toString(),
                                LandingCBox.getText().toString() );
                        if(isInserted =true)
                            Toast.makeText(PreFlightChecklist.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(PreFlightChecklist.this, "Data not Inserted", Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }

    public void toHome(View view)
    {
        Intent intent = new Intent(PreFlightChecklist.this, MainActivity.class);
        startActivity(intent);
    }
}

