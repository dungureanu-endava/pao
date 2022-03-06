package ro.unibuc.interfaces.extending;

public interface Teacher extends Person {

    int getTeacherId();

    void setAssignedClasses(String[] classes);

}
