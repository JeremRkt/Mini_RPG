package com.isep.rpg;

public class Warrior {
    private int lifePoints;
    private int force;
    private int defense;


    public Warrior(){
        lifePoints = 300;
        force      = 3;
        defense    = 50;
    }

    public Warrior(int actual_lifePoints,  int actual_force, int actual_defense){
        this.lifePoints = actual_lifePoints;
        this.force = actual_force;
        this.defense=actual_defense;
    }
    public static void main(String[]args){

        System.out.println("PV:"+"\nForce:"+"\nDefense:");
    }
    public int getactual_lifePoints() {
        return this.lifePoints;
    }
    public int getactual_force() {
        return this.force;
    }
    public int getactual_defense(){
        return this.defense;
    }
}
