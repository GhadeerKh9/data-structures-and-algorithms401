package trees.node;

public class BinarySearchNode {

    private String data;

    private BinarySearchNode leftNode;
    private BinarySearchNode rightNode;

    public BinarySearchNode(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public BinarySearchNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinarySearchNode leftNode) {
        this.leftNode = leftNode;
    }

    public BinarySearchNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinarySearchNode rightNode) {
        this.rightNode = rightNode;
    }
}
