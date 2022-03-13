package com.isep.rpg;

import java.util.Random;

public enum Potion implements Consumable{
    Healing("Healing","Vous soigne",20,1),
    Mana("Mana","Regenere votre mana",20,1);

    private String name;
    private int value, weight;
    private String description;
    private static Random rnd = new Random();

    private Potion(String name,String description,int value, int weight){
        this.name = name;
        this.description=  description;
        this.value = value;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getValue() {
        return value;
    }
    public static Potion getRandom(){
        return Potion.values()[rnd.nextInt(Potion.values().length)];
    }
    public int getWeight() {
        return weight;
    }
}
