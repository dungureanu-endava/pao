package ro.unibuc.encapsulation;

public class Rectangle {

    private int length;
    private int height;

    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public void displayArea() {
        int area = length * height;
        System.out.println("Rectangle area: " + area);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12, 5);
        rectangle.displayArea();
    }

}
