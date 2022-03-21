package ro.unibuc.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Represents an operation that accepts a single input argument and returns a boolean value.
@FunctionalInterface
interface GenericPredicate<T> {
    boolean test(T value);
}

record Doctor(String name, boolean isLicenseValid) {

}

public class PredicateInterface {

    public static void main(String[] args) {
        GenericPredicate<Integer> isEvenNumber = (value) -> value % 2 == 0;
        System.out.println("Is even number: " + isEvenNumber.test(100));


        Predicate<String> startsWithS = (name) -> name.startsWith("S");
        List<String> names = Arrays.asList("Conn Mateu", "Gregers Reuel", "Sibonakaliso Clara", "Terenzio Hartwin", "Birger Everette", "Shailaja Ryo");

        names.stream().filter(startsWithS).forEach(System.out::println);


        Doctor anton = new Doctor("Anton Blodeuedd", true);

        Predicate nullCheck = (value) -> value != null;
        System.out.println("Test instance: " + nullCheck.test(anton));

        Predicate<Doctor> licenseCheck = (doctor) -> doctor.isLicenseValid();
        System.out.println("Is the doctor licensed: " + nullCheck.and(licenseCheck).test(anton));

        Doctor unknownDoctor = null;
        System.out.println("Is the unknown doctor licensed: " + nullCheck.and(licenseCheck).test(unknownDoctor));
    }

}
