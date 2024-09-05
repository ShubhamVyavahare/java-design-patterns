package com.sv.learning.core_patterns.flyweight;

public class Circle extends Shape {

    private String label;

    public Circle() {
        this.label = "Circle";
    }

    @Override
    public void draw(int radius, String fillColor, String lineColor) {
        System.out.println("Drawing a " + label + " with radius " + radius + " Fill color " + fillColor + " Line Color " + lineColor);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}
