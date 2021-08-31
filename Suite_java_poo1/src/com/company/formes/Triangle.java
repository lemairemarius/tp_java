package com.company.formes;

public class Triangle extends Forme{

    private double base;
   private double hauteur;

    public Triangle(double base, double hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    };

    @Override
    public double aire() {
        return (base*hauteur)/2;
    }
}
