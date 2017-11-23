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
public class Queue extends Activity {
    ListView simpleList;
    private WebView mywebView;
    String deptlist[] = {"কিউ ব্যাসিক অপারেশন - হাসান আবদুল্লাহ","কিউ বেসিক ডাটা স্ট্রাকচার - আহমাদ ফাইয়াজ","ডাটা স্ট্রাকচার: কিউ(Queue) - আলাভোলা","সি++ এর Priority Queue - আবু আসিফ খান চৌধুরী","Union Find Algorithm - শাকিল আহমেদ"};
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
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="http://hellohasan.com/category/data-structure/queue";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(Queue.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==1){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="http://blog.faiyaz.info/%e0%a6%95%e0%a6%bf%e0%a6%89-%e0%a6%a1%e0%a6%be%e0%a6%9f%e0%a6%be-%e0%a6%b8%e0%a7%8d%e0%a6%9f%e0%a7%8d%e0%a6%b0%e0%a6%be%e0%a6%95%e0%a6%9a%e0%a6%be%e0%a6%b0/";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(Queue.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==2){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="http://ami-alavola.rhcloud.com/?p=54";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(Queue.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==3){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="http://www.abuasifkhan.me/cplusplus-priority-queue.html";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(Queue.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==4){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="http://shakilcompetitiveprogramming.blogspot.nl/2014/01/union-find-algorithm-union-find.html";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(Queue.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }



            }
        });
    }
}