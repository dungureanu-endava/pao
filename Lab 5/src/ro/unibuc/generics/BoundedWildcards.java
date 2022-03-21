package ro.unibuc.generics;

import java.util.Arrays;
import java.util.List;

class Animal {

    protected String name;

    public String getName() {
        return name;
    }
}

class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }
}

public class BoundedWildcards {

    public static void main(String[] args) {
        List<? extends Animal> animals = Arrays.asList(new Cat("Zoe"), new Dog("Jack"));
        displayNames(animals);
    }

    public static void displayNames(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println("Animal name: " + animal.getName());
        }
    }
}
