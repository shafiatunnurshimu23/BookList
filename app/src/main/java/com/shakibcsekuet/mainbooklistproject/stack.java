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
public class stack extends Activity {
    ListView simpleList;
    private WebView mywebView;
    String deptlist[] = {"স্ট্যাক - শাফায়েত আশরাফ","স্ট্যাক ব্যাসিক অপারেশন - হাসান আবদুল্লাহ","স্ট্যাক বেসিক ডাটা স্ট্রাকচার - আহমাদ ফাইয়াজ","ডাটা স্ট্রাকচার: স্ট্যাক (Stack) - আলাভোলা","স্ট্যাক – অ্যারে ইমপ্লিমেন্টেশন - মুনতাসির ওয়াহেদ","স্ট্যাক – লিংকড লিস্ট ইমপ্লিমেন্টেশন - মুনতাসির ওয়াহেদ"};
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
                if(deptlist[position]=="স্ট্যাক - শাফায়েত আশরাফ"){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="http://www.shafaetsplanet.com/planetcoding/?p=2342";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(stack.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==1){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="http://hellohasan.com/category/data-structure/stack";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(stack.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==2){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="http://blog.faiyaz.info/%e0%a6%b8%e0%a7%8d%e0%a6%9f%e0%a7%8d%e0%a6%af%e0%a6%be%e0%a6%95-%e0%a6%a1%e0%a6%be%e0%a6%9f%e0%a6%be-%e0%a6%b8%e0%a7%8d%e0%a6%9f%e0%a7%8d%e0%a6%b0%e0%a6%be%e0%a6%95%e0%a6%9a%e0%a6%be%e0%a6%b0/";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(stack.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==3){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="http://ami-alavola.rhcloud.com/?p=44";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(stack.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==4){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="http://shoshikkha.com/archives/3321";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(stack.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==5){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="http://shoshikkha.com/archives/3521";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(stack.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }

            }
        });
    }
}