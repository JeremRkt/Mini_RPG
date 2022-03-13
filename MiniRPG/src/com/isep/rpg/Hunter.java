package com.isep.rpg;

public class Hunter{
    private int lifePoints;
    private int mana;
    private int force;
    private int defense;
    private int arrow;


    public Hunter() {
        lifePoints = 100;
        mana       = 0 ;
        force      = 1 ;
        defense    = 4 ;
        arrow      = 30;
    }

    public Hunter(int actual_lifePoints, int actual_mana, int actual_force, int actual_defense, int arrow_left){

        lifePoints = actual_lifePoints;
        mana = actual_mana;
        force = actual_force;
        defense=actual_defense;
        arrow = arrow_left;
    }

    public int getactual_lifePoints() {
        return lifePoints;
    }

    public void setactual_lifePoints(int actual_lifePoints) {
        this.lifePoints = actual_lifePoints;
    }

    public int getactual_Mana() {
        return mana;
    }
    public void setactual_Mana(int actual_Mana) {
        this.mana = actual_Mana;
    }
    public int getactual_Force() {
        return force;
    }
    public void setactual_Force(int actual_Force){
        this.force = actual_Force;
    }

    public int getactual_Defense() {
        return defense;
    }

    public void setactual_Defense(int actual_defense) {
        this.defense = actual_defense;
    }

    public int getArrow_left() {
        if (arrow >=0){
            System.out.println("Vous n'avez plus de flèche! Vous êtes inutile");
        }
        return arrow;
    }

    public void setArrow_left(int arrow_left) {
        this.arrow = arrow_left;
    }
}
