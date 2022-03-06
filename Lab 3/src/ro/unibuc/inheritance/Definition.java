package ro.unibuc.inheritance;

import ro.unibuc.inheritance.hierarchical.Doctor;
import ro.unibuc.inheritance.hierarchical.Teacher;
import ro.unibuc.inheritance.multilevel.TransferStudent;
import ro.unibuc.inheritance.finals.Superhero;
import ro.unibuc.inheritance.single.Student;

public class Definition {

    public void usingSingleInheritance() {
        Student student = new Student();
        student.setName("Marcin Dusseldorf");
        student.setAge(24);

        student.setEnrolledCourses(new String[]{"Math", "History", "Science"});

        student.displayPersonDetails();
        student.displayStudentDetails();
    }

    public void usingMultilevelInheritance() {
        TransferStudent transferStudent = new TransferStudent();
        transferStudent.setName("Jessie Russell");
        transferStudent.setAge(21);

        transferStudent.setEnrolledCourses(new String[]{"History", "Cooking"});

        transferStudent.setTransferredUniversity("University of Wisconsin, Madison");
        transferStudent.setTransferredCredit(75);

        transferStudent.displayPersonDetails();
        transferStudent.displayStudentDetails();
        transferStudent.displayTransferStudentDetails();
    }

    public void usingHierarchicalInheritance() {
        Doctor doctor = new Doctor();
        doctor.setName("Hope Roberson");
        doctor.setAge(57);

        doctor.setAbpCertified(true);

        doctor.displayPersonDetails();
        doctor.displayDoctorDetails();

        Teacher teacher = new Teacher();
        teacher.setName("Damion Andrews");
        teacher.setAge(31);

        teacher.setYearsOfExperience(2);

        teacher.displayPersonDetails();
        teacher.displayTeacherDetails();
    }

    public void usingFinalKeywordInInheritance() {
        Superhero superhero = new Superhero();
        superhero.setName("Haley Pearson");
        superhero.setAge(75);

        superhero.setSuperpowers(new String[]{"X-Ray vision", "Invisibility"});

        superhero.displayPersonDetails();
        superhero.displaySuperheroDetails();
    }

    public static void main(String[] args) {
        Definition definition = new Definition();

        definition.usingSingleInheritance();
        definition.usingMultilevelInheritance();
        definition.usingHierarchicalInheritance();

    }

}
