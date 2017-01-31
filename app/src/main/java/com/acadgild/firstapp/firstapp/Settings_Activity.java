package com.acadgild.firstapp.firstapp;


import android.app.Activity;
import android.os.Bundle;

public class Settings_Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new Settings())
                .commit();
    }
}
