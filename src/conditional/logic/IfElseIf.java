package conditional.logic;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        int age;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your age: ");
        age = userInput.nextInt();

        if (age < 18){ //conditions are either true or false
            System.out.println("You cannot smoke");
        }
        else if (age < 21){
            System.out.println("You can smoke, but cannot drink");
        }
        else if (age < 40){
            System.out.println("You can smoke and drink");
        }
        else { //catch-all
            System.out.println("You are old");
        }
    }
}
