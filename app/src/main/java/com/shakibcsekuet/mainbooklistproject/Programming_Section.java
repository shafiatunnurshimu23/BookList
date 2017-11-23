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
public class Programming_Section extends Activity {
    ListView simpleList;
    String deptlist[] = {"এলগোরিদম","ডাটা স্ট্রাকচার","লিংকড লিস্ট (Linked List)","স্ট্যাক (Stack)","কিউ (Queue)","ট্রি (Tree)","বাইনারী সার্চ ট্রি (Binary Search Tree)","হ্যাশটেবিল (HashTable)","ডিসজয়েন্ট সেট (Disjoint Set)","ট্রাই ট্রি (Trie)","সেগমেন্ট ট্রি (Segment Tree)"};

    @Override   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.programming_section);
        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_home_listview, R.id.textView, deptlist);
        simpleList.setAdapter(arrayAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), " Clicked on :: " +deptlist[position], Toast.LENGTH_LONG).show();
                if(deptlist[position]=="এলগোরিদম"){
                    Intent intent = new Intent(getApplicationContext(), algorithm.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="ডাটা স্ট্রাকচার"){
                    Intent intent = new Intent(getApplicationContext(), data_structure.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="লিংকড লিস্ট (Linked List)"){
                    Intent intent = new Intent(getApplicationContext(), Linked_List.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="স্ট্যাক (Stack)"){
                    Intent intent = new Intent(getApplicationContext(), stack.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="কিউ (Queue)"){
                    Intent intent = new Intent(getApplicationContext(), Queue.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="ট্রি (Tree)"){
                    String s="http://hellohasan.com/category/data-structure/tree/tree-basic-concept/";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(Programming_Section.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);
                }
                else if(deptlist[position]=="বাইনারী সার্চ ট্রি (Binary Search Tree)"){
                    String s="http://hellohasan.com/category/data-structure/tree/binary-search-tree-bst";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(Programming_Section.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);
                }
                else if(deptlist[position]=="হ্যাশটেবিল (HashTable)"){
                    String s="http://ami-alavola.rhcloud.com/?p=198";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(Programming_Section.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);


                }
                else if(deptlist[position]=="ডিসজয়েন্ট সেট (Disjoint Set)"){
                    String s="http://www.shafaetsplanet.com/planetcoding/?p=763";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(Programming_Section.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);
                }
                else if(deptlist[position]=="ট্রাই ট্রি (Trie)"){
                    Intent intent = new Intent(getApplicationContext(), Trie.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="সেগমেন্ট ট্রি (Segment Tree)"){
                    Intent intent = new Intent(getApplicationContext(), Segment_Tree.class);
                    startActivity(intent);
                }


            }
        });
    }
}