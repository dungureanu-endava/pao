/*
 * The package statement must be the first executable line in the file. It represents the location of the file.
 * There can be only one package statement in each source file, and it applies to all types in the file.
 *
 * It can be missing if the classes are not part of any package.
 * Generally speaking, an unnamed package is only for small or temporary applications or when you are just beginning the development process.
 * However, this is rarely left out and is considered a bad design if it does.
 *
 * Package names are written in all lower case to avoid conflict with the names of classes or interfaces.
 */
package ro.unibuc.packages;

/*
 * A package in Java is used to group related classes. Think of it as a folder in a file directory.
 * We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:
 * - Built-in Packages (packages from the Java API)
 * - User-defined Packages
 */

/*
 *   Imports
 *
 * This line imports the SubPackageClass class, so we can use it without specifying each time the package.
 * If the class does not use any classes from other packages, this section can be missing all together.
 */
import ro.unibuc.packages.subpackages.SubPackageClass;

/*
 * To import all the types contained in a particular package, use the import statement with the asterisk (*) wildcard character.
 * Note. Importing java.util.* imports all the types in the java.util package, but it does not import java.util.function, java.util.random, or any other java.util.xxxx packages.
 */
import java.util.*;

/*
 * You can find a list of all the available Java Packages here:
 *  - https://docs.oracle.com/en/java/javase/17/docs/api/allpackages-index.html
 */

/*
 *   Static Imports
 *
 * Static imports can be used to import static methods or fields from other classes, to ease use.
 * This way, we don't need to call in the code the method as UsingStaticImports.printStaticMessages(),
 * but merely using printStaticMessages().
 *
 * You can import them as a group:
 */
import static ro.unibuc.packages.subpackages.ClassWithStaticElements.*;

/*
 * Or import just a specific method or field:
 */
import static java.lang.Math.PI;

public class Definition {

    public static void main(String[] args) {
        // Using the imported class
        SubPackageClass subPackageClass = new SubPackageClass();
        System.out.println("Using imported class to generate random number: " + subPackageClass.generateRandomNumber());

        // Using the Date class from the java.util package
        System.out.println("Using imported Date class; The current date: " + new Date());

        // Using the static method defined in ro.unibuc.packages.subpackages.ClassWithStaticElements
        printStaticMessages();

        // Accessing the static variable from ro.unibuc.packages.subpackages.ClassWithStaticElements
        System.out.println("Using imported static value: " + staticVariable);

        // Using the static field from java.lang.Math
        System.out.println("Using imported static field; The value of PI: " + PI);

        // Using a class by referring by its qualified name
        java.time.LocalTime localTime = new Date().toInstant()
                .atZone(java.time.ZoneId.of("UTC")).toLocalTime();
        System.out.println("Using imported LocalTime and ZoneId classes by their qualified names; The current time in UK: " + localTime);

        // You can access classes from the same package without importing them
        SamePackageClass packageClass = new SamePackageClass();
        packageClass.printMessage();
    }

}
