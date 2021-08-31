package com.company.Array;

public class Personn extends Client{

    Personn (String Nom, String Prenom, String Adresse, String Ville) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Adresse = Adresse;
        this.Ville = Ville;
    }

    public String toString(){
        return "|"+Nom+" || "+ Prenom+" || "+ Adresse+" || "+ Ville+"|";
    }




}