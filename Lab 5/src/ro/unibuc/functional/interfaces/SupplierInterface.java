package ro.unibuc.functional.interfaces;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;

// Represents a function that is a supplier of results.
@FunctionalInterface
interface GenericSupplier<T> {
    T get();
}

class Bottle {
    private String color;

    public Bottle() {

    }

    public Bottle(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bottle Color: " + color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

public class SupplierInterface {

    public static void main(String[] args) {
        GenericSupplier<String> randomStringGenerator = () -> {
            byte[] array = new byte[7];
            new Random().nextBytes(array);
            return new String(array, StandardCharsets.UTF_8);
        };

        System.out.println("Generate random string: " + randomStringGenerator.get());

        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println("Get current date and time: " + supplier.get());

        Bottle defaultBottle = factory(Bottle::new);
        System.out.println(defaultBottle);

        Bottle redBottle = factory(() -> new Bottle("Red"));
        System.out.println(redBottle);
    }

    public static Bottle factory(Supplier<? extends Bottle> supplier) {
        Bottle bottle = supplier.get();

        if (bottle.getColor() == null || "".equals(bottle.getColor())) {
            bottle.setColor("Green");
        }

        return bottle;
    }
}
