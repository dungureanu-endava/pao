package ro.unibuc.inheritance.hierarchical;

import java.util.Arrays;

public class Student extends Person {

    private String[] enrolledCourses;

    public void displayStudentDetails() {
        this.displayPersonDetails();

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
