package ro.unibuc.lambda.expressions;

import java.util.Arrays;
import java.util.List;

interface Operation {
    int execute(int firstValue, int secondValue);
}

interface Comparator<T> {
    boolean compare(T firstElement, T secondElement);
}

class IntegerComparator {
    public static boolean test(Integer firstValue, Integer secondValue) {
        return firstValue == secondValue;
    }
}

record Item(String key, String value) {

}

public class Lambdas {

    public static void main(String[] args) {
        // parameter -> expression
        List<String> names = Arrays.asList("Leandro Jordà", "Govind Hanna", "Zlata Mikayla");
        names.forEach(name -> System.out.println(name));

        // (parameter1, parameter2) -> expression
        Operation addition = (int firstValue, int secondValue) -> firstValue + secondValue;
        executeOperation(addition, 10, 20);
        Operation subtraction = (int firstValue, int secondValue) -> firstValue - secondValue;
        executeOperation(subtraction, 10, 20);
        Operation multiplication = (int firstValue, int secondValue) -> firstValue * secondValue;
        executeOperation(multiplication, 10, 20);

        // (parameter1, parameter2) -> { code block }
        Comparator<Item> itemComparator = (Item firstItem, Item secondItem) -> {
            if (firstItem.key().equals(secondItem.key())) {
                return true;
            } else if (firstItem.value().equals(secondItem.value())) {
                return true;
            } else {
                return false;
            }
        };

        Comparator<Integer> integerComparator = IntegerComparator::test;
        compareElements(itemComparator, new Item("Unique Key", "Value"), new Item("Other Key", "Value"));
        compareElements(integerComparator, 30, 30);
    }

    public static void executeOperation(Operation operation, int firstValue, int secondValue) {
        System.out.println("Operation: " + operation.execute(firstValue, secondValue));
    }

    public static <T> void compareElements(Comparator<T> comparator, T firstElement, T secondElement) {
        System.out.println("Comparison: " + comparator.compare(firstElement, secondElement));
    }

}
