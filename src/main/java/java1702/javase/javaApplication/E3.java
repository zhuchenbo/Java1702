package java1702.javase.javaApplication;

import jdk.internal.util.xml.impl.Input;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by xiaozhu
 * on 2017/4/15
 */
public class E3 {
    public static void main(String[] args) {
        String s0 = "123,45,25,85";
        String[] s1 = s0.split(",");
        for (int i = 0; i < s1.length; i++) {
            System.out.print(s1[i] + " ");
        }
        System.out.println(Arrays.toString(s1));
        int[] a = new int[s1.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(s1[i]);
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        for (int number : a)
            System.out.print(number + " ");
    }
}
