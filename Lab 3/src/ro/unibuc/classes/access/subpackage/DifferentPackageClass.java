package ro.unibuc.classes.access.subpackage;

import ro.unibuc.classes.access.BaseClass;

public class DifferentPackageClass {

    public void accessingBaseClassMembers() {
        BaseClass baseClass = new BaseClass();

        System.out.println("Accessing public field from the BaseClass: " + baseClass.publicField);

        baseClass.publicMethod();
    }

}
