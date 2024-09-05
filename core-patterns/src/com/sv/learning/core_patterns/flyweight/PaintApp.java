package com.sv.learning.core_patterns.flyweight;

public class PaintApp {

    public void render(int numberOfShapes) {

        Shape shape = null;

        for (int i = 0; i <= numberOfShapes; i++) {
            if (i % 2 == 0) {
                shape = ShapeFactory.getShape("circle");
                shape.draw(i, "red", "white");
            } else {
                shape = ShapeFactory.getShape("rectangle");
                shape.draw(i, i + i, "dotted");
            }
        }

    }

}
