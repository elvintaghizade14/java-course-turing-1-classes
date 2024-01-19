package az.edu.turing.module01.lesson04;

public class NumberApp {

    public static void main(String[] args) {
        int a = 5;
        System.out.println(a / 2);
//        a = "Elvin"; compile time error
        float b; // declare
        b = 4; // init
        System.out.println(b * 5);

        System.out.printf("%.3f\n", a / b);

        double salaryOfAybenizXanim = 2_147_483_001.43;
        System.out.println(salaryOfAybenizXanim);

        char symbol1 = 'x';
        System.out.println(symbol1);
        System.out.println(symbol1 + 1);

        char c1 = '\u0022';
        System.out.println(c1);

        boolean b1 = true;
        boolean b2 = false;

        final short ageOfAybeniz = 21;
//        ageOfAybeniz = 22;

        System.out.printf("%d\n", 14);
        System.out.printf("%.6f\t\t\t", 14d);

        int radius = 12;
        System.out.println(Math.PI); // Area = PI * R^2
        System.out.println(Math.PI * Math.pow(radius, 2)); // Area = PI * R^2
        System.out.println(Math.sqrt(16));

    }

}
