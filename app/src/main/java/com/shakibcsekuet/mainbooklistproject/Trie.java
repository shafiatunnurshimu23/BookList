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
public class Trie extends Activity {
    ListView simpleList;
    private WebView mywebView;
    String deptlist[] = {"ট্রাই(প্রিফিক্স ট্রি/রেডিক্স ট্রি) - শাফায়েত আশরাফ","ট্রাই ট্রি ( Trie Tree ) - আহমাদ ফাইয়াজ"};
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
                    String s="http://www.shafaetsplanet.com/planetcoding/?p=1679";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(Trie.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==1){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="http://blog.faiyaz.info/%e0%a6%9f%e0%a7%8d%e0%a6%b0%e0%a6%be%e0%a6%87-%e0%a6%9f%e0%a7%8d%e0%a6%b0%e0%a6%bf-trie-tree/";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(Trie.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }


            }
        });
    }
}