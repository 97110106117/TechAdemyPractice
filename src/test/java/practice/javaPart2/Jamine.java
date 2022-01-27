package practice.javaPart2;

abstract class Flower {
    int i = 10;
    abstract void display();
}
class Jamine extends Flower{
    int j= 20;
    @Override
    void display() {
        System.out.println(i+","+j);
    }
}
class Demo2 {
    public static void main(String[] args) {
        Jamine j = new Jamine();
        j.i = 5;
        j.j=2;
        j.display();
    }
}

// o/p : 5,2
