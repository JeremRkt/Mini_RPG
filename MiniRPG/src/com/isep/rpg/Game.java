package com.isep.rpg;
import com.isep.util.InputParser;

public abstract class Game {
    private Hero heroes;
    private int playerTurn;
    private InputParser inputParser;

    public Game( Hero heroes, int playerTurn, InputParser inputParser){
        this.heroes = heroes;
        this.playerTurn = playerTurn;
        this.inputParser = inputParser;
    }

    public Game(int hero, int playerTurn) {

    }

    public void setHeroes(Hero newVar){
        heroes = newVar;
    }
    public Hero getHeroes() {
        return heroes;
    }

    public void setPlayerTurn(int playerTurn) {
        this.playerTurn = playerTurn;
    }
    public int getPlayerTurn(){
        return playerTurn;
    }

    public void setInputParser(InputParser inputParser) {
        this.inputParser = inputParser;
    }
    public InputParser getInputParser() {
        return inputParser;
    }

    /** lance jeu
     */
    public void playGame(){

    }
    /** Générer combat
     *
     */
    public void generateCombat(){
    }
}
