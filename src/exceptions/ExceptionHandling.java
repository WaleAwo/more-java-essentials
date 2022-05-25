package exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {

        try {
            printInt2("dfg"); //catch the erro where the method is being called
        } catch (NumberFormatException | NullPointerException e) { //catch multiple exceptions
            System.out.println("Caught error");
        }
        finally {
            System.out.println("This code will always run");
        }

        System.out.println("End of program");
    }

    public static void printInt(String numberString) {
        try {
            int myInt = Integer.parseInt("fire"); //converts string to int
            System.out.println(myInt);

        } catch (Exception nfe) { //use generic exception class to catch all exceptions
            System.out.println("Caught a number exception");
            nfe.printStackTrace();//get more info about the error
        }
    }

    public static void printInt2(String numberString) {
        int myInt2 = Integer.parseInt("fire");
        System.out.println(myInt2);
    }
}