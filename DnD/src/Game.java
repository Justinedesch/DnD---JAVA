import java.util.Scanner;
import test.Plateau;

public class Game {

   private Plateau plateau = new Plateau();

    public void startGame () {
        plateau.setPlateau();
    }

    //Position initiale du joueur

public int setPosition() {
     int position = 1;
        return position;
    }


    public int lancerDes(int position) {

        int dé = (int) (Math.random() * 6);
        int resultatDes = dé;

        int playerPosition = position + resultatDes;

        System.out.println("Vous etes a la case" + playerPosition);


        while (position != 64) {

            Scanner relancer = new Scanner(System.in);
            System.out.println("Relancer");

//            lancerDes();

            return playerPosition;

        }

        if (position == 64) {
            Scanner endGame = new Scanner(System.in);
            System.out.println("New game or Quit ?");


        }

        return playerPosition;
    }
}



