package classes.and.objects;

public class StaticExample {
    public static void main(String[] args) {
        //static attributes & methods can only be used on the class level.

        Dog myDog = new Dog();
        Dog yourDog = new Dog();

        System.out.println("Total dogs: " + Dog.dogCount); //static attribute used on the class
        Dog.printMetaDogInfo(); //static method used on the class
    }
}
