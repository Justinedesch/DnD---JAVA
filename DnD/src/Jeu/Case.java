package Jeu;
//CASE INTERRAGI AVEC LE JOUEUR

//lister les foncitons d'une case : ce qu'elle peut faire

//1 - Vide : rejouer
//2 Ennemi : se battre
//3 : objet : changer stats du personnage


import Personnages.Personnage;

public interface Case {


    default void interaction(Personnage player) {

    }


}









