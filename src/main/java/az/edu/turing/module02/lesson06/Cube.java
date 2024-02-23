package az.edu.turing.module02.lesson06;

import java.util.Objects;

public class Cube extends Figure {

    private double tile;


    public Cube(String name, String type, double tile) {
        super(name, type);
        this.tile = tile;
    }

    public double getTile() {
        return tile;
    }

    public void setTile(double tile) {
        this.tile = tile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cube cube = (Cube) o;
        return Double.compare(tile, cube.tile) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tile);
    }

    @Override
    public String toString() {
        return String.format("Cube{tile=%s} IS-A %s", tile, super.toString());
    }
}
