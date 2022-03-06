package ro.unibuc.inheritance.finals;

import java.util.Arrays;

public final class Superhero extends Person {

    private String[] superpowers;

    public void displaySuperheroDetails() {
        System.out.println("Superhero details: ");
        System.out.println("Superpowers: " + Arrays.toString(superpowers));
    }

    public String[] getSuperpowers() {
        return superpowers;
    }

    public void setSuperpowers(String[] superpowers) {
        this.superpowers = superpowers;
    }
}

/*
 * class MorphedHero extends Superhero {
 *
 * }
 */
