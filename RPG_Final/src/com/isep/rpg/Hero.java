package com.isep.rpg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Hero {

    //Variables et attribut du personnage
    protected String nom;
    protected int maxLifePoints;
    protected int lifePoints;
    protected int armor;
    protected int weaponDamage;
    protected static int niveau;
    protected int force;
    protected int agilite;
    protected int experience;
    private List<Potion>potions;
    private List<Food> lembas;

    protected ArrayList<Potion> potionlist= new ArrayList<Potion>();

    public Hero(String nom) {
        this.nom = nom;
    }
     public void init(){
        setLifePoints(70);
        setNiveau(1);
     }

     public static void main(String[]args){

        System.out.println("Niveau : "+ niveau);
     }

  //---------------------------------------------------ACTIONS---------------------------------------------//
   public void resume(){
        System.out.println("Vous êtes niveau"+this.getNiveau()+".");
        System.out.println("Votre arme a"+this.getWeaponDamage()+" "+"de puissance.");
        System.out.println("Force:"+this.getForce()+"\n"+
                            "Armor:"+this.getArmor()+"\n"+
                            "Agilité:"+this.getAgilite()+".");
        System.out.println("Il vous reste "+this.getLifePoints()+"/"+lifePoints+"points de vies.");
   }

    public void ajoutStatistique(int pt){
        System.out.println("Vous avez"+ pt +"points de competences a ajouter.");
        Scanner sc = new Scanner(System.in);
        String choix;
        int for_agm = 0;
        int agi_agm = 0;
        int def_agm = 0;
        while (pt > 0){
            System.out.println("Veuillez choisir quelle statistique vous voulez augmenter. (force/agilite/defense");
            choix = sc.nextLine();
            while (choix.equals("force") != true && choix.equals("agilite") != true && choix.equals("defense") !=true) {
                System.out.print("Choisissez bien, soit force soit agilite soit defense : ");
                choix = sc.nextLine();
            }
            if (choix.equals("force")){
                this.force ++;
                for_agm ++;
            }
            if (choix.equals("agilite")){
                this.agilite++;
                agi_agm++;
            }
            else {
                this.armor++;
                def_agm++;
            }
            pt--;
        }
        System.out.println("Vous avez ajoute "+ for_agm + "points de force, " + agi_agm + "en agilite et  "+ def_agm + " en défense." );
    }
    public void gainExp(int exp){
        int niveau_gagne = 0;
        while (isNiveauGagnee(exp)){
            while (isNiveauGagnee(exp)){
                this.experience = 0;
                exp += this.experience - niveau*5;
                niveau++;
                niveau_gagne++;
            }
            this.experience += exp;
            if (niveau_gagne != 0){
                System.out.println("Vous avez gagner "+ niveau_gagne + "niveau(x).");
                this.ajoutStatistique(niveau_gagne);
            }
        }
    }
    public boolean isNiveauGagnee(int exp){return this.experience + exp > niveau*5;}

    public void useConsumable(Consumable consumable){}
    public  void attack(){
    };

    public void defend(){
    };
    //----------------------------------------------GETTER & SETTER----------------------------------------//


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getAgilite() {
        return agilite;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    //-------- METHODES SUR LES CARACTERISTIQUES --------//

    public void mort(){
        System.out.print(this.getClass() + "viens de mourir.");
        setLifePoints(0);
    }

    public void modifPv(int modif){
        if (this.lifePoints + modif >this.maxLifePoints)
            this.lifePoints = maxLifePoints;
        else if (this.lifePoints + modif <= 0)
            this.mort();
        else
            this.lifePoints += modif;
    }
    public void modifMaxLifePoints(int modif){maxLifePoints += modif;}

}




