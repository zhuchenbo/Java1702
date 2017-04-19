package java1702.javase.generic;

import java.util.Vector;

/**
 * Created by xiaozhu
 * on 2017/4/13
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("test");
        vector.add("123");
        vector.add("hello");
        vector.add("456");
        vector.add("hi");

        String s = vector.get(4);
        System.out.println(s);
    }
}
