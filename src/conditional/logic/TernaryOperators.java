package conditional.logic;

public class TernaryOperators {

    public static void main(String[] args) {

        //commonly used for null checks and a replacemnt for IfElse conditions

        //variable = condition ? someValue : someOtherValue;

        /*
        Cat myCat - null;
        int myCatsAge;

        myCatsAge = myCat != null ? myCat.getAge() : 0;
         */

        //compare 2 numbers max values
        int a = 11;
        int b = 13;

        int max = a > b ? a : b;
        System.out.println(max);

    }
}
