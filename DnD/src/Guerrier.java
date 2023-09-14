public class Guerrier extends Personnage {
    public Guerrier() {
    }

    public Guerrier(String nom) {
        super(nom);
    }

    public Guerrier(String nom, String type) {

     super(nom,type,10,10);
    }

    public Guerrier(String nom, String type, int pv, int force) {
        super(nom, type, pv, force);
    }

    public Guerrier(int pv, int force) {
        super(pv, force);
    }
}