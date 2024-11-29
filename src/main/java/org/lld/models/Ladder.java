package org.lld.models;

public class Ladder extends BoardEntity{



    public Ladder( int start, int end){
        super(start, end);
        this.setEntityType(BoardEntityType.LADDER);
    }

    @Override
    public void printMessage() {
        System.out.println("Encountered ladder ");
    }

    @Override
    public void printEntity() {
        System.out.print("L("+getEnd() +") ");
    }
}