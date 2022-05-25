package ooconcepts.inheritance.animals;

public class Cat extends Animal {

    private String litterPreference;

    public String getLitterPreference() {
        return litterPreference;
    }

    public void setLitterPreference(String litterPreference) {
        this.litterPreference = litterPreference;
    }

    public void meow() {
        System.out.println("Meow!");
    }

}
