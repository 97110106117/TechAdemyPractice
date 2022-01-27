package practice.javaPart2;

public class SimpleTest {
    public static void main(String[] args) {
        String initial = "ABCDEFG",after = "";
        after = initial = initial.replace('A','Z');
        System.out.print(initial+ ","+after);
        }
}

//local variable is stored in Stack memory

// o/p : ZBCDEFG,ZBCDEFG
