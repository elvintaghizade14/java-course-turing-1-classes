package az.edu.turing.module02.part01.lesson07;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static java.lang.Math.PI;

public class ImportApp {

    public static Integer i5;

    public static void main(String[] args) {
        System.out.println(PI * 2);
        System.out.println(PI * 34);
        System.out.println(PI * 27);

        // Scanner scanner = new Scanner(System.in);
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());

        int a = 5;
        Integer a2 = new Integer(5);
        boolean b1 = true;
//        Boolean b2 = new Boolean(true);
        Boolean b2 = Boolean.TRUE;
        Boolean b3 = b1;
        boolean b4 = (boolean) b2;
        System.out.println(i5);
    }
}
