package java1702.javase.collection;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.SpinnerUI;

/**
 * Created by xiaozhu
 * on 2017/3/29
 */
public class StringTest_ {
//    public static void main(String[] args) {
//        String s = "helloworld";
//        // match 匹配\ [mætʃ]
//        System.out.println(s.matches("\\w+")); // JavaScript
////        System.out.println(s.contains("he"));
//        System.out.println(s.equals("hello"));
//
//        // repalce 取代\ [rɪ'pleɪs]
//
////        System.out.println(s.replace("l", "a"));
//        System.out.println(s.replaceAll("l", "a"));
////        System.out.println(s.replaceAll("[l]+", "a"));
//        System.out.println(s.replaceFirst("l", "a"));
//    }
    public static void main(String[] args) {
        String s ="Hello world";
        System.out.println(s.matches("hei"));
      //  System.out.println(s.contains("h"));
        System.out.println(s.equals("hello"));
        System.out.println(s.replace("l","a"));
        System.out.println(s.replaceAll("l","a"));

        String[] strings=s.split("l");
        System.out.println(strings.length);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
