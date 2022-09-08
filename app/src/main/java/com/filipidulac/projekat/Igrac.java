package com.filipidulac.projekat;

public class Igrac {
    int id;
    String ime, datum, brojPoena;

    public Igrac(){}

    public Igrac(String ime, String datum, String brojPoena) {
        this.ime = ime;
        this.datum = datum;
        this.brojPoena = brojPoena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(String brojPoena) {
        this.brojPoena = brojPoena;
    }
}
