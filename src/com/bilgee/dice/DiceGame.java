package com.bilgee.dice;

import java.util.List;


public class DiceGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the Game");
        List<Player> playerList = Player.addPlayer();
        int rounds = Game.askNumberRounds();
        int numberOfDice = Game.askNumberDice();

        Game.playGame(playerList, rounds, numberOfDice);
        Game.showWinners(playerList);



       }



    }

