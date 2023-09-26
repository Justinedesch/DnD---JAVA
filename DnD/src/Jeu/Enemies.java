package Jeu;

import Ennemies.Dragon;
import Personnages.Personnage;

public class Enemies implements Case {

    public int pvMonster;
    public int atkDegats;
    public String nomEnnemi;

    public String descriptionEnnemi;


    public Enemies(int monsterPV, int degatsAtak, String ennemiNom, String ennemidescription) {

        this.pvMonster = monsterPV;
        this.atkDegats = degatsAtak;
        this.nomEnnemi = ennemiNom;
        this.descriptionEnnemi = ennemidescription;
    }


    //Donne des degats
    public int getAtkDegats() {
        return atkDegats;
    }


    //Prends des degats
    public int getPv() {
        return this.pvMonster;
    }

    //Modifie les points de vie
    public int getPvMonster() {
        return this.pvMonster;
    }


    @Override
    public void interaction(Personnage player) {
        System.out.println("Sh**, a monster !");
        while (player.isAlive() && this.isAlive()) {

            int damages = player.getForce();
            int dmgReceived = this.getPvMonster();
            player.receiveDamage(dmgReceived);
        }


    }

    private boolean isAlive() {
        return this.pvMonster>0;
    }


}


