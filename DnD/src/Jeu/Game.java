package Jeu;

import java.util.ArrayList;
import java.util.Scanner;

import Ennemies.Dragon;
import Menu.Menu;
import Personnages.Personnage;
import Stuffs.Arme;


public class Game {
    private ArrayList<Case> collection;
    private final Plateau plateau;
    private int position;

    private Personnage personnage;

    public Personnage getPersonnage() {
        return personnage;
    }

    public void setPersonnage(Personnage personnage) {
        this.personnage = personnage;
    }

    public Game() {
        this.plateau = new Plateau();

    }



    //Position initiale du joueur

    public int diceRoll(){
        return  ((int) ((Math.random() * 6) + 1));
    }
    /**
     * Roll dice and move to tyhe next case
     *
     * @param personnage Personnage to move
     * @throws PersonnageHorsPlateauException Throwed when position is out of board
     */
    public void lancerDes(Personnage personnage) throws PersonnageHorsPlateauException {
        this.position = 1;
        int diceValue = diceRoll();

        while (this.position < plateau.getSize() && personnage.isAlive()) {
//            boolean continu = false;

            this.position = plateau.moovePlayer(personnage, diceValue );
            System.out.println("Vous etes a la case " + this.position);
            System.out.println(personnage.toString());
            if(personnage.isAlive()) {
                Scanner relancer = new Scanner(System.in);
                System.out.println("Relancer ? - 1 Oui - 2 Non");
                int roll = relancer.nextInt();

                switch (roll) {
                    case 1 -> diceValue=diceRoll();
                    case 2 -> {
                        Menu back = new Menu();
                        back.showMenuPrincipal();
                    }
                    default -> System.out.println("Please choose 1 or 2.");

                }
            }
//            if (continu) {
//                diceValue=
//                positionPlayer += diceValue;
//                System.out.println(positionPlayer);
//            }

//            collection = new ArrayList<>();
//            displayList();

        }
        if(personnage.isAlive())
            throw new PersonnageHorsPlateauException();
        else
            System.out.println("T'es dead");


    }


//    private void displayList() {
//
//        for (int i = 0; i < 64; i++) {
//            collection.add(new EmptyCase());
//        }
//
//            collection.set(22, new Enemies(50,10, "Dragon", "Un méchant dragon très fort"));
//            collection.remove(27);
//
//
//        for (int i = 0; i < 64; i++) {
//
//            switch (i) {
//                case 1 -> System.out.println("You're safe");
//                case 2 -> collection.set(45, new Dragon());
//                case 3 -> collection.set(3, new Arme());
//                case 4 -> collection.set(4, new Potion("Pepsi",  "coke is life"));
//            }
//        }

//    }
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







