package com.shakibcsekuet.mainbooklistproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by md sakib on 9/30/2017.
 */

public class cse_1st_1st extends AppCompatActivity {

    ListView simpleList2;
    private WebView mywebView;
    String book[] ={"Discrete mathematics","physics","Basic Electrical Engineering","Introduction to computer system","Differential and Integral Calculus"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cse_1st_1st);
        simpleList2 = (ListView)findViewById(R.id.simpleListView2);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.listview, R.id.textView, book);
        simpleList2.setAdapter(arrayAdapter);
        simpleList2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Clicked on "+book[position], Toast.LENGTH_LONG).show();
                if(position==0){
                    String s="https://drive.google.com/open?id=1Vm8K9x0Ke6rF0O30d2Abee6-AFA1bbhX";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(cse_1st_1st.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);
                }
                else if(position==1){
                    String s="https://drive.google.com/open?id=1OyUglvs5b3_Q5A4f1xKUfPmm2Q4YCRFj";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(cse_1st_1st.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==2){
                    String s="https://drive.google.com/open?id=1wmW_j4BrJir8DWgddLCcwKmiHhZiXd3A";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(cse_1st_1st.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==3){
                    String s="https://drive.google.com/open?id=1Mn7rs0D18JwmMKb_Luy5HW4m3VghEK3s";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(cse_1st_1st.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==4){
                    String s="https://drive.google.com/open?id=1ICSehUE4fPcsIVrlNiuE1XRYzcImYJnE";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(cse_1st_1st.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }





            }
        });

    }

}
