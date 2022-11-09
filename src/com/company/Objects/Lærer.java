package com.company.Objects;

import java.util.ArrayList;
import java.util.List;

public class Lærer extends Person{

    private List<Integer> klasser; //Lave en liste med klasser

    //Constructor
    public Lærer(String tnavn, int talder) {
        alder = talder;
        navn = tnavn;
        klasser = new ArrayList<>();
    }

    //Tilføje en klasse
    public void addKlasse(int tklasse){
        klasser.add(tklasse);
    }

    //Få listen med klasserne
    public List<Integer> getKlasser() {
        return klasser;
    }

    //Test besked til at vise polymorfi
    public void besked(String test) {
        System.out.println("Lærer: " + test);
    }
}
