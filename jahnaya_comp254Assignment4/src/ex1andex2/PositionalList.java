package ex1andex2;

public interface PositionalList <E> extends Iterable<E>{


    Position<E> addLast(E e);
    Iterable<Position<E>> positions();

}