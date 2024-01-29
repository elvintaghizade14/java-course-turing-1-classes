package az.edu.turing.module01.lesson09;

public class PassValueApp {

    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        foo(a);
        System.out.println(a);
    }

    public static void foo(int a) {
        a = 15;
        System.out.println(a);
    }

}
