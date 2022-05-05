package com.isep.rpg;

import java.util.ArrayList;

public class Food implements Consumable {
    public static void main(String []args){
        ArrayList Food = new ArrayList();
            Food.add("Poulet");
            Food.add("Grain de sesame");
            Food.add("Abricot");
    }

    private String Food;

    public void setFood(String food) {
        Food = food;
    }
    public String getFood() {
        return Food;
    }
}
