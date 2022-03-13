package ro.unibuc.practice.lab04.immutable;

import java.util.Date;

record DrivingLicence(String firstName, String secondName, Date expiryDate, State state) {

    DrivingLicence(String firstName, String secondName, Date expiryDate, State state) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.expiryDate = expiryDate;
        this.state = state;
    }

}

class State {

    private String name;
    private Government government;

    public State(String name, Government government) {
        this.name = name;
        this.government = government;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", government=" + government +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Government getGovernment() {
        return government;
    }

    public void setGovernment(Government government) {
        this.government = government;
    }
}

class Government {

    private String name;

    public Government(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Government{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class WorkingWithRecords {

    public static void main(String[] args) {
        Government government = new Government("Arnout");

        State state = new State("Vivek", government);

        DrivingLicence licence = new DrivingLicence("Hartmut", "Eliseu", new Date(), state);

        System.out.println(licence);

        State licenceState = licence.state();
        licenceState.setName("Fiore");

        System.out.println(licence);
    }
}
