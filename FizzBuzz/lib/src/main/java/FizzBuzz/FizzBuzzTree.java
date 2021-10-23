package FizzBuzz;


public class FizzBuzzTree<T > extends BinaryTree<T>{


    public  BinaryTree<T> fizzBuzzTree(BinaryTree<T> tree) {
        fizzBuzz((Node<T>) tree.root);
        return tree;
    }

    private  void fizzBuzz(Node<T> root) {
        if (root == null) {
            return;
        }
        if (root.getLeft() != null) {
            fizzBuzz(root.getLeft());
        }
        if (root.getRight() != null) {
            fizzBuzz(root.getRight());
        }

        if ((int) root.getData() % 3 == 0) {
            if ((int) root.getData() % 5 == 0) {
               root.setData((T) "fizzbuzz");
            } else {
                root.setData((T) "fizz");
            }
        } else if ((int) root.getData() % 5 == 0) {
            root.setData((T) "buzz") ;
        }
    }

    @Override
    public String toString() {
        return "FizzBuzzTree{" +
                "root=" + root +
                '}';
    }
}

