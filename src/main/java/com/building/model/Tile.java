package com.building.model;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Tile {
    
    int id;
    int x;
    int y;
    BufferedImage sprite;

    public Tile(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
        try {
            this.sprite = ImageIO.read(getClass().getResourceAsStream("/assets/white_tile.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public BufferedImage getSprite() {
        return sprite;
    }
}
