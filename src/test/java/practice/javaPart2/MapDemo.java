package practice.javaPart2;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map map = new LinkedHashMap();
        map.put(1,"A");
        map.put(null,"B");
        map.put(2,"A");
        map.put(null,"C");
        map.put(3,null);
        System.out.print(map);
    }
}

// o/p :{1=A, null=C, 2=A, 3=null}