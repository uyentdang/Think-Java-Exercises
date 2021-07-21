import java.util.Scanner;

public class Note {
    public static void main (String[] args) {
        /*
        six relational operators: ==, !=, >, <, >=, <=
        the two sides of a relational operator have to be of the same

        //switch: pg 97
        switch(variable) {
            case option1 :
                do something;
                break;
                }
        Logical operators: && = and, || = or, ! = not
        "true || anything" is always true
        "false && anything" is always
        in.nextLine = returns entire line of input
        in.next() returns only the next token of input
         */
        Scanner in = new Scanner(System.in);
       System.out.print("Enter a number: ");
       if (!in.hasNextDouble()) {
           String word = in.next();
           String word1 = in.nextLine();
           System.err.println(word + " is not a number." + word1);
           return;

       }

    }
}
