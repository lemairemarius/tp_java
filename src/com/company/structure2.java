package com.company;

import com.sun.jdi.event.MonitorWaitedEvent;

import java.util.Objects;
import java.util.Scanner;

public class structure2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Bonjour, la fonction calculette va bientot se mettre en marche :");
        Thread.sleep(2000);


        System.out.println("Veuillez entrer le premier entier :");
        Scanner sc = new Scanner(System.in);
        int op1 = sc.nextInt();

        System.out.println("Veuillez entrer le deuxiéme entier :");
        int op2 = sc.nextInt();


        System.out.println("Maintenant veuillez entrer -, +, /, * : ");
        String multi = sc.next();

        int result = ' ';

        if (Objects.equals(multi, "-")){
            result =  op1 - op2;
        }else if (Objects.equals(multi, "+")){
            result = op1 + op2;
        }else if(Objects.equals(multi, "/")){
            result= op1 / op2;
        }else if(Objects.equals(multi, "*")){
            result = op1 * op2;
        }else{
            System.out.println("You know nothing John Snow !!!");
        }
        System.out.println(result);
    }
}
