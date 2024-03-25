package az.edu.turing.module02.part02.lesson02;

public final class MyBox<E> {

    private E data;
    private Throwable throwable;

    public MyBox(E data) {
        this.data = data;
    }

    public MyBox(Throwable throwable) {
        this.throwable = throwable;
    }

    public E getData() {
        return data;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public boolean isEmpty() {
        return data == null;
    }

    @Override
    public String toString() {
        return String.format("{data=%d}", data);
    }
}
