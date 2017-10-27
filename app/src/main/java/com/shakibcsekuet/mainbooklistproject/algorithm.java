package com.shakibcsekuet.mainbooklistproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


/**
 * Created by md sakib on 10/26/2017.
 */
public class algorithm extends Activity {
    ListView simpleList;
    String deptlist[] = {"বিগ O নোটেশন -শাফায়েত আশরাফ","কমপ্লেক্সিটি ক্লাস(P-NP, টুরিং মেশিন ইত্যাদি) - শাফায়েত আশরাফ"};
    @Override   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithm);
        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_home_listview, R.id.textView, deptlist);
        simpleList.setAdapter(arrayAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), " Clicked on :: " +deptlist[position], Toast.LENGTH_LONG).show();
                if(position==0){

                }
                else if(position==1){

                }

            }
        });
    }
}