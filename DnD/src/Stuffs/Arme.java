package Stuffs;

public class Arme extends EquipementOffensif {
    private int degats;
    public Arme() {
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
