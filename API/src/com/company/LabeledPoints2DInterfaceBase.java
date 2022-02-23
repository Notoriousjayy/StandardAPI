package com.company;

public class LabeledPoints2DInterfaceBase extends Points2D {
    String id;

    public void label(String name){
        id = name;
    }

    @Override
    public String toString(){
        return "(" + "x: " + x + ", y: " + y +")";
    }
}
