package com.shakibcsekuet.mainbooklistproject;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static java.lang.Thread.sleep;

public class Logo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_logo);
        Thread timer=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(1000);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    nextActivity();

                }
            }
        });
        timer.start();

    }

    public void nextActivity(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
