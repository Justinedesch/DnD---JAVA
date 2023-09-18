package Jeu;

import java.util.ArrayList;
import java.util.Scanner;

import Menu.Menu;
import Personnages.Personnage;
import Stuffs.Arme;

public class Game {
    private ArrayList<Case> collection;
    private final Plateau plateau;
    private int position;

    public Game() {
        this.plateau = new Plateau();
    }


    //Position initiale du joueur

    /**
     * Roll dice and move to tyhe next case
     *
     * @param personnage Personnage to move
     * @throws PersonnageHorsPlateauException Throwed when position is out of board
     */
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

            collection = new ArrayList<>();
            displayList();

        }
        throw new PersonnageHorsPlateauException();


    }

    private void displayList() {
        for (int i = 0; i < 64; i++) {
            collection.add(new Case());
            collection.set(22,new Enemies());
            collection.remove(27);
            collection.get(33);
            System.out.println(33);
        }

        for (int i = 0; i < 64; i++) {

            switch (i) {
                case 1 -> System.out.println("You're safe at the case %s" + i + "re roll");
                case 2 -> collection.set(2,new Enemies());
                case 3 -> collection.set(3,new Arme());
                case 4 -> collection.set(4,new Potion());
            }
        }

    }

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





