package classes.and.objects;

public class Constructors {
    public static void main(String[] args) {

        /*
        special method used to create an object of a class.
        java has a default constructor for each new class
         */

        Dog myDog = new Dog();
        Dog myDog2 = new Dog(3);
        System.out.println("myDog legs is: " + myDog.numberOfLegs);
        System.out.println("myDog2 legs is: " + myDog2.numberOfLegs);
    }
}
