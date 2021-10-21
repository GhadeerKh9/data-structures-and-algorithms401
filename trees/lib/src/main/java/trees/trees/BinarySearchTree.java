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




    @Override
    public String toString() {
        return "BinaryTreeClass{" +
                "root=" + root +
                '}';
    }





}
