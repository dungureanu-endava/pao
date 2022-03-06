package ro.unibuc.inheritance.hierarchical;

public class Person {

    private String name;
    private int age;

    public void displayPersonDetails() {
        System.out.println("Person details: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
