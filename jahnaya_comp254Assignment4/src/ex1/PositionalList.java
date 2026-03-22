package ex1;

public interface PositionalList <E> extends Iterable<E>{


    Position<E> addLast(E e);
    Iterable<Position<E>> positions();

}