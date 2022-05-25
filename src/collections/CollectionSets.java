package collections;

import java.util.*;
import java.util.Arrays;

public class CollectionSets {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        //add
        names.add("Mark");
        names.add("Jerry");
        names.add("Lisa");

        //remove
        names.remove("Jerry");

        System.out.println(names);

        //convert set to array
        String[] namesArray = names.toArray(new String[0]);

        //convert array to set
        String[] cars = {"Tesla", "BMW", "Honda", "Kia"};
        Set<String> carsSet = new HashSet<>(Arrays.asList(cars));


    }
}
