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

public class MaintenanceLog extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText StudentNaamEdit,DateEdit, RedenEdit, PartsReplacedEdit,WorkDoneEdit, SystemTestedEdit, NotesEdit;
    Button SubmitBTN;
    DatePickerDialog datePickerDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maintenancelog);
        DateEdit=findViewById(R.id.DateEdit);
        DateEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar= Calendar.getInstance();
                final int year=calendar.get(Calendar.YEAR);
                final int month=calendar.get(Calendar.MONTH);
                final int day=calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog=new DatePickerDialog(MaintenanceLog.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        DateEdit.setText(year+"-"+(month+1)+"-"+day);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });
        myDb = new DatabaseHelper(this);
        StudentNaamEdit = (EditText)findViewById(R.id.StudentennaamEdit);
        DateEdit = (EditText)findViewById(R.id.DateEdit);
        RedenEdit = (EditText)findViewById(R.id.RedenEdit);
        PartsReplacedEdit = (EditText)findViewById(R.id.PartsReplacedEdit);
        WorkDoneEdit = (EditText)findViewById(R.id.WorkDoneEdit);
        SystemTestedEdit = (EditText)findViewById(R.id.SystemTestedEdit);
        NotesEdit = (EditText)findViewById(R.id.NotesEdit);
        SubmitBTN = (Button)findViewById(R.id.SubmitBTN);
        AddData();
    }


    public void AddData() {
        SubmitBTN.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertDataMaintenance(StudentNaamEdit.getText().toString(),
                                DateEdit.getText().toString(),
                                RedenEdit.getText().toString(),
                                PartsReplacedEdit.getText().toString(),
                                WorkDoneEdit.getText().toString(),
                                SystemTestedEdit.getText().toString(),
                                NotesEdit.getText().toString() );
                        if(isInserted =true)
                            Toast.makeText(MaintenanceLog.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(MaintenanceLog.this, "Data not Inserted", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }


    public void toHome(View view)
    {
        Intent intent = new Intent(MaintenanceLog.this, MainActivity.class);
        startActivity(intent);

    }
}