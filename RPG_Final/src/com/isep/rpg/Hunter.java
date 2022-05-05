package com.isep.rpg;

import java.util.Random;

public class Hunter extends Hero{
    protected Hero hero;
    private int arrow;

    public Hunter(String nom){
        super(nom);
    }

    public int getArrow_left() {
        return arrow;
    }

    public void setArrow_left(int arrow_left) {
        this.arrow = arrow_left;
    }

    public String toString(){return "Hunter";}
    int rand(int borneInf, int borneSup){
        Random random = new Random();
        int nb;
        nb = borneInf+random.nextInt(borneSup-borneInf);
        return nb;
    }

    public void combattre(Hero hero){

    }

    @Override
    public void attack() {
        int attack = getForce()+rand(1,4);
        boolean HasAttacked;
        System.out.println(this.getNom()+" lance une flèche "+hero.getNom() +"causant "+attack);
        HasAttacked = true;
        if (HasAttacked == true){
            arrow--;
        }else {
            System.out.println("Il reste "+getArrow_left()+"flèche dans votre inventaire"+""+".");
        }
    }

    @Override
    public void defend() {
        int defense = getArmor();
    }


}
