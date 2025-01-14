package _17_12_2024;

public abstract class Figure {
    protected int Triangle;
    protected int Square;
    protected int Circle;
    public Figure(int Triangle, int Square, int Circle) {
        this.Triangle = Triangle;
        this.Square = Square;
        this.Circle = Circle;
    }

        public abstract double calculateArea();

        // Общие для всех фигур параметры (если такие будут)

    }

