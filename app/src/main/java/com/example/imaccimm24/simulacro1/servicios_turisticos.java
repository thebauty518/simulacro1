package com.example.imaccimm24.simulacro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class servicios_turisticos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios_turisticos);
    }
    public void info(View view){
        Intent uno = new Intent(this,Informacion.class);
        startActivity(uno);
    }
}
