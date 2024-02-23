package az.edu.turing.module02.lesson06;

import java.util.Objects;

public class Circle extends Figure{

    private double radius;

    public Circle(String name, String type, double radius) {
        super(name, type);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }

    @Override
    public String toString() {
        return String.format("Circle{radius=%s} IS-Aw %s", radius, super.toString());
    }
}
