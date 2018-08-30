package com.example.imaccimm24.simulacro1.entidades;

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

}
