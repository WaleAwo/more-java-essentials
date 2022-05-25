package ooconcepts.inheritance.animals;

public class Dog extends Animal {

    private int walkDistancePreference;

    public int getWalkDistancePreference() {
        return walkDistancePreference;
    }

    public void setWalkDistancePreference(int walkDistancePreference) {
        this.walkDistancePreference = walkDistancePreference;
    }

    public void bark() {
        System.out.println("Woof!");
    }

    //method override
    public void eat() {
        System.out.println("The Dog is muching");
    }

    //method overload
    public void eat(int numberOfBites) {
        System.out.println("The Dog is muching");
    }
}
