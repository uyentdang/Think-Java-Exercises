public class P9_1 {

    /*
    Create a new program named and write a method that contains expressions
    that combine various types using the operator. For example, what happens
    when you “add” a String and a char. Does it perform character addition
    or string concatenation? What is the type of the result?
     */
    public static void main(String[] args) {

    }

    public void EmptyInt(){
    String empty = "";
    int five = 5;
    System.out.println(empty + five); // it ignores the empty
    System.out.println(five);
    }

    public void CharIssue(){
        char problem = 'c';
        for (int i = 0; i < 5; i++) {
            problem++;
            System.out.println(problem); //yielding d e f g h
        }
    }
    public void intDoubleChar(){
        int a = 1;
        double b = 0;
        char d = 'B'; //the ASCII of 'B' is 66
        System.out.println(a + b + d); // this yields 67.
    }
    public void String() {
        String a = "Hello";
        char b = 'A';
        System.out.println(a + b); // this works and it prints to console

        String c = a + b; // this also works even though i just concat string + char. Result type is String
        System.out.println(c);

        //Using StringBuilder:
        StringBuilder d = new StringBuilder();
        d.append(a).append(b);
        System.out.println(d);
    }

    public void BoooLean() {
        boolean test1 = true;
        boolean test2 = false;
        //System.out.println(test1 + test2); *this doesn't work
        //boolean test3 = test1 + test2; *this also doesn't work
        Boolean newTest1 = Boolean.valueOf(test1);
        Boolean newTest2 = Boolean.valueOf(test2);
        // System.out.println(newTest1 + newTest2); *nope not working
        String Test1 = Boolean.toString(newTest1); //this can convert both boolean and Boolean to String

    }

}