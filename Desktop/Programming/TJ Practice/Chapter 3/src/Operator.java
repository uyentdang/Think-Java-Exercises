import java.util.*;
import java.lang.*;
public class Operator {
    public static void main(String[] args) {

        final double CM_PER_INCH = 2.54;
        //inch = cm/ CM_PER_INCH; //syntax error "possible lossy conversion from double to int
        //type case: put the name of the type in parentheses and use it as operator
        double pi = 3.14159;
        int x = (int) pi; // 3, casting to int = throwing away the fractional part
        //type cast takes precedence over arithmetic operations
        double y = (int) pi * 20.0; //60 not 62
        System.out.println(y);
        System.out.println("put an integer value: ");
        double input; double output;
        Scanner User1 = new Scanner(System.in);
        input = User1.nextInt(); //use the name of the scanner
        output = input * (int) pi;
        System.out.printf("The result is: %.3f\n", output);

        /* The Scanner Bug */
        int age; String name;
        System.out.println("What is your age? ");
        age = User1.nextInt();
        User1.nextLine();
        System.out.print("What is your name? ");
        name = User1.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);






    }
}
