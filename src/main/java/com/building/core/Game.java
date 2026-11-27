package com.building.core;

import java.awt.Graphics2D;

import com.building.core.state.BuildingState;
import com.building.core.state.GameState;
import com.building.input.InputHandler;
import com.building.model.Building;
import com.building.model.Floor;
import com.building.projection.IsometricProjection;
import com.building.rendering.Camera;
import com.building.rendering.Renderer;
import com.building.rendering.RenderContext;

public class Game {
    private GameState currentState;

    private final GameLoop gameLoop;
    private final GamePanel gamePanel;

    private final Renderer renderer;
    private final Camera camera;
    private final IsometricProjection projection;

    private final InputHandler inputHandler;

    public Game() {
        Building building = makeBuilding();
        currentState = new BuildingState(building);

        camera = new Camera();
        projection = new IsometricProjection();
        
        RenderContext context = new RenderContext(projection, camera);
        renderer = new Renderer(context);
        inputHandler = new InputHandler();

        gamePanel = new GamePanel(this);
        gameLoop = new GameLoop(dt -> update(dt), this::processInput, gamePanel::render);
    }

    public void start() {
        gameLoop.start();
    }

    public void stop() {
        gameLoop.stop();
    }

    private Building makeBuilding() {
        Building building = new Building();

        Floor floor = Floor.createRectangular(8, 10, 0);
        building.addFloor(floor);

        return building;
    }

    public GamePanel getGamePanel() {
        return gamePanel;
    }

    public void setGraphics(Graphics2D graphics) {
        renderer.getContext().setGraphics(graphics);
    }
    
    public void update(double deltaTime) {
        currentState.update(deltaTime);
    }

    public void render(Graphics2D graphics) {
        currentState.render(renderer);
    }

    private void processInput() {

    }

}
