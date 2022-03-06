package ro.unibuc.inheritance.shadowing;

public class John {

    String name = "John";

    public void callJohnPrivateMethod() {
        displayInformation();
    }

    private void displayInformation() {
        System.out.println("John name: " + name);
    }

}

class JohnDoe extends John {

    String name = "John Doe";

    public void callJohnDoePrivateMethod() {
        displayInformation();
    }

    private void displayInformation() {
        System.out.println("John Doe name: " + name);
    }

}

class Main {

    public static void main(String[] args) {
        John john = new John();
        john.callJohnPrivateMethod();

        JohnDoe johnDoe = new JohnDoe();
        johnDoe.callJohnDoePrivateMethod();
    }

}