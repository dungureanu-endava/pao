package ro.unibuc.association.composition;

import java.util.Arrays;

public class Course {

    private String degree;
    private Teacher teacher;
    private Student[] students;

    public static void main(String[] args) {
        Teacher malik = new Teacher("Malik Richard");

        Student lula = new Student("Lula Macias");
        Student mac = new Student("Mac Vang");

        Course course = new Course();
        course.setDegree("Law");
        course.setTeacher(malik);
        course.setStudents(new Student[]{lula, mac});

        System.out.println(course);
    }

    @Override
    public String toString() {
        return "Course Details: " + "Degree '" + degree + '\'' + "; Teacher " + teacher + "; Students: " + Arrays.toString(students);
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}

class Teacher {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}

class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
