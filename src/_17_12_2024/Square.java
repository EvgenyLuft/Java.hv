package _17_12_2024;

public class Square {
    private int side;
    private int area;
    private int perimeter;

    // Конструктор класса
    public Square(int side) {
        this.side = side;
        this.area = side * side;
        this.perimeter = 4 * side;
    }

    public Square(double side) {
    }

    public int getSide() {
        return side;
    }

    public int getArea() {
        return area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setSide(int side) {
        this.side = side;
        this.area = side * side;
        this.perimeter = 4 * side;
    }
}

