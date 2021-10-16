package trees.trees;

import org.checkerframework.checker.units.qual.C;
import trees.node.BinaryNode;

public class BinarySearchTree<T extends Comparable<T>>{


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

//    public boolean contains(T data){
//        BinaryNode<T> binaryNode1 = root;
//
//        while (binaryNode1 != null) {
//            if(data.compareTo(binaryNode1.getData()) > 0)
//                binaryNode1 = binaryNode1.getRightNode();
//            else if (data.compareTo(binaryNode1.getData()) < 0)
//                binaryNode1 = binaryNode1.getLeftNode();
//            else
//                return true;
//        }
//        return false;
//    }

    public boolean

    public boolean isEmpty(){
        return root == null;
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
