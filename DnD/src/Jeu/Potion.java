package Jeu;


import Jeu.Case;
import Personnages.Personnage;

public class Potion implements Case {
    public int sante;
    public String nomPotion;

    public String description;

    public Potion(String nomDePotion, String descriptionPotion) {
        nomPotion = nomDePotion;
        sante = 10;
        description = descriptionPotion;
    }

    public Potion() {
        this("Bibine", "C'est de la bonne");
    }

    public int getPointsSante() {

        return sante;
    }


    @Override
    public void interaction(Personnage player) {

        player.setPv(player.getPv() + sante);
        System.out.println("héhé, lucky day");
    }


}
