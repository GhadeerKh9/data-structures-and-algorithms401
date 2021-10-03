package src.data;

public class LinkedListNode {
    private String data;
    private LinkedListNode next;

    public LinkedListNode(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "LinkedListNode{" +
                "data='" + data + '\'' +
                '}';
    }
}
