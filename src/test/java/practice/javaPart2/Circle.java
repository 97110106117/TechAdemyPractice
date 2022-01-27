package practice.javaPart2;

interface Shape {
    public void perimeterCal();
}

public class Circle implements Shape {

    public void radiusCal() {
        System.out.println("Hi");
    }

    @Override
    public void perimeterCal() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.perimeterCal();
    }
}
//o/p: Hello