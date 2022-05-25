package classes.and.objects;

public class ClassesAndObjects {
    public static void main(String[] args) {

        //create a new object/instance of the class
        Dog myDog = new Dog();

        //set values
        myDog.name = "Sally";
        myDog.age = 12;
        myDog.breed = "Yorkshire Terrier";
        myDog.colour = "Brown";
        myDog.numberOfLegs = 4;
        myDog.bark();

        //retrieve values
        System.out.println("My dog's name is: " + myDog.name);

    }
}
