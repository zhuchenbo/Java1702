package java1702.javase.collection;

import java.util.LinkedList;

/**
 * Created by xiaozhu
 * on 2017/4/11
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");


        System.out.println(strings.size());
        System.out.println(strings.get(2));
        System.out.println("----");

        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("----");
        System.out.println(strings.getFirst());
        System.out.println("----");
        System.out.println(strings.getLast());
    }
}
