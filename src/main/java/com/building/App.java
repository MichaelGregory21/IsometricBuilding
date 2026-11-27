
package com.building;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.building.model.Building;
import com.building.model.Floor;
import com.building.projection.IsometricProjection;
import com.building.rendering.Renderer;
import com.building.ui.GamePanel;

public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Building building = new Building();

            Floor floor = Floor.createRectangular(60, 40, 0);
            building.addFloor(floor);

            IsometricProjection projection = new IsometricProjection();
            Renderer renderer = new Renderer();

            GamePanel gamePanel = new GamePanel(building, renderer, projection);

            JFrame window = new JFrame("Isometric Building");
            window.add(gamePanel.getPanel());

            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setSize(1000, 700);
            window.setLocationRelativeTo(null);

            window.setVisible(true);
        });
    }
}
