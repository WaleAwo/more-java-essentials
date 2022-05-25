package classes.and.objects;

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
        if (numberOfWheels != 4) {
            System.out.println("Number of wheels is not allowed!");
        } else {
            this.numberOfWheels = numberOfWheels;
        }
    }

   public void startCar() {
        System.out.println("The car has started");
    }

   public void stopCar() {
        System.out.println("The car has stopped");
    }
}
