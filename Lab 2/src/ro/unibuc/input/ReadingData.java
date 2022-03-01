package ro.unibuc.input;

import java.util.Scanner;

public class ReadingData {

    public static void main(String[] args) {
//        - Using Scanner Class
//        - Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Provide a number: ");
        int intInput = scanner.nextInt();

//        If the value provided is not a number:
//        Exception in thread "main" java.util.InputMismatchException
//        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
//        at java.base/java.util.Scanner.next(Scanner.java:1594)
//        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
//        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
//        at ro.unibuc.input.ReadingData.main(ReadingData.java:13)

        System.out.println("Integer value: " + intInput);


//                - nextDouble
        System.out.print("Provide a floating point number: ");
        double doubleInput = scanner.nextDouble();

        System.out.println("Double value: " + doubleInput);

//        System.out.print("Provide information: ");
//        String lineValue = scanner.nextLine();
//        System.out.println("Inputted information: " + lineValue);

//                - next
        System.out.print("Provide a value: ");
        String value = scanner.next();

        // Validate input and transform to number or whatever is needed
        System.out.println("Input value: " + value);

//                - nextLine
        System.out.println("Rest of line: " + scanner.nextLine());

    }

}
