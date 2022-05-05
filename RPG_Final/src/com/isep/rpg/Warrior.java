package com.isep.rpg;

import java.util.Random;

public class Warrior extends Hero{

    private static Hero hero;


    public Warrior(String nom){
        super(nom);
        init();
        init2();
    }
    public void init2(){
        setForce(4);
        setArmor(7);
        setAgilite(3);

    }
    public static void main(String[]args){

    }


    public String toString(){return "Warrior";}

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
