package com.company.Poo;

import java.util.Scanner;

public class Cercles {

    public int rayon;

    Scanner sc = new Scanner(System.in);



    public float calculSurface(){

        float air = 3.14f * (rayon*rayon);
        return air;
    }

    public float calculCirconference(){

        float circ = 2 * 3.14f * rayon;
        return circ;

    }

}
