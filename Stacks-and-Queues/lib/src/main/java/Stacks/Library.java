/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Stacks;

import Stacks.structure.Queues;
import Stacks.structure.Stack;

public class Library {
    public static void main(String[] args) {
        Stack nodeOne = new Stack();

        nodeOne.push("Ghadeer");
        nodeOne.push("Gha");
        nodeOne.push("G");


//        System.out.println(nodeOne);

//        nodeOne.pop();
//        System.out.println(nodeOne);
//
//        System.out.println(nodeOne.peek());




        Queues nodeTwo = new Queues();

        nodeTwo.enqueue("Ghadeer");
        nodeTwo.enqueue("Gha");
        nodeTwo.enqueue("G");

        nodeTwo.peek();



        System.out.println(nodeTwo.peek());

//        nodeOne.pop();
//        System.out.println(nodeOne);
//
//        System.out.println(nodeOne.peek());



    }
}
