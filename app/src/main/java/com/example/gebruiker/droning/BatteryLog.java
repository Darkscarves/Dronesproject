package com.example.gebruiker.droning;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class BatteryLog  extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText StudentNaamEdit, DatumEdit, BatteryNumberEdit, BatteryResidualEdit, DateOfChargeEdit, ChargeInputEdit, FlightDurationEdit, PreFlightEdit, NotesEdit;
    Button SubmitBTN;
    DatePickerDialog datePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.batterylog);
        DatumEdit=findViewById(R.id.DatumEdit);
        DatumEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar= Calendar.getInstance();
                final int year=calendar.get(Calendar.YEAR);
                final int month=calendar.get(Calendar.MONTH);
                final int day=calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog=new DatePickerDialog(BatteryLog.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        DatumEdit.setText(day+"-"+(month+1)+"-"+year);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });
        myDb = new DatabaseHelper(this);

        StudentNaamEdit = (EditText)findViewById(R.id.StudentennaamEdit);
        DatumEdit = (EditText)findViewById(R.id.DatumEdit);
        BatteryNumberEdit = (EditText)findViewById(R.id.BatteryNumberEdit);
        BatteryResidualEdit = (EditText)findViewById(R.id.BatteryResidualEdit);
        DateOfChargeEdit = (EditText)findViewById(R.id.DateOfChargeEdit);
        ChargeInputEdit = (EditText)findViewById(R.id.ChargeInputEdit);
        FlightDurationEdit = (EditText)findViewById(R.id.FlightDurationEdit);
        PreFlightEdit = (EditText)findViewById(R.id.PreFlightEdit);
        NotesEdit = (EditText)findViewById(R.id.NotesEdit);
        SubmitBTN = (Button)findViewById(R.id.SubmitBTN);
        AddData();
    }



    public void AddData() {
        SubmitBTN.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertDataBattery(
                                StudentNaamEdit.getText().toString(),
                                DatumEdit.getText().toString(),
                                BatteryNumberEdit.getText().toString(),
                                BatteryResidualEdit.getText().toString(),
                                DateOfChargeEdit.getText().toString(),
                                ChargeInputEdit.getText().toString(),
                                FlightDurationEdit.getText().toString(),
                                PreFlightEdit.getText().toString(),
                                NotesEdit.getText().toString() );
                        if(isInserted =true)
                            Toast.makeText(BatteryLog.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(BatteryLog.this, "Data not Inserted", Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }
    public void toHome(View view)
    {
        Intent intent = new Intent(BatteryLog.this, MainActivity.class);
        startActivity(intent);
    }
}
