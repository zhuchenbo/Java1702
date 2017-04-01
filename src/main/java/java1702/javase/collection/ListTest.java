package java1702.javase.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaozhu
 * on 2017/3/31
 */
public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("hi");
        strings.add("hello");
        strings.add("hello");
        System.out.println(strings.size());
        System.out.println(strings.get(1));
        System.out.println(strings.contains("test"));
        System.out.println(strings.indexOf("hello"));

        System.out.println(strings.isEmpty());
        System.out.println(strings.remove(1));
        System.out.println(strings.set(0,"test"));
        Object[] objects=strings.toArray();
        strings.add("hello");
        System.out.println(strings.size());
        System.out.println(strings);
        ArrayList<String> strings1 = new ArrayList<>();
        //strings1.add("hello");
        strings.removeAll(strings1);
        System.out.println(strings);
        System.out.println(strings.size());
        strings.trimToSize();
        System.out.println(strings.size());

        List<String> strings2=strings.subList(1,2);
        System.out.println(strings2);
    }
}
