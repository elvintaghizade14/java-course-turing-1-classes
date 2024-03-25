package az.edu.turing.module02.part01.lesson04;

public class Fruit {

    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name + " is eaten!");
    }

    @Override
    public String toString() {
        return String.format("Fruit{name='%s'}", name);
    }
}
