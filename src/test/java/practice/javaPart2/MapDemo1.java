package practice.javaPart2;

import java.util.*;

class MapSort implements Comparator<Map.Entry<Integer,String>> {
    public int compare(Map.Entry<Integer,String>data1,Map.Entry<Integer,String>data2) {
        return data2.getKey().compareTo(data1.getKey());
    }
}
 public class MapDemo1 {
    public static void main(String[] args) {
        Map map = new LinkedHashMap();
        map.put(8,"Bob");
        map.put(2,"Rio");
        map.put(4,"Ann");
        map.put(6,"Tina");
        map.put(7,"Kitty");
        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        List<Map.Entry<Integer,String>> entryList = new ArrayList<Map.Entry<Integer,String>>(entrySet);
        Collections.sort(entryList,new MapSort());
        for (Map.Entry<Integer,String> data : entryList) {
            System.out.print(data.getValue());
        }

    }
}
//BobKittyTinaAnnRio