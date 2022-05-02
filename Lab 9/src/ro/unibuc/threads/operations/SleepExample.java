package ro.unibuc.threads.operations;

import java.util.Arrays;
import java.util.List;

public class SleepExample {

    public static void main(String[] args) throws InterruptedException {
        List<String> messages = Arrays.asList("Hello", "there", "(wave)", "Hi", "again!");
        for (String string : messages) {
            Thread.sleep(2000);

            System.out.println(string);
        }
    }
}
