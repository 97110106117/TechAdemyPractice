package practice.javaPart2;

public class MyFirst {
    static int a = 10;
    static int n;
    int b = 5;
    int c;
    public MyFirst(int m) {
        System.out.print(a+","+b+","+c+","+n+","+m);
    }

    //instance block
    {
        b=30;
        n=20;
    }

    //static bloc
    static {
        a=60;
    }
    public static void main(String[] args) {
        MyFirst obj = new MyFirst(n);
    }

}
//o/p : 60,30,0,20,0