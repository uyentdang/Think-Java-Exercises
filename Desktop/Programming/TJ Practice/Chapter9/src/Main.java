

public class Main {
    public static void main (String[] args) {
    Pen blue = new Pen("yellow", "Bic");
    System.out.println("Before clicking: " + blue.Click);
    blue.ReadyToWrite(blue.Click);

    blue.isClick(blue.Click);
    System.out.println("After clicking: " + blue.Click);
    blue.ReadyToWrite(blue.Click);


    }
}
