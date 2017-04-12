package java1702.javase.collection;

import java.util.HashSet;

/**
 * Created by xiaozhu
 * on 2017/4/11
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("hello");
        strings.add("hi");
        strings.add("test");
        strings.add("Test");

        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }

    }
}
