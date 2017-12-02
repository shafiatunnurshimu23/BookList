package com.shakibcsekuet.mainbooklistproject;//Uvauserinfo activity_uvauserinfo

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

public class Uvauserinfo extends Activity implements OnClickListener {

    Button btn;
    EditText e1,e2;
    TextView tv;
    String val;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uvauserinfo);
        e1=(EditText)findViewById(R.id.Etext);
        btn = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.textView);
        btn.setOnClickListener(this);

    }

    public void onClick(View view) {
            String s= String.valueOf(e1.getText());
        String ss="https://uhunt.onlinejudge.org/api/uname2uid/"+s;
            //Mytask mytask = new Mytask();
           // mytask.execute(ss);
            //tv.setText(val);
            String New = "https://uhunt.onlinejudge.org/api/subs-user/"+s;
            String str = New;
            // detect the view that was "clicked"
            Mytask2 mytask2 = new Mytask2();
            mytask2.execute(str);

    }


    private class Mytask2 extends AsyncTask<String, String, String> {

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
                txt += "Name: "+full.getString("name");
                txt +="\nUser name: "+ full.getString("uname");
                JSONArray contacts = full.getJSONArray("subs");
                for(int i=0;i<contacts.length();i++) {

                    JSONArray contacts2 = contacts.getJSONArray(i);
                    txt+="\nSubmission no: "+(i+1);
                    txt += "\nSubmission ID: " + contacts2.getString(0);
                    txt += "\nProblem ID: " + contacts2.getString(1);
                    txt += "\nVerdict ID: " + contacts2.getString(2);
                    txt += "\nRuntime: " + contacts2.getString(3);
                    txt += "\nSubmission Time (unix timestamp) : " + contacts2.getString(4);
                    txt += "\nLanguage ID (1=ANSI C, 2=Java, 3=C++, 4=Pascal, 5=C++11) : " + contacts2.getString(5);
                    txt += "\nSubmission Rank : " + contacts2.getString(6);
                }


            } catch (JSONException e) {
                e.printStackTrace();
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

            val=s;
           // tv.setText(s);





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