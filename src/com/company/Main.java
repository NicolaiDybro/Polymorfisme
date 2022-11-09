package com.company;

import com.company.Objects.Elev;
import com.company.Objects.Lærer;

public class Main {

    public static void main(String[] args) {
        Elev elev = new Elev("Peter", 7, 0);
        System.out.println("Navn: " + elev.getNavn() + " Alder: " + elev.alder + " Klasse: " + elev.getKlasse());
        Lærer lærer = new Lærer("Henrik", 33);
        lærer.addKlasse(5);
        lærer.addKlasse(10);
        System.out.println("Klasser: " + lærer.getKlasser());
    }

}
