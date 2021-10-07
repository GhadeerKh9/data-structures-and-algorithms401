package challenge10;

import challenge10.data.LinkedListNode;

public class Stack {

    private LinkedListNode top;


    public Stack() {

    }

    public void push(){
        if(isEmbty()){
            LinkedListNode node = new LinkedListNode(data);
            top = node;
        }else {

        }
    }

    public static boolean isEmbty() {
        if (top == null) {

        }
        return true;
    }

}