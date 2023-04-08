package OOP.polymorphism_Shape;

import OOP.polymorphism_Shape.models.*;

public class Tests {
    public static void main(String[] args) {

        IShape[] shapes = {
                new Square(18),       //S = 324.0
                new Rectangle(9, 4),  //S = 36.0
                new Triangle(9, 4)    //S = 18.0
        };

        for (var shape : shapes) {
            System.out.println(shape.calculateSurface());
        }
    }
}
