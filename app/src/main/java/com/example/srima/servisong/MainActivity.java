package com.example.srima.servisong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






            final TextView tv= (TextView) findViewById(R.id.song);
            final TextView tv2=(TextView) findViewById(R.id.songg);
            intent=new Intent(this,MyService.class);

            tv.setOnClickListener(new View.OnClickListener() {

                @Override

                public void onClick(View v) {

                    // TODO Auto-generated method stub

                    tv.setText(R.string.playsongs);

                    startService(intent);

                }

            });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    stopService(intent);





            }
        });

        }











    }


