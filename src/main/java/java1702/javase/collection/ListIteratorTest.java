package java1702.javase.collection;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by xiaozhu
 * on 2017/4/12
 */
public class ListIteratorTest {
//    public static void main(String[] args) {
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("a");
//        strings.add("b");
//        strings.add("c");
//        strings.add("d");
//        strings.add("e");
//
//        ListIterator<String> listIterator = strings.listIterator();
//        while (listIterator.hasNext()) {
//
//            String next = listIterator.next();
//            System.out.println(listIterator.nextIndex());
//            System.out.println(next);
//        }
//       // System.out.println("-------");
//
//    }
public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<>();
    strings.add("a");
    strings.add("b");
    strings.add("c");
    strings.add("d");

        /*
        ---[]--[]--[]--[]--[]-|-
         */

    ListIterator<String> iterator = strings.listIterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.nextIndex());
        iterator.add("d");
        String next = iterator.next();
        System.out.println(next);
    }
    System.out.println(strings);
    System.out.println("---");
    while (iterator.hasPrevious()) {
        System.out.println(iterator.previousIndex());
        String prev = iterator.previous();
        if (prev.equals("d") && iterator.previousIndex() != 6) {
            iterator.remove();
//                iterator.set("e");
        }
        System.out.println(prev);
    }
    System.out.println(strings);

    // hasNext next
    // hasPrevious prev
    // nextIndex
    // previousIndex
    // add
    // set
    // remove
}
}
