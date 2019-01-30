package com.example.gebruiker.droning;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class apiTest extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.api_test);
        new Verbinding().execute();
    }


    class Verbinding extends AsyncTask<Void, Void, JSONObject> {
        private static final String JSON_URL = "http://192.168.64.6/dronebeheer/dronebeheerapp/include/incidentloginsert.php"
                + "?check=pizza"
                + "&naamStudent=Niels"
                + "&datum=29-03-2018"
                + "&incidentTime=18:29"
                + "&damage=geen schadedsdsds"
                + "&details=Ik draag geen broekfdsf"
                + "&actionTaken=Ik doe een broek aandasd"
                + "&notes=yjyt";
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
