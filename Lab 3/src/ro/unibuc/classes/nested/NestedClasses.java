package ro.unibuc.classes.nested;

class OuterClass {

    private static final String CONSTANT = "Static Value";

    // Static nested class
    public static class NestedStaticClass {

        // Only static members of Outer class is directly accessible in nested static class
        public void printMessage() {
            // Try making 'CONSTANT' a non-static: variable, there will be compiler error
            System.out.println("Accessing method from static class; Static field: " + CONSTANT);
        }
    }

    // Non-static nested class - also called Inner class
    public class InnerClass {

        // Both static and non-static members of Outer class are accessible in this Inner class
        public void display() {
            System.out.println("Accessing method from inner class; Static field: " + CONSTANT);
        }
    }

}

public class NestedClasses {

    public static void main(String args[]) {
        // Create instance of nested Static class
        OuterClass.NestedStaticClass staticClass = new OuterClass.NestedStaticClass();

        // Call non-static method of nested static class
        staticClass.printMessage();

        // In order to create instance of Inner class we need an Outer class instance
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();

        // Calling non-static method of Inner class
        inner.display();

        // We can also combine above steps in one step to create instance of Inner class
        OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();

        // Similarly, we can now call Inner class method
        innerObject.display();
    }

}
