package com.building.core.state;

import com.building.model.Building;
import com.building.rendering.Renderer;

public class BuildingState implements GameState{

    private final Building building;

    public BuildingState(Building building) {
        this.building = building;
    }

    @Override
    public void update(double deltaTime) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void processInput(String input) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'processInput'");
    }

    @Override
    public void render(Renderer renderer) {
        renderer.renderBuilding(building);
    }
    
}
