package com.example.przepisy;

public class Przepis {
    private String nazwa;
    private int kategoria;
    private int idZdjecia;
    private String skladniki;

    public Przepis(String nazwa,
                   int kategoria,
                   int idZdjecia,
                   String skladniki) {
        this.nazwa = nazwa;
        this.kategoria = kategoria;
        this.idZdjecia = idZdjecia;
        this.skladniki = skladniki;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getKategoria() {
        return kategoria;
    }

    public int getIdZdjecia() {
        return idZdjecia;
    }

    public String getSkladniki() {
        return skladniki;
    }

    @Override
    public String toString() {
        return nazwa;
    }
}
