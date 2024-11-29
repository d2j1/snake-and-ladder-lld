package org.lld.models;

import java.util.LinkedList;
import java.util.Queue;

public class Game {
    private Board board;
    private Queue<Player> players;
    private Queue<Player> winners;

    private int numberOfDices;
    private int dimension;

    public Game(int numberOfDices, int dimension, Queue<Player> players) {
        this.players = players;
        this.numberOfDices = numberOfDices;
        this.dimension = dimension;
        this.board = new Board(this.dimension);
        this.winners = new LinkedList<>();

    }

    public void start(){


    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Queue<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Queue<Player> players) {
        this.players = players;
    }

    public Queue<Player> getWinners() {
        return winners;
    }

    public void setWinners(Queue<Player> winners) {
        this.winners = winners;
    }

    public int getNumberOfDices() {
        return numberOfDices;
    }

    public void setNumberOfDices(int numberOfDices) {
        this.numberOfDices = numberOfDices;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
}
