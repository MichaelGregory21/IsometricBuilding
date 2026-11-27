
package com.building;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.building.core.Game;

public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            Game game = new Game();

            JFrame window = new JFrame("Isometric Building");
            window.add(game.getGamePanel().getPanel());

            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setSize(1000, 700);
            window.setLocationRelativeTo(null);

            window.setVisible(true);

            game.start();
        });
    }
}
