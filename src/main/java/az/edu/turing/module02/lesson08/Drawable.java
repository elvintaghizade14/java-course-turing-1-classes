package az.edu.turing.module02.lesson08;

public interface Drawable {

    // public static final
    String OPERATION_NAME = "drawing";

    // public abstract
    void draw();

    default String getOperationName() {
        return OPERATION_NAME;
    }
}
