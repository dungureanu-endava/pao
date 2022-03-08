package ro.unibuc.practice.zoo.animals;

import ro.unibuc.practice.zoo.actions.Action;

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
