package de.telran.data;

import java.lang.reflect.Type;

public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void printMessage() {
        System.out.println("Hello!");
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape: ";
    }

    public static void displayAreaFromShapesArray(Shape[] shapes) {
        for (Shape s : shapes) {
            System.out.println(s.getArea());
        }
    }

    public static Shape findMaxShapeByAre(Shape[] shapes) {
        Shape max = shapes[0];
        double maxArea = max.getArea();
        for (Shape s : shapes) {
            double area = s.getArea();
            if (area > maxArea) {
                max = s;
                maxArea = area;
            }
        }
        return max;
    }

    private static int numberShapesByColor(Shape[] shapes, Color color) {
        int count = 0;
        for (Shape s : shapes) {
            if (s.getColor().equals(color))
                count++;
        }
        return count;
    }

    public static Shape[] getShapesByColor(Shape[] shapes, Color color) {
        Shape[] shapesByColor = new Shape[numberShapesByColor(shapes, color)];
        int index = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i].getColor().equals(color)) {
                shapesByColor[index] = shapes[i];
                index++;
            }
        }
        return shapesByColor;
    }

    public static Shape[] getShapesByType(Shape[] shapes, String type) {
        System.out.println("\n--------------\nShapes of type " + type + ": \n");
        Shape[] shapesByType = new Shape[getCountShapesByType(shapes, type)];
        int index = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i].getClass().getSimpleName().equals(type)) {
                shapesByType[index] = shapes[i];
                index++;
            }
        }
        return shapesByType;
    }

    private static int getCountShapesByType(Shape[] shapes, String type) {
        int count = 0;
        for (Shape s : shapes) {
            if (s.getClass().getSimpleName().equals(type))
                count++;
        }
        return count;
    }
}
