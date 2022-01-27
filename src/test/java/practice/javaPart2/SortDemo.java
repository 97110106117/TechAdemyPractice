package practice.javaPart2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortDemo {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        set.add("B");
        set.add("D");
        set.add("A");
        set.add("C");
        System.out.println(set);
    }
}


// o/p: [A, B, C, D]