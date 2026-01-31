package ex1;

public class DoublyLinkedList<E> {

    private static class Node<E> {
        E element;
        Node<E> prev;
        Node<E> next;

        Node(E e, Node<E> p, Node<E> n) {
            element =e;
            prev = p;
            next = n;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public DoublyLinkedList() {
        head = new Node<> (null, null, null);
        tail = new Node<>(null, head, null);
        head.next = tail;

    }

    public void addLast(E e) {
        Node<E> newNode = new Node<> (e, tail.prev, tail);
        tail.prev.next = newNode;
        tail.prev = newNode;
        size++;

    }
//Needed method
    public void concatenate(DoublyLinkedList<E> M) {
        if (M.size == 0) return;
        Node<E> lastL = this.tail.prev;
        Node<E> firstM = M.head.next;
        lastL.next = firstM;
        firstM.prev = lastL;

        this.tail = M.tail;
        this.size += M.size;
    }
//Added output to demonstrate that it works

    public void printList() {
     Node<E> current = head.next;
     while(current != tail) {
         System.out.print(current.element + " ");
         current = current.next;
     }
     System.out.println();
    }
}
