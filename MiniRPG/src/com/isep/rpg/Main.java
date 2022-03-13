package com.isep.rpg;
import java.util.*;

public class Main {
    public static void main(String[]args){

//        Warrior joueur1 = null;
//        Healer  joueur2 = null;
//        Hunter  joueur3 = null;
//        Mage    joueur4 = null;
//        Enemy   enemy1  = null;

        int choix_character;
        int nbre_enemy = 0;
        int nbre_perso = 0;
        int perso_créer= 0;

        System.out.println("Lancement de la partie..");
        System.out.println("Selectionner le nombre de personnages que vous souhaitez utliliser");
        Scanner scanner1 = new Scanner(System.in);
        nbre_perso = scanner1.nextInt();

//        int[] personnage    = new int[nbre_perso];
//        int[] characterLife = new int[nbre_perso];
//        int[] characterMana = new int[nbre_perso];
//        int[] char_weaponDmg= new int[nbre_perso];

        if (nbre_perso ==1 && nbre_perso >0){
            Hero hero = new Hero("Warrior",300,20,3){
            };
            Game game = new Game(1,2){
            };
            System.out.println("Player Turn:"+game.getPlayerTurn()+"\nTurn of:"+hero.getName()+"\nPV:"+ hero.getLifePoints()+"\nArmor:"+ hero.getArmor()+"\nDamage:"+hero.getWeaponDamage());


            Boss boss = new Boss(500,150,25,25);
            System.out.println("Enemy turn:"+game.getPlayerTurn()+"\nTurn of ennemy:"+"\nPV:"+boss.getBlifePoints()+"\nMP:"+boss.getBManaPoints()+"\nForce:"+boss.getBoss_Force()+"\nDefense:"+boss.getBoss_Defense());
        }
        }



}
