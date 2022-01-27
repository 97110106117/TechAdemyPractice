package practice.javaPart2;

public class MyThread extends Thread{
    String name;
    public MyThread(String name) {
        this.name=name;
    }
    public void run() {
        try {
            for (int i = 0;i<3;i++) {
                System.out.print(name+ " ");
                Thread.sleep(2000);
            }
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread("Mango");
        MyThread t2 = new MyThread("Apple");
        t1.run();
        t2.run();
    }
}

//o/p Mango Mango Mango Apple Apple Apple