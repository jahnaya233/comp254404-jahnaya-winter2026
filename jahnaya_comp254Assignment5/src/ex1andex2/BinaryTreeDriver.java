package ex1andex2;

public class BinaryTreeDriver {

    public static void main(String[] args) {
        BinaryTree<String> tree = new BinaryTree<>();

        Position<String> root = tree.addRoot("A");
        Position<String> b = tree.addLeft(root,"B");
        Position<String> c = tree.addRight(root,"C");
        Position<String> d = tree.addLeft(b,"D");
        Position<String> e = tree.addRight(b,"E");

        Position<String> next = tree.preorderNext(b);

        if(next != null)
            System.out.println("Next of B:" + next.getElement());
        else
            System.out.println("null");




    }
}
