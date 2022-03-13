## Lab 1

### Will the following sniped of code compile? If it compiles, what will be displayed and what will be the value of variable *number* at the end (and why)? 
```
    public static void main(String[] args) {
        int number = 10;
        System.out.println(number);
        System.out.println(number++);
        System.out.println(++number);
        System.out.println(number);
    }
```

### Will the following sniped of code compile? If it compiles, what will be displayed and why?
```
    public static void main(String[] args) {
        float value = 12.3;
        System.out.println(value);
    }
```

### Will the following sniped of code compile? If it compiles, what will be displayed and why? 
```
    public static void main(String[] args) {
        int primitive = 32_534;
        Long wrapper = primitive;
        System.out.println(wrapper);
    }
```

### Will the following sniped of code compile? If it compiles, what will be displayed and why? 
```
    public static void main(String[] args) {
        short shortNumber = 325;
        int integerNumber = 100;
        System.out.println(shortNumber / integerNumber);
    }
```

### Will the following sniped of code compile? If it compiles, what will be displayed and why? 
```
    public static void main(String[] args) {
        long longNumber = 120L;
        byte byteNumber = (byte) longNumber;
        System.out.println(byteNumber);
    }
```

### Will the following sniped of code compile? If it compiles, what will be displayed and why? 
```
    public static void main(String[] args) {
        double floatingPointValue = 25.0;
        System.out.println(floatingPointValue / 2);
    }
```

### With what primitive can we replace *var* so that the value is assigned without having to cast it?
```
    public static void main(String[] args) {
        var value = 100_000;
        System.out.println(value);
    }
```

### Will the following sniped of code compile? If it compiles, what will be displayed and why? 
```
    public static void main(String[] args) {
        boolean isItMonday = true;
        boolean isThisTheEnd = true;
        System.out.println(isItMonday);
        System.out.println(!isThisTheEnd);
    }
```

### What is automatic casting (Widening Casting) and when does it happen?

### What is the best practice in naming Packages, Classes or Variables?

### Notes
 - https://www.w3schools.com/java/java_type_casting.asp
 - https://www.geeksforgeeks.org/java-naming-conventions/
 - https://www.javatpoint.com/java-naming-conventions
 - https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html