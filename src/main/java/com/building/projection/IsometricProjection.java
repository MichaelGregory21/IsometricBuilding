package com.building.projection;

import java.awt.Point;
import java.awt.geom.Point2D;

public class IsometricProjection {

    private final int TILE_WIDTH = 64;
    private final int TILE_HEIGHT = 32;

    private double originX;
    private double originY;

    public Point2D worldToScreen(double x, double y) {
    return new Point2D.Double(TILE_WIDTH / 2.0 * (x + y) + originX, TILE_HEIGHT / 2.0 * (-x + y) + originY);
}

    public Point2D screenToWorld(double screenX, double screenY) {
        double a = (screenX - originX) / (TILE_WIDTH / 2.0);
        double b = (screenY - originY) / (TILE_HEIGHT / 2.0);

        return new Point2D.Double((a - b) / 2.0, (a + b) / 2.0);
    }

    public Point worldToTile(double x, double y) {
        return new Point( (int) Math.floor(x), (int) Math.floor(y));
    }

    public Point screenToTile(double screenX, double screenY) {
        Point2D world = screenToWorld(screenX, screenY);
        return worldToTile(world.getX(), world.getY());        
    }

    public Point2D tileToWorld(int tileX, int tileY) {
        return new Point2D.Double(tileX + 0.5, tileY + 0.5);
    }
}