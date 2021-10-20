package trees.trees;

import com.google.common.collect.Queues;
import org.checkerframework.checker.units.qual.C;
import trees.node.BinaryNode;

import java.sql.Array;
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
//    public int maximumValue() {
//        if (root == null) return 0;
//        if (root.getLeftNode().getRightNode() == null || root.getRightNode()== null) return root.getData();
//        int max = 0;
//        List<Integer> maxList = (List<Integer>) traversePostOrder((BinaryNode<T>) root);
//        for (int i = 0; i < maxList.size(); i++) {
//            if (maxList.get(i) >= max) {
//                max = maxList.get(i);
//            }
//        }
//        return max;
//    }
//

//    public static ArrayList<Integer> breadthFirst(BinaryTreeClass<Integer> binaryTree) {
//        if (binaryTree.root == null) return null;
//
//        ArrayList<Integer> breadthFirstList = new ArrayList<>();
//        Queues<Integer> myQueue = new Queues();
//
//        myQueue.enqueue(binaryTree.root);
//
//        while (!myQueue.isEmpty()) {
//
//            Node<Integer> front = myQueue.dequeue();
//            breadthFirstList.add(front.value);
//
//            if (front.leftChild != null) {
//                myQueue.enqueue(front.leftChild);
//            }
//            if (front.rightChild != null) {
//                myQueue.enqueue(front.rightChild);
//            }
//        }
//
//        return breadthFirstList;
//    }

  



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
