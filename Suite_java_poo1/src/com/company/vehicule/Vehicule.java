package com.company.vehicule;

public abstract class Vehicule {

    protected String marque;
    protected int nb_roues;

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getNb_roues() {
        return nb_roues;
    }

    public void setNb_roues(int nb_roues) {
        this.nb_roues = nb_roues;
    }

    public String Marche(){
        return "Ce Vehicule est un "+getMarque()+" et il contient : "+getNb_roues()+" roues. ";
    }

}
