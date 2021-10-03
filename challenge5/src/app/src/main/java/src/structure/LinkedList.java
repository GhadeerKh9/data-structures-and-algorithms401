package src.structure;

import src.data.LinkedListNode;

public class LinkedList {

    LinkedListNode head;
    int counter;

    public LinkedList() {

    }

    public void add(String data) {

        if(head == null){
            LinkedListNode node = new LinkedListNode(data);
            head= node;
        }else{
            LinkedListNode current;
            current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            LinkedListNode node = new LinkedListNode(data);
            current.setNext(node);
        }

    }

    public void print(){
        if(head == null){
            System.out.println("LIST IS EMPTY");
        }else{
            LinkedListNode current;
            current = head;

            while(current != null){
                System.out.println(current + "-->");
                current = current.getNext();
            }
            System.out.println("Null");
        }

    }

    public String remove(int x){
        if(head == null){
            System.out.println("LIST IS EMPTY");
        }else{
            LinkedListNode current;
            current = head;

            while(current.getNext() != x){
               counter++;
                current = current.getNext();
            }
            System.out.println("Null");
        }
        return "";

    }




}
