package ex1;

public class DoublyLinkedListDriver {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> L = new DoublyLinkedList<>();
        DoublyLinkedList<Integer> M = new DoublyLinkedList<>();

        L.addLast(1);
        L.addLast(2);
        M.addLast(3);
        M.addLast(4);

        L.concatenate(M);

        L.printList();
    }
}
