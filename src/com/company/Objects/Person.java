package com.company.Objects;

public class Person {

    public String navn; //Navn til personen
    public int alder; //Alder til personen
    public int telefonNummer; //Personens telefonnummer

    //Constructur med input
    public Person(String tnavn, int talder, int ttelefonNummer) {
        navn = tnavn;
        alder = talder;
        telefonNummer = ttelefonNummer;
    }
    //Constructor uden input
    public Person() {
    }

    //Tilføj en alder til personen
    public void addAlder(int nyAlder){
        alder += nyAlder;
    }

    //Få personens alder
    public int getAlder() {
        return alder;
    }

    //Få deres navn
    public String getNavn() {
        return navn;
    }

    //En test funktion til at vise polymorfi
    public void besked(int test) {
        System.out.println("Elev: " + test);
    }
}
