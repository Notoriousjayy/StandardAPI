package com.company;

import AbstractClasses.Points2DBase;
import Interfaces.PointInterface;

public class Real2DPoint extends Points2DBase implements PointInterface {
    double x;
    double y;

    public Real2DPoint() {
        x = Math.random();
        y = Math.random();
    }

    @Override
    public double radius() {
        return Math.sqrt((x * x) + (y * y));
    }

    @Override
    public double theta() {
        return Math.atan2(y, x);
    }

    // Euclidean Distance
    // Demonstrates using refrencens to pass objects as parameters to methods
    public double distance(Real2DPoint point) {
        double dx = this.x - point.x;
        double dy = this.y - point.y;

        return Math.sqrt((dx * dx) + (dy * dy));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "(" + "x: " + x + ", y: " + y + ")";
    }
}