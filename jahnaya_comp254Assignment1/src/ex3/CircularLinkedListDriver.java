package ex3;

public class CircularLinkedListDriver {

    public static void main(String[] args) {
        CircularLinkedList<Integer> list = new CircularLinkedList<>();
        list.add(3);
        list.add(6);
        list.add(9);

        CircularLinkedList<Integer> copy = list.clone();

        System.out.println("List:");
        list.printOnce();

        System.out.println("Cloned list:");
        copy.printOnce();
    }
}


