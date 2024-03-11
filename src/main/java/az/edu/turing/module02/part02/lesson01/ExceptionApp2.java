package az.edu.turing.module02.part02.lesson01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionApp2 {

    public static void mainV1(String[] args) {
        try {
            int result = 1 / 0;
            System.out.println(result);
            System.out.println("Elvin".charAt(10));
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException happened!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException happened!");
            e.printStackTrace();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException happened!");
            System.out.println(e.getMessage());
            System.out.println(e.getClass().getName());
        }

        System.out.println("Cont.");

    }

    public static void main(String[] args) {
        File file = new File("src/main/java/az/edu/turing/module02/part02/lesson01/resource/nums.txt");
        try {
            FileWriter fw = new FileWriter(file, true);
            for (int i = 65; i < 92; i++) {
                fw.write(i);
            }
            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
