## Lab 4

### What is a Lambda Expressions?

### Will the following sniped of code compile? If it compiles, what will be displayed and why?
```
interface Printer {
    void display(String input);
}

public class Main {
    public static void main(String[] args) {
        String variable = "Hello World!";
        Printer printer = (variable) -> System.out.println(variable);
        printer.display(variable);
    }
}
```

### What is a Functional Interfaces?

### What is a Generic Method?

### Will the following sniped of code compile? If it compiles, what will be displayed and why?
```
record Program(boolean works) { }

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isOdd = (number) -> number % 2 != 0;
        Predicate<Program> isWorking = Program::works;
        Predicate<String> isPalindrome = (value) -> value.equalsIgnoreCase(new StringBuffer(value).reverse().toString());

        System.out.println("Test isOdd: " + testPredicate(isOdd, 10));
        System.out.println("Test isWorking: " + testPredicate(isWorking, new Program(false)));
        System.out.println("Test isPalindrome: " + testPredicate(isPalindrome, "Abba"));
    }

    public static <T> boolean testPredicate(Predicate<T> predicate, T value) {
        return predicate.test(value);
    }
}
```

### What are Generic Classes?

### When can you use Wildcards?

### Will the following sniped of code compile? If it compiles, what will be displayed and why?
```
public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
        integers.add(21);

        List<Double> doubles = List.of(11.5, 2.7, 21.0);
        
        displayNumbers(integers);
        displayNumbers(doubles);
    }

    public static void displayNumbers(List<? extends Number> numbers) {
        System.out.println("Numbers: " + numbers);
    }
}
```
