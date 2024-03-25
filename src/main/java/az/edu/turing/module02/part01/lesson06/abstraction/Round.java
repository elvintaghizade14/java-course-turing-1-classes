package az.edu.turing.module02.part01.lesson06.abstraction;

public class Round extends PlainFigure {

    public double radius;

    public Round(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calcPerimeter() {
        return Math.PI * radius * 2;
    }
}
