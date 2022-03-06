package ro.unibuc.classes.constructors;

public class UtilityClass {

    private UtilityClass() {
        // This should never be called
    }

    public static void usingStaticMethodsOnly() {
        System.out.println("Accessing the UtilityClass");
    }

}

class TestingUtilityClass {

    public static void main(String[] args) {
        // UtilityClass utilityClass = new UtilityClass();
        UtilityClass.usingStaticMethodsOnly();
    }

}