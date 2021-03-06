/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Stacks;

import Stacks.structure.*;
import Stacks.structure.Queues;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class LibraryTest {

    @Test
    public void pushTest() {
        Stack nodeOne = new Stack();

        nodeOne.push("Ghadeer");

        assertEquals("Stack{top=Node{data='Ghadeer', next=null}}", nodeOne.toString());

    }


    @Test
    public void popTest() {
        Stack nodeOne = new Stack();

        nodeOne.push("Ghadeer");
        nodeOne.push("Gha");
        nodeOne.push("G");
        nodeOne.pop();

        assertEquals("Stack{top=Node{data='Gha', next=Node{data='Ghadeer', next=null}}}", nodeOne.toString());
//

    }

    //
    @Test
    public void peekTest() {
        Stack nodeOne = new Stack();

        nodeOne.push("Ghadeer");
        nodeOne.push("Gha");
        nodeOne.push("G");
        nodeOne.peek();

        assertEquals("G", nodeOne.peek());

    }

    @Test
    public void checkIsEmpty() {
        Stack nodeOne = new Stack();

        nodeOne.push("Ghadeer");
        nodeOne.push("Gha");
        nodeOne.push("G");
        nodeOne.pop();
        nodeOne.pop();
        nodeOne.pop();


    }

    //
//
//
    @Test
    public void enqueueTest() {
        Queues nodeTwo = new Queues();

        nodeTwo.enqueue("Ghadeer");
        nodeTwo.enqueue("Gha");
        nodeTwo.enqueue("G");

        assertEquals("Queues{front=Node{data='Ghadeer', next=Node{data='Gha', next=Node{data='G', next=null}}}, rear=Node{data='G', next=null}}", nodeTwo.toString());


    }

    //
//
    @Test
    public void dequeueTest() {
        Queues nodeTwo = new Queues();

        nodeTwo.enqueue("Ghadeer");
        nodeTwo.enqueue("Gha");
        nodeTwo.enqueue("G");
        nodeTwo.dequeue();

        assertEquals("Gha", nodeTwo.dequeue());


    }

    @Test
    public void peekQueueTest() {
        Queues nodeTwo = new Queues();

        nodeTwo.enqueue("Ghadeer");
        nodeTwo.enqueue("Gha");
        nodeTwo.enqueue("G");
        nodeTwo.peek();

        assertEquals("Ghadeer", nodeTwo.peek());


    }

    @Test
    public void queueIsEmptyTest() {
        Queues nodeTwo = new Queues();

        nodeTwo.enqueue("Ghadeer");
        nodeTwo.enqueue("Gha");
        nodeTwo.enqueue("G");
        nodeTwo.dequeue();
        nodeTwo.dequeue();
        nodeTwo.dequeue();

        assertTrue(nodeTwo.isEmpty());


    }

    @Test
    public void validateBracketsTest() {

        Brackets stack1 = new Brackets();


        assertTrue(stack1.bracketValidation("[]{}()"));
        assertFalse(stack1.bracketValidation("[{)}]"));
        assertFalse(stack1.bracketValidation("(]("));


    }

    @Test
    public void enqueueTestPsudo() {


        PseudoQueue queue = new PseudoQueue();

        queue.enqueue("Ghadeer");
        queue.enqueue("Khasawneh");

        assertEquals("stack1========>Stack{top=Node{data='Khasawneh', next=Node{data='Ghadeer', next=null}}}", queue.toString());
    }

    @Test
    public void dequeueTestPseudo() {

        PseudoQueue queue = new PseudoQueue();

        queue.enqueue("Ghadeer");
        queue.enqueue("Khasawneh");
        queue.dequeue();


        assertEquals("stack1========>Stack{top=Node{data='Khasawneh', next=Node{data='Ghadeer', next=null}}}", queue.toString());

    }

    @Test
    public void shelterTest() {

        AnimalShelter animalShelter = new AnimalShelter();

        Animal catAnimal = new Cat("Bibi");
        Cat cat1 = new Cat("Angora");


        Animal dogAnimal = new Dog("Bla");
        Dog dog2 = new Dog("Shephered");

        animalShelter.enqueue(catAnimal);
        animalShelter.enqueue(cat1);
        animalShelter.enqueue(dogAnimal);
        animalShelter.enqueue(dog2);
        assertEquals("AnimalShelter{catQueue=Queues{front=Node{data='Bibi', next=Node{data='Angora', next=null}}, rear=Node{data='Angora', next=null}}, dogQueue=Queues{front=Node{data='Bla', next=Node{data='Shephered', next=null}}, rear=Node{data='Shephered', next=null}}}", animalShelter.toString());





        animalShelter.dequeue("cat");
        assertEquals("AnimalShelter{catQueue=Queues{front=Node{data='Angora', next=null}, rear=Node{data='Angora', next=null}}, dogQueue=Queues{front=Node{data='Bla', next=Node{data='Shephered', next=null}}, rear=Node{data='Shephered', next=null}}}", animalShelter.toString());


        animalShelter.dequeue("dog");
        assertEquals("AnimalShelter{catQueue=Queues{front=Node{data='Angora', next=null}, rear=Node{data='Angora', next=null}}, dogQueue=Queues{front=Node{data='Shephered', next=null}, rear=Node{data='Shephered', next=null}}}", animalShelter.toString());

    }
}