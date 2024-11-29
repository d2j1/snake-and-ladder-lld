package org.lld.models;

public abstract class BoardEntity {
    private int start;
    private int end;
    private BoardEntityType entityType;

    public BoardEntity(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public BoardEntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(BoardEntityType entityType) {
        this.entityType = entityType;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public abstract void printMessage();
    public abstract  void printEntity();
}
