package ro.unibuc.keywords;

public class SuperKeyword {

    public static void main(String[] args) {
        BaseClass instance = new BaseClass(511, "Random value");
        instance.displayInformation();
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
