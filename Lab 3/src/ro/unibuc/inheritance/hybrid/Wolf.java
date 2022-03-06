package ro.unibuc.inheritance.hybrid;

public interface Wolf extends Moveable {

    void bite();

    @Override
    default void run() {
        System.out.println("Running on 4 legs");
    }

}
