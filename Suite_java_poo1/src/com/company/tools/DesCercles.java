package com.company.tools;


public class DesCercles {
    public static void main(String[] args) {


        Cercles cercle1 = new Cercles(10);
        Cercles cercle2 = new Cercles(45);

        System.out.println("l'air du cercle 1 : "+cercle1.calculSurface()+" cm2");
        System.out.println("la circonference du cercle 1 : "+cercle1.calculCirconference()+" cm");
        System.out.println("l'air du cercle 2 : "+cercle2.calculSurface()+" cm2");
        System.out.println("la circonference du cercle 2 : "+cercle2.calculCirconference()+" cm");

    }

}
