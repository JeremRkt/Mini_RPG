package com.isep.rpg;

public class Mage extends SpellCaster{

    public Mage(int manaPoint, String nom) {
        super(manaPoint,nom);
        init();
        init2();
    }

    public void init2(){
        setForce(5);
        setArmor(5);
        setAgilite(4);
    }

    public String toString(){return "Mage";}

}
