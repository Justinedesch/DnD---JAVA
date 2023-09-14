import java.util.Scanner;

public class Menu {

    private Personnage personnage;
    Scanner uChoice = new Scanner(System.in);

    public void showMenuPrincipal() {

        System.out.println("1 - Create new character , 2 - modifiate, 3 - Quit or 4 - Start game ?");

        String userChoice = uChoice.nextLine();
        System.out.println("Vous avez choisi le numéro : " + userChoice);


        //Si choix 1 - Créer nouveau personnage

        if (userChoice.equals("1")) {

            String name = nameCharacter();
            String type = typeCharacter();

            switch (type) {
                case "Guerrier" -> {
                    this.personnage = new Guerrier(name, type);

                    System.out.println(" (\\__/)\n" +
                            "           (•ㅅ•)     \n" +
                            "    ＿ノヽ ノ＼＿      \n" +
                            "`/　`/ ⌒Ｙ⌒ Ｙ  ヽ     ever again.\n" +
                            "( 　(三ヽ人　 /　  |\n" +
                            "|　ﾉ⌒＼ ￣￣ヽ   ノ\n" +
                            "ヽ＿＿＿＞､＿_／\n" +
                            "       ｜( 王 ﾉ〈   (\\__/)\n" +
                            "       /ﾐ`ー―彡\\  (•ㅅ•)\n" +
                            "      / ╰    ╯ \\ / ");
                    break;
                }

                case "Mage" -> {
                    this.personnage = new Mage(name, type);

                    System.out.println();
                    break;
                }

                default -> {
                    System.out.println("Veuillez choisir un type");
                    typeCharacter();
                }

            }


            System.out.println(personnage.toString());
            showMenuPrincipal();


            //Si choix 2 - Modifier personnage

        } else if (userChoice.equals("2")) {

            updateUser();
               System.out.println(personnage.toString());
            showMenuPrincipal();
        }


        // Si choix 3 - Quitter

        else if (userChoice.equals("3")) {

            quit();

        }

    }


    public String nameCharacter() {
        Scanner nom = new Scanner(System.in);
        System.out.println("Personnalisez votre joueur");
        System.out.println("Enter username");

        String userName = nom.nextLine();
        System.out.println("Username is: " + userName);
        return userName;
    }

    private String typeCharacter() {

        Scanner Utype = new Scanner(System.in);
        System.out.println("Entrer type : Guerrier | Mage");

        String typeResult = Utype.nextLine();

        if (typeResult.equals("Guerrier")) {
            Guerrier guerrier = new Guerrier();

        } else if (typeResult.equals("Mage")) {
            Mage mage = new Mage();
        }

        return typeResult;
    }


    //Methode choix 3

    private void quit() {
        System.exit(1);
    }

    private void updateUser() {


        System.out.println("Modifiez votre joueur");
        nameCharacter();
        typeCharacter();
    }
}


//}


//Si choix 2 - Modifier personnage
//
//            else if (userChoice.equals("2")) {
//
//                updateUser();
//                showMenuPrincipal();
//                return personnage;
//
//
//            }
//
//
//            // Si choix 3 - Quitter
//
//            else if (userChoice.equals("3")) {
//
//                quit();
//
//            }
//
//        }
//
//
//
//        private void updateUser (String userChoice){
//
//            this.updateUser("Modifiez votre joueur");
//
//            getPersonnage();
//            nameCharacter();
//            typeCharacter();
//        }
//
//
//
//        //Methode choix 4
//        public void startGame () {
//
//
//            Game game = new Game();
//            game.setPosition();
//
//
//        }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
// */
//
//// _____________________________________________________________________________________________________
//
////String userChoice = this.showMenuPrincipal();
////
////
////    //Si choix 1 - Créer nouveau personnage
////
////        if (userChoice.equals("1")) {
////
////        nameCharacter();
////        typeCharacter();
////        showMenuPrincipal();
////
////        return Personnage;
////
//
//        //Si choix 2 - Modifier personnage
//
//            else if (userChoice.equals("2")) {
//
//            updateUser();
//            showMenuPrincipal();
//            return personnage;
//
//
//        }
//
//
//        // Si choix 3 - Quitter
//
//        else if (userChoice.equals("3")) {
//
//            quit();
//
//        }


// _____________________________________________________________________________________________________


//
//// Si on choisit "Guerrier", cela créera un objet de la classe Guerrier
//
//        if (typeResult.equals("Guerrier")) {
//
//            Guerrier newChar = new Guerrier(typeResult);
//            System.out.println(newChar);
//
//
//            System.out.println("User Type is: " + typeResult);  // Output user input
//
//
//        }
//
//        // Si on choisit "Mage", cela créera un objet de la classe Mage
//        else if (typeResult.equals("Mage")) {
//
//            Mage newChar = new Mage(userName, typeResult);
//            System.out.println(newChar);
//
//
//            String userType = Utype.nextLine();
//            System.out.println("User Type is: " + userType);  // Output user input
//
//        }
//
//
//        // Si on tape entrée sans rien choisir, cela créera un objet de la classe personnage (sans parametres de pv et force prédéfinis)
//
//        else if (typeResult.equals(null)) {
//
//            Personnage newChar = new Personnage(typeResult);
//
//            String userType = Utype.nextLine();
//            System.out.println("User Type is: " + typeResult);  // Output user input
//
//
//        }
//    }
//
//}


