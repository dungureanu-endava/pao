package ro.unibuc.interfaces;

/*
 * An interface is a fully abstract class. It includes a group of abstract methods (methods without a body).
 * We use the interface keyword to create an interface in Java.
 */
interface Definition {

    /*
     * All fields in interfaces are "public", "static" and "final" (constants)
     */
    public static final short SHORT_CONSTANT = Short.MAX_VALUE;

    /*
     * Even if the modifiers are not specified, in an interface, this field is still "public" "static" and "final".
     */
    int INTEGER_CONSTANT = Integer.MIN_VALUE;

    /*
     * Each method defined in the interface represents a part of the contract that an implementing class needs to
     * fulfill before it can be instantiated.
     */
    public void interfaceMethod();

    /*
     * Even if the interface is a contract, some methods can have an implementation, but must be marked as "default" or "static".
     *
     * This was introduced to allow backwards compatibility for contracts (in version 1 of an application, the contract
     * included only methodA(). In version 2, it must also include methodB(). Since we don't want everyone using this
     * interface to have to provide an implementation of the new method which they don't need, this can be supplied as
     * a default method.
     */
    default public void defaultMethod() {
        System.out.println("Accessing default method from interface");
    }

    public static void staticMethod() {
        System.out.println("Accessing static method from interface");
        privateStaticMethod();
    }

    /*
     * The "static" methods are the only methods that can both have a method body and be marked as "private".
     */
    private static void privateStaticMethod() {
        System.out.println("Accessing private static method from interface");
    }

}

class Implementation implements Definition {

    @Override
    public void interfaceMethod() {
        System.out.println("Accessing instance method");
    }
}

public class Interfaces {

    public static void main(String[] args) {
        Definition instance = new Implementation();
        instance.interfaceMethod();
        instance.defaultMethod();

        Definition.staticMethod();
        // Definition.INTEGER_CONSTANT = 3; // This does not work, as the field is final
    }

}
