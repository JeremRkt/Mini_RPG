package com.isep.rpg;

public class Boss extends Enemy{

    private int BlifePoints;
    private int BmanaPoints;
    private int Boss_Force;
    private int Boss_Defense;

    public Boss(int actual_BlifePoints,int actual_BmanaPoints, int Boss_Force,int Boss_Defense){
        super(200,100,25,25,null,null);
        this.BlifePoints = actual_BlifePoints;
        this.BmanaPoints = actual_BmanaPoints;
        this.Boss_Force = Boss_Force;
        this.Boss_Defense = Boss_Defense;
    }

    public void setBLifePoints(int BlifePoints) {
        this.BlifePoints = BlifePoints;
    }
    public int getBlifePoints() {
        return BlifePoints;
    }

    public void setBManaPoints(int BmanaPoints) {
        this.BmanaPoints = BmanaPoints;
    }

    public int getBManaPoints() {
        return BmanaPoints;
    }
    public void setBoss_Force(int boss_Force) {
        Boss_Force = boss_Force;
    }
    public int getBoss_Force() {
        return Boss_Force;
    }
    public void setBoss_Defense(int boss_Defense) {
        Boss_Defense = boss_Defense;
    }
    public int getBoss_Defense() {
        return Boss_Defense;
    }
}
