package com.isep.rpg;
import com.isep.rpg.BasicEnemy;
import com.isep.rpg.Boss;

public abstract class Enemy {
    private int lifePoints;
    private int manaPoints;
    private int enemyForce;
    private int enemyDefense;
    private BasicEnemy basicEnemy;
    private Boss boss;

    public Enemy(int actual_lifePoints,int actual_manaPoints, int enemyForce,int enemyDefense,Boss boss,BasicEnemy basicEnemy){
        this.lifePoints = actual_lifePoints;
        this.manaPoints = actual_manaPoints;
        this.enemyForce = enemyForce;
        this.enemyDefense = enemyDefense;
        this.boss = boss;
        this.basicEnemy = basicEnemy;
    }


    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }
    public int getLifePoints(){
        return this.lifePoints;
    }
    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }
    public int getManaPoints(){
        return this.manaPoints;
    }
    public void setEnemyForce(int enemyForce) {
        this.enemyForce = enemyForce;
    }
    public int getEnemyForce(){
        return this.enemyForce;
    }
    public void setEnemyDefense(int enemyDefense) {
        this.enemyDefense = enemyDefense;
    }
    public int getEnemyDefense() {
        return enemyDefense;
    }
    public Boss getBoss() {
        return boss;
    }
    public void setBoss(Boss boss) {
        this.boss = boss;
    }
    public BasicEnemy getBasicEnemy() {
        return basicEnemy;
    }
    public void setBasicEnemy(BasicEnemy basicEnemy) {
        this.basicEnemy = basicEnemy;
    }
    public  String toString(){
        return "PV:"+lifePoints+"MP:"+manaPoints+"Force:"+enemyForce+"Defense:"+enemyDefense;
    }
}
