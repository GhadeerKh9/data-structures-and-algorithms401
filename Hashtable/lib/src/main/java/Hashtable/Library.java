/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Hashtable;

public class Library {
    public static void main(String[] args) {


//        HashTable<String, Integer> grades = new HashTable<>();

//        HashTable<String, Integer> grades = new HashTable<String, Integer>();
//
//        grades.add("Ahmad",90);
//        grades.add("Rana", 95);
//        grades.add("Mohammad", 80);
//        grades.add("Saja", 50);
//
//        System.out.println(grades.getSize());
//        System.out.println(grades.getValue("Rana"));
//
//        System.out.println(grades.getSize());
//        System.out.println(grades.contains("Ali"));
//
//        System.out.println(grades.contains("Saja"));
//
//
//
//        String paragraph3= "My name my age my gender";
//        System.out.println(grades.repeatedWord(paragraph3));
//
//


        HashTable<Integer, Integer> intersection = new HashTable<Integer, Integer>();

        BinaryTree tree1 = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();

        tree1.setRoot(new TreeNode(1));
        tree1.getRoot().setLeft(new TreeNode(2));
        tree1.getRoot().setRight(new TreeNode(3));
        tree1.getRoot().getRight().setLeft(new TreeNode(4));
        tree1.getRoot().getRight().setRight(new TreeNode(5));
        tree1.getRoot().getRight().getRight().setLeft(new TreeNode(6));
        tree1.getRoot().getRight().getRight().setRight(new TreeNode(7));
        tree1.getRoot().getLeft().setLeft(new TreeNode(8));


        tree2.setRoot(new TreeNode(0));
        tree2.getRoot().setLeft(new TreeNode(2));
        tree2.getRoot().setRight(new TreeNode(0));
        tree2.getRoot().getRight().setLeft(new TreeNode(4));
        tree2.getRoot().getRight().setRight(new TreeNode(5));
        tree2.getRoot().getRight().getRight().setLeft(new TreeNode(0));
        tree2.getRoot().getRight().getRight().setRight(new TreeNode(0));
        tree2.getRoot().getLeft().setLeft(new TreeNode(8));



        System.out.println(intersection.treeIntersection(tree1, tree2));

        System.out.println("================================");




    }

}
