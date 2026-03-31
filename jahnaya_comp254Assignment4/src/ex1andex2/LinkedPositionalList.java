package ex1andex2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedPositionalList<E> implements PositionalList<E> {


    private static class Node<E> implements Position<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E e, Node<E> p, Node<E> n) {
            element = e;
            prev = p;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getPrev() { return prev; }
        public Node<E> getNext() { return next; }

        public void setPrev(Node<E> p) {prev = p;}
        public void setNext(Node<E> n) {next = n;}

    }

    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    public LinkedPositionalList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }
    private Node<E> validate(Position<E> p) {
        return (Node<E>) p;
    }

    private Position<E> position(Node<E> node) {
        if (node == header || node == trailer) return null;
        return node;

    }
    private Position<E> addBetween(E e, Node<E> pred, Node<E> succ) {
        Node<E> newest = new Node<>(e, pred, succ);
        pred.setNext(newest);
        succ.setPrev(newest);
        size++;
        return newest;
    }

    public Position<E> addLast(E e) {
        return addBetween(e, trailer.getPrev(), trailer);
    }

public Iterable<Position<E>> positions() {
return() -> new Iterator<Position<E>>() {
private Node<E> cursor = header.getNext();

public boolean hasNext(){
return cursor != trailer;
}
public Position<E> next() {
if(!hasNext()) throw new NoSuchElementException();
Node<E> current = cursor;
cursor = cursor.getNext();
return current;
}
};
}

public Iterator<E> iterator() {
return new Iterator<E>() {
Iterator<Position<E>> posIterator = positions().iterator();

public boolean hasNext() {
return posIterator.hasNext();
}

public E next() {
return posIterator.next().getElement();
}
};
}
}