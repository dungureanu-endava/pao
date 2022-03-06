package ro.unibuc.inheritance.single;

import java.util.Arrays;

public class Student extends Person {

    private String[] enrolledCourses;

    public void displayStudentDetails() {
        System.out.println("Student details: ");
        System.out.println("Enrolled courses: " + Arrays.toString(enrolledCourses));
    }

    public String[] getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(String[] enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

}
