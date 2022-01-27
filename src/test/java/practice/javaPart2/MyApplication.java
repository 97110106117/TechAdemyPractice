package practice.javaPart2;

public class MyApplication implements Runnable{

    @Override
    public void run() {
        for (int i =1;i<=3;i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
      //  Thread t1 = new Thread(this);
        //t1.start();
    }
}
// o/p : compilation error due to this keyword used