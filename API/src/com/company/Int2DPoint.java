package com.company;

import Interfaces.PointInterface;

public class Int2DPoint implements PointInterface {
    int x;
    int y;

    @Override
    public double radius() {
        return Math.sqrt((x * x) + (y * y));
    }

    @Override
    public double theta() {
        return Math.atan2(y, x);
    }

    // Euclidean Distance
    // Demonstrates using references to pass objects as parameters to methods
    public double distance(Real2DPoint point) {
        double dx = this.x - point.x;
        double dy = this.y - point.y;

        return Math.sqrt((dx * dx) + (dy * dy));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "(" + "x: " + x + ", y: " + y + ")";
    }
}
