package ro.unibuc.classes.constructors;

public class NoArgsConstructor {

    public int instanceVariable;

    public NoArgsConstructor() {
        this.instanceVariable = 124;
    }

    public static void main(String[] args) {
        NoArgsConstructor instance = new NoArgsConstructor();
        System.out.println("Accessing instance variable: " + instance.instanceVariable);
    }

}
