package az.edu.turing.module02.part02.lesson06;

public class MyLinkedListApp {

    public static void main(String[] args) {
        var myLinkedList = new MyLinkedList<>(10);

        System.out.println(myLinkedList);

        myLinkedList.addTail(11);
        System.out.println(myLinkedList);

        myLinkedList.addTail(12);
        System.out.println(myLinkedList);

        myLinkedList.addTail(13);
        System.out.println(myLinkedList);

        myLinkedList.addTail(14);
        System.out.println(myLinkedList);

        myLinkedList.addHead(9);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.getSize());
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(100));
    }
}
