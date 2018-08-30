package com.example.imaccimm24.simulacro1.entidades;

import java.io.Serializable;

public class Item implements Serializable {

    private String Nombre;
    private String Descripcion;
    private String Direccion;
    private String Telefono;
    private String Web;
    private String Email;

    public Item() {

    }

    public Item(String nombre, String descripcion, String direccion, String telefono, String web, String email) {
        Nombre = nombre;
        Descripcion = descripcion;
        Direccion = direccion;
        Telefono = telefono;
        Web = web;
        Email = email;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getWeb() {
        return Web;
    }

    public void setWeb(String web) {
        Web = web;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
