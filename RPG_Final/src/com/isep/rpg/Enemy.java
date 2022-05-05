package com.isep.rpg;

public abstract class Enemy {
    int lifePoints;
    private int enemyForce;
    private int enemyDefense;
    private BasicEnemy basicEnemy;
    private Boss boss;

    public Enemy(int actual_lifePoints, int enemyForce,int enemyDefense,Boss boss,BasicEnemy basicEnemy){
        this.lifePoints = actual_lifePoints;

        this.enemyForce = enemyForce;
        this.enemyDefense = enemyDefense;
        this.boss = boss;
        this.basicEnemy = basicEnemy;
    }


    public boolean receiveAttack(int lifePoints){
        this.lifePoints -= lifePoints;
        return this.lifePoints <=0;
    }
    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }
    public int getLifePoints(){
        return this.lifePoints;
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
        return "PV:"+lifePoints+"Force:"+enemyForce+"Defense:"+enemyDefense;
    }
}
