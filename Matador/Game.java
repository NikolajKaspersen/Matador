package com.company;

import java.util.ArrayList;

public class Game {
    ArrayList<Player> players = new ArrayList<>();
    FileIO fileIO = new FileIO();

    public Game()
    {
       /* Player player1 = new Player("Egon", 50000);
        Player player2 = new Player("Bente", 40000);
        Player player3 = new Player("Bo", 60000);
        players.add(player1);
        players.add(player2);
        players.add(player3);*/
        ArrayList<String> data = new ArrayList<>();
        data = fileIO.readGameData();
        for (String s: data)
        {
            String[] values = s.split(": ");
            System.out.println(values[0]);
            System.out.println(values[1]);

            int balance = Integer.parseInt(values[1]);

            Player p1 = new Player(values[0], balance);
            players.add(p1);
        }

    }

    boolean hasGameData()
    {
        return false;
    }
    void runLoop()
    {

    }
    void takeTurn()
    {

    }
    void printAccount()
    {

    }
    void saveGameData()
    {

    }
}
