package ro.unibuc.polymotphism.overloading;

public class Printer {

    public void print(String value) {
        System.out.println("Printing String: " + value);
    }

    /*
     * public String print(String value) {
     *
     * }
     */

    public void print(Integer value) {
        System.out.println("Printing Integer: " + value);
    }

    public void print(String value, Boolean flag) {
        System.out.println("Printing String: " + value + " Where flag is: " + flag);
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Value");
        printer.print(335);
        printer.print("Value", false);
    }

}
