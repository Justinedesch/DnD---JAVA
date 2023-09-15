package Personnages;

import Personnages.Personnage;

public class Mage extends Personnage {


    public Mage(String nom) {
        super(nom, "Mage",6, 15);
    }

    @Override
    public String toString() {
        return "Le nom de votre personnage est: " + getNom() + "" + " Son type est :" + getType() + " \n" +
                ",________________________________       \n" +
                "|__________,----------._ [____]  \"\"-,__  __...-----===\"\n" +
                "        (_(||||||||||||)___________/   \"\"             |\n" +
                "           `----------'      [ ))\"-,                |\n" +
                "                                \"\"    `,  _,--...___  |\n" +
                "                                        `/   \n";

    }
}