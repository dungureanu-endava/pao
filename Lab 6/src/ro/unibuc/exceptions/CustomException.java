package ro.unibuc.exceptions;

class TestCustomExceptions {

    public static void main(String[] args) {
        TestCustomExceptions tester = new TestCustomExceptions();

        tester.handleCustomException();
        System.out.println();
        tester.handleParametrizedCustomException();
    }

    public void handleCustomException() {
        try {
            System.out.println("Handling custom exception.");
            throwCustomException();
        } catch (CustomException exception) {
            System.out.println("Exception message: " + exception.getMessage());
        }
    }

    public void handleParametrizedCustomException() {
        try {
            System.out.println("Handling parametrized custom exception.");
            throwParametrizedCustomException();
        } catch (CustomException exception) {
            System.out.println("Exception message: " + exception.getMessage());
            System.out.println("Exception cause: " + exception.getCause());

            System.out.println("Exception stack trace: ");
            exception.printStackTrace();
        }
    }

    public void throwCustomException() throws CustomException {
        throw new CustomException("Testing custom exception!");
    }

    public void throwParametrizedCustomException() throws CustomException {
        try {
            int[] array = new int[10];
            array[10] = 9;
        } catch (ArrayIndexOutOfBoundsException exception) {
            throw new CustomException("Testing parametrized custom exception!", exception);
        }
    }
}

//public class CustomExceptions extends RuntimeException { <- For Unchecked Exception
public class CustomException extends Exception { // <- For Checked Exception

    // default constructor
    CustomException() {

    }

    // Parametrized constructor with exception message
    CustomException(String message) {
        // Call constructor of parent Exception
        super(message);
    }

    // Parametrized constructor with exception message and cause
    CustomException(String message, Exception cause) {
        // Call constructor of parent Exception
        super(message, cause);
    }

}
