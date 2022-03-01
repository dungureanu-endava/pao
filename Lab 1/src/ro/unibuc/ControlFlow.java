package ro.unibuc;

import java.util.Arrays;

public class ControlFlow {


    public static void main(String[] args) {
//
//    - The if-then Statement
//  if (expression) {
//        statement(s)
//    }
//
        boolean isRunning = true;
        if (isRunning) {
            System.out.println("Program is running");
        }

        int[] firstArray = {1, 2, 3};
        int[] secondArray = {1, 3};
        if (Arrays.equals(firstArray, secondArray)) {
            System.out.println("They are equal");
        }

        if (!Arrays.equals(firstArray, secondArray)) {
            System.out.println("They are not equal");
        }

//
//- The if-then-else Statement
//  if (expression) {
//        true statement(s)
//    } else {
//        false statement(s)
//    }

        int firstNumber = 1235;
        int secondNumber = 3253;
        if (firstNumber > secondNumber) {
            System.out.println("First number is greater than second number");
        } else {
            System.out.println("First number is lesser than second number");
        }

        secondNumber = 1235;
        if (firstNumber > secondNumber) {
            System.out.println("First number is greater than second number");
        } else if(firstNumber == secondNumber) {
            System.out.println("First number is equal to second number");
        } else {
            System.out.println("First number is lesser than second number");
        }

//
//- The switch Statement
//

        int grade = 8;

        switch (grade) {
            case 1:
            case 2:
            case 3:
                System.out.println("Sad face!");
                break;

            case 4:
            case 5:
            case 6:
                System.out.println("It happens!");
                break;

//            case 7:
//            case 8:
            case 10:
                System.out.println("Party time!");
                break;

            default:
                System.out.println("Default party");
        }


        String name = "Jon";
        String prefix = "";

        switch (name) {
            case "Jon":
            case "Jonny":
//                System.out.println("Mr. " + name);
                prefix = "Mr. ";
                break;
            case "Don":
//                System.out.println("Dr. " + name);
                prefix = "Dr. ";
                break;

            case "Con":
//                System.out.println("Mrs. " + name);
                prefix = "Mrs. ";
                break;
        }

        System.out.println(prefix + name);


//
//- The while Statements
//  while (expression) {
//        statement(s)
//    }
//
        int startNumber = 3;
        while (startNumber < 3) {
            startNumber++;

            System.out.println("Current value " + startNumber);
        }


//- The do-while Statements
//  do {
//        statement(s)
//    } while (expression);
        startNumber = 3;
        do {
            startNumber++;

            System.out.println("Current value " + startNumber);
        } while (startNumber < 3);



        //- The for Statement
//  for (initialization; termination; increment) {
//        statement(s)
//    }
//        for (int index = 0; index < 10; index++) {
        for (int index = 0; index < 10; index = index + 2) {
            System.out.println("Index value: " + index);
        }


        int[] newArray = {1, 2, 3, 4, 5};
        for (int index = 0; index < newArray.length; index++) {
            System.out.println("Element at " + index + " : " + newArray[index]);
        }

        int index = 10;
        for (; index < 20; ) {
            System.out.println("Index value: " + index);
            index = index + 10;
        }

        for (int element : newArray) {
            System.out.println("Array value: " + element);
        }

//
//- The break Statement
//   - Besides a switch, the statement can terminate a for, while or do-while loop
//

        for (int newIndex = 0; newIndex < 10; newIndex++) {
            System.out.println("Index values:  " + newIndex);
            if (newIndex == 6) {
                break;
            }
        }

        int newNumber = 1;
        while (newNumber < 3) {
            newNumber++;

            System.out.println("Current value for break " + newNumber);


            if (newNumber == 2) {
                break;
            }
        }

//- The continue Statement
//   - The statement skips the current iteration of a for, while or do-while loop
        while (newNumber < 10) {
            newNumber++;

            if (newNumber % 2 == 0) {
                continue;
            }

            System.out.println("Current value for continue " + newNumber);
        }

//- The return Statement
//   - The statement exits from the current method and returns to where the method was invoked.
//   - The return statement has two forms: one that returns a value, and one that doesn't. To return a value, simply put the value (or an expression that calculates the value) after the return keyword.
//
        System.out.println("Which number is greater? " + compareNumbers(100, 200));

        if (true) {
            return;
        }

        System.out.println("Will never reach!");

    }

    public static boolean compareNumbers(int firstNumber, int secondNumber) {
        boolean comparison = firstNumber > secondNumber;

//        return; -- will not compile
        return comparison;
    }

}
