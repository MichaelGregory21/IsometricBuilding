package com.building.model;

public class Wall {
    
    int id;
    int x;
    int y;
    int start;
    int end;
    int color;

    public Wall(int id, int x, int y, int start, int end) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.start = start;
        this.end = end;
    }
}
