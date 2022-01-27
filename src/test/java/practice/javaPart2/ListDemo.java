package practice.javaPart2;

import java.util.HashSet;
import java.util.Set;

public class ListDemo {
    public static void main(String[] args) {
        Set<Integer> list = new HashSet<>();

        list.add(5);
        list.add(7);
        list.add(6);
        list.add(9);
        list.add(3);
        list.clear();
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(4);
        System.out.println(list.size());

    }
}

// o/p : 3
