package com.example.gebruiker.droning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MaintenanceLog extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText StudentNaamEdit,DateEdit, RedenEdit, TimeOfIncidentEdit, PartsReplacedEdit,WorkDoneEdit, NotesEdit;
    Button SubmitBTN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maintenancelog);
        myDb = new DatabaseHelper(this);
        StudentNaamEdit = (EditText)findViewById(R.id.StudentennaamEdit);
        RedenEdit = (EditText)findViewById(R.id.RedenEdit);
        DateEdit = (EditText)findViewById(R.id.DateEdit);
        PartsReplacedEdit = (EditText)findViewById(R.id.PartsReplacedEdit);
        WorkDoneEdit = (EditText)findViewById(R.id.WorkDoneEdit);
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
                                RedenEdit.getText().toString(),
                                WorkDoneEdit.getText().toString(),
                                DateEdit.getText().toString(),
                                PartsReplacedEdit.getText().toString(),
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