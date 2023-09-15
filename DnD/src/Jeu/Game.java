package Jeu;

import java.util.Scanner;

import Menu.Menu;
import Personnages.Personnage;

public class Game {

    private final Plateau plateau;
    private int position;

    public Game() {
        this.plateau = new Plateau();
    }


    //Position initiale du joueur

    public void lancerDes(Personnage personnage) throws PersonnageHorsPlateauException {
        this.position = 1;
        int positionPlayer = this.position;


        while (positionPlayer < 64) {
            boolean continu = false;

            System.out.println("Vous etes a la case " + positionPlayer);
            Scanner relancer = new Scanner(System.in);
            System.out.println("Relancer ? - 1 Oui - 2 Non");
            int roll = relancer.nextInt();

            switch (roll) {
                case 1 -> continu = true;
                case 2 -> {
                    Menu back = new Menu();
                    back.showMenuPrincipal();
                }
                default -> System.out.println("Please choose 1 or 2.");

            }
            if (continu) {
                positionPlayer += (int) ((Math.random() * 5) + 1);
                System.out.println(positionPlayer);
            }

        }
        throw new PersonnageHorsPlateauException();

//        if (positionPlayer >= 64) {
//            Scanner endGame = new Scanner(System.in);
//            System.out.println("You win !! 1 - Play new game or 2 - Quit ?");
//            int replay = endGame.nextInt();
//            switch (replay) {
//
//                case 1 -> {
//                    Game game = new Game();
//                    game.lancerDes(personnage);
//                }
//
//                case 2 -> {
//                    Menu back = new Menu();
//                    back.showMenuPrincipal();
//                }
//
//            }
//
//
//        }

    }
}




