package com.company.Objects;

public class Elev extends Person {

    private int klasse;

    public Elev(String tnavn, int talder, int tklasse) {
        alder = talder;
        navn = tnavn;
        klasse = tklasse;
    }

    public void besked(int test) {
        System.out.println(test + "");
    }

    public int getKlasse() {
        return klasse;
    }
}
