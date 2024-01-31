package ObjectOrientedDesign.Classes.Polymorphism;

import java.util.ArrayList;

public class PolymorphismExample {

}

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class Alien {
    public void animalSound() {
        System.out.println("The Alien says: #$$!)@($&$%&&)(!#");
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>();
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object

        Pig my2Pig = new Pig();  // Create a Pig object notice of class Pig
        Dog my2Dog = new Dog();  // Create a Dog object notice of class Dog
        Alien alien = new Alien();  // Create a Dog object

        /*
         Class Animal using polymorphic references
         myAnimal.animalSound();
         myPig.animalSound();
         myDog.animalSound();
        */

        list.add(myAnimal);
        list.add(myPig);
        list.add(myDog);
        list.add(my2Pig); // Because the child class extend the Animal base class they are also of type Animal
        list.add(my2Dog);
       //  list.add(alien); This wont work because it Required type: Animal but Provided: Alien
        list.forEach(Animal::animalSound);
    }
}
