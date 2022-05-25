package ooconcepts.inheritance;

import ooconcepts.inheritance.animals.Animal;
import ooconcepts.inheritance.animals.Cat;
import ooconcepts.inheritance.animals.Dog;
import ooconcepts.inheritance.animals.Horse;

public class InheritanceExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.eat();

        Dog myDog = new Dog();
        myDog.setName("Larry");
        myDog.eat();

        Cat myCat = new Cat();
        myCat.setName("Lilly");
        myCat.meow();

        Horse myHorse = new Horse();
        myHorse.setName("Liam");
        myHorse.setShoeSize(3);
    }
}
