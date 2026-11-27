package com.building.rendering;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

import com.building.model.Building;
import com.building.model.Tile;
import com.building.projection.IsometricProjection;

public class Renderer {
    
    public void render(Building building, int floor, RenderContext context) {
        renderFloor(building, floor, context);

    }

    private void renderObjects(Building building, int floor, RenderContext context) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'renderObjects'");
    }

    private void renderStructuralFeatures(Building building, int floor, RenderContext context) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'renderStructuralFeatures'");
    }

    private void renderWalls(Building building, int floor, RenderContext context) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'renderWalls'");
    }

    private void renderFloor(Building building, int floor, RenderContext context) {
        for (Tile tile : building.getFloor(floor).getTiles()) {
            renderTile(tile, context);
        }
    }

    private void renderTile(Tile tile, RenderContext context) {
        Graphics2D g2 = context.getGraphics();
        IsometricProjection projection = context.getProjection();

        Point2D screen = projection.worldToScreen(tile.getX() + 0.5, tile.getY() + 0.5);
        BufferedImage sprite = tile.getSprite();

        g2.drawImage(sprite, (int) screen.getX(), (int) screen.getY(), null);
    }

    
}
