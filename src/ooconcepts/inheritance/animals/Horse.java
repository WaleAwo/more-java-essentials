package ooconcepts.inheritance.animals;

public class Horse extends Animal {

    private int shoeSize;

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public void neigh() {
        System.out.println("Neigh!");
    }
}
