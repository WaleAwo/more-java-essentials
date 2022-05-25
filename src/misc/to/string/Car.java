package misc.to.string;

import java.util.Objects;

public class Car {

    private String make;
    private String model;
    private String color;
    private int numberOfWheels;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void startCar() {
        System.out.println("The car has started");
    }

    public void stopCar() {
        System.out.println("The car has stopped");
    }

    //converts hexidecimal memory to string value based on
    public String toString() {
        return "Make: " + this.make + " Model: " + this.model;
    }
}
