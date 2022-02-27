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

    }

//
//- The Equality and Relational Operators
//   ==	Equal to
//   !=	Not equal to
//   >	Greater than
//   >=	Greater than or equal to
//   <	Less than
//   <=	Less than or equal to
//
//
//- Conditional Operators
//   &&	Conditional AND
//   ||	Conditional OR
//   ?:	Ternary (shorthand for if-then-else statement)
//
//
//- Type Comparison Operator
//   instanceof	Compares an object to a specified type
//
//
//- Bitwise and Bit Shift Operators (https://www.tutorialspoint.com/Java-Bitwise-Operators)
//    ~	Unary bitwise complement
//    <<	Signed left shift
//    >>	Signed right shift
//    >>>	Unsigned right shift
//    &	Bitwise AND
//    ^	Bitwise exclusive OR
//    |	Bitwise inclusive OR

}
