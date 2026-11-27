package com.building.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Floor {

    int z;
    List<Tile> tiles;
    List<Wall> walls;
    List<StructuralFeature> features;
    
    public Floor(int z, List<Tile> tiles, List<Wall> walls, List<StructuralFeature> features) {
        this.z = z;
        this.tiles = tiles;
        this.walls = walls;
        this.features = features;
    }

    public void addFeature(StructuralFeature feature) {
        features.add(feature);
    }

    public List<Tile> getTiles() {
        return tiles;
    }

    public static Floor createRectangular(int width, int length, int z) {
        List<Tile> tiles = new ArrayList<>();
        List<Wall> walls = new ArrayList<>();
        List<StructuralFeature> features = new ArrayList<>();
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < length; y++) {
                Tile tile = new Tile(0, x, y);
                tiles.add(tile);
            }
        }
        return new Floor(z, tiles, walls, features);
    }
}
