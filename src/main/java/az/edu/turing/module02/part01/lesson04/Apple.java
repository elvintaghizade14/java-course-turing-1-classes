package az.edu.turing.module02.part01.lesson04;

public class Apple extends Fruit {

    private String color;
    private double weight;
    private String origin;

    public Apple(String name, String color, double weight, String origin) {
        super(name);
        this.color = color;
        this.weight = weight;
        this.origin = origin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public void eat() {
        System.out.println(toString() + " is eaten!");
    }

    @Override
    public String toString() {
        return String.format("Apple{name='%s', color='%s', weight=%s, origin='%s'}",
                super.getName(), color, weight, origin);
    }

}
