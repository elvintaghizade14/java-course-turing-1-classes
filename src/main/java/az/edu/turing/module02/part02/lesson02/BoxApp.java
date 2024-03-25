package az.edu.turing.module02.part02.lesson02;

public class BoxApp {

    public static void main(String[] args) {
        Box<String> divided = divideV1("15", "3a");
        if (!divided.isEmpty()) {
            System.out.println(divided.getData());
        }
    }

    public static Box<String> divideV1(String a, String b) {
        try {
            int num1 = parseStr(a);
            int num2 = parseStr(b);
            int result = num1 / num2;
            return new Box<>(String.valueOf(result));
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException happened!");
            return new Box<String>(e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException happened!");
            return new Box<String>(e.getMessage());
        } catch (Exception e) {
            System.err.println("Exception happened!");
            return new Box<String>(e.getMessage());
        }
    }

    private static int parseStr(String s) {
        return Integer.parseInt(s);
    }
}
