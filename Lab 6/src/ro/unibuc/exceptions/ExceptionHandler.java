package ro.unibuc.exceptions;

public class ExceptionHandler {

    public static void main(String[] args) {
        ExceptionHandler exceptionHandler = new ExceptionHandler();

        exceptionHandler.tryCatch();
        exceptionHandler.tryFinally();
        exceptionHandler.tryCatchFinally();
        exceptionHandler.tryCatchButNotHandled();
        exceptionHandler.tryCatchFinallyButNotHandled();
        exceptionHandler.tryCatchFinallyButNoExceptionThrown();
    }

    public void tryCatch() {
        int[] array = new int[5];
        try {
            int value = array[5];
            System.out.println("Inside try block");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Exception caught in Catch block");
        }

        System.out.println("Outside try-catch clause");
    }

    public void tryFinally() {
        int[] array = new int[5];
        try {
            int value = array[5];
            System.out.println("Inside try block");
        } finally {
            System.out.println("Executing finally");
        }

        System.out.println("Outside try-finally clause");
    }

    public void tryCatchFinally() {
        int[] array = new int[5];
        try {
            int value = array[5];
            System.out.println("Inside try block");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Exception caught in Catch block");
        } finally {
            System.out.println("Executing finally");
        }

        System.out.println("Outside try-catch-finally clause");
    }

    public void tryCatchButNotHandled() {
        int[] array = new int[5];
        try {
            int value = array[5];
            System.out.println("Inside try block");
        } catch (NullPointerException exception) {
            System.out.println("Exception caught in Catch block");
        }

        System.out.println("Outside try-catch clause");
    }

    public void tryCatchFinallyButNotHandled() {
        int[] array = new int[5];
        try {
            int value = array[5];
            System.out.println("Inside try block");
        } catch (NullPointerException exception) {
            System.out.println("Exception caught in Catch block");
        } finally {
            System.out.println("Executing finally");
        }

        System.out.println("Outside try-catch clause");
    }

    public void tryCatchFinallyButNoExceptionThrown() {
        int[] array = new int[5];
        try {
            int value = array[3];
            System.out.println("Inside try block");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Exception caught in Catch block");
        } finally {
            System.out.println("Executing finally");
        }

        System.out.println("Outside try-catch clause");
    }

}
