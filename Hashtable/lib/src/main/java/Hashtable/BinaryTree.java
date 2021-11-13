package Hashtable;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T extends Comparable<T>>{
    TreeNode root;

    public BinaryTree() {
        root = null;
    }

    List<Integer> postOrderList = new ArrayList<>(); // FOR TEST
    List<Integer> inOrderList = new ArrayList<>();  // FOR TEST
    List<Integer> preOrderList = new ArrayList<>(); // FOR TEST


    public void postOrder(TreeNode treeNode){

        if(treeNode == null){
            return;
        }

        // recur left
        postOrder(treeNode.getLeft());

        // recur right
        postOrder(treeNode.getRight());

        //  print the value
        System.out.print(treeNode.getKey() + " ");
        postOrderList.add(treeNode.getKey());
    }

    public void inOrder(TreeNode treeNode){

        if(treeNode == null){
            return;
        }

        inOrder(treeNode.getLeft());

        System.out.print(treeNode.getKey()+" ");
        inOrderList.add(treeNode.getKey());

        inOrder(treeNode.getRight());

    }

    public void preOrder(TreeNode treeNode){

        if(treeNode == null){
            return;
        }

        System.out.print(treeNode.getKey() + " ");
        preOrderList.add(treeNode.getKey());

        preOrder(treeNode.getLeft());

        preOrder(treeNode.getRight());
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }





    @Override
    public String toString() {

        if(root == null){
            return "BinaryTree{ " +
                    " root = " + root + " }";

        }else if(root != null && root.getLeft() == null && root.getRight() == null){

            return "BinaryTree{ " +
                    " root = " + root.getKey() +
                    " left = " + null+
                    " right = " + null+
                    " }";

        }else if(root != null && root.getLeft() != null && root.getRight() == null){
            return "BinaryTree{ " +
                    " root = " + root.getKey() +
                    " left = " + root.getLeft().getKey()+
                    " right = " + null+
                    " }";

        }else if(root != null && root.getLeft() == null && root.getRight() != null){
            return "BinaryTree{ " +
                    " root = " + root.getKey() +
                    " left = " + null+
                    " right = " + root.getRight().getKey()+
                    " }";
        }else{
            return "BinaryTree{ " +
                    " root = " + root.getKey() +
                    " left = " + root.getLeft().getKey()+
                    " right = " + root.getRight().getKey()+
                    " }";
        }

    }
}