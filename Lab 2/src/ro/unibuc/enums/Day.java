package ro.unibuc.enums;

public enum Day {

    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY

}

class UsingDayEnum {

    public void dayActivities(Day day) {
        switch (day) {
            case SUNDAY:
                System.out.println(day + " - Make a rabbit hutch from kitchen rolls");
                break;
            case MONDAY:
                System.out.println(day + " - Make your own newspaper");
                break;
            case TUESDAY:
                System.out.println(day + " - Play Snakes and Ladders");
                break;
            case WEDNESDAY:
                System.out.println(day + " - Invent a card game");
                break;
            case THURSDAY:
                System.out.println(day + " - Stick googly eyes on inanimate objects");
                break;
            case FRIDAY:
                System.out.println(day + " - Play with a pet");
                break;
            case SATURDAY:
                System.out.println(day + " - Do as many press ups as you can");
                break;
        }
    }

}

class Main {

    public static void main(String[] args) {
        UsingDayEnum instance = new UsingDayEnum();
        instance.dayActivities(Day.TUESDAY);
        instance.dayActivities(Day.WEDNESDAY);
    }

}