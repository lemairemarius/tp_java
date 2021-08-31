package com.company;

import java.util.Scanner;

public class structure1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Veuillez indiquer votre âge ?");
        int age = sc.nextInt();
        float rest = age%2;

        if (rest == 0 ){
            System.out.println("Votre âge est Pair !!");
        }else {
            System.out.println("Votre âge est impair ;( ");
        }

    }}
