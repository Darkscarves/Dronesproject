package com.example.gebruiker.droning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BatteryLog  extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText StudentNaamEdit, DatumEdit, BatteryNumberEdit, BatteryResidualEdit, DateOfChargeEdit, ChargeInputEdit, FlightDurationEdit, PreFlightEdit, NotesEdit;
    Button SubmitBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.batterylog);
        myDb = new DatabaseHelper(this);

        StudentNaamEdit = (EditText)findViewById(R.id.StudentNaamEdit);
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
