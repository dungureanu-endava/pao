package ro.unibuc.encapsulation;

public class Person {

    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person details: " + "name='" + name + '\'' + ", age=" + age;
    }

    public static void main(String[] args) {
        Person person = new Person("Gloria Strong");
        person.setAge(32);
        System.out.println(person);

        person.setAge(33);
        System.out.println(person);
    }

}
