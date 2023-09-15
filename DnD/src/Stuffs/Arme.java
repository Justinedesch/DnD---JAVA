package Stuffs;

public class Arme extends EquipementOffensif {

    private int degats;
    public Arme(int atk, String nom, String type) {
        super(atk, nom, type);
        setDegats(12);
    }

    public int getDegats() {
        return degats;
    }

    public void setDegats(int degats) {
        this.degats = degats;
    }
}
