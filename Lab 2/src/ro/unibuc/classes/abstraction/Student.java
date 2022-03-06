package ro.unibuc.classes.abstraction;

public class Student extends Person {

    private int enrollmentNumber;
    private Integer yearOfPassing;

    public Student(Integer enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }

    public int getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public void setYearOfPassing(Integer year) {
        this.yearOfPassing = year;
    }

    @Override
    void displayInformation() {
        System.out.println("Accessing implemented abstract method; Person details: " + getName() + " " + getAge());
    }

}
