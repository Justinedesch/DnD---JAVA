package Personnages;

import java.sql.ParameterMetaData;
import Stuffs.EquipementOffensif;
import Stuffs.EquipementDefensif;

// Classe personnage :
public abstract class Personnage {

    public Personnage() {
        this("default");
    }

    private String nom;
    private String type;
    private int pv;
    private int force;
    private EquipementOffensif equipementOffensif;
    private EquipementDefensif equipementDefensif;


    //ENCAPSULATION (methodes qui permettent d'acceder aux attributs private de notre classe personnage (via getter) et de les modifier (via setter) :

    //Getters :
    public String getNom() {
        return this.nom;
    }

    public String getType() {
        return this.type;
    }

    public int getPv() {
        return this.pv;
    }

    public int getForce() {
        return this.force;
    }

    //Setters :

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public void setForce(int force) {
        this.force = force;
    }


// Classes enfant






    // CONSTRUCTEURS




    // 2 - constructeur de la classe personnage avec nom
    public Personnage(String nom) {

//        this.nom = nom;
        this(nom, "");
    }


    // 3 - constructeur de la classe personnage avec nom et type
    public Personnage(String nom, String type) {

//        this.nom = nom;
//        this.type = type;
//        this.pv = 6;
//        this.force = 10;
        this(nom,type,6,10);
    }

    // 1 - constructeur de la classe personnage

    public Personnage(String nom, String type, int pv, int force) {

        this.nom = nom;
        this.type = type;
        this.pv = pv;
        this.force = force;
//     this.equipementOffensif;
// this.equipementDefensif ;
    }

    public Personnage( int pv, int force) {


        this.pv = pv;
        this.force = force;

    }



    // Methode ToString renvoie les informations paramétrées "en sortie". Override permet de la surcharger : c'est à dire que cette simple méthode renvoie plusieures informations
    @Override
    public abstract String toString();
}




