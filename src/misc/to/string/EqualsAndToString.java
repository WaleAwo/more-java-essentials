package misc.to.string;

public class EqualsAndToString {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.setMake("BWM");

        Car yourCar = new Car();
        yourCar.setMake("BMW");

        if (myCar.equals(yourCar)){
            System.out.println("They are equal");
        }else {
            System.out.println("They are not equal");
        }

        System.out.println(myCar);
    }
}
