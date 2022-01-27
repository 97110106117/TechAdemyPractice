package practice.javaPart2;

import java.util.*;

public class hashSet {
    public static void main(String[] args) {
       HashSet hashSet = new HashSet();
                    //bcz Diamond operator is not applicable for non-parameterized types

        hashSet.add("step");
        hashSet.add("by");
        hashSet.add("step");
        hashSet.add("stepbystep");

        System.out.println(hashSet);

    }
}
 // o/p : compilation error