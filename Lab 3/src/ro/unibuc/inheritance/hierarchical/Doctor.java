package ro.unibuc.inheritance.hierarchical;

public class Doctor extends Person {

    private boolean isAbpCertified;

    public void displayDoctorDetails() {
        this.displayPersonDetails();

        System.out.println("Doctor details: ");
        System.out.println("Is ABP certified: " + isAbpCertified);
    }

    public boolean isAbpCertified() {
        return isAbpCertified;
    }

    public void setAbpCertified(boolean isAbpCertified) {
        this.isAbpCertified = isAbpCertified;
    }

}
