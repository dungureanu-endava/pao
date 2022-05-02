package ro.unibuc.streams;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxCount {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> max = list.stream()
                .max(Integer::compareTo); // (integer) -> integer.compareTo
        if (max.isPresent()) {
            System.out.println("Max is : " + max.get());
        }

//        Optional<String> optional = Optional.empty();
//        System.out.println("Optional value: " + optional.get());

        Optional<Integer> min = list.stream().min((i, j) -> i.compareTo(j));
        min.ifPresent(integer -> System.out.println("Min is :" + integer));

        System.out.println("Count: " + list.stream().count());
    }

}
