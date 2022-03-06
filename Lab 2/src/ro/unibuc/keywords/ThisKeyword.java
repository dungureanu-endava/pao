package ro.unibuc.keywords;

public class ThisKeyword {

    public static void main(String[] args) {
        Person superhero = new Person("Chrystal Jacobs");
        superhero.testSuperpowers();
    }

}

class Person {

    private String name;
    private boolean isSuperhero;

    public Person(String name) {
        this(name, true);
    }

    public Person(String name, boolean isSuperhero) {
        this.name = name;
        this.isSuperhero = isSuperhero;
    }

    public void testSuperpowers() {
        doPrivateTest(this);
    }

    private void doPrivateTest(Person thisInstance) {
        if (thisInstance.isSuperhero) {
            System.out.println(thisInstance.name + " has superpowers!");
        } else {
            System.out.println(thisInstance.name + " is still searching for the magical formula!");
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSuperhero() {
        return this.isSuperhero;
    }

    public void setSuperhero(boolean isSuperhero) {
        this.isSuperhero = isSuperhero;
    }

}
