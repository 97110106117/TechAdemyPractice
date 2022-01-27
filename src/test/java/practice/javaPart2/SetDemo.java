package practice.javaPart2;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add(1.00);
        set.add("2");
        set.add(3);
        System.out.println(set);
    }
}


// o/p : runtime exception

 /*   Exception in thread "main" java.lang.ClassCastException: java.base/java.lang.Double cannot be cast to java.base/java.lang.String
        at java.base/java.lang.String.compareTo(String.java:123)
        at java.base/java.util.TreeMap.put(TreeMap.java:566)
        at java.base/java.util.TreeSet.add(TreeSet.java:255)
        at practice.javaPart2.SetDemo.main(SetDemo.java:10)
*/