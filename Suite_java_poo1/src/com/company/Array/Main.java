package com.company.Array;

public class Main {
    public static void main(String[] args) {

Personn[] clients = {
         new Personn("Paul","Weller","Baker Street","Londres"),
         new Personn("White","Jack","Hell Street","Detroit"),
         new Personn("Claypool","Les","Key Street","San Francisco"),
         new Personn("Thunders","Johnny","Funny Street","New York"),
};

        System.out.println("|| Nom || Prenom || Adresse || Ville ||");
        for (Personn item:clients){
            System.out.println("|--------------------------------------------|");
            System.out.println("| "+item.toString()+" |");
            System.out.println("|--------------------------------------------|");
        }
    }
}
