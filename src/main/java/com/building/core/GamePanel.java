package com.building.core;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GamePanel {

    private final JPanel panel;

    public GamePanel(Game game) {
        panel = new JPanel() {
            @Override 
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                game.setGraphics((Graphics2D) g);
                game.render((Graphics2D) g);
            }
        };
        panel.setFocusable(true);
    }

    public void render() {        
        panel.repaint();
    }

    public JPanel getPanel() {
        return panel;
    }
    
}
