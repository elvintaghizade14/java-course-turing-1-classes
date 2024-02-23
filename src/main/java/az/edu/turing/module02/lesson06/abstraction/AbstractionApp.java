package az.edu.turing.module02.lesson06.abstraction;

public class AbstractionApp {

    public static void main(String[] args) {
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(3, 4);

        System.out.println(square.calcArea());
        System.out.println(square.calcPerimeter());
        System.out.println(rectangle.calcArea());
        System.out.println(rectangle.calcPerimeter());

        printAreaAndPerimeter(square);
        printAreaAndPerimeter(rectangle);
    }

    private static void printAreaAndPerimeter(PlainFigure plainFigure) {
        System.out.println(plainFigure.calcArea() + " " + plainFigure.calcPerimeter());
    }
}
