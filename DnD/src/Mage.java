public class Mage extends Personnage {
    public Mage() {
    }

    public Mage(String nom) {
        super(nom);
//        this.getPv();
//        this.setPv(6);
//        this.getForce();
//        this.setForce(15);
    }

    public Mage(String nom, String type) {
        super(nom, type,6, 15);
    }
}