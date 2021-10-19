package trees.trees;

import org.checkerframework.checker.units.qual.C;
import trees.node.BinaryNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeClass<T extends Comparable<T>>{

    Queues bla = new Queues();


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
public ArrayList<T> breadthFirst(BinaryTreeClass<T> binaryTree) {
    if (isEmpty()) {
        return null;
    }
    ArrayList<T> breadthList = new ArrayList<>();
    Queue<BinaryNode<T>> treeQueue = new LinkedList<>();
    BinaryNode<T> newNode = binaryTree.root;

    treeQueue.add(newNode);

    while(!treeQueue.isEmpty()){
        if(treeQueue.peek().getLeftNode() != null){
            treeQueue.add(treeQueue.peek().getLeftNode());
        }
        if(treeQueue.peek().getRightNode() != null){
            treeQueue.add(treeQueue.peek().getRightNode());
        }
        breadthList.add(treeQueue.remove().getData());
    }

    return breadthList;
}



    public boolean isEmpty(){
        return root == null;
    }

    @Override
    public String toString() {
        return "BinaryTreeClass{" +
                "root=" + root +
                '}';
    }
}
