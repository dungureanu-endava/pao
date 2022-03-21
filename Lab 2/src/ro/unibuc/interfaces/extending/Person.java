package ro.unibuc.interfaces.extending;

public interface Person {

    void setName(String name);

    String getName();

    void setAge(int age);

    Integer getAge();

    default void printPersonAge() {
        System.out.println("Accessing interface default method; Person age: " + getAge());
    }

    static void displayTruth() {
        System.out.println("Universal truth that is available for all Persons!");
    }

}
