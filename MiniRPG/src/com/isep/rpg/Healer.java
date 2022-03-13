package com.isep.rpg;

public class Healer {
    private int weaponDMG,lifePoints,mana;
    private String capacite,type,immunise;
    private String className;

    public Healer(int weaponDMG, int lifePoints, int mana, String capacite, String type, String immunise,String className){
        this.weaponDMG  = weaponDMG;
        this.lifePoints = lifePoints;
        this.mana       = mana;
        this.capacite   = capacite;
        this.type       = type;
        this.immunise   = immunise;
        this.className  = className;
    }

}
