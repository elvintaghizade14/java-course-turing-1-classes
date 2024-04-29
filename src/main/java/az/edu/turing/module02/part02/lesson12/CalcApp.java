package az.edu.turing.module02.part02.lesson12;

public class CalcApp {

    public static void main(String[] args) {
        System.out.println(new CalcApp().add(2, 3));
        System.out.println(new CalcApp().add(2, 4));
    }

    public int add(int a, int b) {
        return a + b;
    }
}
