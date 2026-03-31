package ex1andex2;
import java.util.ArrayList;
import java.util.List;

interface Position<E> {
    E getElement();
}

interface Tree<E> {
    Position<E> root();

    Position<E> parent(Position<E> p);

    Position<E> left(Position<E> p);

    Position<E> right(Position<E> p);

    Iterable<Position<E>> children(Position<E> p);

    int size();

    boolean isEmpty();

}
public class BinaryTree<E> implements Tree<E> {

    protected static class Node<E> implements Position<E> {
        private E element;
        private Node<E> parent;
        private Node<E> left;
        private Node<E> right;

        public Node(E e, Node<E> p, Node<E> l, Node<E> r) {
            element = e;
            parent = p;
            left = l;
            right = r;
        }

        public E getElement() { return element; }
        public Node<E> getParent() { return parent; }
        public Node<E> getLeft() { return left; }
        public Node<E> getRight() { return right; }

        public void setParent(Node<E> p) {parent = p;}
        public void setLeft(Node<E> l) {left = l;}
        public void setRight(Node<E> r) {right = r;}
    }
    protected Node<E> root = null;
    private int size= 0;

    public BinaryTree() {}
    protected Node<E> validate(Position<E> p) {
        return (Node<E>) p;
    }

    public int size() {return size;}
    public boolean isEmpty() {return size ==0;}
    public Position<E> root() {return root;}
    public Position<E> parent(Position<E> p) {
        return validate(p).getParent();
    }
    public Position<E> left(Position<E> p) {
        return validate(p).getLeft();
    }
    public Position<E> right(Position<E> p) {
        return validate(p).getRight();
}

public Iterable<Position<E>> children(Position<E> p) {
    List<Position<E>> list = new ArrayList<>();
    if (left(p) != null) list.add(left(p));
    if (right(p) != null) list.add(right(p));
    return list;
}
    public Position<E> addRoot(E e) {
     root = new Node<>(e, null, null, null);
     size =1;
     return root;
    }
public Position<E> addLeft(Position<E> p, E e){
        Node<E> parent = validate(p);
        Node<E> child = new Node<>(e, parent, null, null);
        parent.setLeft(child);
        size++;
        return child;
}
    public Position<E> addRight(Position<E> p, E e){
        Node<E> parent = validate(p);
        Node<E> child = new Node<>(e, parent, null, null);
        parent.setRight(child);
        size++;
        return child;
    }

    public int printHeight(Position<E> p) {
        Node<E> node = validate(p);

        int leftHeight = 0;
        int rightHeight = 0;

        if(node.getLeft() != null)
            leftHeight = printHeight(node.getLeft());

        if(node.getRight()!= null)
            rightHeight = printHeight(node.getRight());

        int height = Math.max(leftHeight,rightHeight);

        System.out.println(node.getElement() + " : " + height);
        return height +1;
    }

    public Position<E> preorderNext(Position<E> p) {
        Node<E> node = validate(p);

        if (node.getLeft() != null)
            return node.getLeft();

        if (node.getRight() != null)
            return node.getRight();

        while(node.getParent() != null) {
            Node<E> parent = node.getParent();

            if(node == parent.getLeft() && parent.getRight() != null)
                return parent.getRight();

            node = parent;
        }
        return null;
    }
}
