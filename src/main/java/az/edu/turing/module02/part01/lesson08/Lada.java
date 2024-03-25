package az.edu.turing.module02.part01.lesson08;

public class Lada extends Car implements Flyable, Signal {

    @Override
    public void start() {
        System.out.println("Qabagima chixani vurajaaaam...");
    }

    @Override
    public void fly() {
        System.out.println("LADA: heyat fani olum ani :d");
    }

    @Override
    public String customSignal() {
        return "Elesgeeeer, ay Elesgerrr!";
//        return Signal.super.signal();
    }
}
