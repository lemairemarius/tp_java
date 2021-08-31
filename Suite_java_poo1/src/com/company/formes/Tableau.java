package com.company.formes;

public class Tableau {
    public static void main(String[] args) {

        Forme[] Tableau = {
                new Triangle(5, 10),
                new Triangle(56, 99),
                new Triangle(6, 10)
        };

    int count = 1;
    for(Forme item: Tableau){
            System.out.println("l'air du triangle "+count+" est de : "+ item.aire()+" cm2");
            count++;
        }
    }
}
