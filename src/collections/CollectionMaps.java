package collections;

import java.util.HashMap;
import java.util.Map;

public class CollectionMaps {
    public static void main(String[] args) {

        Map<Integer, String> employees = new HashMap<>();

        //add
        employees.put(01, "Jack");
        employees.put(02, "Claire");
        employees.put(03, "Henry");

        //retrieve
        employees.get(01);

        //methods
        employees.containsValue("Lisa");
        employees.replace(02, "May");
        employees.put(04, "April");

        //remove
        employees.remove(2);

        //loop through all keys
        for (Integer employeeId: employees.keySet()){
            System.out.println(employeeId);
        }

        //loop through all values
        for (String employeeNames: employees.values()){
            System.out.println(employeeNames);
        }

        //loop through map for a key based on a value
        for (Integer employeeId: employees.keySet()){
            if("April".equals(employees.get(employeeId))){
                System.out.println("Kramer's employee ID is " + employeeId);
            }
        }

        System.out.println(employees);
//        System.out.println(employees.get(01));
    }
}
