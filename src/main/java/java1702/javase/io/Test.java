package java1702.javase.io;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by xiaozhu
 * on 2017/4/27
 */
public class Test {
    public static void main(String[] args) {
        // Pattern 模式
        // Matcher  匹配
        Pattern pattern = Pattern.compile("l");
        Matcher matcher = pattern.matcher("hello");
//        System.out.println(matcher.find());
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
