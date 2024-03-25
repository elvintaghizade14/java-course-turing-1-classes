package az.edu.turing.module02.part02.lesson02;

public class GenericIntroApp {

    public static void main(String[] args) {
        System.out.println(divide("15", "0"));
    }

    public static MyBox divide(String a, String b) {
        try {
            int num1 = parseStr(a);
            int num2 = parseStr(b);
            int result = num1 / num2;
            return new MyBox<Integer>(result);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException happened!");
            return new MyBox<Exception>(e);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException happened!");
            return new MyBox(e);
        } catch (Exception e) {
            System.out.println("Exception happened!");
            return new MyBox(e);
        }
    }

    private static int parseStr(String s) {
        return Integer.parseInt(s);
    }
}
