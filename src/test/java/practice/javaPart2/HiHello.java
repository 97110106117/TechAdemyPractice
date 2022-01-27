package practice.javaPart2;

interface  Hello {
    public void sayHello();
}
public class HiHello implements Hello {
    @Override
    public void sayHello() {
        System.out.println("Hello Hi");
    }

    public static void main(String[] args) {
        new HiHello().sayHello();
    }
}

//o/p : Hello Hi
