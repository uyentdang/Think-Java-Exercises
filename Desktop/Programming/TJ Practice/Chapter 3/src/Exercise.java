import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        //3-1
        int check;
        check = 5;
       // System.out.printf("Check this out: %f", check);
            //this throws exception, it prints the first line but cannot print the number000000
        System.out.printf("Check this out: %f \n", (float)check); //5.
        //System.out.printf("Ask 2 give 1: %s, %int", check);
            //also problematic

        //3-2 CONVERT FROM CELSIUS TO FAHRENHEIT
        double input; double Fah;

        Scanner user = new Scanner(System.in);
        /*
        System.out.println("Enter a temperature in Celsius: ");
        input = user.nextDouble();

        Fah = (input * (double) 9/5) + (double)32;
        System.out.printf("%.1f C = %.1f F", input, Fah);

         */

        //3-3 CONVERT SECONDS TO HOURS, MINUTES AND SECONDS

        System.out.println("Enter a number of seconds: ");
         int userinput; int sec; int hour; int minute; int ver ;
         userinput = user.nextInt();
         hour = userinput/3600;
         minute = (userinput - (hour*3600))/60;
         sec = userinput - (hour*3600) - (minute*60);
         ver = (hour*3600) + (minute*60) + sec;
         System.out.printf("%d seconds = %d hour, %d minutes, %d seconds.\n", userinput, hour, minute, sec);

         System.out.printf("Check work: %d seconds = (%d hours * 3600 secs/hr) + (%d minutes * 60 secs/min) + %d seconds. \n", userinput, hour, minute, sec, ver);

        //3-4 GUESS MY NUMBER GAME
        int guess; int actual; int diff;
        System.out.println("I am thinking of a number between [1, 100]. Can you guess what it is?");
        System.out.println("Type a number: ");
        guess = user.nextInt();
        // pick a random number
        Random random = new Random();
        actual = random.nextInt(101);
        diff = Math.abs(actual - guess);
        System.out.printf("Your guess is: %d. The number I was thinking of is: %d; you were off by: %d", guess, actual, diff);







}
}
