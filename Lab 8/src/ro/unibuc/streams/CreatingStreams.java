package ro.unibuc.streams;

import ro.unibuc.streams.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CreatingStreams {

    public static void main(String[] args) {
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> stringStream = Arrays.stream(arr);

        List<Student> studentList = new ArrayList<>();
        Stream<Student> studentStream = studentList.stream();

        Stream<String> secondStringStream = Stream.of("a", "b");

        Stream<Integer> emptyStream = Stream.empty();

        Stream<Integer> integerStream = Stream.iterate(0, x -> x + 1).limit(10); // 0 1 2 3...
        Consumer<Integer> otherWay = System.out::println;
        integerStream.forEach(otherWay);

        Stream.iterate(0, x -> x + 1)
                .limit(10)
                .sorted()
                .forEach(System.out::println);

        Stream<Integer> secondIntegerStream = Stream.generate(() -> 1); // 1 1 1...
    }

}
