package ro.unibuc.classes.constructors;

public class ParameterizedConstructor {

    private String color;
    private boolean isEngineWorking;

    public ParameterizedConstructor() {
        // this.isEngineWorking = false;
        this("Grey");
    }

    public ParameterizedConstructor(String color) {
        this(color, true);
    }

    public ParameterizedConstructor(String color, boolean isEngineWorking) {
        this.color = color;
        this.isEngineWorking = isEngineWorking;
    }

    @Override
    public String toString() {
        return "ParameterizedConstructor {color='" + color + "', isEngineWorking=" + isEngineWorking + '}';
    }

    public static void main(String[] args) {
        ParameterizedConstructor noArgsInstance = new ParameterizedConstructor();
        System.out.println("Accessing no arguments instance: " + noArgsInstance);

        ParameterizedConstructor parameterizedInstance = new ParameterizedConstructor("Red", false);
        System.out.println("Accessing parametrized instance: " + parameterizedInstance);
    }

}
