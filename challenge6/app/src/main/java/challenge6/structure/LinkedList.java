package challenge6.structure;

import challenge6.data.LinkedListNode;

public class LinkedList {

    public LinkedListNode head;


    public LinkedList() {

    }

    public void append(String data) {

        if (head == null) {
            LinkedListNode node = new LinkedListNode(data);
            head = node;
        } else {
            LinkedListNode current;
            current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            LinkedListNode node = new LinkedListNode(data);
            current.setNext(node);
        }

    }


    public void print() {
        if (head == null) {
            System.out.println("LIST IS EMPTY");
        } else {
            LinkedListNode current;
            current = head;
            System.out.print("head------------->");
            while (current != null) {
                System.out.print(current.getData() + "-->");
                current = current.getNext();
            }
            System.out.println("Null");
        }

    }

    public void insertBefore(String data, String before) {
        LinkedListNode node = new LinkedListNode(before);
        if (head == null) {
            head = node;
        } else if (data == head.getData()) {
            node.next = head;
            head = node;
        } else {
            LinkedListNode current = head;
            while (current.next.getData() != data) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }

    }

    public void insertAfter(String data , String after){
        LinkedListNode node = new LinkedListNode(after);
        if (head == null) {
            head = node;
        }else {
            LinkedListNode current = head;
            while (current.getData() != data) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }

    }


    public static LinkedList zippedList(LinkedList list1, LinkedList list2){

        LinkedListNode current1 = list1.head;
        LinkedListNode current2 = list2.head;


        LinkedListNode currentA;
        LinkedListNode currentB;

        while(current1.getNext() !=null && current2.getNext() != null){

            currentA = current1.getNext();
            currentB = current2.getNext();

            current1.setNext(current2);
            current2.setNext(currentA);


        }

        return list1;

    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}

