package com.shakibcsekuet.mainbooklistproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class database_MainActivity extends AppCompatActivity   {

    EditText e1,e2,e3,e4;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_baseactivity_main);

        e1 = (EditText) findViewById(R.id.name);
        e2 = (EditText) findViewById(R.id.bday);
       // e3 = (EditText) findViewById(R.id.writer);
        //e4 = (EditText) findViewById(R.id.dept);

        b1 = (Button) findViewById(R.id.save);
        b2 = (Button) findViewById(R.id.show);

        final MyDBFunctions mf = new MyDBFunctions(getApplicationContext());

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String _name = e1.getText().toString();
                String _bday = e2.getText().toString();
               // String _writer = e3.getText().toString();
                //String _dept = e4.getText().toString();

                DataTemp dt = new DataTemp(_name, _bday);

                mf.addingDataToTable(dt);

                Toast.makeText(getApplicationContext(), "Data added successfully!", Toast.LENGTH_LONG).show();



            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BirthdayOfFriends.class));
            }
        });



    }
}


