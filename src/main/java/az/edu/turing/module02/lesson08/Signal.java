package az.edu.turing.module02.lesson08;

public interface Signal {

    String customSignal();

    default String signal() {
        return "bip";
    }
}
