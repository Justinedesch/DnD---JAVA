import java.util.Scanner;

public class Plateau {


    int[] plateau = new int[64]; //Plateau de 64 cases

    void position() {
        int position = 1;

        while (position != 64) {

            int dé = (int) (Math.random() * 6);
            int resultatDes = dé;

            int playerPosition = position + resultatDes;

            System.out.println("Vous etes a la case" + playerPosition);

        }

        if (position == 64) {
            Scanner endGame = new Scanner(System.in);
            System.out.println("New game or Quit ?");


        }
    }
}
