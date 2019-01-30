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

public class IncidentLog extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText StudentNaamEdit, DateOfIncidentEdit, TimeOfIncidentEdit, InjuriesDamageEdit, IncidentDetailsEdit, ActionTakenIncidentReportEdit, NotesEdit;
    Button SubmitBTN;
    DatePickerDialog datePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.incidentlog);
        DateOfIncidentEdit=findViewById(R.id.DateOfIncidentEdit);
        DateOfIncidentEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar= Calendar.getInstance();
                final int year=calendar.get(Calendar.YEAR);
                final int month=calendar.get(Calendar.MONTH);
                final int day=calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog=new DatePickerDialog(IncidentLog.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        DateOfIncidentEdit.setText(day+"-"+(month+1)+"-"+year);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });
        myDb = new DatabaseHelper(this);

        StudentNaamEdit = (EditText)findViewById(R.id.StudentNaamEdit);
        DateOfIncidentEdit = (EditText)findViewById(R.id.DateOfIncidentEdit);
        TimeOfIncidentEdit = (EditText)findViewById(R.id.TimeOfIncidentEdit);
        InjuriesDamageEdit = (EditText)findViewById(R.id.InjuriesDamageEdit);
        IncidentDetailsEdit = (EditText)findViewById(R.id.IncidentDetailsEdit);
        ActionTakenIncidentReportEdit = (EditText)findViewById(R.id.ActionTakenIncidentReportEdit);
        NotesEdit = (EditText)findViewById(R.id.NotesEdit);
        SubmitBTN = (Button)findViewById(R.id.SubmitBTN);
        AddData();
    }

    public void AddData() {
        SubmitBTN.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertDataIncident(StudentNaamEdit.getText().toString(),
                                DateOfIncidentEdit.getText().toString(),
                                TimeOfIncidentEdit.getText().toString(),
                                InjuriesDamageEdit.getText().toString(),
                                IncidentDetailsEdit.getText().toString(),
                                ActionTakenIncidentReportEdit.getText().toString(),
                                NotesEdit.getText().toString() );
                        if(isInserted =true)
                            Toast.makeText(IncidentLog.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(IncidentLog.this, "Data not Inserted", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
    public void toHome(View view)
    {
        Intent intent = new Intent(IncidentLog.this, MainActivity.class);
        startActivity(intent);
    }
}

