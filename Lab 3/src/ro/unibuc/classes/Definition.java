/*
 * The package statement must be the first executable line in the file. It represents the location of the file.
 * There can be only one package statement in each source file, and it applies to all types in the file.
 */
package ro.unibuc.classes;

/*
 * This line imports the Math class, so we can use it without specifying each time the package.
 * If the class does not use any classes from other packages, this section can be missing all together.
 */
import java.lang.Math;

import static java.lang.Math.PI;

/*
 * This is the declaration of the class. Keep in mind that if this class is public, the file must
 * be named exactly the same, with the extension ".java".
 *
 * Declaring classes:
 *   - Access Modifier: can be "public" or it can be left out, meaning it's "default" or "package private"
 *   - Non-Access Modifiers (optional): can be "static", "final" or "abstract"
 *   - Class Name: ClassStructure
 *   - Class Body (the area between the braces) contains all the code that provides for the life cycle of the objects created from the class:
 *     - Declarations for the fields
 *     - Initialization block
 *     - Constructors for initializing new objects
 *     - Methods to implement the behavior
 */
public class Definition {

    /*
     *    Class Fields
     *
     * Declaring class variables:
     *   - Access Modifier: can be "private", "protected", "public" or it can be left out, meaning it's "default" or "package private"
     *   - Non-Access Modifiers:
     *     - Static keyword (optional): "static" field belong to the class, rather than an object; they can be accessed without instantiating the class
     *     - Final keyword (optional): "final" field that once has been defined, they cannot be overridden or modified
     *   - Type: int, Long, String
     *   - Name: privateInstanceField, privateStaticField
     *
     */
    private int privateInstanceField;
    public int publicInstanceField;
    private static int initializationCount = 0;
    protected static Long protectedStaticField;
    public final static String CONSTANT_FIELD = "Constants are defined as \"final\" and \"static\" and they should be written in all caps letters";

    /*
     *    Initialization Blocks
     *
     * This is an instance initialization block. It is run at the creation of each object, for that specific object.
     * A class can have multiple such blocks, and they will be executed in the order that they appear in the class.
     */
    {
        publicInstanceField = 305;
    }

    {
        initializationCount++;
        System.out.printf("Accessing initialization block for the %s time%n", initializationCount);
    }

    /*
     * This a class initialization block. It is run the first time the class is references somewhere.
     * It can only access static fields and methods in the class.
     */
    static {
        System.out.println("Accessing static block; The value of PI: " + PI);
        protectedStaticField = Long.MAX_VALUE;
    }

    /*
     *    Class Methods
     *
     * Declaring methods:
     *   - Access Modifier: "private"; can be "private", "protected", "public" or it can be left out, meaning it's "default" or "package private".
     *   - Return Type: "double"; if the method does not return anything, the return type is "void".
     *   - Method Name: "maxValue"; can be any valid identifier in the java language
     *   - Parameter List: a comma-delimited list of input parameters, preceded by their data types, enclosed by parentheses, (). If there are no parameters, you must use empty parentheses.
     *     - Parameter Types: long, String
     *     - Parameter Names: firstParameter, secondParameter
     */
    private double maxValue(long firstParameter, Double secondParameter) {
        return Math.max(firstParameter, secondParameter); // any non-void function must return a value. If the method is void, the "return;" instruction can be used.
        // signaling that it should end its execution at that point.
    }

    public void printValue(String value) {
        System.out.println("Accessing class methods; Value: " + value);
        // The "return;" statement is not mandatory, and it can be omitted for void methods,
    }

    void printPrivateInstanceFieldValue() {
        System.out.println("Accessing private field; Value: " + privateInstanceField);
    }

    /*
     *    Class Constructors
     *
     * A class contains constructors that are invoked to create objects from the class blueprint.
     * Constructor declarations look like method declarations—except that they use the name of the
     * class and have no return type. Every class has a default, empty constructor even if it's not defined.
     *
     * You can use access modifiers in a constructor's declaration to control which other classes can call the constructor.
     */
    public Definition() {

    }

    private Definition(int newValue) {
        privateInstanceField = newValue;
    }

    /*
     * This is the main entry point in a java class. If a class should be run, this is the signature that the java runtime environment
     * will look for. The args parameter will always have at least one value in it: args[0] will be the name of the class called.
     * If any argument have been supplied when running the class, they will follow in the array.
     */
    public static void main(String[] args) {
        System.out.println("Accessing static variables; " + Definition.CONSTANT_FIELD);

        Definition classInstance = new Definition();
        classInstance.printPrivateInstanceFieldValue();
        classInstance.printValue(String.valueOf(classInstance.publicInstanceField));

        Definition.protectedStaticField = 73550L;

        //
        Definition newInstance = new Definition(500);
        newInstance.printPrivateInstanceFieldValue();
        newInstance.printValue(String.valueOf(newInstance.protectedStaticField));
    }

}
