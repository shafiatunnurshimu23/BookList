package com.shakibcsekuet.mainbooklistproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static android.R.id.message;

/**
 * Created by md sakib on 10/28/2017.
 */

public class data_structure extends Activity {
    ListView simpleList;
    String deptlist[] = {"অ্যারে ব্যাসিক অপারেশন - হাসান আবদুল্লাহ","অ্যারে কমপ্রেশন/ম্যাপিং - শাফায়েত আশরাফ"};
    @Override   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_structure);
        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_home_listview, R.id.textView, deptlist);
        simpleList.setAdapter(arrayAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), " Clicked on :: " +deptlist[position], Toast.LENGTH_LONG).show();
                if(deptlist[position]=="অ্যারে ব্যাসিক অপারেশন - হাসান আবদুল্লাহ"){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="http://hellohasan.com/category/data-structure/array";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(data_structure.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);
                }
                else if(position==1){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="http://www.shafaetsplanet.com/planetcoding/?p=1388";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(data_structure.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }


            }
        });
    }
}