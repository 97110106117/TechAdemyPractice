package practice.javaPart2;

//@FunctionalInterface
interface Calculation {
    int add(int x,int y);
    int sub(int x,int y);
}


public class MyApplication1 {
    public static void main(String[] args) {
       /* Calculation cal1 =(int a, int b)->{return (a+b);};
        System.out.println(cal1.add(5,3));
        Calculation cal2 = (int a, int b)->{return (a-b);};
        System.out.println(cal2.sub(5,3));
        */
    }
}

// o/p : compilation error