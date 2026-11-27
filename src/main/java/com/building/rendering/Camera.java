package com.building.rendering;

public class Camera {
    private double x;
    private double y;

    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
