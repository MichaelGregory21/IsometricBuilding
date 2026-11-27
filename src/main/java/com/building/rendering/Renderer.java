package com.building.rendering;

import java.awt.geom.Point2D;

import com.building.model.Building;
import com.building.model.Floor;
import com.building.model.Tile;

public class Renderer {

    private final RenderContext context;

    public Renderer(RenderContext context) {
        this.context = context;
    }

    public void renderBuilding(Building building) {
        Floor floor = building.getFloor(0);
        for (Tile tile : floor.getTiles()) {
            renderTile(tile);
        }
    }

    private void renderTile(Tile tile) {
        Point2D screen = context.getProjection().worldToScreen(tile.getX() + 0.5, tile.getY() + 0.5);
        double screenX = screen.getX() - context.getCamera().getX();
        double screenY = screen.getY() - context.getCamera().getY();

        context.getGraphics().drawImage(tile.getSprite(), (int) screenX - 32, (int) screenY - 32, null);
    }    

    public RenderContext getContext() {
        return context;
    }
}
