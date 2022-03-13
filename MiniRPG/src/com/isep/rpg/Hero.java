package com.isep.rpg;


import java.util.Random;
import java.util.Scanner;

public abstract class Hero {

    //Variables et attribut du personnage
    private String name;
    private Random rnd = new Random();
    private CharClass charClass;
    private Potion potion;
    private int lifePoints, armor, weaponDamage;
    private boolean enVie;


    public Hero(String name, int lifePoints, int armor, int weaponDamage){

        this.name = name;
        this.lifePoints = lifePoints;
        this.armor = armor;
        this.weaponDamage = weaponDamage;
    }



    public  int attack(){
        return 0;
    }
    public  int defend(){
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }
    public int getLifePoints() {
        return lifePoints;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }
    public int getArmor() {
        return armor;
    }
    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }
    public int getWeaponDamage() {
        return weaponDamage;
    }

    public String toString(){
        return "nom du Joueur="+name+"\nPV ="+lifePoints+"\nArmor="+armor+"\nDamage="+weaponDamage;
    }
    public void useConsumable(int Consumable){
        System.out.println(this.potion.getName()+""+"Utiliser"+this.name);
    }
}
