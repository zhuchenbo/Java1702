package java1702.javase.javaApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by xiaozhu
 * on 2017/4/15
 */
public class E2 {
    public static void main(String[] args) {

        String s1 = "sdjklasdsssdandi";
        getStr(s1);
    }

    public static void getStr(String s1) {
        char[] cs = s1.toCharArray();
        List<Character> list = new ArrayList<Character>();
        for (int i = 0; i < cs.length; i++) {
            list.add(cs[i]);
        }
        int maxcount = 1;
        char maxc = cs[0];
        for (int i = 0; i < list.size() - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                    j--;
                    count++;
                }
                if (count > maxcount) {
                    maxc = list.get(i);
                    maxcount = count;
                }
            }
        }
        System.out.println(maxc + " " + maxcount);


    }
}

