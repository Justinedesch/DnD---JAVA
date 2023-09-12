import java.util.Scanner;

public class Menu {

    public void MenuPrincipal() {

// 1 - Le joueur chosit nouvelle partie ou quitter

        Scanner UChoice = new Scanner(System.in);
        System.out.println("Create new character OR Quit ?");

        String userChoice = UChoice.nextLine();

        // Si le joueur quitte, le programme se ferme

        if (userChoice.equals("Quit")) {

//            System.exit(1);


            // Sinon, on passe à la personnalisation du personnage

        } else if (userChoice.equals("Create new character")) {


            System.out.println("Personnalisez votre joueur" + userChoice);


            Scanner nom = new Scanner(System.in);
            System.out.println("Enter username");

            String userName = nom.nextLine();
            System.out.println("Username is: " + userName);

        }

// Une fois le nom choisit, on passe au type :

        Scanner Utype = new Scanner(System.in);
        System.out.println("Enter type");


        String typeResult = Utype.nextLine();


        // Si on choisit "Guerrier", cela créera un objet de la classe Guerrier

        if (typeResult.equals("Guerrier")) {

            Guerrier newChar = new Guerrier(typeResult);
            System.out.println(newChar);


            System.out.println("User Type is: " + typeResult);  // Output user input


        }

        // Si on choisit "Mage", cela créera un objet de la classe Mage
        else if (typeResult.equals("Mage")) {

            Mage newChar = new Mage(typeResult);
            System.out.println(newChar);


            String userType = Utype.nextLine();
            System.out.println("User Type is: " + userType);  // Output user input

        }


        // Si on tape entrée sans rien choisir, cela créera un objet de la classe personnage (sans parametres de pv et force prédéfinis)

        else if (Utype.equals(null)) {

            Personnage newChar = new Personnage(typeResult);

            String userType = Utype.nextLine();
            System.out.println("User Type is: " + typeResult);  // Output user input


        }



        public void startGame () {
            Plateau plateau = new Plateau();
            plateau.setPlateau();

            Game game = new Game();
            game.setPosition();


        }


    }


}





