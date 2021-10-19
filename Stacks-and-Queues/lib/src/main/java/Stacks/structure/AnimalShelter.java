package Stacks.structure;

public class AnimalShelter {

    Queues cat = new Queues();

    Queues dog = new Queues();


    public void enqueue(Animal animal){

        if (animal instanceof Cat){
            cat.enqueue(animal.getPref());
        }else if(animal instanceof Dog){
            dog.enqueue(animal.getPref());
        }else{
            System.out.println("Neither a cat nor a dog!");
        }
    }

    public String dequeue(String pref){
        if(pref.equals("cat") && !cat.isEmpty()){
            return cat.dequeue();
        }else if (pref.equals("dog") && !dog.isEmpty()){
            return dog.dequeue();
        }else{
            return null;
        }
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "catQueue=" + cat +
                ", dogQueue=" + dog +
                '}';
    }
}
