package az.edu.turing.module01.lesson11;

public class EqualityApp {

    public static void main(String[] args) {
        int[] first = new int[]{1, 2, 3};
        int[] second = new int[]{1, 3, 5};

        System.out.println(first == second);
        
        if (!(first.length == second.length)) {
            System.out.println(false);
        } else {
            boolean isEqual = true;
            for (int i = 0; i < first.length; i++) {
                if (first[i] != second[i]) {
                    isEqual = false;
                    break;
                }
            }
            System.out.println(isEqual);
        }
    }

}
