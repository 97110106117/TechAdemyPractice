package practice.javaPart2;

public class Test {
    public static void main(String[] args) {
        String s1 = new String("java program");
        String s2 = new String("java program");

        if (s1 == s2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}

// o/p : Not Equal