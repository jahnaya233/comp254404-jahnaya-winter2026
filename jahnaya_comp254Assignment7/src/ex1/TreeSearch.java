package ex1;

public class TreeSearch {

    static class TreeNode<K> {
        K key;
        TreeNode<K> left, right;

        public TreeNode(K k) {
            key = k;
        }
    }

    public static <K extends Comparable<K>> TreeNode<K> treeSearch(TreeNode<K> root, K key) {
        TreeNode<K> current = root;

        while (current != null) {
            int comp = key.compareTo(current.key);

            if (comp == 0)
                return current;
            else if (comp < 0)
                current = current.left;
            else
                current = current.right;
        }
        return null;
    }

}
