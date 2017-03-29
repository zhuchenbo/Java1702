package java1702.javase.collection;

import com.sun.javafx.sg.prism.web.NGWebView;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

/**
 * Created by xiaozhu
 * on 2017/3/29
 */
public class VectorTest {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        vector.add("hi");
        vector.add("hello");
        vector.add("test");
        vector.add("hi");

        System.out.println(vector.size());

        for (String s : vector) {
            System.out.println(s);
        }

        System.out.println(vector.size());
        System.out.println(vector.capacity());

        Set<String> strings = new HashSet<>();
        strings.add("a");
        strings.add("aa");
        strings.add("aaa");
        strings.add("aaa");
        System.out.println(strings.size());
    }
}
