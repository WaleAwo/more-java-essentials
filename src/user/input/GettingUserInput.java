package user.input;

import java.util.Scanner;

public class GettingUserInput {

    public static void main(String[] args) {
        String name;
        int age;
        float shoeSize;

        //create an input variable
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your name:");
        name = userInput.nextLine();

        System.out.println("Enter your age:");
        age = userInput.nextInt();

        System.out.println("Enter your shoe size:");
        shoeSize = userInput.nextFloat();

        System.out.println("Hello " + name);
        System.out.println("Age: " + age);
        System.out.println("Shoe size: " + shoeSize);

        System.out.println("Your name is " + name + " your age is " + age + " and your shoe size is " + shoeSize);
    }
}
