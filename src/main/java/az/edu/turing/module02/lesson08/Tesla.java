package az.edu.turing.module02.lesson08;

public class Tesla extends Car implements Swimable, Signal {

    @Override
    public void start() {
        System.out.println("Battery is low, charge me... :-(");
    }

    @Override
    public void swim() {
        System.out.println("J.P. Morgan, borc ichinde uzurem :(");
    }

    @Override
    public String customSignal() {
        return null;
    }

    @Override
    public String signal() {
        return "Z.o... battery is low :(";
    }
}
