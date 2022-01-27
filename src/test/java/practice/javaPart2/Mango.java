package practice.javaPart2;

class Fruit {
    public void show() {
        System.out.println("fruit");
    }
}
public class Mango extends Fruit{
    public void show()/*throws Exception*/ {
        super.show();
        System.out.println("mango");
    }

    public static void main(String[] args) {
        Fruit f = new Mango();
        f.show();
    }
}
