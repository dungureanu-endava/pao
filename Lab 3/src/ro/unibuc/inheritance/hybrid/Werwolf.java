package ro.unibuc.inheritance.hybrid;

public class Werwolf implements Wolf, Human {

    private int age;

    public Werwolf(Integer age) {
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void bite() {

    }

    @Override
    public void run() {
        Wolf.super.run();
    }

//    @Override
//    public void run() {
//        Wolf.super.run();
//    }

}
