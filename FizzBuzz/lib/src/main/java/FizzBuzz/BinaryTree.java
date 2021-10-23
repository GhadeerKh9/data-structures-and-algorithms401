package FizzBuzz;


import java.util.ArrayList;
import java.util.Queue;

public class BinaryTree<T> {
    public Node<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public boolean isEmpty(){
        return root == null;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}