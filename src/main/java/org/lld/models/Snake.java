package org.lld.models;

public class Snake extends BoardEntity{
    public Snake(int start, int end) {
        super(start, end);
        this.setEntityType(BoardEntityType.SNAKE);
    }

    @Override
    public void printMessage() {
        System.out.println("Encountered snake ");
    }

    @Override
    public void printEntity() {
    System.out.print("S("+getEnd() +") ");
    }
}
