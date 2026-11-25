package com.building.model;

import com.building.geometry.Footprint;

public class StructuralFeature {
    
    int id;
    int type;
    Footprint coverage;

    public StructuralFeature(int id, int type, Footprint coverage) {
        this.id = id;
        this.type = type;
        this.coverage = coverage;
    }
}
