package ro.unibuc.practice.lab03.animals;

import ro.unibuc.practice.lab03.actions.Action;

public class Lion implements Animal {

    private final String name = "Lion";

    @Override
    public void react(Action action) {
        switch (action) {
            case POKES:
                System.out.printf("The %s growls", name);
                break;
            case SCARE:
                System.out.printf("The %s runs away!", name);
                break;
            case PET:
                System.out.printf("The %s purrs", name);
        }
    }

}
