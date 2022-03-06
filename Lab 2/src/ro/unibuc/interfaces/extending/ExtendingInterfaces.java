package ro.unibuc.interfaces.extending;

public class ExtendingInterfaces {

    public static void main(String[] args) {
        Student student = new StudentImplementation();
        student.setName("Vilma Walton");
        printPersonName(student);

        Teacher teacher = new TeacherImplementation();
        teacher.setName("Gwen Cameron");
        printPersonName(teacher);
    }

    public static void printPersonName(Person person) {
        System.out.println("Accessing interface method; Person name: " + person.getName());
    }

}

class StudentImplementation implements Student {

    private String name;
    private int age;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public int getEnrollmentNumber() {
        return 0;
    }

    @Override
    public void setYearOfPassing(int year) {

    }

}

class TeacherImplementation implements Teacher {

    private String name;
    private int age;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public int getTeacherId() {
        return 0;
    }

    @Override
    public void setAssignedClasses(String[] classes) {

    }

}
