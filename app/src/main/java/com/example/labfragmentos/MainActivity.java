package com.example.labfragmentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ParrafoFragment parrafoFragment = new ParrafoFragment();
/*
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container, parrafoFragment)
                .commit();
*/
    }
}
