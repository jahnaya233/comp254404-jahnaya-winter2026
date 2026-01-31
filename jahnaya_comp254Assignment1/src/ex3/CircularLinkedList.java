package ex3;

public class CircularLinkedList<E> {

    private static class Node<E> {
        E element;
        Node<E> next;

        Node(E e, Node<E> n) {
            element = e;
            next = n;

        }
    }

    private Node<E> tail = null;
    private int size = 0;

    public void add(E e) {
        if (tail == null) {
            tail = new Node<>(e, null);
            tail.next = tail;
        } else
        {
            Node<E> newNode = new Node<>(e, tail.next);
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }
//Needed method
    public CircularLinkedList<E> clone() {
        CircularLinkedList<E> other = new CircularLinkedList<>();
        if (tail ==null) return other;

        Node<E> current = tail.next;
        do {
            other.add(current.element);
            current = current.next;
        } while(current != tail. next);

        return other;
    }
public void printOnce() {
    if (tail == null) {
        return;
    }

    Node <E> current = tail.next;
    do {
        System.out.print(current.element + " ");
        current = current.next;
    } while (current != tail.next);

    System.out.println();
    }
}


