package ro.unibuc.inheritance.multiple;

public class Superman extends Person implements Flying {

    @Override
    public void fly() {
        System.out.println("Flying at supersonic speed!");
    }

    public static void main(String[] args) {
        Superman superman = new Superman();
        superman.setName("Clark Kent");
        superman.setAge(72);

        superman.displayPersonDetails();

        superman.fly();
    }

}
