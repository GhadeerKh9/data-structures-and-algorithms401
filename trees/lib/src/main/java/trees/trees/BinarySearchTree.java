//package trees.trees;
//
//import trees.node.BinaryNode;
//
//public class BinarySearchTree<T> extends BinaryTreeClass{
//
//    public void add(T data){
//
//        if(isEmpty()) {
//            root = new BinaryNode<>(data);
//
//        }
//
//        else{
//            addHelper(data, root);
//        }
//
//    }
//
//    public void addHelper(T data, BinaryNode<T> root){
//
//        BinaryNode<T> newNode = new BinaryNode<>(data);
//        if(data.compareTo(root.getData()) < 0){
//
//            if(root.getLeftNode() == null){
//                root.setLeftNode(newNode);
//
//            }else {
//                addHelper(data, root.getLeftNode());
//            }
//
//        }else if (data.compareTo(root.getData()) > 0){
//            if(root.getRightNode() == null){
//                root.setRightNode(newNode);
//
//            }else {
//                addHelper(data, root.getRightNode());
//            }
//        }
//
//    }
//
//
//    public boolean contains(T data){
//
//        BinaryNode<T> newNode = root;
//
//        while (newNode != null) {
//            if(data.compareTo(newNode.getData()) < 0){
//                newNode = newNode.getLeftNode();
//
//            }else if (data.compareTo(newNode.getData()) > 0){
//                newNode = newNode.getRightNode();
//            }else {
//
//                return true;
//            }
//
//        }
//
//        return false;
//    }
//}
