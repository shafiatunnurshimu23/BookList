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


/**
 * Created by md sakib on 10/26/2017.
 */
public class Linked_List extends Activity {
    ListView simpleList;
    private WebView mywebView;
    String deptlist[] = {"লিংকড লিস্ট - শাফায়েত আশরাফ","লিংকড লিস্ট ব্যাসিক অপারেশন - হাসান আবদুল্লাহ","লিংকড লিস্ট - অনিন্দ্য পাল","লিংকড লিস্ট – সি - মুনতাসির ওয়াহেদ","কোডিং লিংকড লিস্ট - আলাভোলা","ডাবলি লিংকড লিস্ট - মুনতাসির ওয়াহেদ"};
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
                if(deptlist[position]=="লিংকড লিস্ট - শাফায়েত আশরাফ"){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="http://www.shafaetsplanet.com/planetcoding/?p=2689";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(Linked_List.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==1){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="http://hellohasan.com/category/data-structure/linked-list";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(Linked_List.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==2){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="http://shoshikkha.com/archives/1914";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(Linked_List.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==3){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="http://ami-alavola.rhcloud.com/?p=26";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(Linked_List.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==4){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="http://ami-alavola.rhcloud.com/?p=37";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(Linked_List.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==5){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="http://shoshikkha.com/archives/3290";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(Linked_List.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }

            }
        });
    }
}