package Jeu;

import Personnages.Personnage;

public class EmptyCase implements Case {
    public EmptyCase() {
    }


    @Override
    public void interaction(Personnage player) {

        System.out.println("It's so quiet here...");
    }


}
