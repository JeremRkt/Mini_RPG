package com.isep.rpg;
import com.isep.util.InputParser;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Game {
    private Hero hero;
    private int playerTurn;
    private Scanner scanner_lecture = new Scanner(System.in);
    private ArrayList<Hero> liste_hero = new <Hero> ArrayList();
    private InputParser inputParser;

    public Game( Hero heroes, int playerTurn, InputParser inputParser){
        this.hero = hero;
        this.playerTurn = playerTurn;
        this.inputParser = inputParser;
    }

    public Game(int hero, int playerTurn) {

    }


    public static  void main(String[]args){
    }

    //---------------------------GETTER ET SETTER --------------------------//

    public void setHero(Hero newVar){
        hero = newVar;
    }
    public Hero getHero() {
        return hero;
    }

    public void setPlayerTurn(int playerTurn) {
        this.playerTurn = playerTurn;
    }
    public int getPlayerTurn(){
        return playerTurn;
    }

    public void setInputParser(InputParser inputParser) {
        this.inputParser = inputParser;
    }
    public InputParser getInputParser() {
        return inputParser;
    }

    //---------------------- METHODE DE JEU -------------------------//

    public Hero creerHero() {
        Hero hero;

        String nom = "";
        String nom_ecrit;

        System.out.println("Saisissez le nom par lequel on vous appelera");
        boolean ok = true;

        while(ok) {

            System.out.print("Soyez role play :");
            nom_ecrit = scanner_lecture.nextLine();
            nom = "";

            for(int a = 0 ; a < nom_ecrit.length() ; a++ ) {

                if (nom_ecrit.charAt(a) != ' ') {

                    nom += nom_ecrit.charAt(a);
                }
            }

            System.out.print(nom + " vous convient il ? ");

            nom_ecrit = scanner_lecture.nextLine();

            if(nom_ecrit.length() == 0 || nom_ecrit.charAt(0) == 'o' || nom_ecrit.charAt(0) == 'O' )
                ok = false;
        }

        System.out.println("Tres bien " + nom + "." );
        System.out.println("Maintenant vous allez choisir la zone ou commencer la partie (par defaut au nord): " );

        nom_ecrit = scanner_lecture.nextLine();

        System.out.println("Pour finir choisissez votre classe (Mage, Warrior, Healer, Hunter): ");
        String persoClasse;

        boolean yes = true;
        while (yes) {
            persoClasse = scanner_lecture.nextLine();
            try {
                if(persoClasse.charAt(0) == 'M' || persoClasse.charAt(0) == 'm') {
                    hero = new Mage(200,nom);
                    return hero;
                }
                else if(persoClasse.charAt(0) == 'W' || persoClasse.charAt(0) == 'w') {
                    hero = new Warrior(nom);
                    return hero;
                }
                else if(persoClasse.charAt(1) == 'h'){
                    hero = new Healer(nom);
                    return hero;
                }
                else if(persoClasse.charAt(1) == 'H') {
                    hero = new Hunter(nom);
                    return hero;
                }
                else {
                    System.out.println("Choisissez une des quatres classes ");
                    persoClasse = scanner_lecture.nextLine();
                }
            }
            catch(IndexOutOfBoundsException e) {
                System.out.println("Ecrivez le nom de la classe que vous voulez choisir.");

            }

        }
        return null;

    }

    /** lance jeu
     */
    public void playGame(int nb_joueur){
        for(int a=0; a < nb_joueur; a++){
            System.out.println("Créer votre personnage");
            liste_hero.add(creerHero());

        }
        while (true){

        }

    }
    /** Générer combat
     *
     */
    public void generateCombat(){
    }

    private void generateEnemies(){

    }
    public ArrayList <Hero> getListe_hero(){return liste_hero;}

    public void setListe_hero(ArrayList<Hero> liste_hero) {
        this.liste_hero = liste_hero;
    }
}
