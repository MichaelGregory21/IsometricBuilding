package com.building.ui;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import com.building.model.Building;
import com.building.projection.IsometricProjection;
import com.building.rendering.Renderer;
import com.building.rendering.RenderContext;

public class GamePanel {
    JPanel panel = new JPanel() {
        @Override 
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            draw((Graphics2D) g);
        }
    };

    private final IsometricProjection projection;
    private final Renderer renderer;
    private final Building building;

    public GamePanel(Building building, Renderer renderer, IsometricProjection projection) {
        this.building = building;
        this.renderer = renderer;
        this.projection = projection;
    }

    public void draw(Graphics2D g2) {
        RenderContext context = new RenderContext(g2, projection);
        renderer.render(building, 0, context);
    }

    public JPanel getPanel() {
        return panel;
    }
    
}
