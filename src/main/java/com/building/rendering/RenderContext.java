package com.building.rendering;

import java.awt.Graphics2D;
import com.building.projection.IsometricProjection;

public class RenderContext {
    private final Graphics2D graphics;
    private final IsometricProjection projection;
    
    public RenderContext(Graphics2D graphics, IsometricProjection projection) {
        this.graphics = graphics;
        this.projection = projection;
    }

    public Graphics2D getGraphics() {
        return graphics;
    }

    public IsometricProjection getProjection() {
        return projection;    
    }


}
