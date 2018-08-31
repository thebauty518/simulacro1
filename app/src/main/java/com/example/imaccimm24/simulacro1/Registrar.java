package com.example.imaccimm24.simulacro1;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.imaccimm24.simulacro1.Helper.HelperSqlite;
import com.example.imaccimm24.simulacro1.entidades.Usuario;

public class Registrar extends AppCompatActivity {
    EditText Nombre, Telefono,Email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        Nombre=findViewById(R.id.txtNombre);
        Telefono =findViewById(R.id.txtCelular);
        Email = findViewById(R.id.txtEmail);
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


            case R.id.itemIcono:
                finish();
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
    public void Mostrar(View view){
        HelperSqlite base = new HelperSqlite(this,"bd_simulacro.db",null,1);
        SQLiteDatabase Datos= base.getWritableDatabase();
        String codigo = Nombre.getText().toString();
        if (!codigo.isEmpty()){

            Cursor cursor =Datos.rawQuery("select Telefono,Email from Usuario where Nombre ='"+codigo+"'",null);
            if (cursor.moveToFirst()){
                Telefono.setText(cursor.getString(0));
                Email.setText(cursor.getString(1));
                Datos.close();


            }else{
                Toast.makeText(this, "El Usuario que Buscas no existe", Toast.LENGTH_SHORT).show();
                Datos.close();
            }


        }else{
            Toast.makeText(this, "Debe especificar el nombre para poder buscarlo", Toast.LENGTH_SHORT).show();
        }


    }
    public void Registro(View view){
        if (!Email.getText().toString().isEmpty()||!Nombre.getText().toString().isEmpty() ||!Telefono.getText().toString().isEmpty()) {
           HelperSqlite base =new HelperSqlite(this,"bd_simulacro.db",null,1);
           SQLiteDatabase datos = base.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put("Nombre",Nombre.getText().toString());
            values.put("Telefono",Telefono.getText().toString());
            values.put("Email",Email.getText().toString());
            datos.insert("Usuario",null,values);
            datos.close();
                Toast.makeText(this, "Registro Exitoso", Toast.LENGTH_SHORT).show();
                Nombre.setText("");
                Email.setText("");
                Telefono.setText("");

        }else{
            Toast.makeText(this, "Debe de llenar todos los campos", Toast.LENGTH_SHORT).show();
        }

    }
    public void Actualizar(View view){
        if (!Email.getText().toString().isEmpty()||!Nombre.getText().toString().isEmpty() ||!Telefono.getText().toString().isEmpty()) {
            HelperSqlite base =new HelperSqlite(this,"bd_simulacro.db",null,1);
            SQLiteDatabase datos = base.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put("Nombre",Nombre.getText().toString());
            values.put("Telefono",Telefono.getText().toString());
            values.put("Email",Email.getText().toString());
            datos.update("Usuario",values,"Nombre = '"+Nombre.getText().toString()+"'",null);
            datos.close();
            Toast.makeText(this, "Actualizacion Exitoso", Toast.LENGTH_SHORT).show();
            Nombre.setText("");
            Email.setText("");
            Telefono.setText("");

        }else{
            Toast.makeText(this, "Debe de llenar todos los campos", Toast.LENGTH_SHORT).show();
        }
    }
    public void Eliminar(View view){
        if (!Email.getText().toString().isEmpty()||!Nombre.getText().toString().isEmpty() ||!Telefono.getText().toString().isEmpty()) {
            HelperSqlite base =new HelperSqlite(this,"bd_simulacro.db",null,1);
            SQLiteDatabase datos = base.getWritableDatabase();

            datos.delete("Usuario","Nombre = '"+Nombre.getText().toString()+"'",null);
            datos.close();
            Toast.makeText(this, "Eliminado de forma Exitoso", Toast.LENGTH_SHORT).show();
            Nombre.setText("");
            Email.setText("");
            Telefono.setText("");

        }else{
            Toast.makeText(this, "Debe de llenar todos los campos", Toast.LENGTH_SHORT).show();
        }
    }
}
