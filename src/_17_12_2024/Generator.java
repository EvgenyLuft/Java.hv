package _17_12_2024;

import java.util.Random;

public class Generator {

    private double radius;

    public Circle generateCircle() {
        double radius = new Random().nextDouble() * 10;
        return new Circle(radius);

    }

    private double Side;

    public Square generateSquare() {
        double side = new Random().nextDouble() * 4;
        return new Square(side);
    }

    private double side;

    public Triangle generateTriangle() {
        double side = new Random().nextDouble() * 3;
        return new Triangle(side);

    }
}






