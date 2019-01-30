package com.example.gebruiker.droning;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

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
    EditText StudentNaamEditData, DateOfIncidentEditData, TimeOfIncidentEditData, InjuriesDamageEditData, IncidentDetailsEditData, ActionTakenIncidentReportEditData, NotesEditData;
    Button SubmitBTN;
    DatePickerDialog datePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.incidentlog);
        DateOfIncidentEditData=findViewById(R.id.DateOfIncidentEdit);
        DateOfIncidentEditData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar= Calendar.getInstance();
                final int year=calendar.get(Calendar.YEAR);
                final int month=calendar.get(Calendar.MONTH);
                final int day=calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog=new DatePickerDialog(IncidentLog.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        DateOfIncidentEditData.setText(year+"-"+(month+1)+"-"+day);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });
        myDb = new DatabaseHelper(this);

        StudentNaamEditData = (EditText)findViewById(R.id.StudentNaamEdit);
        StudentNaamEditData.setInputType(InputType.TYPE_CLASS_TEXT);

        DateOfIncidentEditData = (EditText)findViewById(R.id.DateOfIncidentEdit);
        DateOfIncidentEditData.setInputType(InputType.TYPE_CLASS_TEXT);

        TimeOfIncidentEditData = (EditText)findViewById(R.id.TimeOfIncidentEdit);
        TimeOfIncidentEditData.setInputType(InputType.TYPE_CLASS_TEXT);

        InjuriesDamageEditData = (EditText)findViewById(R.id.InjuriesDamageEdit);
        InjuriesDamageEditData.setInputType(InputType.TYPE_CLASS_TEXT);

        IncidentDetailsEditData = (EditText)findViewById(R.id.IncidentDetailsEdit);
        IncidentDetailsEditData.setInputType(InputType.TYPE_CLASS_TEXT);

        ActionTakenIncidentReportEditData = (EditText)findViewById(R.id.ActionTakenIncidentReportEdit);
        ActionTakenIncidentReportEditData.setInputType(InputType.TYPE_CLASS_TEXT);

        NotesEditData = (EditText)findViewById(R.id.NotesEdit);
        NotesEditData.setInputType(InputType.TYPE_CLASS_TEXT);

        SubmitBTN = (Button)findViewById(R.id.SubmitBTN);
    }


    class Verbinding extends AsyncTask<Void, Void, JSONObject> {
        String check = "pizza";
        String Data1 = StudentNaamEditData.getText().toString();
        String Data2 = DateOfIncidentEditData.getText().toString();
        String Data3 = TimeOfIncidentEditData.getText().toString();
        String Data4 = InjuriesDamageEditData.getText().toString();
        String Data5 = IncidentDetailsEditData.getText().toString();
        String Data6 = ActionTakenIncidentReportEditData.getText().toString();
        String Data7 = NotesEditData.getText().toString();
        private final String JSON_URL = "http://192.168.64.6/dronebeheer/dronebeheerapp/include/incidentloginsert.php"
                + "?check="+ check
                + "&naamStudent=" + Data1
                + "&datum=" +  Data2
                + "&incidentTime=" + Data3
                + "&damage=" + Data4
                + "&details=" + Data5
                + "&actionTaken=" + Data6
                + "&notes=" + Data7;
        String charset = "UTF-8";
        HttpURLConnection conn;
        StringBuilder result;
        URL urlObj;


        protected JSONObject doInBackground(Void... args ) {
            JSONObject retObj = null;

            try {
                urlObj = new URL(JSON_URL);

                conn = (HttpURLConnection) urlObj.openConnection();
                conn.setDoOutput(false);
                conn.setRequestMethod("GET");
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
                Log.i("ontvangen json", json.toString());
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

    public void SendDataIncident(View view)
    {
        new Verbinding().execute();
    }
}

