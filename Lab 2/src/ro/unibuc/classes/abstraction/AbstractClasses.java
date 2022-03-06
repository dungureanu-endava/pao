package ro.unibuc.classes.abstraction;

public class AbstractClasses {

    public static void main(String[] args) {
        Student student = new Student(775);
        student.setName("Leland Meza");
        accessPersonMethod(student);

        Teacher teacher = new Teacher(993);
        teacher.setName("Dirk Mosley");
        accessPersonMethod(teacher);
    }

    public static void accessPersonMethod(Person person) {
        person.displayInformation();
    }

}
