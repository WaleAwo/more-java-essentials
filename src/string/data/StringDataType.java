package string.data;

public class StringDataType {

    public static void main(String[] args) {
        String firstName = "John";
        String quote = "John \"Lee\" Pak";
        String lastName = "Pak";
        String fullName = (firstName + " " + lastName);

        System.out.println(fullName);

        //the string class has many in-built methods
        System.out.println(firstName.length());
        System.out.println(fullName.toLowerCase());
    }
}
