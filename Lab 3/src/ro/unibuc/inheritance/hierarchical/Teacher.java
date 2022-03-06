package ro.unibuc.inheritance.hierarchical;

public class Teacher extends Person {

    private int yearsOfExperience;

    public void displayTeacherDetails() {
        this.displayPersonDetails();

        System.out.println("Teacher details: ");
        System.out.println("Years of experience: " + yearsOfExperience);
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
