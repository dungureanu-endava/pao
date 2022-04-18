package ro.unibuc.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {
        // Check Predicate functional interface
        List<String> fruits = Arrays.asList("Apple", "Cherry", "Banana", "Pineapple");

        Predicate<String> predicate = fruit -> fruit.equals("Banana");
        fruits.stream() // Stream<String>
                .peek(e -> System.out.println("Unfiltered value: " + e))
                .filter(predicate) // Predicate parameter, Stream<String> return
                .peek(e -> System.out.println("Filtered value: " + e))
                .forEach(System.out::println); // Consumer parameter, void return
    }

}
