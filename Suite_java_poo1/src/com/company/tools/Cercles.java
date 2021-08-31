package com.company.tools;

import java.util.Scanner;


public class Cercles {


    private int rayon;


    //constructor avec paramétres
    public Cercles(int rayon) {
        this.rayon = rayon;
    }


    //constructor sans paramétres mais avec valeur defaut
    public Cercles() {
        this.rayon = 10;
    }

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

    public double calculSurface(){

        return 3.14f * (rayon * rayon);
    }

    public double calculCirconference (){
        return 2*3.14f*rayon;
    }


}





