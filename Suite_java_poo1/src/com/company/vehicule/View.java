package com.company.vehicule;

public class View {
    public static void main(String[] args) {
 Avion test = new Avion("Aribus",5);
        System.out.println(test.Marche());

        Vélo cycle = new Vélo("rockrider",2);
        System.out.println(cycle.Marche());
    }
}
