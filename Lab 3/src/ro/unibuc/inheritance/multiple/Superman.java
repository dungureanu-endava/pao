package ro.unibuc.inheritance.multiple;

public class Superman extends Person implements Flying {

    @Override
    public void fly() {
        System.out.println("Flying at supersonic speed!");
    }

}
