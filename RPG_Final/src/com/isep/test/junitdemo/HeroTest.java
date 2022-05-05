package com.isep.test.junitdemo;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    int force = 0;
    int agilite =0;
    int armor = 0;

    public int ajoutStatistique(int pt){
        System.out.println("Vous avez "+ pt +" points de competences a ajouter.");
        Scanner sc = new Scanner(System.in);
        String choix;
        int for_agm = 0;
        int agi_agm = 0;
        int def_agm = 0;
        while (pt > 0){
            System.out.println("Veuillez choisir quelle statistique vous voulez augmenter. (force/agilite/defense)");
            choix = sc.nextLine();
            while (choix.equals("force") != true && choix.equals("agilite") != true && choix.equals("defense") !=true) {
                System.out.print("Choisissez bien, soit force soit agilite soit defense : ");
                choix = sc.nextLine();
            }
            if (choix.equals("force")){
                this.force ++;
                for_agm ++;
            }
            if (choix.equals("agilite")){
                this.agilite++;
                agi_agm++;
            }
            else {
                this.armor++;
                def_agm++;
            }
            pt--;
        }
        System.out.println("Vous avez ajoute "+ for_agm + " points de force, " + agi_agm + " en agilite et  "+ def_agm + " en defense." );
        return for_agm;
    }

    @Test
    void ajoutStatistique() {
        assertEquals(ajoutStatistique(0),ajoutStatistique(0));
    }
}