package ro.unibuc.classes.access;

public class SamePackageClass {

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
