package trees.trees;

import org.checkerframework.checker.units.qual.C;
import trees.node.BinaryNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeClass<T extends Comparable<T>>{


    private BinaryNode<T> root;


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


    


    public void inorderTraversal(){

        if (isEmpty()) {
            return;
        }

        traverseInorder(root);
    }

    public void traverseInorder(BinaryNode<T> root){
        if(root.getLeftNode() != null){
            traverseInorder(root.getLeftNode());

            System.out.println(root.getData() + "--->");
        }

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
