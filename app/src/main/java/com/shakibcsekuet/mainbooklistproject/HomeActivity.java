package com.shakibcsekuet.mainbooklistproject;

/**
 * Created by md sakib on 9/28/2017.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class HomeActivity extends Activity
{

    ListView simpleList;
    String deptlist[] = {"Programming Section","CSE","EEE","MECANICAL","CIVIL","BME","ECE","IEM","BECM","TE","ET","LE","URP"};

    @Override   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);      setContentView(R.layout.activity_home);
        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_home_listview, R.id.textView, deptlist);
        simpleList.setAdapter(arrayAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), " Clicked on :: "+ deptlist[position], Toast.LENGTH_LONG).show();
                if(deptlist[position]=="CSE"){
                    Intent intent = new Intent(getApplicationContext(), CSE.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="EEE"){
                    Intent intent = new Intent(getApplicationContext(), EEE.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="MECANICAL"){
                    Intent intent = new Intent(getApplicationContext(), MECA.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="CIVIL"){
                    Intent intent = new Intent(getApplicationContext(), CIVIL.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="BME"){
                    Intent intent = new Intent(getApplicationContext(), BME.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="ECE"){
                    Intent intent = new Intent(getApplicationContext(), ECE.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="IEM"){
                    Intent intent = new Intent(getApplicationContext(), IEM.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="BECM"){
                    Intent intent = new Intent(getApplicationContext(), BECM.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="TE"){
                    Intent intent = new Intent(getApplicationContext(), TE.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="ET"){
                    Intent intent = new Intent(getApplicationContext(), ET.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="LE"){
                    Intent intent = new Intent(getApplicationContext(), LE.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="URP"){
                    Intent intent = new Intent(getApplicationContext(), URP.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="Programming Section"){
                    Intent intent = new Intent(getApplicationContext(), Programming_Section.class);
                    startActivity(intent);
                }
            }
        });
    }
}