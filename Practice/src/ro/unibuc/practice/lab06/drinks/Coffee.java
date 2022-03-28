package ro.unibuc.practice.lab06.drinks;

public class Coffee extends Drink {

    public Coffee(String name, Double price) {
        super(name, null, price);
    }

    @Override
    public void displayInformation(Integer index) {
        System.out.printf("%s. %s - %.2f$ \n", index, name, price);
    }

}
