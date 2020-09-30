package de.telran.application;

import de.telran.data.*;

import java.lang.reflect.Type;

public class ShapeApp {
    public static void main(String[] args) {

        Shape shape = new Circle(Color.RED, 12);
        Circle circle1 = new Circle(Color.BLACK, 10);
        Shape square = new Square(Color.GREEN, 8);

        Circle c1 = new Circle(Color.RED,12);
        Circle c2 = new Circle(Color.GREEN,9);

        Square sq1 = new Square(Color.YELLOW, 5);
        Square sq2 = new Square(Color.RED, 8);

        Rectangle r1 = new Rectangle(Color.BLUE, 9,3);
        Rectangle r2 = new Rectangle(Color.YELLOW, 7,6);

        Triangle tr1 = new RightTriangle(Color.BLACK, 6, 3);
        Shape tr2 = new EquilateralTriangle(Color.YELLOW, 7);



        Shape[] shapes = {shape, circle1, square, c1,c2, sq1, sq2, r1, r2, tr1, tr2,};

        //Shape.displayAreaFromShapesArray(shapes);

        System.out.println(Shape.findMaxShapeByAre(shapes));
        System.out.println();
        printArray(Shape.getShapesByColor(shapes, Color.RED));
        printArray(Shape.getShapesByType(shapes, "EquilateralTriangle"));
        printArray(Shape.getShapesByType(shapes, "Rectangle"));

    }

    public static void printArray(Object[] objects){
        for (Object o:objects) {
            System.out.println(o);
        }
    }
}
