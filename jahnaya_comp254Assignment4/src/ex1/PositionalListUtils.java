package ex1;

public class PositionalListUtils {

    public static <E> int indexOf(PositionalList<E> list, Position<E> p) {
int index= 0;

for (Position<E> pos : list.positions()) {
    if (pos == p)
        return index;
    index++;
}
return -1;
    }
}