package ro.unibuc.keywords;

public class SuperKeyword {

    public static void main(String[] args) {
        BaseClass instance = new BaseClass(511, "Random value");
        instance.displayInformation();

        NewBaseClass defaultInstance = new NewBaseClass();
        NewBaseClass parameterizedInstance = new NewBaseClass("Value");
    }

}

class SuperClass {

    private int privateNumber;

    public SuperClass(Integer number) {
        privateNumber = number;
    }

    public void displayInformation() {
        System.out.println("Accessing super class; Private number: " + privateNumber);
    }

    public int getPrivateNumber() {
        return privateNumber;
    }
}

class BaseClass extends SuperClass {

    private String baseValue;

    public BaseClass(Integer number) {
        super(number);
        baseValue = "Default value";
    }

    public BaseClass(Integer privateNumber, String baseValue) {
        this(privateNumber);
        this.baseValue = baseValue;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Accessing base class; Base value: " + baseValue);
    }

}

class ParentClassWithDefaultConstructor {

    public ParentClassWithDefaultConstructor() {
        System.out.println("Accessing parent class default constructor!");
    }

}

class NewBaseClass extends ParentClassWithDefaultConstructor {

    private String value;

    public NewBaseClass() {
        // super();
        value = "Default value";
        System.out.println("Accessing base class default constructor!");
    }

    public NewBaseClass(String value) {
        this.value = value;
        System.out.println("Accessing base class parameterized constructor!");
    }

    public void displayInformation() {
        System.out.println("Value: " + value);
    }

}
