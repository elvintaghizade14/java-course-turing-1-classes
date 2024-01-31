package az.edu.turing.module01.lesson10;

import java.awt.image.RasterOp;

public class CharsApp {

    public static void main(String[] args) {
        printChars(new char[]{'E', 'L', 'V', 'I', 'N'});

        String name = "\nElvin Taghizade\n   ";
        System.out.print(name);
        System.out.print(name.length());
        System.out.println(name.trim());

        String s = "   1   ";
        System.out.println(s);
        s.trim();
        System.out.println(s);
        s = s.trim();
        System.out.println(s);

        String abc = "ABC";
        abc = abc.replace("C", "ABCDE");
        System.out.println(abc);

        // String multipleLine = """askjbdad""";
    }

    private static void printChars(char[] chars) {
        for (char c : chars) {
            System.out.print(c);
        }
    }

}
