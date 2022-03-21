## Lab 2

### What is the difference between a class and an object?

### What is an instance block?

### What access modifiers can a class have?

### What is a constructor?

### What access modifiers can a constructor have?

### What access modifiers can a variable have?

### What are abstract classes?

### Can an abstract class be extended by another abstract class?

### Do abstract classes contain only abstract methods?
 
### What is an interface?

### What type of variables are defined in an interface?

### Can an abstract class implement an interface?

### Can an interface method be defined in the interface?

### What is a final variable?

### Will the following sniped of code compile? If it compiles, what will be displayed and why?
```
    public static void main(String[] args) {
        final Long longNumber = 120L;
        System.out.println("The value is: " + longNumber);
        longNumber = 100L;
        System.out.println("The updated value is: " + longNumber);
    }
```

### What is a static variable?

### Will the following sniped of code compile? If it compiles, what will be displayed and why?
```
class TestClass { public static int value = 100; }

public class Main {
    public static void main(String[] args) {
        TestClass firstInstance = new TestClass();
        TestClass secondInstance = new TestClass();
        System.out.println("First call: " + firstInstance.value);
        System.out.println("Second call: " + secondInstance.value++);
        System.out.println("Third call: " + ++firstInstance.value);
    }
}
```

### What is a static method?

### What is a static block?

### Will the following sniped of code compile? If it compiles, what will be displayed and why?
```
class TestClass { static { System.out.println("Inside static block!"); } }

public class Main {
    public void main(String[] args) {
        TestClass firstInstance = new TestClass();
        TestClass secondInstance = new TestClass();
    }
}
```

### Can a static method defined in a class use an instance variable of the same class?

### What are the key modifiers of an interface variable?

### Can interfaces have constructors?

### Can interfaces have static methods?

### Will the following sniped of code compile? If it compiles, what will be displayed and why?
```
interface Person {
    static void displayTruth() { privateTruth(); }
    private static void privateTruth() { System.out.println("Universal truth that is available for all Persons!"); }
}

public class Main {
    public static void main(String[] args) {
        Person.displayTruth();
    }
}
```