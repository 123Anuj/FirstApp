package com.acadgild.firstapp.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by user on 12/15/2016.
 */

public class SecondActivity extends AppCompatActivity {

    Button show_msg;
    TextView text;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

      super.onCreate(savedInstanceState);//it is used to provide a window so that we can view .All fragments and loaders

        setContentView(R.layout.second_activity);//this methd is used to link the layout to the activity.
        //setContentView(R.xml.preferences);

        show_msg=(Button)findViewById(R.id.button);//
        text=(TextView)findViewById(R.id.textsecond);
        text.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Toast.makeText(SecondActivity.this," This is my first app ",Toast.LENGTH_LONG).show();

                return false;
            }
        });

        show_msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(SecondActivity.this,"Hey! This is Anuj...",Toast.LENGTH_LONG).show();  //3s,5s

                Intent intent=new Intent(SecondActivity.this,FirstActivity.class);

                Bundle userXDetails=new Bundle();
                userXDetails.putString("PAC01_NAME",text.getText().toString());
                userXDetails.putString("PAC01_ADDRESS","bangalore");

                intent.putExtras(userXDetails);

                startActivity(intent);


            }
        });

    }
}
