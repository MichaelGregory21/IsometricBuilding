package com.building.model;

import java.util.ArrayList;
import java.util.List;

import com.building.object.PlacedObject;

public class Building {
    
    List<Floor> floors = new ArrayList<>();
    List<PlacedObject> objects;
    
    public void addFloor(Floor floor) {
        floors.add(floor);
    } 

    public Floor getFloor(int floor) {
        return floors.get(floor);
    }

    public void addObject(PlacedObject object) {
        objects.add(object);
    }
}
