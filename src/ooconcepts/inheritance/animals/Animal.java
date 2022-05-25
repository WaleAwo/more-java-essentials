package ooconcepts.inheritance.animals;

public class Animal {
    String name;
    String colour;

    //constructor
    public Animal(String name, String colour){
        this.name = name;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void eat() {
        System.out.println("Munching...");
    }
}
