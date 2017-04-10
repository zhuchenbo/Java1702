package java1702.javase.newoop;

import java.util.Hashtable;

/**
 * Created by xiaozhu
 * on 2017/4/10
 */
//哈希表
public class HashtableTest {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "hi");
        hashtable.put(1,"hello");
        System.out.println(hashtable.size());
        for (Integer integer : hashtable.keySet()) {

        }

    }
}

