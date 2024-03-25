package az.edu.turing.module02.part02.lesson02;

public class Box<E> {

    private final E data;

    public Box(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public boolean isEmpty() {
        return data == null;
    }

    @Override
    public String toString() {
        return String.format("{data=%s}", data);
    }
}
