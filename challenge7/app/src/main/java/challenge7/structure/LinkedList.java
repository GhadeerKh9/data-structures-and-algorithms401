package challenge7.structure;


import challenge7.data.LinkedListNode;

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

    public LinkedList zipLists(LinkedList list1, LinkedList list2){
        if(list1.head == null && list2.head == null){
            System.out.println("EMPTY");
            return null;
        }
        else if (list1.head == null) {
            return list2;
        } else if (list2.head == null) {
            return list1;
        } else {
            LinkedListNode current1 = list1.head;
            LinkedListNode current2 = list2.head;
            LinkedListNode currentA, currentB;
            while (current1.getNext() != null && current2 != null) {

                currentA=current1.getNext();
                currentB= current2.getNext();
                current1.setNext(current2);
                current2.setNext(currentA);
                current1=currentA;


                current2=currentB;

                if(current1.getNext() == null){
                    current1.setNext(current2);
                    break;
                }
            }
        }

        return list1;
    }

//    public String kthFromEnd(int index) {
//
//        LinkedListNode current = head;
//        if (head == null) {
//            System.out.println("The list is empty");
//        }
//        if (index > getSize() - 1 || index < 0) {
//            return "Exception";
//        }
//        int i = 0;
//        while (i < (getSize() - index - 1)) {
//            current = current.getNext();
//            i++;
//        }
//        return current.getData();
//    }


    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}