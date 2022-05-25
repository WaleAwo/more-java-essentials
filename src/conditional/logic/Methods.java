package conditional.logic;

public class Methods {
    public static void main(String[] args) {

        int total;

        total = add(23, 23);
        System.out.println(total);
        hi();
    }

    //method that returns a value
    private static int add(int num, int num2) {
        return num + num2;
    }

    //method that doesn't return a value
    private static void hi(){
        System.out.println("Hi");
    }
}
