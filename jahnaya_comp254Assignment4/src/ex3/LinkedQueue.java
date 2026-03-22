package ex3;

public class LinkedQueue<E> {

    private static class Node<E> {
        E element;
        Node<E> next;

        Node(E e, Node<E> n) {
            element = e;
            next = n;
        }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;


    public boolean isEmpty() { return  size == 0;}

    public void enqueue(E e) {
        Node<E> newest = new Node<> (e, null);
        if (isEmpty())
            head = newest;

        else
            tail.next = newest;
        tail = newest;
        size++;
    }

    public E dequeue() {
        if (isEmpty()) return null;
        E answer = head.element;
        head = head.next;
        size--;
        if (isEmpty()) tail = null;
        return  answer;

    }


    public void concatentate(LinkedQueue<E> Q2) {
        if (Q2.isEmpty()) return;

        if (this.isEmpty()) {
            this.head = Q2.head;
            this.tail = Q2.tail;
        } else {
            this.tail.next = Q2.head;
            this.tail = Q2.tail;

        }

        this.size += Q2.size;

        Q2.head = null;
        Q2.tail = null;
        Q2. size = 0;
    }
}
