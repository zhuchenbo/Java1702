package java1702.javase.collection;

import java.util.TreeMap;

/**
 * Created by xiaozhu
 * on 2017/4/12
 */
public class TreeMapTest {
//    public static void main(String[] args) {
//        TreeMap<String, Integer> map = new TreeMap<>();
//        map.put("a", 1);
//        map.put("b", -1);
//        map.put("b", 100);
//
//        System.out.println(map.size());
//        System.out.println(map.get("b"));
//    }
public static void main(String[] args) {
    TreeMap<String, Integer> map = new TreeMap<>();
    map.put("a", 1);
    map.put("b", -1);
    map.put("b", 100);

    System.out.println(map.size());
    System.out.println(map.get("b"));
}
}
