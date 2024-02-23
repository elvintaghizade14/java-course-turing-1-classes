package az.edu.turing.module02.lesson06.abstraction;

public class Square extends PlainFigure {

    public double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calcArea() {
        return side * side;
    }

    @Override
    public double calcPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return String.format("Square{side=%s}", side);
    }
}
