package com.company;

public class LabeledReal2DPointInterfaceBase extends Real2DPoint {
    String id;

    public void label(String name) {
        id = name;
    }

    @Override
    public String toString() {
        return "(" + "x: " + x + ", y: " + y + ")";
    }
}
