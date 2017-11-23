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
public class Segment_Tree extends Activity {
    ListView simpleList;
    private WebView mywebView;
    String deptlist[] = {"সেগমেন্ট ট্রি-১ - শাফায়েত আশরাফ","স্ট্যাক বেসিক ডাটা স্ট্রাকচার - আহমাদ ফাইয়াজ","Segment tree/ BIT part - 1 - শাকিল আহমেদ","লোয়েস্ট কমন অ্যানসেস্টর - শাফায়েত আশরাফ","Persistent Segment Tree (Part - 01)","Persistent Segment Tree (Part - 02)","বাইনারি ইনডেক্সড ট্রি - শাফায়েত আশরাফ"};
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
                    String s="http://www.shafaetsplanet.com/planetcoding/?p=1557";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(Segment_Tree.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==1){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="http://www.shafaetsplanet.com/planetcoding/?p=1591";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(Segment_Tree.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==2){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="http://shakilcompetitiveprogramming.blogspot.nl/2015/06/segment-tree-bit-part-1_21.html";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(Segment_Tree.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==3){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="http://www.shafaetsplanet.com/planetcoding/?p=1831";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(Segment_Tree.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==4){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="https://rezwanarefin01.github.io/posts/persistent-segment-tree-01/";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(Segment_Tree.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==5){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="https://rezwanarefin01.github.io/posts/persistent-segment-tree-02/";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(Segment_Tree.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==6){
                    //Toast.makeText(getBaseContext(), " Clicked on :: " +position, Toast.LENGTH_LONG).show();
                    String s="http://www.shafaetsplanet.com/planetcoding/?p=1961";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(Segment_Tree.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }

            }
        });
    }
}