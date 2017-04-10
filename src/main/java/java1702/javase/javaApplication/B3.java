package java1702.javase.javaApplication;

import java1702.javase.newoop.StringBufferDemo;

import javax.sound.midi.Soundbank;

/**
 * Created by xiaozhu
 * on 2017/4/8
 */
//编写一个java应用程序，要求如下：
//（1）声明一个String类的变量并初始化值“Hello World”。
//（2）用字符串类的一个方法将上面变量的值拆分成” Hello” 和“World”两个字符串并打印输出。
//（3）将” Hello”这个变量转换成大写、“World”转换成 小写并打印输出。
// （4）声明一个String类的变量并初始化值“20100110”。
//　（5）将上面变量的值转换成2010年1月10日的形式打印输出。
public class B3 {
    public static void main(String[] args) {
        //  StringBuffer stringBuffer = new StringBuffer("Hello");
        //   StringBuffer stringBuffer1 =new StringBuffer ("World");
        //System.out.println(stringBuffer);
        // System.out.println(stringBuffer1);
        System.out.println("Hello".toUpperCase() + " " + "World".toLowerCase());
        //  System.out.println("World".toLowerCase());
        StringBuffer stringBuffer = new StringBuffer("20100110");
        System.out.println(stringBuffer.insert(4,"年").insert(7, "月").insert(10, "日").delete(5,6));
       // System.out.println(stringBuffer.delete(5,6));
        //   System.out.println(stringBuffer.insert(7,"月"));
        // System.out.println(stringBuffer.insert(10, "日"));
    }
}
