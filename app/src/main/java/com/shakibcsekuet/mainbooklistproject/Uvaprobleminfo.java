package com.shakibcsekuet.mainbooklistproject;//Uvaprobleminfo

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.Settings.System;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Uvaprobleminfo extends Activity implements OnClickListener {

    Button btn;
    EditText e1,e2;
    TextView tv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uvaprobleminfo);
        e1=(EditText)findViewById(R.id.Etext);
        btn = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.textView);
        btn.setOnClickListener(this);

    }

    public void onClick(View view) {
        String s= String.valueOf(e1.getText());
            String New = "https://uhunt.onlinejudge.org/api/p/id/" + s;
            String str = New;
            // detect the view that was "clicked"
            Mytask mytask = new Mytask();
            mytask.execute(str);


    }

    private class Mytask extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... params) {
            URL url;
            String data="";
            try {
                url = new URL(params[0]);
                HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
                InputStream stream = conn.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(stream));
                String line;
                while ((line = br.readLine())!=null) {
                    data += line;
                }
            } catch (Exception e) {


            }
            return data;
        }

        @Override
        protected void onPostExecute(String s) {

            String txt = "";
            try {
                JSONObject full = new JSONObject(s);
                txt = "Problem Title: "+full.getString("title")+"\n";
                txt += "Accepted: "+full.getString("ac")+"\n";
                txt += "Wrong Answer: "+full.getString("wa")+"\n";
                txt += "Time limit exceed: "+full.getString("tle")+"\n";



            } catch (Exception e) {
                tv.setText("Parsing Error");
            }
            tv.setText(txt);

        }



        @Override
        protected void onPreExecute() {}

        @Override
        protected void onProgressUpdate(String... str) {
            TextView txt = (TextView) findViewById(R.id.textView);
            txt.setText(str[0]);
        }
    }



}