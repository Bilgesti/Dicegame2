package com.bilgee.dice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    String name;
    int score;

    public static List<Player> addPlayer () {
        // Arraylist for totPlayers
        List<Player> playerList = new ArrayList<>();

        // Ask the user how many players:
        Scanner in = new Scanner(System.in);
        System.out.println("How many players: ");
         int totPlayers = in.nextInt();

        for (int i = 0; i < totPlayers; i++) {

            //Create Unique player
            System.out.println("Enter the name of the player: " + (i + 1));
            String playerName = in.next();
            playerList.add(new Player(playerName));

        }
        return playerList;
    }




    public String getName() {
        return name;
    }


    public void addToScore(int points) {
        score += points;
    }

    public int getScore() {
        return score;
    }
}
