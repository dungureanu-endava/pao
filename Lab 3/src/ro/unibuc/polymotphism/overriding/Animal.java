package ro.unibuc.polymotphism.overriding;

public class Animal {

    protected void displayInfo() {
        System.out.println("I am an animal.");
    }

}

class Dog extends Animal {

    @Override
    public void displayInfo() {
        System.out.println("I am a dog.");
    }

}

class Cat extends Animal {

    @Override
    public void displayInfo() {
        System.out.println("I am a cat.");
    }

}

class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.displayInfo();

        Cat cat = new Cat();
        cat.displayInfo();

        Animal animal = new Dog();
        animal.displayInfo();

        // Dog dogAnimal = (Dog) new Animal();
        // dogAnimal.displayInfo();
    }

}