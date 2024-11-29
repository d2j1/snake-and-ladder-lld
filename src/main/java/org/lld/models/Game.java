package org.lld.models;

import org.lld.utility.DiceUtility;

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

        this.board.print();

        while(players.size() > 1){
            Player currentPlayer = players.poll();
            System.out.println("This is "+ currentPlayer.getName()+ " turn to roll.");;

            int dice = DiceUtility.roll(numberOfDices);

            System.out.println(currentPlayer.getName() + " got "+dice + " on the dice.");

            int  finalPositionOfCurrentPlayer  = currentPlayer.getPosition()+dice;

            // check if there is a snake or a ladder present at final position


            if( finalPositionOfCurrentPlayer <= this.board.getCellCount()){
                if( this.board.hasSnakeOrLadder(finalPositionOfCurrentPlayer)){

                    BoardEntity entity = this.board.getSnakeAndLadderMap().get(finalPositionOfCurrentPlayer);

//                    if( entity.getEntityType().equals(BoardEntityType.SNAKE)){
//                        System.out.println("Snake encountered at "+ finalPositionOfCurrentPlayer);
//                    }else{
//                        System.out.println("Ladder encountered at "+ finalPositionOfCurrentPlayer);
//                    }

                    entity.printMessage();
                    finalPositionOfCurrentPlayer = entity.getEnd();
                }
// change the position of the player to the final position
                currentPlayer.setPosition(finalPositionOfCurrentPlayer);
            }else{
//                 skip the move
                System.out.println("Try again! when you get the turn");
                finalPositionOfCurrentPlayer =  currentPlayer.getPosition();
            }

            if( finalPositionOfCurrentPlayer == board.getCellCount()){
                // plyer has won the game
                System.out.println(currentPlayer.getName() + " has won the game!" );
                winners.add(currentPlayer);
            }else{
                players.add(currentPlayer);
            }
        }
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
