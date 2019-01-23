package com.example.gebruiker.droning;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;

public class apiTest extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.api_test);
        new Verbinding().execute();
    }


    class Verbinding extends AsyncTask<Void, Void, JSONObject> {
        private static final String JSON_URL = "http://192.168.64.6/dronebeheer/dronebeheerapp/include/incidentloginsert.php";
        JSON_URL += "?check=pizza";
        JSON_URL += "&naamStudent=David";
        JSON_URL += "&datum=24-03-2018";
        JSON_URL += "&incidentTime=13:33";
        JSON_URL += "&damage=geen schade";
        JSON_URL += "&details=ik draag geen bril";
        JSON_URL += "&actionTaken=Ik heb een zonnebril gepakt";
        JSON_URL += "&notes=C#";
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

} // End of class apiTest
