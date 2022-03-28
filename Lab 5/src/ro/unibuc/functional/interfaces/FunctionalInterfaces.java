package ro.unibuc.functional.interfaces;

import java.util.function.Function;

/*
 * Functional interfaces are interfaces that contains only one abstract method. They can have only one functionality to exhibit.
 * A functional interface can have any number of default methods.
 */
@FunctionalInterface
interface Square {
    int calculate(int x);
}

// Represents a function that accepts one argument and produces a result.
@FunctionalInterface
interface GenericFunction<T, R> {
    R apply(T value);
}

public class FunctionalInterfaces {

    public static void main(String[] args) {
        Square square = (int x) -> x * x;
        System.out.println("Calculating the square root: " + square.calculate(135));

        GenericFunction<Integer, String> convertor = (Integer value) -> value.toString();
        System.out.println("Converting Integer to String: " + (convertor.apply(315) instanceof String));

        Function<String, Integer> stringLengthFunction = String::length;
        System.out.println("Converting Integer to String: " + stringLengthFunction.apply("Eligendo im comparem."));
    }

}
