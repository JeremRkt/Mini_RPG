package com.isep.rpg;

import java.util.Random;

public enum CharClass {
    Warrior(3,300,0,"Coup d'épée","CaC","Physique","Warrior"),
    Healer (5,80,100,"Soin","Magique","Magie","Healer"),
    Hunter (1,150,0,"Lancer de bout de bois","tir a distance","A distance","Hunter"),
    Mage   (4, 120,130,"Boule de feu","Magique","Cac","Mage");


    private int weaponDMG,lifePoints,mana;
    private String capacite,type,immunise;
    private String className;
    private static Random rnd = new Random();

    CharClass(int weaponDMG, int lifePoints, int mana, String capacite, String type, String immunise, String className){
        this.weaponDMG  = weaponDMG;
        this.lifePoints = lifePoints;
        this.mana       = mana;
        this.capacite   = capacite;
        this.type       = type;
        this.immunise   = immunise;
        this.className  = className;
    }

    class HeroStat{

    }

    public int getWeaponDMG() {
        return weaponDMG;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public int getMana() {
        return mana;
    }

    public String getCapacite() {
        return capacite;
    }

    public String getType() {
        return type;
    }

    public String getImmunise() {
        return immunise;
    }

    public String getClassName() {
        return className;
    }
    public static CharClass getRandom(){
        return CharClass.values()[rnd.nextInt(CharClass.values().length)];
    }
}
