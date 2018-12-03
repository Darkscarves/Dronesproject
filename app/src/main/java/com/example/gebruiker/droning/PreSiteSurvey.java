package com.example.gebruiker.droning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class PreSiteSurvey extends AppCompatActivity {

    DatabaseHelper myDb;
    EditText StudentNaamEdit,DateEdit, JobNumberEdit, PilotInCommandEdit, PartsReplacedEdit,ObserverEdit, uavEdit,Helper1Edit,Helper2Edit,SiteNameEdit,LatitudeAmpEdit, AltitudeFromEdit, WorkReqEdit, DateWorkEdit, uavEdit, uavEdit, uavEdit;
    Button SubmitBTN;
    CheckBox DownloadedMapCBox;
    RadioGroup RadioGroupVehicularAccess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presitesurvey);
        myDb = new DatabaseHelper(this);
        StudentNaamEdit = (EditText)findViewById(R.id.StudentennaamEdit);
        JobNumberEdit = (EditText)findViewById(R.id.JobNumberEdit);
        DateEdit = (EditText)findViewById(R.id.DateEdit);
        PilotInCommandEdit = (EditText)findViewById(R.id.PilotInCommandEdit);
        ObserverEdit = (EditText)findViewById(R.id.ObserverEdit);
        uavEdit = (EditText)findViewById(R.id.uavEdit);
        Helper1Edit = (EditText)findViewById(R.id.Helper1Edit);
        Helper2Edit = (EditText)findViewById(R.id.Helper2Edit);
        SiteNameEdit = (EditText)findViewById(R.id.uavEdit);
        LatitudeAmpEdit = (EditText)findViewById(R.id.uavEdit);
        AltitudeFromEdit = (EditText)findViewById(R.id.AltitudeFromEdit);
        WorkReqEdit = (EditText)findViewById(R.id.WorkReqEdit);
        DateWorkEdit = (EditText)findViewById(R.id.DateWorkEdit);
        DownloadedMapCBox = (CheckBox) findViewById(R.id.DownloadedMapCBox);
        RadioGroupVehicularAccess = (RadioGroup)findViewById(R.id.RadioGroupVehicularAccess);
        SubmitBTN = (Button)findViewById(R.id.SubmitBTN);
        AddData();
    }


    public void AddData() {
        SubmitBTN.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertDataPreSiteSurvey(StudentNaamEdit.getText().toString(),
                                JobNumberEdit.getText().toString(),
                                PilotInCommandEdit.getText().toString(),
                                DateEdit.getText().toString(),
                                ObserverEdit.getText().toString(),
                                uavEdit.getText().toString() ,
                                Helper1Edit.getText().toString(),
                                Helper2Edit.getText().toString(),
                                SiteNameEdit.getText().toString(),
                                LatitudeAmpEdit.getText().toString(),
                                AltitudeFromEdit.getText().toString(),
                                WorkReqEdit.getText().toString(),
                                DateWorkEdit.getText().toString(),
                                DownloadedMapCBox.getText().toString(),
                                RadioGroupVehicularAcces.getText().toString(),
                                uavEdit.getText().toString());
                        if(isInserted =true)
                            Toast.makeText(PreSiteSurvey.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(PreSiteSurvey.this, "Data not Inserted", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
    public void toHome(View view)
    {
        Intent intent = new Intent(PreSiteSurvey.this, MainActivity.class);
        startActivity(intent);
    }
}
