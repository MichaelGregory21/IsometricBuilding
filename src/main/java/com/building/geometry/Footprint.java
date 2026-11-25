package com.building.geometry;

public class Footprint {
    protected class FootprintCell {
        int x;
        int y;
        int height;
        boolean isSurface;

        public FootprintCell(int x, int y, int height, boolean isSurface) {
            this.x = x;
            this.y = y;
            this.height = height;
            this.isSurface = isSurface;
        }
    }

    int pivot;
    FootprintCell[] cells;

    public Footprint(int pivot, FootprintCell[] cells) {
        this.pivot = pivot;
        this.cells = cells;
    }
}
