package com.building.model;

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

}
