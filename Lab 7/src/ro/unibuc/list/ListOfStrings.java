package ro.unibuc.list;

import java.util.*;

public class ListOfStrings {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        ArrayList<String> flowers = new ArrayList<>();

        List<String> seasons = new ArrayList<>(4);

        List<String> animals = new ArrayList<>(Arrays.asList("Cat", "Dog", "Parrot"));

        animals.add(2, "Fish"); // cat dog fish parrot
        animals.add("Turtle"); // cat dog fish parrot turtle

        animals.set(1, "Pig"); // cat pig fish parrot turtle
        animals.remove(3); // cat pig fish turtle
        animals.remove("Pig"); // cat fish turtle

        System.out.println("For-each iteration: ");
        for (String animal : animals) {
            System.out.print(animal + " ");
        }

        System.out.println("\nIterator: ");
        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()) {
            String animal = iterator.next();
            System.out.print(animal + " ");
        }

        Iterator<String> iterator2 = animals.iterator();
        while (iterator2.hasNext()) {
            String animal = iterator2.next();
            if (animal.equals("Cat")) {
                iterator2.remove();
            }
        }

        Collections.sort(animals);
        Collections.reverse(animals);
        System.out.println("\nSorted: ");
        for (String animal : animals) {
            System.out.print(animal + " "); // fish turtle
        }

        int pigIndex = Collections.binarySearch(animals, "Pig");
        if (pigIndex >= 0) {
            System.out.println("\nPig found at index: " + pigIndex);
        } else {
            System.out.println("\nPig not found");
        }

        if (animals.contains("Fish")) {
            System.out.println("Fish found");
        } else {
            System.out.println("Fish not found");
        }
    }

}
