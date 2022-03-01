package Linked.list.structure;

import Linked.list.data.LinkedListNode;

public class LinkedList {

    public LinkedListNode head;
    private int size;

    public LinkedList() {

    }



    public void insert(String data) {
        if (head == null) {
            LinkedListNode node = new LinkedListNode(data);
            head = node;
        } else {
            LinkedListNode newNode = new LinkedListNode(data);
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }



    public boolean include(String data) {
        if (head == null) {
            LinkedListNode node = new LinkedListNode(data);
            head = node;
        } else {
            LinkedListNode current = head;
            while (current != null) {
                if (current.getData() == data) {
                    return true;
                }
                current = current.getNext();
            }
        }
        return false;
    }





    public void append(String data) {

        if (head == null) {
            LinkedListNode node = new LinkedListNode(data);
            head = node;
            size++;
        } else {
            LinkedListNode current;
            current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            LinkedListNode node = new LinkedListNode(data);
            current.setNext(node);
            size++;
        }

    }

    public void insertBefore(String check, String data) {
        LinkedListNode node = new LinkedListNode(data);
        if (head == null) {
            head = node;
        } else if (check == head.getData()) {
            node.next = head;
            head = node;
        } else {
            LinkedListNode current = head;
            while (current.next.getData() != check) {
                current = current.next;

            }
            node.next = current.next;
            current.next = node;
        }
        size++;

    }

    public void insertAfter(String check , String data){
        LinkedListNode node = new LinkedListNode(data);
        if (head == null) {
            head = node;
        }else {
            LinkedListNode current = head;
            while (current.getData() != check) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
        size++;

    }


    public String valueFromEnd(int number) {
        if (head == null) {
            return "List is Empty";
        } else {

            int index = (size - number) ;

            LinkedListNode current;
            current = head;

            int counter = 0;

            while (counter != index) {
                current = current.getNext();
                counter++;
            }

            return current.getData();
        }
    }




    public LinkedList zippedList(LinkedList list1, LinkedList list2) {
        if(list1.head == null && list2.head == null) {
            System.out.println("Lists Are Empty");
        } else {
            LinkedListNode current1 = list1.head;
            LinkedListNode current2 = list2.head;
            LinkedListNode currentA, currentB;

            while (current1.getNext() != null && current2 != null) {

                currentA = current1.getNext();
                currentB = current2.getNext();
                current1.setNext(current2);
                current2.setNext(currentA);
                current1 = currentA;
                current2 = currentB;

                size++;

                if(current1.getNext() == null){
                    current1.setNext(current2);
                    break;
                }
            }
        }

        return list1;
    }




    public LinkedList reverseList(LinkedList list){


        LinkedListNode head1 = list.head;
        LinkedListNode head2 = list.head;
        LinkedListNode current = head1.getNext();
        LinkedListNode temp;

        while(current != null){

            temp = current;

            current = current.getNext();

            temp.setNext(head2);

            head1.setNext(null);

            head2 = temp;
        }

        list.head = head2;
        return list;


    }


    ////////////////////////////////////////////////

    public LinkedList reverseListMosh(LinkedList list){

      LinkedListNode current = head.getNext();
      LinkedListNode previous = head;


        LinkedListNode n;
    while (current != null){
        n = current.getNext();
        current.setNext(previous);
        previous = current;
        current = n;
    }


    list.head = previous;



   return list;
    }














    ///////////////////////////////////////////////////////////


    @Override
    public String toString() {
        String printing = "";
        if (head == null) {
            System.out.println("THE LIST IS EMPTY");
        } else {
            LinkedListNode current = head;
            while (current != null) {
                printing = printing + " { " + current.getData() + " } " + " ---> ";
                current = current.getNext();
            }
            printing = printing + " NULL ";
        }
        return printing;
    }
}
