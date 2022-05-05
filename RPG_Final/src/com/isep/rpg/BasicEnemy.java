package com.isep.rpg;

public class BasicEnemy extends Enemy{
    public BasicEnemy(int actual_lifePoints, int enemyForce, int enemyDefense, Boss boss, BasicEnemy basicEnemy) {
        super(actual_lifePoints, enemyForce, enemyDefense, boss, basicEnemy);
    }
    public boolean receiveAttack(int lifePoints) {
        this.lifePoints -= lifePoints;
        return this.lifePoints <= 0; // Vrai si le combattant est mort
    }

}
