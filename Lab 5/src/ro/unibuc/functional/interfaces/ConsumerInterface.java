package ro.unibuc.functional.interfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

// Represents an operation that accepts a single input argument and returns no result.
@FunctionalInterface
interface GenericConsumer<T> {
    void method(T value);
}

record Person(String name, Integer age) {
    @Override
    public String toString() {
        return "Name: '" + name + '\'' + " Age: " + age;
    }
}

public class ConsumerInterface {

    public static void main(String[] args) {
        Person kris = new Person("Kristiane Cassiopeia", 27);

        GenericConsumer<Person> genericConsumer = (person) -> System.out.println("Accessing GenericConsumer; Person: " + person);
        genericConsumer.method(kris);

        Consumer<Person> consumer = (person) -> System.out.println("Accessing java.util.function.Consumer; Person: " + person);
        consumer.accept(kris);

        BiConsumer<String, Integer> biConsumer = (name, age) -> System.out.println("Accessing java.util.function.BiConsumer; Person: Name: '" + name + '\'' + " Age: " + age);
        biConsumer.accept(kris.name(), kris.age());
    }

}
