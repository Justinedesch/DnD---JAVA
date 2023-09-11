import java.sql.ParameterMetaData;


public class Personnage {


    private String nom;

    private String type;
    private int pv;
    private int force;
    private EquipementOffensif equipementOffensif ;
    private EquipementDefensif equipementDefensif ;


    //constructeur de la classe personnage

    public Personnage(String nom, String type, int pv, int force) {

        this.nom = nom;
        this.type = type;
        this.pv = pv;
        this.force = force;
//     this.equipementOffensif;
// this.equipementDefensif ;
    }






    //constructeur de la classe personnage avec nom
//    public Personnage(String nom) {
//
//        this.nom = nom;
//
//    }


    //constructeur de la classe personnage avec nom et type
    public Personnage(String nom, String type) {

        this.nom = nom;
        this.type = type;
        this.pv = 6;
        this.force = 10;
    }

    @Override
    public String toString() {
        return "Le nom de votre personnage est: "+ this.nom + "" + " Son type est :" + this.type;
    }
}









