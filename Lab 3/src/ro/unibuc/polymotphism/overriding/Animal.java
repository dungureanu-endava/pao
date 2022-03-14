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

    public void displayDogInfo() {
        System.out.println("I bark!");
    }

}

class Cat extends Animal {

    @Override
    public void displayInfo() {
        System.out.println("I am a cat.");
    }

    public void displayCatInfo() {
        System.out.println("I purr!");
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

//        Dog dogAnimal = (Dog) new Animal();

        workingWithCasts(animal);
    }

    public static void workingWithCasts(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.displayDogInfo();
            return;
        }

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.displayCatInfo();
            return;
        }

        animal.displayInfo();
    }

}