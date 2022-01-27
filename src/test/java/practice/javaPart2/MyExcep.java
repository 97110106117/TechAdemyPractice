package practice.javaPart2;

public class MyExcep {
    static int val = 5;
    public static void main() {
        throw new ArithmeticException();
    }

    public static void main(String[] args) {
        try {
            val +=2;
            throw new Exception();
        } catch (Exception e) {
            val +=7;
        } finally {
            val +=3;
           // show();
            val +=2;
        }
        System.out.println(val);
    }
}


// o/p : compilation error bcz there is no show()