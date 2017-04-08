package java1702.javase.newoop;

/**
 * Created by xiaozhu
 * on 2017/4/7
 */

public class StringTest {

        /**
         * @param args 主方法的参数数组
         * @author tester
         */
        public static void main(String[] args) {
            String s = "hi";
            System.out.println(s);
            s = "hello";
            System.out.println(s);








            // GC Garbage Collection 垃圾回收机制
            byte[] bytes = new byte[10];
            String s1 = ""; // deprecated 弃用\ [ˈdeprəkeɪtɪd]
            System.out.println("-" + s1 + "-");
            String s2 = "test...";
            String s3 = "test...";
//        String s3 = new String("test...");
            System.out.println(s2 == s3);

        /*
        String Pool 字符串池
        "test..."
         */

            System.out.println("hello".contains(s2));
        }
    }
/*
charAt
concat
contains
endsWith
equals
indexOf
lastIndexOf
length
replace
split
startWith
subString
toCharArray
toLowerCase
toUpperCase
trim
valueOf
 */

