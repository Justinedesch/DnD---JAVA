package Stuffs;

public abstract class EquipementDefensif {


    private int def;
    private String nom;
private String type;

    //constructeur de la classe equipementDefensif

    EquipementDefensif(int def, String nom,String type) {
        this.def = def;
        this.nom = nom;
        this.type = type;

    }

//    equipementDefensif Stuffs.Bouclier = new equipementDefensif(20, "Ecu en fer","bouclier");
//    equipementDefensif Stuffs.Philtre = new equipementDefensif(10, "Voile blanc","philtre");


}
