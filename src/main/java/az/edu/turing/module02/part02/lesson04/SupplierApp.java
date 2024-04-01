package az.edu.turing.module02.part02.lesson04;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class SupplierApp {

    private static final Supplier<Integer> RANDOM100 = new Supplier<>() {
        @Override
        public Integer get() {
            return (int) (Math.random() * 101);
        }
    };

    public static void main(String[] args) {
        System.out.println(RANDOM100.get());
        System.out.println(RANDOM100.get());
        System.out.println(RANDOM100.get());
        System.out.println(RANDOM100.get());
        System.out.println(RANDOM100.get());

        Supplier<Integer> randomSupplier = () -> (int) (Math.random() * 101);

        System.out.println(randomSupplier.get());
        System.out.println(randomSupplier.get());
        System.out.println(randomSupplier.get());
        System.out.println(randomSupplier.get());

        Supplier<Integer> randomSupplier2 = () -> {
            return new Random().nextInt();
        };

        System.out.println(randomSupplier2.get());
        System.out.println(randomSupplier2.get());
        System.out.println(randomSupplier2.get());
    }
}
