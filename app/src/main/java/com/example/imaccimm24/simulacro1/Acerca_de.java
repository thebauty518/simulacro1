
package com.example.imaccimm24.simulacro1;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class Acerca_de extends AppCompatActivity implements SensorEventListener {


    SensorManager sm;
    Sensor sensor;

    TextView txtS;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);
        txtS=(TextView)findViewById(R.id.txtS);

        sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        sensor = sm.getDefaultSensor(Sensor.TYPE_PROXIMITY);

        sm.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
    }
    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        Float texto = Float.valueOf(sensorEvent.values[0]);


        /*float valor= texto;
       /* Intent intent = new Intent(this, menuP.class);
        startActivity(intent);*/
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.item1:
                Intent registar = new Intent(this, Registrar.class);
                startActivity(registar);
                return true;

            case R.id.item2:
                Intent configuracion= new Intent(this, Items.class);
                startActivity(configuracion);
                return true;

            case R.id.item3:
                Intent ayudar = new Intent(this, Ayudar.class);
                startActivity(ayudar);
                return true;

            case R.id.item4:
                Toast.makeText(this, "bye", Toast.LENGTH_SHORT).show();
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }


}
