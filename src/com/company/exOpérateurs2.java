package com.company;

import java.util.Scanner;

public class exOpérateurs2 {
    public static void main(String[] args) {

        System.out.println("Veuillez entrer un nombre de seconde pour les convertirs ? :");
        Scanner sc = new Scanner(System.in);
        int totalSecs = sc.nextInt();
        int hours = totalSecs/3600;
        int minutes = (totalSecs % 3600)/60;
        int seconds = totalSecs %60;

        System.out.println("cela fait donc "+hours+"H "+minutes+"M "+seconds+"S");


    }
}
