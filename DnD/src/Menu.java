import java.util.Scanner;

public class Menu {


    public static void main(String[] args) {

        Scanner UChoice = new Scanner(System.in);
        System.out.println("Create new character OR Quit ?");

        String userChoice = UChoice.nextLine();  // Read user input
        System.out.println("Personnalisez votre joueur" + userChoice);  // Output user input

        Scanner nom = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = nom.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input


        Scanner type = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter type");


        String userType = type.nextLine();
        System.out.println("User Type is: " + userType);  // Output user input


        Personnage newChar = new Personnage(userName, userType);
        System.out.println(newChar);

    }


}


