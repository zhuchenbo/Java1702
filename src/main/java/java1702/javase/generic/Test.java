package java1702.javase.generic;

import java.util.Date;

/**
 * Created by xiaozhu
 * on 2017/4/13
 */
public class Test<T> {
    //generic 通用的
    //general 一般

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.concat(1, 2));
        System.out.println(test.concat(1.2, 3.4));
        System.out.println(test.concat(new Date(),new Date()));
    }

    private String concat(T x,T y) {
        return String.valueOf(x).concat(String.valueOf(y));
    }
}
