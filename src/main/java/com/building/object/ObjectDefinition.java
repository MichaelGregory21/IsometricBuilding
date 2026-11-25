package com.building.object;

import com.building.geometry.Footprint;

public record ObjectDefinition (
    int id,
    String name,
    MountType mountType,
    boolean isTransparent,
    Footprint footprint,
    boolean isFlat,
    boolean obstructsFlat
    ) {}
