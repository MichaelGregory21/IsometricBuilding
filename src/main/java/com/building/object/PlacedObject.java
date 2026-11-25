package com.building.object;

import com.building.geometry.Orientation;

public record PlacedObject(
    int id,
    ObjectDefinition definition,
    int x,
    int y,
    int z,
    Orientation orientation,
    PlacedObject supporter,
    int color
    ) {}
