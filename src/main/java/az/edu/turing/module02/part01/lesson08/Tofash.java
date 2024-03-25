package az.edu.turing.module02.part01.lesson08;

public class Tofash extends Car implements Flyable, Swimable, Signal {

    @Override
    public void start() {
        System.out.println("Tofash starting... ğğğnnn");
    }

    @Override
    public void fly() {
        System.out.println("Tofash: heyat fani olum ani :d");
    }

    @Override
    public void swim() {
        System.out.println("Qaqaaaaaw, oooh xumarittt...");
    }

    @Override
    public String customSignal() {
        return Signal.super.signal();
    }

//    @Override
//    public String signal(){
//        return "Aga napiyoooon???";
//    }
}
