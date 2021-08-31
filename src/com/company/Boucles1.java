package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Boucles1 {
    public static void main(String[] args) {

        System.out.println("Veuillez écrire un mot :");
        Scanner sc = new Scanner(System.in);
        String mot = sc.next();

//        ArrayList<String> voyelles = new ArrayList<String>(); // chaine comportant les différentes voyelles
//        voyelles.add("a");
//        voyelles.add("e");
//        voyelles.add("i");
//        voyelles.add("o");
//        voyelles.add("u");
//        voyelles.add("y");

        String voyelles = "aeiouy";

        int motLong = mot.length(); //longueur du mot ecrit

        int i = 0;

        int count = 0;
        while(i<motLong) {
            char letter = mot.charAt(i); //verifie lettre par lettre à boucler avec 'Index'

            int index = voyelles.indexOf(letter); //verification array et  mot à boucler

            i++;

            if (index>0){
                count++;
            }
        }
        System.out.println("il y a : "+count+" de voyelles dans votre mot");
    }
}
