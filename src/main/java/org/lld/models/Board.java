package org.lld.models;

import java.util.HashMap;

public class Board {

    private int dimension;
    private HashMap<Integer, BoardEntity> snakeAndLadderMap;
    private int cellCount;

    public Board(int dimension) {
        this.dimension = dimension;
        this.snakeAndLadderMap = new HashMap<>();
        this.cellCount = this.dimension * this.dimension;
        // add n snakes and add n ladder to the board



    }

    private void addSnakesAndLadders(){

//        for snake start should be greater than end
//        for ladder start should be less than the end

//         the starting index and end index of the ladder will be from 2 to cellCount-1;

        // to add ladders
        for( int i =0; i < dimension; i++){
            int min = 2;
            int max = cellCount-1;

            int start = (int) (Math.random() * ( max - min + 1) + min);
            min = start +1;
            int end = (int) (Math.random() * (max - min +1) + min);

            if(!hasSnakeOrLadder(start)){
                snakeAndLadderMap.put(start, new Ladder(start, end));
            }

            // to add the snakes
            // start to add the snake should be greater than end in case of the snake

             min = 2;
             max = cellCount-1;

//            start > end
            end  = (int) ( Math.random() * ( max - min +1) + min);
            min = end +1;
            start = (int) ( Math.random() * ( max - min +1) + min);

            if(!hasSnakeOrLadder(start)){
                snakeAndLadderMap.put(start, new Snake(start, end));
            }
        }

//         try to cover few more edge cases

    }

    private boolean hasSnakeOrLadder( int index) {
        return snakeAndLadderMap.containsKey(index);
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public HashMap<Integer, BoardEntity> getSnakeAndLadderMap() {
        return snakeAndLadderMap;
    }

    public void setSnakeAndLadderMap(HashMap<Integer, BoardEntity> snakeAndLadderMap) {
        this.snakeAndLadderMap = snakeAndLadderMap;
    }
}
