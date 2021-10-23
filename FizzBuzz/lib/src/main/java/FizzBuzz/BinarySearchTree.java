package FizzBuzz;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T>{

    public void add(T data){

        if(isEmpty()) {
            root = new Node<>(data);

        }

        else{
            addHelper(data, root);
        }

    }



    public void addHelper(T data, Node<T> root){

        Node<T> newNode = new Node<>(data);
        if(data.compareTo(root.getData()) < 0){

            if(root.getLeft() == null){
                root.setLeft(newNode);

            }else {
                addHelper(data, root.getLeft());
            }

        }else if (data.compareTo(root.getData()) > 0){
            if(root.getRight() == null){
                root.setRight(newNode);

            }else {
                addHelper(data, root.getRight());
            }
        }

    }


    public boolean contains(T data){

        Node<T> newNode = root;

        while (newNode != null) {
            if(data.compareTo(newNode.getData()) < 0){
                newNode = newNode.getLeft();

            }else if (data.compareTo(newNode.getData()) > 0){
                newNode = newNode.getRight();
            }else {

                return true;
            }

        }

        return false;
    }


    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}