package ro.unibuc.classes.access.subpackage;

import ro.unibuc.classes.access.BaseClass;

public class SubClass extends BaseClass {

    public void accessingBaseClassMembers() {
        // BaseClass baseClass = new BaseClass();

        System.out.println("Accessing public field from the BaseClass: " + super.publicField);
        System.out.println("Accessing protected field from the BaseClass: " + super.protectedField);

        super.publicMethod();
        super.protectedMethod();
    }

}
