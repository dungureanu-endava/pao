package ro.unibuc.practice.lab03.animals;

import ro.unibuc.practice.lab03.actions.Action;

public class Fish implements Animal {

    private final String name = "Fish";

    @Override
    public void react(Action action) {
        switch (action) {
            case POKES:
                System.out.printf("The %s pokes back", name);
                break;
            case SCARE:
                System.out.printf("The %s looks at you menacingly!", name);
                break;
            case PET:
                System.out.printf("The %s ignores you", name);
        }
    }

}
