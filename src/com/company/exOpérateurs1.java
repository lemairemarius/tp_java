package com.company;

import java.util.Scanner;

//Exo 3 Conversion de température

public class exOpérateurs1 {
    public static void main(String[] args) {

        System.out.print("Qu'elle est le montant de la température en Farenheit(F°) que vous voulez convertir en Celsius(C°) ? ");
        Scanner sc = new Scanner(System.in);

        float degre = sc.nextFloat();
        float resultat;
        float calcul;

        calcul = (degre-32);

        resultat = calcul / 1.8f;

        System.out.println("Il fait donc " + resultat +"C°");

    }
}

