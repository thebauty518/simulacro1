package com.example.imaccimm24.simulacro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.item1:
                Intent registar = new Intent(this, Registrar.class);
                startActivity(registar);
                return true;

            case R.id.item2:
                Intent ayudar = new Intent(this, Ayudar.class);
                startActivity(ayudar);
                return true;

            case R.id.item3:
                Toast.makeText(this, "bye", Toast.LENGTH_SHORT).show();
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
