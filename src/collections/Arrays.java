package collections;

import java.util.List;

public class Arrays {
    public static void main(String[] args) {

        //a collection of similar objects
        String[] cars = {"Tesla", "BMW", "Honda", "Kia"};
        System.out.println(cars[2]);

        //loop through an array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        //loop backwards
        for (int i = cars.length -1; i >= 0 ; i--) {
            System.out.println(cars[i]);
        }

        //modern way
        for(String car : cars){
            System.out.println(car);
        }
    }
}
