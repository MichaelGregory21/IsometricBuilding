package com.building.model;

import java.util.List;

import com.building.object.PlacedObject;

public class Building {
    
    List<Floor> floors;
    List<PlacedObject> objects;
    
    public void addFloor(Floor floor) {
        floors.add(floor);
    } 

    public void addObject(PlacedObject object) {
        objects.add(object);
    }
}
