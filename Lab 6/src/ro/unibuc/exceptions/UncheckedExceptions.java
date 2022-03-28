package ro.unibuc.exceptions;

public class UncheckedExceptions {

    public static void main(String[] args) {
        UncheckedExceptions uncheckedExceptions = new UncheckedExceptions();

        uncheckedExceptions.arrayIndexOutOfBoundsException();
        uncheckedExceptions.arithmeticException();
        uncheckedExceptions.nullPointerException();
        uncheckedExceptions.stringIndexOutOfBoundsException();
        uncheckedExceptions.numberFormatException();
    }

    public void arrayIndexOutOfBoundsException() {
        int[] array = new int[10];
        array[10] = 9;
    }

    private void nullPointerException() {
        String value = null;
        Integer length = value.length();
    }

    private void arithmeticException() {
        int value = 10;
        int divider = 0;
        int division = value / divider;
    }

    private void stringIndexOutOfBoundsException() {
        Character value = "Test String.".charAt(13);
    }

    private void numberFormatException() {
        Integer value = Integer.parseInt("Other value!");
    }

}
