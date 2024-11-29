package org.lld.models;

import java.util.HashMap;

public class Board {

    private int dimension;
    private HashMap<Integer, BoardEntity> snakeAndLadderMap;

    public Board(int dimension, HashMap<Integer, BoardEntity> snakeAndLadderMap) {
        this.dimension = dimension;
        this.snakeAndLadderMap = snakeAndLadderMap;
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
