package java1702.javase.collection;

import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Source;

/**
 * Created by xiaozhu
 * on 2017/3/28
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = "hi..";

        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String s2 = new String(chars);

        System.out.println(s2);

        for (char c : s2.toCharArray()) {
            //    System.out.println(c);
        }
        String s4 = "Hello"; // hello HELLO
        System.out.println(toLowerCase(s4));
        System.out.println(toUpperCase(s4));

        String str = new String(chars);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        ///   System.out.println("итальянский".toLowerCase());
        //  System.out.println("итальянский".toUpperCase());

        String s3 = "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello";
        System.out.println(s3.charAt(s3.length() - 1));
    }

    private static String toLowerCase(String origin) {
        char[] chars = origin.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar >= 'A' && aChar <= 'Z') {
                chars[i] += 32; // a - A = 32
            }
        }
        return new String(chars);
    }

    private static String toUpperCase(String origin) {
        char[] chars = origin.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar >= 'a' && aChar <= 'z') {
                chars[i] -= 32; // a - A = 32
            }
        }
        return new String(chars);
    }
}
