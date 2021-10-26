package trees.trees;

import trees.node.BinaryNode;



import java.util.*;

public class BinaryTreeClass<T extends Comparable<T>>{




    public BinaryNode<T> root;



    List<Integer> postOrderList = new ArrayList<>();

    public void inorderTraversal(){

        if (isEmpty()) {
            return;
        }



        traverseInorder(root);
    }

    public void traverseInorder(BinaryNode<T> root){
        if(root.getLeftNode() != null){
            traverseInorder(root.getLeftNode());


        }

        System.out.println(root.getData() + "--->");

        if(root.getRightNode() != null){
            traverseInorder(root.getRightNode());
        }
    }

    public void preOrderTraversal() {
        if (isEmpty()) {
            return;
        }

        traversePreOrder(root);
    }
    public void traversePreOrder(BinaryNode<T>  root){

        if(root == null){
            return;
        }

        System.out.print(root.getData() + "--->");

        traversePreOrder(root.getLeftNode());

        traversePreOrder(root.getRightNode());
    }


    public void postOrderTraversal() {
        if (isEmpty()) {
            return;
        }

        traversePostOrder(root);
    }

    public void traversePostOrder(BinaryNode<T> root){

        if(root == null){
            return;
        }
        traversePostOrder(root.getLeftNode());
        traversePostOrder(root.getRightNode());


        System.out.println(root.getData() + "--->");
        postOrderList.add((Integer) root.getData());




    }


    public int maximumValue() {
        if (root == null) {
           return 0;

        } else {
            return maximumValueHelper((BinaryNode<Integer>) root);
        }
    }

    private int maximumValueHelper(BinaryNode<Integer> root ) {
        if (root.getRightNode() == null) {
            return (int) root.getData();
        } else {
            return maximumValueHelper(root.getRightNode());
        }
    }


public ArrayList<T> breadthFirst(BinaryTreeClass<T> binaryTree) {
    if (isEmpty()) {
        return null;
    }
    ArrayList<T> nodeList = new ArrayList<>();
    Queue<BinaryNode<T>> queue = new LinkedList<>();
    BinaryNode<T> node = binaryTree.root;

    queue.add(node);

    while (!queue.isEmpty()) {
        if (queue.peek().getLeftNode() != null) {
            queue.add(queue.peek().getLeftNode());
        }
        if (queue.peek().getRightNode() != null) {
            queue.add(queue.peek().getRightNode());
        }
        nodeList.add(queue.remove().getData());
    }

    return nodeList;


}
////////////////////////////////////////////////////////////////
    /// methods for sum of odd numbers

    public ArrayList<T> preOrderSecondtraversal() {

        if (isEmpty()) {
            return null;
        }
        ArrayList<T> arrayList = new ArrayList<>();

        helperTraversal(root, arrayList);

        return arrayList;
    }

    private void helperTraversal(BinaryNode<T> root, ArrayList<T> arrayList) {

        arrayList.add(root.getData());

        if (root.getLeftNode() != null) {
            helperTraversal(root.getLeftNode(), arrayList);
        }
        if (root.getRightNode() != null) {
            helperTraversal(root.getRightNode(), arrayList);
        }
    }



    public int sumOfOddNumbers() {
        if (isEmpty()) {
            return 0;
        }
        ArrayList<T> someList = preOrderSecondtraversal();
        int counter = 0;

        for (int i = 0; i < someList.size(); i++) {
            if (Integer.parseInt(someList.get(i) + "") % 2 != 0) {
                counter = counter + Integer.parseInt(someList.get(i) + "");
            }
        }
        return counter;
    }

/////////////////////////////////////////////////////////////////////////////////////////


    public void setRoot(BinaryNode<T> root) {
        this.root = root;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public BinaryNode<T> getRoot() {
        return root;
    }

    @Override
    public String toString() {
        return "BinaryTreeClass{" +
                "root=" + root +
                '}';
    }
}
