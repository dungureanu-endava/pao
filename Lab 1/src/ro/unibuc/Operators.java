package ro.unibuc;

public class Operators {

    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 37;

//   The Arithmetic Operators
//   +	Additive operator
        System.out.println(secondNumber + firstNumber); // 47

//   -	Subtraction operator
        System.out.println(secondNumber - firstNumber); // 27

//   *	Multiplication operator
        System.out.println(secondNumber * firstNumber); // 370

//   /	Division operator
        System.out.println(secondNumber / firstNumber); // 3

//   %	Remainder operator
        System.out.println(secondNumber % firstNumber); // 7

//   -  The Unary Operators (require only one operand)
        int unary = 10;

//   +	Unary plus operator; indicates positive value
        System.out.println(+unary);

//   -	Unary minus operator; negates an expression
        System.out.println(-unary);

//   ++	Increment operator; increments a value by 1
        System.out.println(++unary); // 11 - First the value is incremented and after, it is sent to System.out.println

        System.out.println(unary); // 11
//   --	Decrement operator; decrements a value by 1
        System.out.println(unary--); // 11 - First the value is sent to System.out.println, after it is decremented

        System.out.println(unary); // 10

        System.out.println(--unary); // 9 - First the value is decremented and after, it is sent to System.out.println

        System.out.println(unary); // 9

//   !	Logical complement operator; inverts the value of a boolean
        boolean logical = true;
        System.out.println(!logical);


//
//- The Equality and Relational Operators
//   ==	Equal to
        System.out.println("Is equal? " + (10 == 10));
//   !=	Not equal to

        boolean notEqual = secondNumber != firstNumber;
        System.out.println("Is not equal? " + notEqual);

//   >	Greater than
        System.out.println("Greater than? " + (firstNumber > secondNumber));
//        System.out.println("Greater than? " + firstNumber > secondNumber);

//   >=	Greater than or equal to
        System.out.println("Greater than or equals? " + (firstNumber >= secondNumber));

//   <	Less than
        System.out.println("Lesser than? " + (100 < 100));

//   <=	Less than or equal to
        System.out.println("Lesser than or equals? " + (100 <= 100));

//
//- Conditional Operators
        System.out.println("Conditional Operators");

        boolean trueBoolean = true;
        boolean falseBoolean = false;

//   &&	Conditional AND
        System.out.println("Conditional AND - " + (trueBoolean && trueBoolean));
        System.out.println("Conditional AND - " + (trueBoolean && falseBoolean));
        System.out.println("Conditional AND - " + (falseBoolean && trueBoolean));
        System.out.println("Conditional AND - " + (falseBoolean && falseBoolean));

//   ||	Conditional OR
        System.out.println("Conditional OR - " + (trueBoolean || trueBoolean));
        System.out.println("Conditional OR - " + (trueBoolean || falseBoolean));
        System.out.println("Conditional OR - " + (falseBoolean || trueBoolean));
        System.out.println("Conditional OR - " + (falseBoolean || falseBoolean));


//   ?:	Ternary (shorthand for if-then-else statement)
//   (condition) ? (return for true) : (return for false)
        int variableOne = 300;
        int variableTwo = 200;

        int max = variableOne > variableTwo ? variableOne : variableTwo;
        System.out.println("Max value: " + max);

//
//- Type Comparison Operator
//   instanceof	Compares an object to a specified type

        Integer integerWrapper = 10;

        boolean isInstance = (integerWrapper instanceof Integer);
        System.out.println("Integer instance? " + isInstance);
//        System.out.println("Long instance? " + (integerWrapper instanceof Long)); - Does not work
        isInstance = (integerWrapper instanceof Number);
        System.out.println("Number instance? " + isInstance);

        Operators operatorsInstance = new Operators();
        isInstance = (operatorsInstance instanceof Operators);
        System.out.println("Operators instance? " + isInstance);
        isInstance = (operatorsInstance instanceof Object);
        System.out.println("Object instance? " + isInstance);

    }

//- Bitwise and Bit Shift Operators (https://www.tutorialspoint.com/Java-Bitwise-Operators)
//    ~	Unary bitwise complement
//    <<	Signed left shift
//    >>	Signed right shift
//    >>>	Unsigned right shift
//    &	Bitwise AND
//    ^	Bitwise exclusive OR
//    |	Bitwise inclusive OR

}
