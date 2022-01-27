package practice.javaPart2;

public class Demo {
    public static void main(String[] args) {
        int i =10;
        int j = 20;
        if (i++> 5 || j++>15) {
            System.out.println("Hello,"+i+","+j);
        } else {
            System.out.println("Hi,"+i+","+j);

        }
    }
}

//o/p : Hello,11,20