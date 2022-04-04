package ro.unibuc.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class WorkingWithSets {

    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add("Bucuresti");
        cities.add("Timisoara");
        cities.add("Brasov");
        cities.add("Bucuresti");
        cities.add("Cluj");

        cities.forEach(System.out::println);

        Set<String> cities2 = new LinkedHashSet<>();
        cities2.add("Bucuresti");
        cities2.add("Timisoara");
        cities2.add("Brasov");
        cities2.add("Bucuresti");
        cities2.add("Cluj");

        System.out.println("Cities ordered by adding operation");
        cities2.forEach(System.out::println);

        Set<String> cities3 = new TreeSet<>();
        cities3.add("Bucuresti");
        cities3.add("Timisoara");
        cities3.add("Brasov");
        cities3.add("Bucuresti");
        cities3.add("Cluj");

        System.out.println("Cities sorted by natural order");
        cities3.forEach(System.out::println);
    }

}
