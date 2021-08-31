package com.company;

import java.util.Scanner;

public class Boucles2 {
    public static void main(String[] args) {
    System.out.println("Combien de lignes ?");
        Scanner sc = new Scanner(System.in);

        int nbreLigne,i,structure;
        nbreLigne= sc.nextInt();


      for( i = 0; i < nbreLigne; i++){
          for( structure = 0; structure < nbreLigne -i -1; structure++)
              System.out.print(" ");
              for (structure = 0; structure <= i*2;structure++)
                  System.out.print("*");
              System.out.println();
              }

    }
}
