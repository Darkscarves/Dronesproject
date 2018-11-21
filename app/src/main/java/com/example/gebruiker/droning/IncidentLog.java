package com.example.gebruiker.droning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class IncidentLog extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText StudentNaamEdit, DateOfIncidentEdit, TimeOfIncidentEdit, InjuriesDamageEdit, IncidentDetailsEdit, ActionTakenIncidentReportEdit, NotesEdit;
    Button SubmitBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.incidentlog);
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
                        boolean isInserted = myDb.insertData(StudentNaamEdit.getText().toString(),
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

