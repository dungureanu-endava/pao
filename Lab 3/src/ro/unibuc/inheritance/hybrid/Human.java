package ro.unibuc.inheritance.hybrid;

public interface Human extends Moveable {

    int getAge();

    @Override
    default void run() {
        System.out.println("Running on 2 legs");
    }

}
