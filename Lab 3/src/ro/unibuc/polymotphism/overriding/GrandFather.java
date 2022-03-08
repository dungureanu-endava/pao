package ro.unibuc.polymotphism.overriding;

public class GrandFather {

    void move() {
        System.out.println("I use my stick to move!");
    }
}

class Father extends GrandFather {

    @Override
    void move() {
        System.out.println("I can walk fast!");
    }

}

class Baby extends Father {

    void print() {}

    @Override
    void move() {
        System.out.println("I crawl and have fun!");
    }

    public static void main(String[] args) {
        Baby baby = new Baby();
        baby.move();
        baby.print();

        Father father = new Father();
        father.move();

        GrandFather grandFather = new Baby();
        grandFather.move();
//        grandFather.print();
    }

}
