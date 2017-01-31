package com.acadgild.firstapp.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by user on 12/15/2016.
 */

public class FirstActivity extends AppCompatActivity {
    Button show;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.first_activity);
        show=(Button)findViewById(R.id.show);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this," Hello Again",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(FirstActivity.this,Settings_Activity.class);
                startActivity(intent);
            }
        });

       // Intent intent= new Intent();
        Bundle values=getIntent().getExtras();

        if(values!=null) {
            String s = values.getString("PAC01_NAME");
            Toast.makeText(this, s, Toast.LENGTH_SHORT).show();

        }

    }
}
