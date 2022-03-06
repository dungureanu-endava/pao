package ro.unibuc.classes.abstraction;

import java.util.Arrays;

public class Teacher extends Person {

    private int teacherId;
    private String[] assignedClasses;

    public Teacher(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return this.teacherId;
    }

    public void setAssignedClasses(String[] classes) {
        this.assignedClasses = classes;
    }

    @Override
    void displayInformation() {
        System.out.println("Accessing implemented abstract method; Person details: " + getName() + " " + getAge());
    }
}
