package ro.unibuc.practice.zoo;

import ro.unibuc.practice.zoo.actions.Action;
import ro.unibuc.practice.zoo.animals.Animal;
import ro.unibuc.practice.zoo.animals.Fish;
import ro.unibuc.practice.zoo.animals.Lion;
import ro.unibuc.practice.zoo.animals.Monkey;

import java.util.Scanner;

public class Zoo {

    private final Scanner scanner;

    private final Animal[] animals;

    public Zoo() {
        scanner = new Scanner(System.in);

        animals = new Animal[3];
        animals[0] = new Lion();
        animals[1] = new Fish();
        animals[2] = new Monkey();
    }

    public void interactWithAnimal(Animal animal) {
        System.out.println("How do you want to interact with it?");
        System.out.println("1. Pet");
        System.out.println("2. Poke");
        System.out.println("3. Scare");

        int actionIndex = scanner.nextInt();

        switch (actionIndex) {
            case 1:
                animal.react(Action.PET);
                break;
            case 2:
                animal.react(Action.POKES);
                break;
            case 3:
                animal.react(Action.SCARE);
                break;
            default:
                System.out.println("Unknown action!");
        }
    }

    public void playWithAnAnimals() {
        System.out.println("What animal do you want to play with?");
        System.out.println("1. Lion");
        System.out.println("2. Fish");
        System.out.println("3. Monkey");

        int actionIndex = scanner.nextInt();

        switch (actionIndex) {
            case 1, 2, 3:
                interactWithAnimal(animals[actionIndex - 1]);
                break;
            default:
                System.out.println("Unknown action!");
        }
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.playWithAnAnimals();
    }

}
