package az.edu.turing.module02.lesson05;

public class SquareApp {

    public static void main(String[] args) {
        Square square1 = new Square(15);
        Square square2 = new Square(15);
        Square square3 = new Square(14);
        System.out.println(square1);
        System.out.println(square2);
        System.out.println(square3);
        System.out.println(square1.hashCode());
        System.out.println(square2.hashCode());
        System.out.println(square3.hashCode());

        System.out.println(square1 == square2);
        System.out.println(square1 == square3);
        System.out.println(square1.equals(square2));
        System.out.println(square1.equals(square3));

        square2 = square1;
        System.out.println(square1 == square2);
        System.out.println(square1.hashCode());
        System.out.println(square2.hashCode());
        System.out.println(square3.hashCode());

    }
}
