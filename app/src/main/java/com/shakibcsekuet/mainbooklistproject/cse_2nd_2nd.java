package com.shakibcsekuet.mainbooklistproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by md sakib on 9/30/2017.
 */

public class cse_2nd_2nd extends AppCompatActivity {

    ListView simpleList2;
    String book[] ={"Algorithm Analysis and Design","Microprocessors and Microcontrollers","Numerical Methods","Econmics and Accounting","Vector Analysis and Statistics"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cse_2nd_2nd);
        simpleList2 = (ListView)findViewById(R.id.simpleListView5);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.listview, R.id.textView, book);
        simpleList2.setAdapter(arrayAdapter);
        simpleList2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Clicked on "+book[position], Toast.LENGTH_LONG).show();
                if(position==0){
                    String s="https://drive.google.com/open?id=0B1ON83FyGCF5MG54Y0NPQXRTdDg";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(cse_2nd_2nd.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==1){
                    String s="https://drive.google.com/open?id=0B1ON83FyGCF5SU8taENySmlRZFU";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(cse_2nd_2nd.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==2){
                    String s="https://drive.google.com/open?id=0B1ON83FyGCF5Rm4zcHJ2TUJBU1U";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(cse_2nd_2nd.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==3){
                    String s="https://drive.google.com/open?id=0B1ON83FyGCF5NUlWZEhpWUMzRmc";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(cse_2nd_2nd.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==4){
                    String s="https://drive.google.com/open?id=0B1ON83FyGCF5dHdqTzNncElNTjQ";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(cse_2nd_2nd.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }



            }
        });

    }
}
