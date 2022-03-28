package ro.unibuc.practice.lab05;

public class Main {

    public static void main(String[] args) {
        CocktailBar cocktailBar = new CocktailBar();

        Customer customer = new Customer();
        cocktailBar.placeOrder(customer.createOrder());

        System.out.println("Income: " + cocktailBar.getIncome());
    }

}
