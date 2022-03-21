package ro.unibuc.generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

record Item(String value) {
    @Override
    public String toString() {
        return value;
    }
}

public class UnboundedWildcards {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("continent", "ex", "opiniones", "libertate", "du", "is", "strepitum");
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Item> items = Arrays.asList(new Item("Obvium"), new Item("Finitus"), new Item("Mendax"));
        List<?> objects = Arrays.asList("ex", 5, new Item("Neque"), 2, new Item("Mendax"));

        printCollection(strings);
        printCollection(integers);
        printCollection(items);
        printCollection(objects);

        printCollectionWithGeneric(strings);
        printCollectionWithGeneric(integers);
        printCollectionWithGeneric(items);
        printCollectionWithGeneric(objects);
    }

    static void printCollection(Collection<?> collection) {
        for (Object object : collection) {
            System.out.println(object);
        }
    }

    static <T> void printCollectionWithGeneric(Collection<T> collection) {
        for (T object : collection) {
            System.out.println(object);
        }
    }
}
