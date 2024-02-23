package az.edu.turing.module02.lesson06;

import java.util.Objects;

public class Square extends Figure {

    private double side;


    public Square(String name, String type, double side) {
        super(name, type);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return Double.compare(side, square.side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side);
    }

    @Override
    public String toString() {
        return String.format("Square{side=%s} IS-A %s", side, super.toString());
    }
}
