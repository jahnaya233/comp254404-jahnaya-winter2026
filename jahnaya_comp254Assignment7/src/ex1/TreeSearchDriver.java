package ex1;

public class TreeSearchDriver {

    public static void main(String[] args) {
        TreeSearch.TreeNode<Integer> root = new TreeSearch.TreeNode<>(50);
        root.left = new TreeSearch.TreeNode<>(30);
        root.right = new TreeSearch.TreeNode<>(70);

        TreeSearch.TreeNode<Integer> result = TreeSearch.treeSearch(root, 30);

        if (result != null)
            System.out.println("Found: " + result.key);
        else
            System.out.println("Not found");
    }
}