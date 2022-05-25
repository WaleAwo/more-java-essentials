package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionLists {
    public static void main(String[] args) {

        //declare the type of list
        List<String> names = new ArrayList<>();

        //add item
        names.add("John");
        names.add("Mark");
        names.add("Lee");
        names.add("Lisa");
        names.add(1, "Kevin");

        //remove item
        names.remove(2);

        //replace
        names.set(0, "Kate");

        //get size
        System.out.println(names.size());

        //contains
        names.contains("Lise");

        //helper methods
        Collections.sort(names);
        Collections.reverse(names);

        System.out.println(names.get(2));
        System.out.println(names);

        //convert list to array
        String[] namesArray = names.toArray(new String[0]);

        //convert array to list - fixed
        String[] cars = {"Tesla", "BMW", "Honda", "Kia"};
        List<String> carsList = Arrays.asList(cars);

        //covert array to list - flexible
        List<String> carsList2 = new ArrayList<>(Arrays.asList(cars));
    }
}
