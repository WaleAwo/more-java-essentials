package ooconcepts.inheritance.animals;

public class Animal {
    private String name;
    private String colour;

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
