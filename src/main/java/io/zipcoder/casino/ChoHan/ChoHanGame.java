package io.zipcoder.casino.ChoHan;

import io.zipcoder.casino.Interfaces.GamblingGame;
import io.zipcoder.casino.Interfaces.GamblingPlayer;
import io.zipcoder.casino.Interfaces.Game;
import io.zipcoder.casino.utilities.Console;
import io.zipcoder.casino.utilities.Dice;
import io.zipcoder.casino.utilities.Player;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ChoHanGame implements Game, GamblingGame {

    private ArrayList<Player> playerList = new ArrayList<Player>();
    private ChoHanPlayer choHanPlayerObj;
    private Integer numberOfDices = 2;
    private Integer playerBet = 100;
    private String playerGuessIn = "";
    private Integer playerGuess;

    private Console inOut = new Console(System.in, System.out);

    // constructor with player list
    public ChoHanGame(ArrayList<Player> playerList) {
        this.playerList = playerList;
        choHanPlayerObj = new ChoHanPlayer(playerList);
    }

    // default constructor
    public ChoHanGame() {}

//    public ArrayList<Player> getPlayerListChoHan() {
//        return playerListCHGame;
//    }

    public void setPlayerListChoHan(ArrayList<Player> playerList) {

        choHanPlayerObj.playerListChoHan(playerList);
    }

    public void start() {

        //creat the initial ChoHan eligible playerlist with enough wallet balance
        setPlayerListChoHan(playerList);
        // how to use the Console

        /** get the player guesses input */
        playerGuessIn = inOut.getStringInput("Please enter your guess: even or odd: ");
        playerGuess = choHanPlayerObj.getPlayerGuess(playerGuessIn);

        /** get the player bets input */
        // get the number of dices to roll
        // get the house balance
        // get the dice roll throw and sum
        // randomly pick the players win/losses
        // update the players wallets
        // update the house wallet

    }


    public Integer askForBet(GamblingPlayer gamblingPlayer) {

        return null;
    }


    public Integer getDiceResult(Integer numberOfDices) {
        Dice dice = new Dice(numberOfDices);
        return 0;
    }

    public void loadPlayer() {

    }

    public String getNextPlayerAction() {
        return null;
    }

    public void displayGameState() {

    }

    public Boolean playAgain() {
        return null;
    }

    public void exit() {
        System.exit(0);

    }

}
