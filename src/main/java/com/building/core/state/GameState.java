package com.building.core.state;

import com.building.rendering.Renderer;

public interface GameState {
    public void update(double deltaTime);
    public void render(Renderer renderer);
    public void processInput(String input);
}
