package ro.unibuc.keywords;

public class StaticKeyword {

    public static void main(String[] args) {
        OuterClass.NestedStaticClass staticClass = new OuterClass.NestedStaticClass();
        staticClass.printMessage();

        OuterClass.printStaticField();
        OuterClass.setStaticField("New value");
        OuterClass.printStaticField();

        DerivedClass.printStaticField();
    }

}

class OuterClass {

    private String instanceVariable;
    private static final String CONSTANT = "Static Final Field";
    protected static String staticField = "Static Field";

    public static class NestedStaticClass {

        public void printMessage() {
            System.out.println("Accessing method from static class; Constant: " + CONSTANT);
        }
    }

    public static void setStaticField(String staticField) {
        OuterClass.staticField = staticField;
    }

    public void printSomething() {
        printStaticField();
    }

    public static void printStaticField() {
        System.out.println("Accessing static method; Static field: " + staticField);
    }

}

class DerivedClass extends OuterClass {

    public static void printStaticField() {
        System.out.println("Accessing static method in derived class; Static field: " + staticField);
    }

}
