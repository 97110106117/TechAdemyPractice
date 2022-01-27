package practice.javaPart2;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void show(List<? super Double> list) {
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
       // show(list);

    }
}
// compilation error