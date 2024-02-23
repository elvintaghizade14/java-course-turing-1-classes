package az.edu.turing.module02.lesson06;

public class FigureApp {

    public static void main(String[] args) {
        Circle circle1 = new Circle("Circle", "circle", 15);
        System.out.println(circle1);
        System.out.println(circle1.getRadius());
        Figure figure1 = circle1;

        Square square1 = new Square("Square", "square", 5);
        System.out.println(square1);

        Cube cube = new Cube("Cube", "somali qachqinlari", 7);
        System.out.println(cube);

        Human human = new Human("Nazrin", 19);
        System.out.println(human);

        printNameOfFigure(circle1);
//        printNameOfFigure(square1);
//        printNameOfFigure(cube);
//        printNameOfFigure(human);
    }

    private static void printNameOfFigureV1(Figure object) {
        if (object instanceof Circle) {
            Circle circle = (Circle) object;
            System.out.println(circle.getName());
        } else if (object instanceof Square) {
            Square square = (Square) object;
            System.out.println(square.getName());
        } else if (object instanceof Cube) {
            Cube cube = (Cube) object;
            System.out.println(cube.getName());
        } else {
            throw new IllegalArgumentException("Mohteshem!!!");
        }
    }

    private static void printNameOfFigure(Figure figure) {
        System.out.println(figure.getName());
    }
}
