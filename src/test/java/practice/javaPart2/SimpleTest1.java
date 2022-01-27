package practice.javaPart2;

public class SimpleTest1 {
    public static void main(String[] args) {
        try {
            args[0]= "0";
            return;
        } catch (Exception e) {
            System.out.println("exception");
        } finally {
            System.out.println("final");
        }
    }
}

// o/p :exception final