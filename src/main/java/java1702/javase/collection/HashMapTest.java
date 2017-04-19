package java1702.javase.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiaozhu
 * on 2017/4/12
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "hello");
        map.put(10, "hi");
        map.put(100, "test");

        System.out.println(map.size());
        System.out.println(map.get(10));

        for (Integer integer : map.keySet()) {
            System.out.println(integer + ">" + map.get(integer));
        }
        for (String s : map.values()) {
            System.out.println(s);
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+">"+entry.getValue());

        }
    }
}
