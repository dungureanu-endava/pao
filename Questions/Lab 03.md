## Lab 3

### What is encapsulation?

### What is composition?

### What is aggregation?

### Can a class implement multiple interfaces?

### Can a class extend multiple classes?

### What is a final class?

### Will the following sniped of code compile? If it compiles, what will be displayed and why?
```
final class FinalClass {
    public void method() { System.out.println("Inside FinalClass method!"); }
}

class TestClass extends FinalClass {
    @Override
    public void method() { System.out.println("Inside TestClass method!"); }
}

public class Main {
    public static void main(String[] args) {
        TestClass instance = new FinalClass();
        instance.method();
    }
}
```

### Can a final class be extended by another class?

### What is a final method?

### Will the following sniped of code compile? If it compiles, what will be displayed and why?
```
class FinalClass {
    public final void finalMethod() { System.out.println("Inside FinalClass method!"); }
}

class TestClass extends FinalClass {
    @Override
    public void method() { System.out.println("Inside TestClass method!"); }
}

public class Main {
    public static void main(String[] args) {
        FinalClass instance = new TestClass();
        instance.finalMethod();
    }
}
```

### Can you override a final method?

### Is the 'protected void method()' method definition a valid override of the parent 'public void method()' method?

### Is the 'public void method(String input)' method definition a valid override of the parent 'protected void method(String input)' method?

### Is the 'public String method(Integer number, String value)' method definition a valid override of the parent 'private String method(Integer number, String value)' method?

### Can you overload a final method?

### Can the methods 'private String method(Integer number, String value)' and 'public String method(Integer input, String output)' be overloaded?

### Can the methods 'public String method()' and 'public void method()' be overloaded?

### Can the methods 'public void method(String input)' and 'public String method(Integer number, String value)' be overloaded?

### Will the following sniped of code compile? If it compiles, what will be displayed and why?
```
class TestClass {
    private int value;

    public TestClass(Integer value) {
        value = value;
    }

    public int getValue() { return value; }
}

public class Main {
    public static void main(String[] args) {
        TestClass instance = new TestClass(100);
        System.out.println("Instance value: " + instance.getValue());
    }
}
```

### Will the following sniped of code compile? If it compiles, what will be displayed and why?
```
class ParentClass {
    protected int value;

    public int getValue() { return value; }
}

class TestClass extends ParentClass {
    private int value;

    public TestClass(Integer value) {
        super.value = value;
    }

    public int getValue() { return this.value; }

    public int getParentValue() { return super.getValue(); }
}

public class Main {
    public static void main(String[] args) {
        TestClass instance = new TestClass(100);
        ParentClass parentInstance = new TestClass(100);
        System.out.println("Instance value: " + instance.getValue());
        System.out.println("Instance parent value: " + instance.getParentValue());
        System.out.println("Parent instance value: " + parentInstance.getValue());
    }
}
```

### Will the following sniped of code compile? If it compiles, what will be displayed and why?
```
class TestClass {
    private final int number;
    private final String value;

    public TestClass() {
        this("Random value", 101);
    }

    public TestClass(String value, Integer number) {
        this.value = value;
        this.number = number;
    }

    public int getNumber() { return number; }

    public String getValue() { return value; }
}

public class Main {
    public static void main(String[] args) {
        TestClass instance = new TestClass();
        System.out.println("Instance value: " + instance.getValue());
        System.out.println("Instance number: " + instance.getNumber());
    }
}
```

### Will the following sniped of code compile? If it compiles, what will be displayed and why?
```
class ParentClass {
    protected final int number;
    protected final double decimal;
    protected final String value;

    public ParentClass(String value, Integer number) {
        this.value = value;
        this.decimal = 33.22;
        this.number = number;
    }
}

class TestClass extends ParentClass {
    public TestClass(Integer number) {
        super("Evadit", number);
    }

    public int getNumber() { return this.number; }

    public double getDecimal() { return decimal; }

    public String getValue() { return super.value; }
}

public class Main {
    public static void main(String[] args) {
        TestClass instance = new TestClass(337);
        System.out.println("Instance value: " + instance.getValue());
        System.out.println("Instance decimal: " + instance.getDecimal());
        System.out.println("Instance number: " + instance.getNumber());
    }
}
```

### Will the following sniped of code compile? If it compiles, what will be displayed and why?
```
interface Person {
    int age = 40;
}

class Mike implements Person {
    public Mike(Integer age) {
        this.age = age;
    }

    public void displayInformation() {
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Mike instance = new Mike(38);
        instance.displayInformation();
    }
}
```

### What is a marker interface?
