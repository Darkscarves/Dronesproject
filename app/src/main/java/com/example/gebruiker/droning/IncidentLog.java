package com.example.gebruiker.droning;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
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
        new Verbinding().execute();
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
  //      AddData();
    }

 //   public void AddData() {
 //       SubmitBTN.setOnClickListener(
  //              new View.OnClickListener() {
    //                @Override
      //              public void onClick(View v) {
//                        boolean isInserted = myDb.insertDataIncident(StudentNaamEdit.getText().toString(),
//                                DateOfIncidentEdit.getText().toString(),
//                                TimeOfIncidentEdit.getText().toString(),
//                                InjuriesDamageEdit.getText().toString(),
//                                IncidentDetailsEdit.getText().toString(),
//                                ActionTakenIncidentReportEdit.getText().toString(),
//                                NotesEdit.getText().toString() );
//                        if(isInserted =true) {
//                            Toast.makeText(IncidentLog.this, "Data Inserted", Toast.LENGTH_SHORT).show();
//                            Log.i("buttonCheck", "Je hebt op submit gedrukt...");
//                        }
//                        else {
//                            Toast.makeText(IncidentLog.this, "Data not Inserted", Toast.LENGTH_SHORT).show();
//                        }
//                        Hier afhandeling van HTTP Request

                        class Verbinding extends AsyncTask<Void, Void, JSONObject> {
                        private static final String JSON_URL = "../../../../lampp/htdocs/dronebeheer/dronebeheerapp/include/incidentloginsert.php";
                        String charset = "UTF-8";
                        HttpURLConnection conn;
                        StringBuilder result;
                        URL urlObj;


                                protected JSONObject doInBackground(Void... args) {
                                    JSONObject retObj = null;

                                    try {
                                        urlObj = new URL(JSON_URL);

                                        conn = (HttpURLConnection) urlObj.openConnection();
                                        conn.setDoOutput(false);
                                        conn.setRequestMethod("get");
                                        conn.setRequestProperty("Accept-Charset", charset);
                                        conn.setConnectTimeout(15000);
                                        conn.connect();

                                        InputStream in = new BufferedInputStream(conn.getInputStream());
                                        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                                        result = new StringBuilder();

                                        String line;
                                        while ((line = reader.readLine()) != null) {
                                        result.append(line);
                                    }

                                    retObj = new JSONObject(result.toString());

                                 }  catch (IOException e) {
                                     e.printStackTrace();
                                 } catch (JSONException e) {
                                     e.printStackTrace();
                                 }
                                 return retObj;
                                 }
                                protected void onPostExecute(JSONObject json){
                                    if (json != null) {
                                        //textview.setText(json.toString());
                                        Log.d("ontvangen json", json.toString());
                                    }
                                }
                            }
    //    );
 //   }
    public void toHome(View view)
    {
        Intent intent = new Intent(IncidentLog.this, MainActivity.class);
        startActivity(intent);
    }
}

