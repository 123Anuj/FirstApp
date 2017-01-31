package com.acadgild.firstapp.firstapp;

import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Settings  extends PreferenceFragment{

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

         addPreferencesFromResource(R.xml.preferences);
       // getActivity();

    }
}

