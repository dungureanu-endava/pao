package ro.unibuc.keywords;

public class FinalKeyword {

    public static void main(String[] args) {
        AudiQ5 car = new AudiQ5();
        // car.brand = "New Brand";
        // car.model = "New Model";
        car.start();

        final AudiQ5 finalCar = new AudiQ5();
        finalCar.price = 325_000L;
        finalCar.displayPrice();

        finalCar.price = 305_000L;
        finalCar.displayPrice();

        // finalCar = new AudiQ5();
    }

}

class Audi {

    protected final String brand = "Audi";

    public final void start() {
        System.out.println("Accessing final method, start, from Audi class; Audi car starts!");
    }

}

final class AudiQ5 extends Audi {

    public final String model = "Q5";
    public Long price;

    /*
     * @Override
     * public void start() {
     *     System.out.println("Accessing start method from AudiQ5 class; Audi Q5 car starts!");
     * }
     */

    public void displayPrice() {
        System.out.println("Accessing instance; Price: " + price);
    }

}

/*
 * class AudiQ5TDI extends AudiQ5 {
 *
 * }
 */
