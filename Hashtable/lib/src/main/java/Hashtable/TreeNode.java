package Hashtable;


public class TreeNode<T> {

    private final int key;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(int key) {
        this.key = key;
        left = right = null;
    }

    public int getKey() {
        return key;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

}