package practice.javaPart2;

abstract class Base extends Object implements Runnable {
    public void run() {
    }
}
class Derive extends Base {

}

class DemoApp {
   /* public boolean checkTest(Object obj) {
        return (obj instanceof Base) & (obj instanceof Runnable);
    }

    public static void main(String[] args) {
        System.out.print(new DemoApp().checkTest(new Derive()));
        System.out.println(new DemoApp().checkTest(new Thread()));
    }*/
}


// o/p : compilation error