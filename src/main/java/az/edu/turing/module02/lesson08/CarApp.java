package az.edu.turing.module02.lesson08;

public class CarApp {

    public static void main(String[] args) {
        Tofash tofash = new Tofash();
        tofash.start();

        Tesla tesla = new Tesla();
        tesla.start();

        tofash.fly();

        Lada lada = new Lada();
        lada.start();
        lada.fly();

        tofash.swim();
        tesla.swim();

        callFlyingCars(tofash);
        callFlyingCars(lada);
//        callFlyingCars(tesla);

        startCar(tesla);
        startCar(tofash);
        startCar(lada);

        System.out.println(tofash.signal());
        System.out.println(tofash.customSignal());
    }

    public static void callFlyingCars(Flyable flyable) {
        System.out.print("Flying -> ");
        flyable.fly();
    }

    public static void startCar(Car car) {
        car.start();
    }
}
