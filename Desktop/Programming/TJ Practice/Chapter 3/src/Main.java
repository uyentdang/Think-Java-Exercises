import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System is a PrintSteam, defined in java.io
        //A package is a collection of related classes
        //I/O = input and output
        System.out.println(System.out);
        // system is defined in System.java & PrintStream is defined in PrintStream.java, part of java library
        // to use scanner, import java.util.Scanner; this tells comp that
        // when you refer to Scanner, you mean the one defined in java.util
        Scanner in = new Scanner(System.in);

        //the Scanner class provides a method called nextLine - keyboard input >> string
        String line;
        Scanner user = new Scanner(System.in);
        System.out.print("Type somethings: ");
        line = in.nextLine();
        System.out.println("You said: " + line);
        System.out.print("Type something else: ");
        line = in.nextLine();
        System.out.println("You also said: " + line);

        //System belongs to the java.lang class, which is fundamental and is auto-imported.
        // Pkg > Class > Method > Statement > Expression > Token (number, var names, operators, keywords, parentheses, braces, semicolon)
        int inch;
        double cm;
        final double CM_PER_INCH = 2.54; //constant, all upper case
        Scanner other = new Scanner(System.in);
        System.out.println("How many inches? ");
        inch = other.nextInt();
        cm = inch * CM_PER_INCH;
        System.out.println(inch + " in = "+ cm + " cm");

        //format string, start with %.3f = floating point, round to 3 dec
        // format string specifies how output should look like
        // table 3-1 pg 59
        System.out.printf("Four thirds = %.3f", 4.0/3.0); //separated by commas not +

    }
}