import java.util.Random;
import java.util.Scanner;

public class Exercise {
    public static void main (String[] args) {
        //5-1
            /* int x;
        if(x > 0 && x < 10) {
            System.out.println("positive single digit number.");

        }

         */
        //5-2
            //guessingGame();
        // 5-3 FERMAT'S LAST theorem
            //Fermat(10,3,5, 7);
        //5-6
            //Quadratic.java
        //5-7
            //Triangle.java

    }
    public static void guessingGame() {
        Scanner game = new Scanner(System.in);
        Random random = new Random();
        int guess; int actual;
        System.out.println("Welcome to \"Guess my number.\"");
        System.out.println("Choose a number from 1 - 100, inclusive: ");
        guess = game.nextInt();
        actual = random.nextInt(101);
        while(actual != guess) {
            if (actual > guess) {
                System.out.println("Pick a larger number");
                guess = game.nextInt();
            } else if ( guess > actual) {
                System.out.println("Pick a smaller number");
                guess = game.nextInt();
            }
        }
    System.out.println("You've guessed correctly");
    }

    public static void Fermat(int a, int b, int c, int n) {
        boolean check = (a*n + b*n == c*n);
        if (check == true && (n > 2)) {
            System.out.println("Holy smokes, Fermat was wrong");
        } else {
            System.out.println("No, that doesn't work!");
        }

        }
    }


