package com.building.rendering;

import java.awt.Graphics2D;
import com.building.projection.IsometricProjection;

public class RenderContext {
    private Graphics2D graphics;
    private IsometricProjection projection;
    private Camera camera;

    public RenderContext(IsometricProjection projection, Camera camera) {
        this.projection = projection;
        this.camera = camera;
    }

    public void setGraphics(Graphics2D graphics) {
        this.graphics = graphics;
    }

    public Graphics2D getGraphics() {
        return graphics;
    }

    public IsometricProjection getProjection() {
        return projection;    
    }

    public Camera getCamera() {
        return camera;
    }


}
