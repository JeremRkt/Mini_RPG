package com.isep.rpg;

import java.util.Random;

public class  SpellCaster extends Hero{
    private int manaPoints;
    private Hero hero;
    public SpellCaster(int manaPoints,String nom){
        super(nom);
        this.manaPoints = manaPoints;
    }
    public SpellCaster(String nom){
        super(nom);
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    int rand(int borneInf, int borneSup){
        Random random = new Random();
        int nb;
        nb = borneInf+random.nextInt(borneSup-borneInf);
        return nb;
    }
    @Override
    public void attack() {
        int attack = getForce()+rand(1,4);
        System.out.println(this.getNom()+" donne un coup d'épée "+hero.getNom() +"causant "+attack);
    }

    @Override
    public void defend() {
        int defense = getArmor();
    }
}
