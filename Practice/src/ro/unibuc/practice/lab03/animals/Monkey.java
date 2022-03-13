package ro.unibuc.practice.lab03.animals;

import ro.unibuc.practice.lab03.actions.Action;

public class Monkey implements Animal {

    private final String name = "Monkey";

    @Override
    public void react(Action action) {
        switch (action) {
            case POKES:
                System.out.printf("The %s throws boogers at you!", name);
                break;
            case SCARE:
                System.out.printf("The %s laughs out loud", name);
                break;
            case PET:
                System.out.printf("The %s pets you back", name);
        }
    }

}
