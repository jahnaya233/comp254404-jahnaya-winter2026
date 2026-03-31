package ex1andex2;

public class HeightDriver {

    public static void main(String[] args) {
        BinaryTree<String> tree= new BinaryTree<>();

        Position<String> root = tree.addRoot("A");
        Position<String> b = tree.addLeft(root,"B");
        Position<String> c = tree.addRight(root,"C");
        Position<String> d = tree.addLeft(b,"D");
        Position<String> e = tree.addRight(b,"E");
        tree.printHeight(root);

    }
}
