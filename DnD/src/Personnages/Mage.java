package Personnages;

import Personnages.Personnage;

public class Mage extends Personnage {


    public Mage(String nom) {
        super(nom, "Mage",46, 15);
    }

    @Override
    public String toString() {
        return super.toString() + " \n" +
                ",________________________________       \n" +
                "|__________,----------._ [____]  \"\"-,__  __...-----===\"\n" +
                "        (_(||||||||||||)___________/   \"\"             |\n" +
                "           `----------'      [ ))\"-,                |\n" +
                "                                \"\"    `,  _,--...___  |\n" +
                "                                        `/   \n";

    }
}