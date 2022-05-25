package classes.and.objects;

public class Dog {

    static int dogCount = 0;

    //attribute (state)
    String name;
    int age;
    String breed;
    String colour;
    int numberOfLegs;

    public Dog(){
        dogCount++;
    }

    /*
    a constructor which sets an attribute for new objects
    public Dog(){ //no args constructor
        this.numberOfLegs = 4; //"this" keyword refers to the newly created object
    }
     */

    // a constructor with an arugument
    public Dog(int numberOfLegs){ //constructor that takes an argument
        this.numberOfLegs = numberOfLegs; //set the value
    }

    //actions (behaviour)
    public void bark(){
        System.out.println("Woof! My name is " + name);
    }

    //static method can only access static attributes
    static void printMetaDogInfo(){
        System.out.println("Total dogs: " + dogCount);
    }
}
