package com.filipidulac.projekat;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteTransactionListener;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {
        super(context,"myDB.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try{
            db.execSQL("CREATE TABLE TABELA (id INTEGER PRIMARY KEY AUTOINCREMENT, ime TEXT, datum TEXT, brojPoena TEXT)");
        }catch (Exception e){

        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void dodajRed(String ime, int brojPoena) {


        String datum = new SimpleDateFormat("dd-MM-yyyy HH:mm", Locale.getDefault()).format(new Date());

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("ime",ime);
        cv.put("datum", String.valueOf(datum));
        cv.put("brojPoena",String.valueOf(brojPoena));

        db.insert("TABELA",null,cv);
        db.close();
    }

    public ArrayList<Igrac> prikaziPodatke(){
        ArrayList<Igrac> stavke = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM TABELA order by brojPoena desc",null);
        Igrac igrac = null;
        while(cursor.moveToNext()){
            igrac = new Igrac();
            igrac.setId(cursor.getInt(0));
            igrac.setIme(cursor.getString(1));
            igrac.setDatum(cursor.getString(2));
            igrac.setBrojPoena(cursor.getString(3));
            stavke.add(igrac);
        }

        return stavke;
    }

    public void obrisiSve(){
        SQLiteDatabase db = this.getReadableDatabase();
        db.execSQL("DELETE FROM TABELA");
        db.close();
    }
}
