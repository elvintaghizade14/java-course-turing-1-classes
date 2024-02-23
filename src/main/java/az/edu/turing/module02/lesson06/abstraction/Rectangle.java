package az.edu.turing.module02.lesson06.abstraction;

public class Rectangle extends PlainFigure {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calcArea() {
        return length * width;
    }

    @Override
    public double calcPerimeter() {
        return (width + length) * 2;
    }
}
