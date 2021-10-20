package trees.trees;

import trees.node.BinaryNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BinarySearchTree<T extends Comparable<T>> extends BinaryTreeClass<T>{

    public void add(T data){

        if(isEmpty()) {
            root = new BinaryNode<>(data);

        }

        else{
            addHelper(data, root);
        }

    }



    public void addHelper(T data, BinaryNode<T> root){

        BinaryNode<T> newNode = new BinaryNode<>(data);
        if(data.compareTo(root.getData()) < 0){

            if(root.getLeftNode() == null){
                root.setLeftNode(newNode);

            }else {
                addHelper(data, root.getLeftNode());
            }

        }else if (data.compareTo(root.getData()) > 0){
            if(root.getRightNode() == null){
                root.setRightNode(newNode);

            }else {
                addHelper(data, root.getRightNode());
            }
        }

    }


    public boolean contains(T data){

        BinaryNode<T> newNode = root;

        while (newNode != null) {
            if(data.compareTo(newNode.getData()) < 0){
                newNode = newNode.getLeftNode();

            }else if (data.compareTo(newNode.getData()) > 0){
                newNode = newNode.getRightNode();
            }else {

                return true;
            }

        }

        return false;
    }


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


    @Override
    public String toString() {
        return "BinaryTreeClass{" +
                "root=" + root +
                '}';
    }





}
