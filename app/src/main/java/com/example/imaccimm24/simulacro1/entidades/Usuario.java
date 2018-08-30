package com.example.imaccimm24.simulacro1.entidades;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.constraint.solver.widgets.Helper;

import com.example.imaccimm24.simulacro1.Helper.HelperSqlite;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String Nombre;
    private String Telefono;
    private String Email;

    public Usuario() {

    }

    public Usuario(String nombre, String telefono, String email) {
        Nombre = nombre;
        Telefono = telefono;
        Email = email;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public float Registrar(Context context){
        HelperSqlite base =new HelperSqlite(context,"bd_simulacro.db",null,1);
        SQLiteDatabase datos = base.getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put("Nombre",Nombre);
        values.put("Telefono",Telefono);
        values.put("Email",Email);
        long uno = datos.insert("Usuario",null,values);
        return uno;
    }
    public float Modificar(Context context) {
        HelperSqlite base = new HelperSqlite(context, "bd_simulacro.db", null, 1);
        SQLiteDatabase datos = base.getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put("Nombre",Nombre);
        values.put("Telefono",Telefono);
        values.put("Email",Email);
        long uno = datos.update("Uusario",values,"Nombre="+Nombre,null);
        return uno;
    }

    public float Eliminar(Context context){
        HelperSqlite base = new HelperSqlite(context, "bd_simulacro.db", null, 1);
        SQLiteDatabase datos = base.getWritableDatabase();
        long uno =  datos.delete("Usuario","Nombre="+Nombre,null);

        return uno;

    }
    }

