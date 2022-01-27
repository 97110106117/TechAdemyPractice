package practice.javaPart2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortDemo1 {
    public static void main(String[] args) {
        Collection<Integer> collection = new HashSet<>();
        collection.add(3);
        collection.add(7);
        collection.add(null);
        collection.add(2);
        collection.add(5);

       // System.out.println(collection);  //[null, 2, 3, 5, 7]

        Set<Integer> set = new TreeSet<>();
        set.addAll(collection);
        System.out.print(set);
    }
}


//o/p : Runtime error
