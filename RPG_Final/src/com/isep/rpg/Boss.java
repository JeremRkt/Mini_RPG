package com.isep.rpg;

public class Boss extends Enemy{

    private int BlifePoints;
    private int Boss_Force;
    private int Boss_Defense;

    public Boss(int actual_BlifePoints, int Boss_Force,int Boss_Defense){
        super(actual_BlifePoints,Boss_Force,Boss_Defense,null,null);

      setBLifePoints(100);;
      setBoss_Force(20);
      setBoss_Defense(25);

    }

    public void setBLifePoints(int BlifePoints) {
        this.BlifePoints = BlifePoints;
    }
    public int getBlifePoints() {
        return BlifePoints;
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
