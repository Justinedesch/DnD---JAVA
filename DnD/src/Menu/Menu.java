package Menu;

import Personnages.Guerrier;
import Personnages.Mage;
import Personnages.Personnage;
import Jeu.Game;
import Jeu.PersonnageHorsPlateauException;

import java.util.Scanner;

public class Menu {

    private Personnage personnage;
    Scanner uChoice = new Scanner(System.in);

    /**
     *
     */

    public void showMenuPrincipal() {

//        System.out.println("Welcome to Donjon et Dragon" +
//                        "                                                                                          \n" +
//                        "                                                                                          \n" +
//                        "                                       :=+*###*+-.                                        \n" +
//                        "                                     -#%%%%%%%%%%%*.                                      \n" +
//                        " *#+=--:::::::::::::::.             *%%%%%=. .=%%%%%: :%*+=----:::::::::::::.             \n" +
//                        "  *%%%%%%%%%%%%%%%%%%%%%%#+-       -%%%%%-     =%%%%*  -%%%%%%%%%%%%%%%%%%%%%%%*=:        \n" +
//                        "   -#%%%%%%%%%%%%%%%%%%%%%%%%*:    -%=%%%-= :  =%%%%#   .+%%%%%%%%%%%%%%%%%%%%%%%%#=.     \n" +
//                        "     :#%%%%%%%%%%%%%%%%%%%%%%%%#:  .#-:*%=%==+.%%%%%-      =%%%%%%%%%%%%%%%%%%%%%%%%%=    \n" +
//                        "      .%%%%%%%%#+++++*#%%%%%%%%%%= :=+%*=-#%#**=+%%=        *%%%%%%%%+++++*#%%%%%%%%%%#.  \n" +
//                        "       %%%%%%%%+       .+%%%%%%%%%= -%%%%%#*%%#*#=.         :.-=. :=+        -#%%%%%%%%#  \n" +
//                        "       %%%%%%%%+         :%%%%%%#+==#%%%%#*#%%%##%#.      :+:+%#*%%%%%*=.      #%%%%%%%%+ \n" +
//                        "       %%%%%%%%+          *%%%#=-+=*%%%+.:#%%%%#+%%+     +#+******#%*=--:      :%%%%%%%%% \n" +
//                        "       %%%%%%%%+          =%%%%%=-*=#+=-:*#%#=..:%%%*+  ==*%*=+#%%*+#.          %%%%%%%%%.\n" +
//                        "       %%%%%%%%+          +%%%%-*%%:+%%++*- *=.+=+=+%: -#%%-=%%%%%%%%.         .%%%%%%%%% \n" +
//                        "       %%%%%%%%+          %%%%-#%%%%%%%%#.  *%= :#%-. +%%#. +%%%%%%%%.         +%%%%%%%%* \n" +
//                        "       %%%%%%%%+        .#%%%%..%%%%%%%%.   :-.  =%%%%*++.  +%*%%%%%%.        =%%%%%%%%%. \n" +
//                        "       %%%%%%%%*.....:=*%%%%%#+=%%%%%%%*          -#%%%%#=  +%==:::=+. ...:-+%%%%%%%%%%:  \n" +
//                        "       %%%%%%%%%%%%%%%%%%%%%%%=*%%%%%%%#          =*+*%%%%%*+++%*+%-#%#=%%%%%%%%%%%%%#.   \n" +
//                        "      .%%%%%%%%%%%%%%%%%%%%%%%=+%%%%%%%%+       -#%%%#:+%%%%%%%%+++-%%%%=%%%%%%%%%%#-     \n" +
//                        "     -*%%%%%%%%%%%%%%%%%%%%*-  .%%%%%%%%%%*=-=*%%%%%%=  %%%%%%%%**%%%%%%=%%%%%%%#=:       \n" +
//                        "  .=****************+++=-.      -%*%%%%%%%%%%%%%%%%#:   %%#%%%%%%%%%%%#-+*++=-:           \n" +
//                        "                                 ...*%%%%%%%%%%%%#-     *%.+%%%%%%*+=:                    \n" +
//                        "                                      -=**##**=-.        :: :*%%%%%#=.                    \n" +
//                        "                                                               ...    ");


        System.out.println("1 - Create new character , 2 - modifiate, 3 - Quit or 4 - Start game ?");

        String userChoice = uChoice.nextLine();
        System.out.println("Vous avez choisi le numéro : " + userChoice);


        //Si choix 1 - Créer nouveau personnage

        if (userChoice.equals("1")) {
            Scanner chooseName = new Scanner(System.in);
            System.out.println("Enter username");
            String name = chooseName.nextLine();
            String type = typeCharacter();

            switch (type) {
                case "Guerrier" -> this.personnage = new Guerrier(name);

                case "Mage" -> this.personnage = new Mage(name);

                default -> System.out.println("Veuillez choisir un type");
            }


            System.out.println(this.personnage.toString());
            showMenuPrincipal();


            //Si choix 2 - Modifier personnage

        } else if (userChoice.equals("2")) {
            updateUser(this.personnage);
        }


        // Si choix 3 - Quitter

        else if (userChoice.equals("3")) {

            quit();

        }


        //Si choix 4 - Demarrer la partie


        else if (userChoice.equals("4")) {

            startGame(this.personnage);

        }

    }



    public void nameCharacter(Personnage personnage) {
        System.out.println("Personnalisez votre joueur : " + personnage.getNom());
        System.out.println("Enter username");

        Scanner nom = new Scanner(System.in);

        String nameValue = nom.nextLine();

        if (!nameValue.isEmpty()) {
            personnage.setNom(nameValue);
            String changeType = typeCharacter();
            personnage.setType(changeType);
            showMenuPrincipal();
        } else {
            System.out.println("The username cannot be empty. Please write a valid name.");
            nameCharacter(this.personnage);
        }
    }

    /**
     *
     * @return
     */
    private String typeCharacter() {
        Scanner Utype = new Scanner(System.in);
        System.out.println("Entrer type : Guerrier | Mage");
        return Utype.nextLine();
    }


    //Methode choix 3

    private void quit() {
        System.exit(1);
    }

    private void updateUser(Personnage personnage) {
        nameCharacter(personnage);
//        typeCharacter();
    }

    //Methode Choix 4
    private void startGame(Personnage personnage) {
        Game game = new Game();
        try {
            game.lancerDes(personnage);
        } catch (PersonnageHorsPlateauException e) {
            System.out.println(e.getMessage());

            System.out.println("\n" +

                    " __   __   ___    _   _          __      __ ___    _  _   \n" +
                    " \\ \\ / /  / _ \\  | | | |    o O O\\ \\    / /|_ _|  | \\| |  \n" +
                    "  \\ V /  | (_) | | |_| |   o      \\ \\/\\/ /  | |   | .` |  \n" +
                    "  _|_|_   \\___/   \\___/   TS__[O]  \\_/\\_/  |___|  |_|\\_|  \n" +
                    "_| \"\"\" |_|\"\"\"\"\"|_|\"\"\"\"\"| {======|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \n" +
                    "\"`-0-0-'\"`-0-0-'\"`-0-0-'./o--000'\"`-0-0-'\"`-0-0-'\"`-0-0-'" +
                    "\n" +
                    "\n"
            );

           this.showMenuPrincipal();

        }
    }


}


// GUERRIER
//     System.out.println("" +
//             "     (\\/__/)\n" +
//             "       (•ㅅ•)     \n" +
//             "    ＿ノヽ ノ＼＿      \n" +
//             "`/　`/ ⌒Ｙ⌒ Ｙ  ヽ \n" +
//             "( 　(三ヽ人　 /　  |\n" +
//             "|　ﾉ⌒＼ ￣￣ヽ   ノ\n" +
//             "ヽ＿＿＿＞､＿_／\n" +
//             "   ｜( 王 ﾉ〈 \n" +
//             "   /ﾐ`ー―彡\\ " +
//             "   / ╰    ╯ \\ / ");


//MAGE

