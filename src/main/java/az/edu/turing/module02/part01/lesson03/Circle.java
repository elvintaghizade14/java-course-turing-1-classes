package az.edu.turing.module02.part01.lesson03;

public class Circle {

    public static long countOfCircles;

    private final double radius;
    private String color;

    public Circle(double radius) {
        this.radius = radius;
        countOfCircles++;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        if (!"white".equals(color)) {
            this.color = color;
        }
    }

    public double calcLength() {
        return 2 * Math.PI * this.radius;
    }
}
