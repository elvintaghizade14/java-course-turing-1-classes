package az.edu.turing.module02.part01.lesson04;

public class FruitApp {

    public static void main(String[] args) {
        Apple apple1 = new Apple("Simironka", "green", 0.20, "Quba");
        apple1.setOrigin("Ismayilli");
        apple1.eat();

        System.out.println(apple1.toString());
        System.out.println(apple1.hashCode());

        Fruit fruit1 = new Fruit("limandra");
        System.out.println(fruit1);
        System.out.println(fruit1.hashCode());
        fruit1.eat();

        System.out.println(apple1 instanceof Apple);
        System.out.println(apple1 instanceof Fruit);
        System.out.println(apple1 instanceof Object);
//        System.out.println(apple1 instanceof String);

    }
}
