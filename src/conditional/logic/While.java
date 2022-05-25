package conditional.logic;

public class While {
    public static void main(String[] args) {

        int counter = 0;

        while (counter < 10){ //condition will loop while the statement is true
            System.out.println("Hello");
            if (counter == 5){
                break; //loop will stop when the condition is met
            }
            counter++;
        }

        //a do while loop will run at least once
    }
}
