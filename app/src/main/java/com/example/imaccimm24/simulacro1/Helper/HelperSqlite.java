package com.example.imaccimm24.simulacro1.Helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class HelperSqlite extends SQLiteOpenHelper{
    public HelperSqlite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE Usuario (" +
                "    Nombre  TEXT," +
                "    Telefono TEXT," +
                "    Email    TEXT" +
                ")");
        sqLiteDatabase.execSQL("CREATE TABLE Items (\n" +
                "    Nombre      TEXT,\n" +
                "    Descripcion TEXT,\n" +
                "    Telefono    TEXT,\n" +
                "    Direccion   TEXT,\n" +
                "    Web         TEXT,\n" +
                "    Email       TEXT,\n" +
                "    Categoria   TEXT REFERENCES Categoria_item (Categoria),\n" +
                "    Tipo        TEXT REFERENCES Tipo_Item (Tipo) \n" +
                ")");
                sqLiteDatabase.execSQL("CREATE TABLE Tipo_Item (\n" +
                        "    Tipo TEXT \n" +
                        ")");

                sqLiteDatabase.execSQL("insert into Tipo_Item (Tipo)values('Museos'),('Monumentos')" +
                        ",('Parques'),('Zona de Camping'),('Hoteles'),('Heladerías'),('Restaurantes')"+
                ",('Guías Turísticos'),('Transporte'),('Droguería'),('Policía')");


                sqLiteDatabase.execSQL("CREATE TABLE Categorias (\n" +
                        "   Categoria TEXT \n" +
                        ")");
                sqLiteDatabase.execSQL("insert into Categorias (Categoria)values('¿Que Visitar?')"+
                ",('¿Dónde Dormir?'),('¿Dónde Comer?'),('¿Qué Hacer?'),('tServicios Turísticos')"+
                        ",('tLlamadas Urgentes')");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
