package ooconcepts.inheritance.animals;

public class Cat extends Animal {

    String litterPreference;

    public Cat(String name, String colour, String litterPreference) {
        super(name, colour); //call the parent constrctor to set values
        this.litterPreference = litterPreference;
    }

    public String getLitterPreference() {
        return litterPreference;
    }

    public void setLitterPreference(String litterPreference) {
        this.litterPreference = litterPreference;
    }

    public void meow() {
        System.out.println("Meow!");
    }

    @Override
    public void eat() {
        super.eat(); //calls the super class eat method
        System.out.println("The cat is eating");
    }
}
