package ro.unibuc.classes.access;

public class BaseClass {

    private String privateField;
    protected String protectedField;
    String packageProtectedField;
    public String publicField;

    private void privateMethod() {
        System.out.println("Accessing private method from BaseClass");
    }

    protected void protectedMethod() {
        System.out.println("Accessing protected method from BaseClass");

    }

    void packageProtectedMethod() {
        System.out.println("Accessing package protected method from BaseClass");

    }

    public void publicMethod() {
        System.out.println("Accessing public method from BaseClass");

    }

    class InnerClass {

        public void accessingBaseClassMembers() {
            // BaseClass baseClass = new BaseClass();

            System.out.println("Accessing public field from the BaseClass: " + BaseClass.this.publicField);
            System.out.println("Accessing package protected field from the BaseClass: " + BaseClass.this.packageProtectedField);
            System.out.println("Accessing protected field from the BaseClass: " + BaseClass.this.protectedField);
            System.out.println("Accessing private field from the BaseClass: " + BaseClass.this.privateField);

            BaseClass.this.publicMethod();
            BaseClass.this.protectedMethod();
            BaseClass.this.packageProtectedMethod();
            BaseClass.this.privateMethod();
        }

    }

}

class OuterClass {

    public void accessingBaseClassMembers() {
        BaseClass baseClass = new BaseClass();

        System.out.println("Accessing public field from the BaseClass: " + baseClass.publicField);
        System.out.println("Accessing package protected field from the BaseClass: " + baseClass.packageProtectedField);
        System.out.println("Accessing protected field from the BaseClass: " + baseClass.protectedField);

        baseClass.publicMethod();
        baseClass.protectedMethod();
        baseClass.packageProtectedMethod();
    }

}
