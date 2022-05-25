package user.input;

import java.util.Scanner;

public class HeightCalculator {

    public static void main(String[] args) {
        int foot;
        int inches;
        int height;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your height in feet:");
        foot = userInput.nextInt();

        System.out.println("Enter your height in inches");
        inches = userInput.nextInt();

        height = foot * 12 + inches;

        System.out.println("Your height is " + height + "\" inches");
    }

}
