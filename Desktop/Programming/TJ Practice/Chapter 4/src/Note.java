public class Note {
    /*
    program begins at the first statement of main, regardless of location
    statements are executed one at a time in order until you reach a method invocation
    Math is in java.lang pkg, no import needed
    Trig must be in radians
    Math.PI = pi
    INCREMENTAL DEVELOPMENT
    scaffolding
    stub
     */
    public static void main (String[] args) {
        long x = Math.round(Math.PI * 20);
    /* long ~ int but bigger. int = 32 bit, max 2^31 - 1 or 2 bil
        long uses 64 bits so the largest value is 2^63 - 1 or 9 quintillion
        Math.pow(base, exponent)
    */
        double radians = Math.toRadians(180.0);
        double degrees = Math.toDegrees(Math.PI);


    }
}
