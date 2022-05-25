package conditional.logic;

public class LogicalOperators {
    public static void main(String[] args) {

        int age1 = 22;
        int age2 = 16;

        if(age1 >= 17 || age2 >= 17){ //OR
            System.out.println("This group can go to the movie");
        }
        else {
            System.out.println("This group cannot go to the movie");
        }

        if(age1 >= 21 && age2 >= 21){ //AND
            System.out.println("This group can go to the bar");
        }
        else {
            System.out.println("This group cannot go to the bar");
        }

        if(!(age1 < 18)) { //NOT
            System.out.println("This person can vote");
        }
        else {
            System.out.println("This person cannot vote");
        }

        if(age1 == 18) { //EQUALS
            System.out.println("This person is 18");
        }
        else {
            System.out.println("This person is not 18");
        }

        if(age1 != 18) { //NOT EQUALS
            System.out.println("This person is not 18");
        }
        else {
            System.out.println("This person is 18");
        }

    }
}
