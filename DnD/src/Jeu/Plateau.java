package Jeu;
//PLATEAU

import Ennemies.Dragon;
import Ennemies.Gobelins;
import Personnages.Personnage;
import Stuffs.Arme;

import java.util.ArrayList;
import java.util.List;


public class Plateau {

    public static final int DEFAULT_LENGTH = 64;
    private List<Case> cases;
    private int playerPosition;




    public Plateau() {
        this(DEFAULT_LENGTH);

    }
     private Game game;
    public Plateau(int length) {
        playerPosition = 0;
        cases = new ArrayList<>(length);
        populate();
    }

    private void populate() {
        //TODO: set cases in list

        cases.add(new EmptyCase());
        cases.add(new Potion());
        cases.add(new Gobelins());
        cases.add(new EmptyCase());
        cases.add(new Potion());
        cases.add(new Potion());
        cases.add(new EmptyCase());
        cases.add(new Gobelins());;
        cases.add(new Potion());
        cases.add(new Potion());
        cases.add(new Gobelins());
        cases.add(new EmptyCase());
        cases.add(new Potion());
        cases.add(new Potion());
        cases.add(new Potion());
        cases.add(new EmptyCase());
        cases.add(new Gobelins());
        cases.add(new Potion());
        cases.add(new EmptyCase());
        cases.add(new EmptyCase());
        cases.add(new Gobelins());
        cases.add(new Gobelins());
        cases.add(new Potion());
        cases.add(new EmptyCase());
        cases.add(new EmptyCase());
        cases.add(new EmptyCase());
        cases.add(new EmptyCase());
        cases.add(new Gobelins());
        cases.add(new Potion());
        cases.add(new Potion());
        cases.add(new EmptyCase());
        cases.add(new EmptyCase());
        cases.add(new Dragon());
        cases.add(new EmptyCase());
        cases.add(new EmptyCase());
        cases.add(new Potion());
        cases.add(new Gobelins());
        cases.add(new EmptyCase());
        cases.add(new Potion());
        cases.add(new Potion());
        cases.add(new EmptyCase());
        cases.add(new Gobelins());;
        cases.add(new Potion());
        cases.add(new Potion());
        cases.add(new Gobelins());
        cases.add(new EmptyCase());
        cases.add(new Potion());
        cases.add(new Potion());
        cases.add(new Potion());
        cases.add(new EmptyCase());
        cases.add(new EmptyCase());
        cases.add(new Potion());
        cases.add(new Gobelins());
        cases.add(new EmptyCase());
        cases.add(new Potion());
        cases.add(new Potion());
        cases.add(new EmptyCase());
        cases.add(new Gobelins());;
        cases.add(new Potion());
        cases.add(new Potion());
        cases.add(new Gobelins());
        cases.add(new EmptyCase());
        cases.add(new Potion());
        cases.add(new Potion());
        cases.add(new Potion());
        cases.add(new EmptyCase());
        cases.set(45,new Dragon());
        cases.set(52,new Dragon());
        cases.set(56,new Dragon());
        cases.set(62, new Dragon());

    }

    public void reload() {
        // empty plateau
        cases = new ArrayList<>(cases.size());
        // populate plateau
        populate();
    }


    public int moovePlayer(Personnage player, int deplacement) throws PersonnageHorsPlateauException {

        // 1 - tester les paramètres => position dans plateau ? joueur valide ?
        if (playerPosition + deplacement >= cases.size()) {
            throw new PersonnageHorsPlateauException();
        }

        if (player == null) {
            throw new NullPointerException();
        }

        // 2 - trouver la case si c'est bon

        playerPosition = playerPosition + deplacement;
        Case current = cases.get(playerPosition);


        // 3 - faire l'interaction entre case et joueur
        current.interaction(player);

//        game.lancerDes(player);

        return this.playerPosition;
//
//        for (int i = 0; i < 64; i++) {
//
//            switch (i) {
//                case 1 -> System.out.println("You're safe");
//                case 2 -> cases.set(45, new Dragon());
//                case 3 -> cases.set(3, new Arme());
//                case 4 -> cases.set(4, new Potion("Pepsi", 5, "coke is life"));
//            }
//        }


//OR Override ??




//        public int getplayerPosition () {
//            return playerPosition;
//        }


    }

    public int getSize() {
        return cases.size();
    }
}





