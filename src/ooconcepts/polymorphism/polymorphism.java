package ooconcepts.polymorphism;

import ooconcepts.inheritance.animals.Dog;

public class polymorphism {
    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.eat(); //override
        myDog.eat(2); //overload

    }
}
