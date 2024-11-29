package org.lld;

import org.lld.models.Game;
import org.lld.models.Player;

import java.util.LinkedList;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int noOfDice =1;
        int dimension =10;

        Player p1 = new Player(0, "Rani");
        Player p2 = new Player(0, "Madan");

        Queue<Player> players = new LinkedList<>();

        players.add(p1);
        players.add(p2);

        Game game = new Game(noOfDice, dimension, players);

    }
}