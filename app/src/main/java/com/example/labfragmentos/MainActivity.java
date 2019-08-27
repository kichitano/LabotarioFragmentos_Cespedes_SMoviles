package com.example.labfragmentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Contenedor
        if (findViewById(R.id.fragment_container) != null) {

            if (savedInstanceState != null) {
                return;
            }
            //Crear el nuevo Fragmento
            TituloFragment tituloFragment = new TituloFragment();

            //Agregar extras si existen
            tituloFragment.setArguments(getIntent().getExtras());

            //Lanzar la vista del fragmento
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragment_container, tituloFragment)
                    .commit();

        }
    }
}
