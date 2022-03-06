package ro.unibuc.classes.constructors;

public class DefaultConstructor {

    public int instanceVariable;

    /*
     * public DefaultConstructor() {
     *
     * }
     */

    public static void main(String[] args) {
        DefaultConstructor instance = new DefaultConstructor();
        System.out.println("Accessing instance variable: " + instance.instanceVariable);
    }

}
