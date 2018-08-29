package com.example.imaccimm24.simulacro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import java.io.Serializable;

public class menuP extends AppCompatActivity {

    CardView queVisitar,dondeComer,queHacer,dondeDormir,Servicios,Llamadas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_p);
        queVisitar=findViewById(R.id.uno);
        dondeDormir=findViewById(R.id.dos);
        dondeComer=findViewById(R.id.tres);
        queHacer=findViewById(R.id.cuatro);
        Servicios=findViewById(R.id.cinco);
        Llamadas=findViewById(R.id.seis);
        queVisitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uno = new Intent(menuP.this,que_visitar.class);
                startActivity(uno);
            }
        });
        dondeDormir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uno = new Intent(menuP.this,donde_dormir.class);
                startActivity(uno);
            }
        });
        dondeComer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uno = new Intent(menuP.this,donde_comer.class);
                startActivity(uno);
            }
        });
        queHacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uno = new Intent(menuP.this,que_hacer.class);
                startActivity(uno);
            }
        });
        Servicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uno = new Intent(menuP.this,que_visitar.class);
                startActivity(uno);
            }
        });
        Llamadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uno = new Intent(menuP.this,llamadas_urgentes.class);
                startActivity(uno);
            }
        });
    }

}
