package com.isep.rpg;

import java.util.Random;

public class Healer extends SpellCaster {

    public Healer(String nom){
        super(nom);
        init();
        init2();
    }
    public void init2(){
        setForce(4);
        setArmor(3);
        setAgilite(4);
    }
    public String toString(){return "Healer";}
    int rand(int borneInf, int borneSup){
        Random random = new Random();
        int nb;
        nb = borneInf+random.nextInt(borneSup-borneInf);
        return nb;
    }
    @Override
    public void attack(){}
    @Override
    public void defend(){    }
}
